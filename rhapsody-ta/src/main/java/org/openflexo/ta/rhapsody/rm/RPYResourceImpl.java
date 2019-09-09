/**
 * 
 * Copyright (c) 2018, Openflexo
 * 
 * This file is part of OpenflexoTechnologyAdapter, a component of the software infrastructure 
 * developed at Openflexo.
 * 
 * 
 * Openflexo is dual-licensed under the European Union Public License (EUPL, either 
 * version 1.1 of the License, or any later version ), which is available at 
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * and the GNU General Public License (GPL, either version 3 of the License, or any 
 * later version), which is available at http://www.gnu.org/licenses/gpl.html .
 * 
 * You can redistribute it and/or modify under the terms of either of these licenses
 * 
 * If you choose to redistribute it and/or modify under the terms of the GNU GPL, you
 * must include the following additional permission.
 *
 *          Additional permission under GNU GPL version 3 section 7
 *
 *          If you modify this Program, or any covered work, by linking or 
 *          combining it with software containing parts covered by the terms 
 *          of EPL 1.0, the licensors of this Program grant you additional permission
 *          to convey the resulting work. * 
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 *
 * See http://www.openflexo.org/license.html for details.
 * 
 * 
 * Please contact Openflexo (openflexo-contacts@openflexo.org)
 * or visit www.openflexo.org if you need additional information.
 * 
 */

package org.openflexo.ta.rhapsody.rm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openflexo.foundation.FlexoException;
import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.FlexoProject;
import org.openflexo.foundation.IOFlexoException;
import org.openflexo.foundation.InnerResourceData;
import org.openflexo.foundation.resource.FileIODelegate;
import org.openflexo.foundation.resource.FileSystemBasedResourceCenter;
import org.openflexo.foundation.resource.FileWritingLock;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.resource.PamelaResourceImpl;
import org.openflexo.foundation.resource.ResourceData;
import org.openflexo.foundation.resource.ResourceLoadingCancelledException;
import org.openflexo.foundation.resource.SaveResourceException;
import org.openflexo.foundation.resource.StreamIODelegate;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.model.RPYModelFactory;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYRootObject;
import org.openflexo.ta.rhapsody.model.parser.ParseException;
import org.openflexo.ta.rhapsody.model.parser.RPYParser;
import org.openflexo.toolbox.FileSystemMetaDataManager;
import org.openflexo.toolbox.FileUtils;

/**
 * Abstract base implementation for a Rhapsody resource storing data using Rhapsody format (key/value dictionaries)
 * 
 * @author sylvain
 *
 */
