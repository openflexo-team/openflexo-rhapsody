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

package org.openflexo.ta.rhapsody.model;

import java.util.logging.Logger;

import org.openflexo.pamela.converter.RelativePathResourceConverter;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;

/**
 * A {@link RPYModelFactory} used to manage a {@link RPYProject}<br>
 * One instance of this class should be used for each {@link RPYProjectResource}
 * 
 * @author sylvain
 * 
 */
public class RPYProjectFactory extends RPYModelFactory<RPYProject, RPYProjectResource> {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RPYProjectFactory.class.getPackage().getName());

	private RelativePathResourceConverter relativePathResourceConverter;

	public RPYProjectFactory(RPYProjectResource resource, RPYTechnologyContextManager technologyContextManager)
			throws ModelDefinitionException {
		super(RPYProject.class, resource, technologyContextManager);
		addConverter(relativePathResourceConverter = new RelativePathResourceConverter(null));
		if (resource != null && resource.getIODelegate() != null && resource.getIODelegate().getSerializationArtefactAsResource() != null) {
			relativePathResourceConverter
					.setContainerResource(resource.getIODelegate().getSerializationArtefactAsResource().getContainer());
		}
	}

	public RPYProject makeProject() {
		return newInstance(RPYProject.class);
	}

	@Override
	public RPYObject makeObject(RPYConcept concept) {
		if (concept.getName().equals("IProject")) {
			RPYProject returned = makeProject();
			returned.setConcept(concept);
			setRootObject(returned);
			return returned;
		}
		if (concept.getName().equals("IProfile")) {
			RPYProfile returned = newInstance(RPYProfile.class);
			returned.setConcept(concept);
			return returned;
		}
		return super.makeObject(concept);
	}

}
