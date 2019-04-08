/*
 * (c) Copyright 2013- Openflexo
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

package org.openflexo.ta.rhapsody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.openflexo.foundation.resource.FlexoResourceCenterService;
import org.openflexo.foundation.technologyadapter.TechnologyContextManager;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.pamela.factory.ModelFactory;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty.PropertyType;

public class RPYTechnologyContextManager extends TechnologyContextManager<RPYTechnologyAdapter> {

	private ModelFactory metaModelFactory;

	public RPYTechnologyContextManager(RPYTechnologyAdapter adapter, FlexoResourceCenterService resourceCenterService) {
		super(adapter, resourceCenterService);
		try {
			metaModelFactory = new ModelFactory(RPYConcept.class);
		} catch (ModelDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Stores all known RPYConcept */
	protected Map<String, RPYConcept> rpyConcepts = new HashMap<>();

	public Collection<RPYConcept> getRPYConcepts() {
		return rpyConcepts.values();
	}

	public RPYConcept getRPYConcept(String conceptName) {
		RPYConcept returned = rpyConcepts.get(conceptName);
		if (returned == null) {
			// System.out.println("******* New concept " + conceptName);
			returned = metaModelFactory.newInstance(RPYConcept.class);
			returned.setName(conceptName);
			rpyConcepts.put(conceptName, returned);
		}
		return returned;
	}

	public RPYProperty ensureProperty(String propertyName, PropertyType type, RPYConcept concept) {
		RPYProperty returned = null;
		for (RPYProperty property : concept.getProperties()) {
			if (property.getName().equals(propertyName)) {
				returned = property;
				break;
			}
		}
		if (returned == null) {
			// System.out.println("******* New property " + propertyName + " in " + concept);
			returned = metaModelFactory.newInstance(RPYProperty.class);
			returned.setName(propertyName);
			returned.setType(type);
			concept.addToProperties(returned);
		}
		return returned;
	}

}
