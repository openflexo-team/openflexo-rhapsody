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

import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.resource.SaveResourceException;
import org.openflexo.foundation.resource.TechnologySpecificPamelaResourceFactory;
import org.openflexo.foundation.technologyadapter.TechnologyContextManager;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.model.RPYPackage;
import org.openflexo.ta.rhapsody.model.RPYPackageFactory;

/**
 * Implementation of PamelaResourceFactory for {@link RPYPackageResource} inside a {@link AtelierBProjectResource}
 * 
 * @author sylvain
 *
 */
public class RPYPackageResourceFactory
		extends TechnologySpecificPamelaResourceFactory<RPYPackageResource, RPYPackage, RPYTechnologyAdapter, RPYPackageFactory> {

	private static final Logger logger = Logger.getLogger(RPYPackageResourceFactory.class.getPackage().getName());

	public static final String SBS_FILE_SUFFIX = ".sbs";

	public RPYPackageResourceFactory() throws ModelDefinitionException {
		super(RPYPackageResource.class);
	}

	@Override
	public RPYPackage makeEmptyResourceData(RPYPackageResource resource) {
		return resource.getFactory().makePackage();
	}

	@Override
	public <I> boolean isValidArtefact(I serializationArtefact, FlexoResourceCenter<I> resourceCenter) {

		return resourceCenter.retrieveName(serializationArtefact).endsWith(SBS_FILE_SUFFIX);
	}

	@Override
	protected <I> RPYPackageResource registerResource(RPYPackageResource resource, FlexoResourceCenter<I> resourceCenter) {
		super.registerResource(resource, resourceCenter);

		// Register the resource in the repository of supplied resource center
		// registerResourceInResourceRepository(resource,
		// getTechnologyAdapter(resourceCenter.getServiceManager()).getBResourceRepository(resourceCenter));

		return resource;
	}

	@Override
	public RPYPackageFactory makeModelFactory(RPYPackageResource resource,
			TechnologyContextManager<RPYTechnologyAdapter> technologyContextManager) throws ModelDefinitionException {
		return new RPYPackageFactory(resource, (RPYTechnologyContextManager) technologyContextManager);
	}

	public <I> RPYPackageResource retrieveInnerPackageResource(I serializationArtefact, RPYProjectResource projectResource)
			throws ModelDefinitionException, IOException {

		FlexoResourceCenter<I> resourceCenter = (FlexoResourceCenter<I>) projectResource.getResourceCenter();
		String name = resourceCenter.retrieveName(serializationArtefact);

		RPYPackageResource returned = initResourceForRetrieving(serializationArtefact, resourceCenter);
		returned.setURI(projectResource.getURI() + "/" + name);

		projectResource.addToContents(returned);
		projectResource.notifyContentsAdded(returned);

		registerPackageResource(returned, projectResource);
		registerResource(returned, resourceCenter);

		return returned;
	}

	private void registerPackageResource(RPYPackageResource returned, RPYProjectResource projectResource) {
		/*String name = returned.getName().substring(0, returned.getName().lastIndexOf("."));
		AtelierBComponent component = projectResource.getAtelierBProject().getAtelierBProjectDefinition().getComponentNamed(name);
		if (component != null) {
			component.setComponentResource(returned);
		}
		else {
			logger.warning("No component definition for name:" + name);
		}*/
		logger.warning("Y'aurait pas un truc a faire la pour :" + returned);
	}

	public <I> RPYPackageResource makeInnerPackageResource(String name, RPYProjectResource projectResource, boolean createEmptyContents)
			throws SaveResourceException, ModelDefinitionException {

		FlexoResourceCenter<I> resourceCenter = (FlexoResourceCenter<I>) projectResource.getResourceCenter();
		I dbArtefact = resourceCenter.getContainer((I) projectResource.getIODelegate().getSerializationArtefact());
		I containerArtefact = resourceCenter.getContainer(dbArtefact);

		I serializationArtefact = resourceCenter.createEntry(name, containerArtefact);

		RPYPackageResource returned = initResourceForCreation(serializationArtefact, resourceCenter, name,
				projectResource.getURI() + "/" + name);

		projectResource.addToContents(returned);
		projectResource.notifyContentsAdded(returned);

		registerPackageResource(returned, projectResource);
		registerResource(returned, resourceCenter);

		if (createEmptyContents) {
			RPYPackage resourceData = makeEmptyResourceData(returned);
			resourceData.setResource(returned);
			returned.setResourceData(resourceData);
			returned.setModified(true);
			returned.save();
		}

		return returned;
	}

}