public abstract class RPYResourceImpl<RD extends RPYRootObject<RD>, F extends RPYModelFactory<RD, ?>> extends PamelaResourceImpl<RD, F>
		implements RPYResource<RD, F> {

	private static final Logger logger = Logger.getLogger(RPYResourceImpl.class.getPackage().getName());

	@Override
	protected RD performLoad() throws IOException, Exception {

		if (getFlexoIOStreamDelegate() == null) {
			throw new IOFlexoException("Cannot load document with this IO/delegate: " + getIODelegate());
		}

		RD returned = null;
		try {
			returned = load(getFlexoIOStreamDelegate());
			getInputStream().close();
		} catch (IOException e) {
			throw new IOFlexoException(e);
		} catch (ParseException e) {
			throw new IOFlexoException(e.getMessage());
		}

		if (returned == null) {
			logger.warning("canno't retrieve resource data from serialization artifact " + getIODelegate().toString());
			return null;
		}
		returned.lookupReferences();

		return returned;
	}

	/**
	 * Resource saving safe implementation<br>
	 * Initial resource is first copied, then we write in a temporary file, renamed at the end when the seriaization has been successfully
	 * performed
	 */
	@Override
	protected void performSave(boolean clearIsModified) throws SaveResourceException {

		if (getFlexoIOStreamDelegate() == null) {
			throw new SaveResourceException(getIODelegate());
		}

		FileWritingLock lock = getFlexoIOStreamDelegate().willWriteOnDisk();

		if (logger.isLoggable(Level.INFO)) {
			logger.info("Saving resource " + this + " : " + getIODelegate().getSerializationArtefact());
		}

		if (getFlexoIOStreamDelegate() instanceof FileIODelegate) {
			File temporaryFile = null;
			try {
				File fileToSave = ((FileIODelegate) getFlexoIOStreamDelegate()).getFile();
				// Make local copy
				makeLocalCopy(fileToSave);
				// Using temporary file
				temporaryFile = ((FileIODelegate) getIODelegate()).createTemporaryArtefact(".txt");
				if (logger.isLoggable(Level.FINE)) {
					logger.finer("Creating temp file " + temporaryFile.getAbsolutePath());
				}
				try (FileOutputStream fos = new FileOutputStream(temporaryFile)) {
					write(fos);
				}
				System.out.println("Renamed " + temporaryFile + " to " + fileToSave);
				FileUtils.rename(temporaryFile, fileToSave);
			} catch (IOException e) {
				e.printStackTrace();
				if (temporaryFile != null) {
					temporaryFile.delete();
				}
				if (logger.isLoggable(Level.WARNING)) {
					logger.warning("Failed to save resource " + getIODelegate().getSerializationArtefact());
				}
				getFlexoIOStreamDelegate().hasWrittenOnDisk(lock);
				throw new SaveResourceException(getIODelegate(), e);
			}
		}
		else {
			write(getOutputStream());
		}

		// Save meta data
		saveMetaData();

		getFlexoIOStreamDelegate().hasWrittenOnDisk(lock);
		if (clearIsModified) {
			notifyResourceStatusChanged();
		}
	}

	/**
	 * {@link ResourceData} internal loading implementation<br>
	 * (trivial here)
	 * 
	 * @param ioDelegate
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	private <I> RD load(StreamIODelegate<I> ioDelegate) throws IOException, ParseException {

		logger.info("Loading " + getIODelegate().getSerializationArtefact());
		RD returned = RPYParser.parse(ioDelegate.getInputStream(), getFactory());
		// readRawSource(ioDelegate);
		ioDelegate.getInputStream().close();
		return returned;

	}

	/**
	 * {@link ResourceData} internal saving implementation<br>
	 * (trivial here)
	 * 
	 * @throws IOException
	 */
	private void write(OutputStream out) throws SaveResourceException {
		logger.warning("Write NOT IMPLEMENTED: " + getIODelegate().getSerializationArtefact());
	}

	protected FileSystemMetaDataManager getMetaDataManager() {
		FlexoResourceCenter<?> rc = getResourceCenter();

		if (rc instanceof FlexoProject) {
			rc = ((FlexoProject<?>) rc).getDelegateResourceCenter();
		}

		if (rc instanceof FileSystemBasedResourceCenter) {
			return ((FileSystemBasedResourceCenter) rc).getMetaDataManager();
		}

		return null;
	}

	protected abstract void saveMetaData();

	/**
	 * Generic method used to retrieve in this resource an object with supplied objectIdentifier, userIdentifier, and type identifier<br>
	 * 
	 * Note that for certain resources, some parameters might not be used (for example userIdentifier or typeIdentifier)
	 * 
	 * @param objectIdentifier
	 * @param userIdentifier
	 * @param typeIdentifier
	 * @return
	 */
	@Override
	public FlexoObject findObject(String objectIdentifier, String userIdentifier, String typeIdentifier) {
		System.out.println("Je dois trouver l'objet avec l'ID " + objectIdentifier);
		// return getFlexoObject(Long.parseLong(objectIdentifier), userIdentifier);
		try {
			return getResourceData().getObjectWithID(objectIdentifier, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ResourceLoadingCancelledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FlexoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Used to compute identifier of an object asserting this object is the {@link ResourceData} itself, or a {@link InnerResourceData}
	 * object stored inside this resource
	 * 
	 * @param object
	 * @return a String identifying supplied object (semantics is composite key using userIdentifier and typeIdentifier)
	 */
	@Override
	public String getObjectIdentifier(Object object) {
		if (object instanceof RPYObject) {
			return ((RPYObject) object).getSerializationIdentifier();
		}
		return super.getObjectIdentifier(object);
	}

	@Override
	public RPYTechnologyAdapter getTechnologyAdapter() {
		if (getServiceManager() != null) {
			return getServiceManager().getTechnologyAdapterService().getTechnologyAdapter(RPYTechnologyAdapter.class);
		}
		return null;
	}

}
