/**
 * 
 * Copyright (c) 2014, Openflexo
 * 
 * This file is part of Flexodiagram, a component of the software infrastructure 
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

import org.apache.commons.io.FilenameUtils;
import org.openflexo.foundation.FlexoException;
import org.openflexo.foundation.IOFlexoException;
import org.openflexo.foundation.InconsistentDataException;
import org.openflexo.foundation.InvalidModelDefinitionException;
import org.openflexo.foundation.InvalidXMLException;
import org.openflexo.foundation.resource.FileIODelegate;
import org.openflexo.foundation.resource.FlexoFileNotFoundException;
import org.openflexo.foundation.resource.InJarIODelegate;
import org.openflexo.foundation.resource.ResourceLoadingCancelledException;
import org.openflexo.rm.BasicResourceImpl;
import org.openflexo.rm.ClasspathResourceLocatorImpl;
import org.openflexo.rm.FileSystemResourceLocatorImpl;
import org.openflexo.rm.InJarResourceImpl;
import org.openflexo.rm.Resource;
import org.openflexo.rm.ResourceLocator;
import org.openflexo.ta.rhapsody.model.RPYProject;
import org.openflexo.ta.rhapsody.model.RPYProjectFactory;
import org.openflexo.toolbox.FileSystemMetaDataManager;

/**
 * Default implementation for a resource storing a {@link RPYProject}
 * 
 * @author sylvain
 *
 */
public abstract class RPYProjectResourceImpl extends RPYResourceImpl<RPYProject, RPYProjectFactory> implements RPYProjectResource {

	static final Logger logger = Logger.getLogger(RPYProjectResourceImpl.class.getPackage().getName());

	@Override
	public Class<RPYProject> getResourceDataClass() {
		return RPYProject.class;
	}

	/**
	 * Return virtual model stored by this resource<br>
	 * Load the resource data when unloaded
	 */
	@Override
	public RPYProject getRPYProject() {
		try {
			return getResourceData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ResourceLoadingCancelledException e) {
			e.printStackTrace();
		} catch (FlexoException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Return virtual model stored by this resource when loaded<br>
	 * Do not force the resource data to be loaded
	 */
	@Override
	public RPYProject getLoadedRPYProject() {
		if (isLoaded()) {
			return getRPYProject();
		}
		return null;
	}

	@Override
	public boolean delete(Object... context) {
		if (super.delete(context)) {
			getServiceManager().getResourceManager().addToFilesToDelete(ResourceLocator.retrieveResourceAsFile(getDirectory()));
			return true;
		}

		return false;
	}

	@Override
	public Resource getDirectory() {
		if (getIODelegate() instanceof FileIODelegate) {
			String parentPath = ((FileIODelegate) getIODelegate()).getFile().getParentFile().getAbsolutePath();
			if (ResourceLocator.locateResource(parentPath) == null) {
				FileSystemResourceLocatorImpl.appendDirectoryToFileSystemResourceLocator(parentPath);
			}
			return ResourceLocator.locateResource(parentPath);
		}
		else if (getIODelegate() instanceof InJarIODelegate) {
			InJarResourceImpl resource = ((InJarIODelegate) getIODelegate()).getInJarResource();
			String parentPath = FilenameUtils.getFullPath(resource.getRelativePath());
			BasicResourceImpl parent = ((ClasspathResourceLocatorImpl) (resource.getLocator())).getJarResourcesList().get(parentPath);
			return parent;
		}
		return null;
	}

	private String projectName;

	public String getProjectName() {
		if (isLoaded()) {
			return getRPYProject().getName();
		}
		else {
			projectName = findProjectNameInMetaData();
			if (projectName == null) {
				try {
					if (!isLoading()) {
						System.out.println("********** Loading " + this);
						loadResourceData();
						projectName = getRPYProject().getName();
						saveMetaData();
					}
				} catch (IOFlexoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FlexoFileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidXMLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InconsistentDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidModelDefinitionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return projectName;
		}
	}

	private String findProjectNameInMetaData() {

		FileSystemMetaDataManager metaDataManager = getMetaDataManager();
		if (metaDataManager != null && getIODelegate().getSerializationArtefact() instanceof File) {
			File file = (File) getIODelegate().getSerializationArtefact();
			if (file.lastModified() < metaDataManager.metaDataLastModified(file)) {
				return metaDataManager.getProperty("projectName", file);
			}
		}
		return null;
	}

	@Override
	protected void saveMetaData() {
		FileSystemMetaDataManager metaDataManager = getMetaDataManager();
		if (metaDataManager != null && getIODelegate().getSerializationArtefact() instanceof File) {
			File file = (File) getIODelegate().getSerializationArtefact();
			metaDataManager.setProperty("projectName", getLoadedResourceData().getName(), file, true);
		}
	}

}
