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

package org.openflexo.ta.rhapsody.metamodel;

import java.util.List;

import org.openflexo.pamela.annotations.Adder;
import org.openflexo.pamela.annotations.Finder;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.Getter.Cardinality;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Remover;
import org.openflexo.pamela.annotations.Setter;

@ModelEntity
// @ImplementationClass(value = RPYConcept.RPYConceptImpl.class)
public interface RPYConcept {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYProperty.class, cardinality = Cardinality.LIST)
	public static final String PROPERTIES_KEY = "properties";

	/**
	 * Return name of this package
	 * 
	 * @return
	 */
	@Getter(value = NAME_KEY)
	public String getName();

	/**
	 * Sets name of this package
	 * 
	 * @return
	 */
	@Setter(NAME_KEY)
	public void setName(String aName);

	@Getter(value = PROPERTIES_KEY, cardinality = Cardinality.LIST, inverse = RPYProperty.CONCEPT_KEY)
	public List<RPYProperty> getProperties();

	@Adder(PROPERTIES_KEY)
	public void addToProperties(RPYProperty aProperty);

	@Remover(PROPERTIES_KEY)
	public void removeFromProperties(RPYProperty aProperty);

	@Finder(attribute = RPYProperty.NAME_KEY, collection = PROPERTIES_KEY)
	public RPYProperty getPropertyNamed(String name);

}
