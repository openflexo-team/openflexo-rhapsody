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

import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;

@ModelEntity
public interface RPYProperty {

	public enum PropertyType {
		String, Chars, Number, NumberList, Id, Identifier, Object, Style, DateTime
	}

	public enum Cardinality {
		Single, Multiple
	}

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = PropertyType.class)
	public static final String TYPE_KEY = "type";
	@PropertyIdentifier(type = Cardinality.class)
	public static final String CARDINALITY_KEY = "cardinality";
	@PropertyIdentifier(type = RPYConcept.class)
	public static final String CONCEPT_KEY = "concept";

	@Getter(value = NAME_KEY)
	public String getName();

	@Setter(NAME_KEY)
	public void setName(String aName);

	@Getter(value = TYPE_KEY, defaultValue = "String")
	public PropertyType getType();

	@Setter(TYPE_KEY)
	public void setType(PropertyType aType);

	@Getter(value = CARDINALITY_KEY, defaultValue = "Single")
	public Cardinality getCardinality();

	@Setter(CARDINALITY_KEY)
	public void setCardinality(Cardinality aCardinality);

	@Getter(value = CONCEPT_KEY)
	public RPYConcept getConcept();

	@Setter(CONCEPT_KEY)
	public void setConcept(RPYConcept aConcept);

}
