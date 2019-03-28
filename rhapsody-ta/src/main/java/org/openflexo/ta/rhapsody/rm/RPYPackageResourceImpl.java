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
import org.openflexo.ta.rhapsody.model.ParseException;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYPackage;
import org.openflexo.ta.rhapsody.model.RPYPackageFactory;
import org.openflexo.ta.rhapsody.model.RPYParser;
import org.openflexo.toolbox.FileSystemMetaDataManager;
import org.openflexo.toolbox.FileUtils;

/**
 * Default implementation for a resource storing a {@link DSLSystem}
 * 
 * @author sylvain
 *
 */
public abstract class RPYPackageResourceImpl extends PamelaResourceImpl<RPYPackage, RPYPackageFactory> implements RPYPackageResource {

	private static final Logger logger = Logger.getLogger(RPYPackageResourceImpl.class.getPackage().getName());

	// private String rawSource = null;

	/**
	 * Convenient method to retrieve resource data
	 * 
	 * @return
	 */
	@Override
	public RPYPackage getRPYPackage() {
		try {
			return getResourceData();
		} catch (ResourceLoadingCancelledException e) {
			e.printStackTrace();
			return null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (FlexoException e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean isLoading = false;

	/**
	 * Load the resource data of this resource.
	 * 
	 * @return the resource data.
	 * @throws IOFlexoException
	 */
	@Override
	public RPYPackage loadResourceData() throws IOFlexoException {

		if (getFlexoIOStreamDelegate() == null) {
			throw new IOFlexoException("Cannot load document with this IO/delegate: " + getIODelegate());
		}

		RPYPackage resourceData = null;
		try {
			isLoading = true;
			resourceData = load(getFlexoIOStreamDelegate());
			getInputStream().close();
		} catch (IOException e) {
			throw new IOFlexoException(e);
		} catch (ParseException e) {
			throw new IOFlexoException(e.getMessage());
		} finally {
			isLoading = false;
		}

		if (resourceData == null) {
			logger.warning("canno't retrieve resource data from serialization artifact " + getIODelegate().toString());
			return null;
		}

		resourceData.setResource(this);
		setResourceData(resourceData);

		return resourceData;
	}

	@Override
	public boolean isLoading() {
		return isLoading;
	}

	/**
	 * Provides hook when {@link ResourceData} is unloaded
	 */
	@Override
	public void unloadResourceData(boolean deleteResourceData) {
		super.unloadResourceData(deleteResourceData);
	}

	/**
	 * Return type of {@link ResourceData}
	 */
	@Override
	public Class<RPYPackage> getResourceDataClass() {
		return RPYPackage.class;
	}

	/**
	 * Resource saving safe implementation<br>
	 * Initial resource is first copied, then we write in a temporary file, renamed at the end when the seriaization has been successfully
	 * performed
	 */
	@Override
	protected void _saveResourceData(boolean clearIsModified) throws SaveResourceException {

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
	private <I> RPYPackage load(StreamIODelegate<I> ioDelegate) throws IOException, ParseException {

		logger.info("Loading " + getIODelegate().getSerializationArtefact());
		RPYPackage returned = RPYParser.parse(ioDelegate.getInputStream(), getFactory());
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

	private String packageName;

	@Override
	public String getPackageName() {
		if (isLoaded()) {
			return getRPYPackage().getName();
		}
		else {
			packageName = findPackageNameInMetaData();
			if (packageName == null) {
				try {
					if (!isLoading()) {
						System.out.println("********** Loading " + this);
						loadResourceData();
						packageName = getRPYPackage().getName();
						saveMetaData();
					}
				} catch (IOFlexoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return packageName;
		}
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

	private String findPackageNameInMetaData() {

		FileSystemMetaDataManager metaDataManager = getMetaDataManager();
		if (metaDataManager != null && getIODelegate().getSerializationArtefact() instanceof File) {
			File file = (File) getIODelegate().getSerializationArtefact();
			if (file.lastModified() < metaDataManager.metaDataLastModified(file)) {
				return metaDataManager.getProperty("packageName", file);
			}
		}
		return null;
	}

	private void saveMetaData() {
		FileSystemMetaDataManager metaDataManager = getMetaDataManager();
		if (metaDataManager != null && getIODelegate().getSerializationArtefact() instanceof File) {
			File file = (File) getIODelegate().getSerializationArtefact();
			metaDataManager.setProperty("packageName", getLoadedResourceData().getName(), file, true);
		}
	}

	@Override
	public void updateResourceData() {

		if (resourceData == null) {
			System.out.println("Do not update BResource since it this not loaded yet");
			return;
		}

		System.out.println("Updating from disk version");
		RPYPackage reloadedResourceData;
		try {

			System.out.println("On recharge la resource");
			// Reload resource data
			reloadedResourceData = load(getFlexoIOStreamDelegate());
			reloadedResourceData.setResource(this);

			System.out.println("On obtient " + getFactory().stringRepresentation(reloadedResourceData));

			System.out.println("Et ensuite on update");

			// Now perform PAMELA updating with reloaded resource data
			// Existing model will be updated and notified
			resourceData.updateWith(reloadedResourceData);

			// TODO: set new pretty-print delegates to old objects

			System.out.println("Hop");

			System.out.println("Apres le updateWith " + getFactory().stringRepresentation(resourceData));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
			return getResourceData().getObjectWithSerializationIdentifier(objectIdentifier);
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
}
