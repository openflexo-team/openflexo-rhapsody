/*
 * (c) Copyright 2013 Openflexo
 *
 * This file is part of OpenFlexo.
 *
 * OpenFlexo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenFlexo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenFlexo. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.openflexo.ta.rhapsody.rm;

import java.io.IOException;
import java.util.logging.Logger;

import org.openflexo.foundation.resource.FlexoIODelegate;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.resource.RepositoryFolder;
import org.openflexo.foundation.resource.SaveResourceException;
import org.openflexo.foundation.resource.TechnologySpecificPamelaResourceFactory;
import org.openflexo.foundation.technologyadapter.TechnologyContextManager;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.model.RPYProject;
import org.openflexo.ta.rhapsody.model.RPYProjectFactory;

/**
 * Implementation of PamelaResourceFactory for {@link ViewPointResource}
 * 
 * @author sylvain
 *
 */
public class RPYProjectResourceFactory
		extends TechnologySpecificPamelaResourceFactory<RPYProjectResource, RPYProject, RPYTechnologyAdapter, RPYProjectFactory> {

	private static final Logger logger = Logger.getLogger(RPYProjectResourceFactory.class.getPackage().getName());

	public static final String RPY_DIR_SUFFIX = "_rpy";
	public static final String CORE_FILE_SUFFIX = ".rpy";

	private final RPYPackageResourceFactory packageResourceFactory;

	public RPYProjectResourceFactory() throws ModelDefinitionException {
		super(RPYProjectResource.class);
		packageResourceFactory = new RPYPackageResourceFactory();
	}

	public RPYPackageResourceFactory getPackageResourceFactory() {
		return packageResourceFactory;
	}

	@Override
	public RPYProject makeEmptyResourceData(RPYProjectResource resource) {
		return resource.getFactory().makeProject();
	}

	@Override
	public RPYProjectFactory makeModelFactory(RPYProjectResource resource,
			TechnologyContextManager<RPYTechnologyAdapter> technologyContextManager) throws ModelDefinitionException {
		return new RPYProjectFactory(resource, technologyContextManager.getServiceManager().getEditingContext());
	}

	@Override
	public <I> boolean isValidArtefact(I serializationArtefact, FlexoResourceCenter<I> resourceCenter) {

		if (resourceCenter.exists(serializationArtefact) && resourceCenter.isDirectory(serializationArtefact)
				&& resourceCenter.canRead(serializationArtefact)) {
			boolean hasCoreFile = false;
			boolean hasDirectory = false;
			String expectedCoreFile = resourceCenter.retrieveName(serializationArtefact) + CORE_FILE_SUFFIX;
			String expectedDirectory = resourceCenter.retrieveName(serializationArtefact) + RPY_DIR_SUFFIX;

			for (I i : resourceCenter.getContents(serializationArtefact)) {
				if (resourceCenter.retrieveName(i).equals(expectedCoreFile)) {
					hasCoreFile = true;
				}
				if (resourceCenter.retrieveName(i).equals(expectedDirectory)) {
					hasDirectory = true;
				}
			}
			return hasCoreFile && hasDirectory;
		}
		return false;
	}

	public <I> RPYProjectResource makeRPYProjectResource(String baseName, String uri, RepositoryFolder<RPYProjectResource, I> folder,
			boolean createEmptyContents) throws SaveResourceException, ModelDefinitionException {

		FlexoResourceCenter<I> resourceCenter = folder.getResourceRepository().getResourceCenter();

		String artefactName = baseName;
		I serializationArtefact = resourceCenter.createDirectory(artefactName, folder.getSerializationArtefact());
		return makeResource(serializationArtefact, resourceCenter, baseName, uri, createEmptyContents);
	}

	@Override
	protected <I> RPYProjectResource registerResource(RPYProjectResource resource, FlexoResourceCenter<I> resourceCenter) {

		System.out.println("On enregistre: " + resource);
		System.out.println("artefact:" + resource.getIODelegate().getSerializationArtefact());

		super.registerResource(resource, resourceCenter);

		// Register the resource in the right repository of supplied resource center
		registerResourceInResourceRepository(resource,
				getTechnologyAdapter(resourceCenter.getServiceManager()).getRPYProjectResourceRepository(resourceCenter));

		// Now look inside
		exploreRPYProjectContents(resource);

		return resource;

	}

	@Override
	protected <I> RPYProjectResource initResourceForCreation(I serializationArtefact, FlexoResourceCenter<I> resourceCenter, String name,
			String uri) throws ModelDefinitionException {
		RPYProjectResource returned = super.initResourceForCreation(serializationArtefact, resourceCenter, name, uri);
		return returned;
	}

	@Override
	protected <I> RPYProjectResource initResourceForRetrieving(I serializationArtefact, FlexoResourceCenter<I> resourceCenter)
			throws ModelDefinitionException, IOException {

		RPYProjectResource returned = super.initResourceForRetrieving(serializationArtefact, resourceCenter);

		String artefactName = resourceCenter.retrieveName(serializationArtefact);
		String baseName = artefactName;

		returned.initName(baseName);

		return returned;
	}

	@Override
	protected <I> FlexoIODelegate<I> makeFlexoIODelegate(I serializationArtefact, FlexoResourceCenter<I> resourceCenter) {
		String artefactName = resourceCenter.retrieveName(serializationArtefact);
		System.out.println("On contruit le IODelegate pour " + serializationArtefact);
		I rpyDir = resourceCenter.getDirectory(artefactName + RPY_DIR_SUFFIX, serializationArtefact);
		if (!resourceCenter.exists(rpyDir)) {
			rpyDir = resourceCenter.createDirectory(artefactName + RPY_DIR_SUFFIX, serializationArtefact);
		}
		I rpyFile = resourceCenter.getEntry(artefactName + CORE_FILE_SUFFIX, serializationArtefact);
		if (!resourceCenter.exists(rpyFile)) {
			rpyFile = resourceCenter.createEntry(artefactName + CORE_FILE_SUFFIX, serializationArtefact);
		}
		return resourceCenter.makeDirectoryBasedFlexoIODelegate(serializationArtefact, rpyFile, this);
	}

	private void exploreRPYProjectContents(RPYProjectResource projectResource) {

		exploreResource(projectResource.getIODelegate().getSerializationArtefact(), projectResource);
	}

	@SuppressWarnings("unchecked")
	private <I> void exploreResource(I serializationArtefact, RPYProjectResource projectResource) {
		if (serializationArtefact == null) {
			return;
		}

		FlexoResourceCenter<I> resourceCenter = (FlexoResourceCenter<I>) projectResource.getResourceCenter();
		I projectArtefact = resourceCenter.getContainer(resourceCenter.getContainer(serializationArtefact));

		for (I child : resourceCenter.getContents(projectArtefact)) {
			if (getPackageResourceFactory().isValidArtefact(child, resourceCenter)) {
				try {
					RPYPackageResource bRes = getPackageResourceFactory().retrieveInnerPackageResource(child, projectResource);
				} catch (ModelDefinitionException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*private static class AtelierBProjectInfo {
		public String uri;
		public String version;
		public String name;
		public String modelVersion;
	}
	
	private static <I> AtelierBProjectInfo findAtelierBProjectInfo(AtelierBProjectResource resource,
			FlexoResourceCenter<I> resourceCenter) {
	
		AtelierBProjectInfo returned = new AtelierBProjectInfo();
		XMLRootElementInfo xmlRootElementInfo = resourceCenter
				.getXMLRootElementInfo((I) resource.getIODelegate().getSerializationArtefact());
		if (xmlRootElementInfo == null) {
			return null;
		}
		if (xmlRootElementInfo.getName().equals("AtelierBProject")) {
			returned.name = xmlRootElementInfo.getAttribute(AtelierBProject.NAME_KEY);
			returned.uri = xmlRootElementInfo.getAttribute(AtelierBProject.URI_KEY);
			returned.version = xmlRootElementInfo.getAttribute("version");
			returned.modelVersion = xmlRootElementInfo.getAttribute("modelVersion");
		}
		return returned;
	}*/

	/*public static AtelierBProjectResource makeAtelierBProjectResource(String name, RepositoryFolder<?, ?> folder, String uri,
			FlexoResourceCenter<?> resourceCenter, FlexoServiceManager serviceManager) {
		try {
			// File diagramSpecificationDirectory = new File(folder.getFile(), name + DIAGRAM_SPECIFICATION_SUFFIX);
			ModelFactory factory = new ModelFactory(
					ModelContextLibrary.getCompoundModelContext(DirectoryBasedFlexoIODelegate.class, AtelierBProjectResource.class));
			AtelierBProjectResourceImpl returned = (AtelierBProjectResourceImpl) factory
					.newInstance(AtelierBProjectResource.class);
	
			// String baseName = name;
			// File diagramSpecificationXMLFile = new File(diagramSpecificationDirectory, baseName + ".xml");
			returned.initName(name);
	
			returned.setFlexoIODelegate(DirectoryBasedFlexoIODelegateImpl.makeDirectoryBasedFlexoIODelegate(folder.getFile(),
					DIAGRAM_SPECIFICATION_SUFFIX, CORE_FILE_SUFFIX, returned, factory));
	
			// returned.setFlexoIODelegate(FileFlexoIODelegateImpl.makeFileFlexoIODelegate(diagramSpecificationXMLFile, factory));
			AtelierBProjectFactory diagramSpecificationFactory = new AtelierBProjectFactory(returned,
					serviceManager.getEditingContext());
			returned.setFactory(diagramSpecificationFactory);
			returned.setURI(uri);
			returned.setResourceCenter(resourceCenter);
			returned.setServiceManager(serviceManager);
			// viewPointResource.addToContents(returned);
			// viewPointResource.notifyContentsAdded(returned);
			AtelierBProject newDiagram = returned.getFactory().makeNewAtelierBProject();
			newDiagram.setResource(returned);
			returned.setResourceData(newDiagram);
			newDiagram.setURI(uri);
			return returned;
		} catch (ModelDefinitionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static AtelierBProjectResource retrieveAtelierBProjectResource(File diagramSpecificationDirectory,
			RepositoryFolder<?> folder, FlexoResourceCenter<?> resourceCenter, FlexoServiceManager serviceManager) {
		try {
			ModelFactory factory = new ModelFactory(
					ModelContextLibrary.getCompoundModelContext(DirectoryBasedFlexoIODelegate.class, AtelierBProjectResource.class));
			AtelierBProjectResourceImpl returned = (AtelierBProjectResourceImpl) factory
					.newInstance(AtelierBProjectResource.class);
	
			String baseName = diagramSpecificationDirectory.getName().substring(0,
					diagramSpecificationDirectory.getName().length() - DIAGRAM_SPECIFICATION_SUFFIX.length());
	
			returned.initName(baseName);
			File diagramSpecificationXMLFile = new File(diagramSpecificationDirectory, baseName + ".xml");
	
			AtelierBProjectInfo vpi = null;
			try {
				vpi = findAtelierBProjectInfo(new FileInputStream(diagramSpecificationXMLFile));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			if (vpi == null) {
				// Unable to retrieve infos, just abort
				logger.warning("Cannot retrieve info for diagram specification " + diagramSpecificationDirectory);
				return null;
			}
			returned.setURI(vpi.uri);
			returned.initName(vpi.name);
	
			returned.setFlexoIODelegate(DirectoryBasedFlexoIODelegateImpl.makeDirectoryBasedFlexoIODelegate(
					diagramSpecificationDirectory.getParentFile(), DIAGRAM_SPECIFICATION_SUFFIX, CORE_FILE_SUFFIX, returned, factory));
	
			// returned.setFlexoIODelegate(FileFlexoIODelegateImpl.makeFileFlexoIODelegate(diagramSpecificationXMLFile, factory));
			AtelierBProjectFactory diagramSpecificationFactory = new AtelierBProjectFactory(returned,
					serviceManager.getEditingContext());
			returned.setFactory(diagramSpecificationFactory);
	
			// TODO: why do we set the name twice ???
			returned.initName(vpi.name);
			if (StringUtils.isNotEmpty(vpi.version)) {
				returned.setVersion(new FlexoVersion(vpi.version));
			}
			returned.setModelVersion(new FlexoVersion(StringUtils.isNotEmpty(vpi.modelVersion) ? vpi.modelVersion : "0.1"));
	
			returned.setResourceCenter(resourceCenter);
			returned.setServiceManager(serviceManager);
	
			logger.fine("AtelierBProjectResource " + diagramSpecificationDirectory.getAbsolutePath() + " version "
					+ returned.getModelVersion());
	
			if (returned.getDirectory() != null) {
				returned.exploreInternalResources(returned.getDirectory());
			}
	
			return returned;
		} catch (ModelDefinitionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static AtelierBProjectResource retrieveAtelierBProjectResource(InJarResourceImpl inJarResource,
			FlexoResourceCenter<?> resourceCenter, FlexoServiceManager serviceManager) {
		try {
			ModelFactory factory = new ModelFactory(
					ModelContextLibrary.getCompoundModelContext(InJarFlexoIODelegate.class, AtelierBProjectResource.class));
			AtelierBProjectResourceImpl returned = (AtelierBProjectResourceImpl) factory
					.newInstance(AtelierBProjectResource.class);
			returned.setFlexoIODelegate(InJarFlexoIODelegateImpl.makeInJarFlexoIODelegate(inJarResource, factory));
			AtelierBProjectFactory diagramSpecificationFactory = new AtelierBProjectFactory(returned,
					serviceManager.getEditingContext());
			returned.setFactory(diagramSpecificationFactory);
			AtelierBProjectInfo vpi = findAtelierBProjectInfo(returned.getFlexoIOStreamDelegate().getInputStream());
			if (vpi == null) {
				// Unable to retrieve infos, just abort
				// logger.warning("Cannot retrieve info for diagram specification " + diagramSpecificationDirectory);
				return null;
			}
			returned.setURI(vpi.uri);
	
			returned.initName(vpi.name);
			if (StringUtils.isNotEmpty(vpi.version)) {
				returned.setVersion(new FlexoVersion(vpi.version));
			}
			returned.setModelVersion(new FlexoVersion(StringUtils.isNotEmpty(vpi.modelVersion) ? vpi.modelVersion : "0.1"));
	
			returned.setResourceCenter(resourceCenter);
			returned.setServiceManager(serviceManager);
	
			returned.exploreInternalResources(returned.getDirectory());
	
			return returned;
		} catch (ModelDefinitionException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void exploreInternalResources(Resource parent) {
		XMLRootElementInfo result = null;
	
		for (Resource child : parent.getContents()) {
			if (child.isContainer()) {
				exploreInternalResources(child);
			}
			else {
				try {
					if (child.getURI().endsWith(".diagram")) {
						result = reader.readRootElement(child);
						// Serialization artefact is File
						if (result.getName().equals("Diagram") && getFlexoIODelegate() instanceof FileFlexoIODelegate) {
							DiagramResource exampleDiagramResource = getTechnologyAdapter().getTechnologyContextManager()
									.getDiagramResource(((FileFlexoIODelegate) getFlexoIODelegate()).getFile());
							if (exampleDiagramResource == null) {
								exampleDiagramResource = DiagramResourceImpl.retrieveDiagramResource(
										ResourceLocator.retrieveResourceAsFile(child), getResourceCenter(), getServiceManager());
							}
							addToContents(exampleDiagramResource);
							if (exampleDiagramResource.getMetaModelResource() == null) {
								exampleDiagramResource.setMetaModelResource(this);
							}
							getTechnologyAdapter().getTechnologyContextManager().registerDiagram(exampleDiagramResource);
							logger.fine("ExampleDiagramResource " + exampleDiagramResource.getFlexoIODelegate().toString() + " version "
									+ exampleDiagramResource.getModelVersion());
						}
						// Serialization artefact is InJarResource
						else if (result.getName().equals("Diagram") && getFlexoIODelegate() instanceof InJarFlexoIODelegate) {
							DiagramResource exampleDiagramResource = DiagramResourceImpl.retrieveDiagramResource((InJarResourceImpl) child,
									getResourceCenter(), getServiceManager());
							addToContents(exampleDiagramResource);
							if (exampleDiagramResource.getMetaModelResource() == null) {
								exampleDiagramResource.setMetaModelResource(this);
							}
						}
					}
					if (child.getURI().endsWith(".palette")) {
						result = reader.readRootElement(child);
						// Serialization artefact is File
						if (result.getName().equals("DiagramPalette") && getFlexoIODelegate() instanceof FileFlexoIODelegate) {
							DiagramPaletteResource diagramPaletteResource = DiagramPaletteResourceImpl.retrieveDiagramPaletteResource(this,
									ResourceLocator.retrieveResourceAsFile(child), getServiceManager());
							addToContents(diagramPaletteResource);
						}
						// Serialization artefact is InJarResource
						else if (result.getName().equals("DiagramPalette") && getFlexoIODelegate() instanceof InJarFlexoIODelegate) {
							DiagramPaletteResource diagramPaletteResource = DiagramPaletteResourceImpl.retrieveDiagramPaletteResource(this,
									(InJarResourceImpl) child, getServiceManager());
							addToContents(diagramPaletteResource);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}*/

}
