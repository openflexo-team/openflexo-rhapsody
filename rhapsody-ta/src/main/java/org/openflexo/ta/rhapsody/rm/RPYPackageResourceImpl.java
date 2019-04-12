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
import java.util.logging.Logger;

import org.openflexo.foundation.FlexoException;
import org.openflexo.foundation.IOFlexoException;
import org.openflexo.foundation.resource.ResourceData;
import org.openflexo.foundation.resource.ResourceLoadingCancelledException;
import org.openflexo.ta.rhapsody.model.RPYPackage;
import org.openflexo.ta.rhapsody.model.RPYPackageFactory;
import org.openflexo.toolbox.FileSystemMetaDataManager;

/**
 * Default implementation for a resource storing a {@link RPYPackage}
 * 
 * @author sylvain
 *
 */
public abstract class RPYPackageResourceImpl extends RPYResourceImpl<RPYPackage, RPYPackageFactory> implements RPYPackageResource {

	private static final Logger logger = Logger.getLogger(RPYPackageResourceImpl.class.getPackage().getName());

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

	/**
	 * Return type of {@link ResourceData}
	 */
	@Override
	public Class<RPYPackage> getResourceDataClass() {
		return RPYPackage.class;
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

	@Override
	protected void saveMetaData() {
		FileSystemMetaDataManager metaDataManager = getMetaDataManager();
		if (metaDataManager != null && getIODelegate().getSerializationArtefact() instanceof File) {
			File file = (File) getIODelegate().getSerializationArtefact();
			metaDataManager.setProperty("packageName", getLoadedResourceData().getName(), file, true);
		}
	}

	/*@Override
	public RPYPackage loadResourceData() throws IOFlexoException {
		System.out.println("Hop c'est la !!!");
		Thread.dumpStack();
		return super.loadResourceData();
	}*/
}
