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

import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.pamela.factory.PamelaModelFactory;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.rm.RPYPackageResource;

/**
 * A {@link PamelaModelFactory} used to manage a {@link RPYPackage}<br>
 * One instance of this class should be used for each {@link RPYPackageResource}
 * 
 * @author sylvain
 * 
 */
public class RPYPackageFactory extends RPYModelFactory<RPYPackage, RPYPackageResource> {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RPYPackageFactory.class.getPackage().getName());

	public RPYPackageFactory(RPYPackageResource resource, RPYTechnologyContextManager technologyContextManager)
			throws ModelDefinitionException {
		super(RPYPackage.class, resource, technologyContextManager);
	}

	public RPYPackage makePackage() {
		return newInstance(RPYPackage.class);
	}

	@Override
	public RPYObject makeObject(RPYConcept concept) {
		if (concept.getName().equals("ISubsystem")) {
			RPYPackage returned = makePackage();
			returned.setConcept(concept);
			setRootObject(returned);
			return returned;
		}
		else if (concept.getName().equals("IClass")) {
			RPYClass returned = newInstance(RPYClass.class);
			returned.setConcept(concept);
			return returned;
		}
		else if (concept.getName().equals("IEvent")) {
			RPYEvent returned = newInstance(RPYEvent.class);
			returned.setConcept(concept);
			return returned;
		}
		else if (concept.getName().equals("IAssociationEnd")) {
			RPYAssociationEnd returned = newInstance(RPYAssociationEnd.class);
			returned.setConcept(concept);
			return returned;
		}
		else if (concept.getName().equals("IPart")) {
			RPYPart returned = newInstance(RPYPart.class);
			returned.setConcept(concept);
			return returned;
		}
		else if (concept.getName().equals("IReception")) {
			RPYReception returned = newInstance(RPYReception.class);
			returned.setConcept(concept);
			return returned;
		}
		else if (concept.getName().equals("IPrimitiveOperation")) {
			RPYPrimitiveOperation returned = newInstance(RPYPrimitiveOperation.class);
			returned.setConcept(concept);
			return returned;
		}
		return super.makeObject(concept);
	}

}
