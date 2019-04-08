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

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.technologyadapter.TechnologyObject;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.Import;
import org.openflexo.pamela.annotations.Imports;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.toolbox.StringUtils;

/**
 * Common API for all objects involved in Rhapsody model
 * 
 * @author sylvain
 *
 */
@ModelEntity(isAbstract = true)
@ImplementationClass(value = RPYObject.RPYObjectImpl.class)
@Imports({ @Import(RPYRawContainer.class), @Import(RPYHandle.class), @Import(RPYUnmappedObject.class) })
public interface RPYObject extends FlexoObject, TechnologyObject<RPYTechnologyAdapter> {

	@PropertyIdentifier(type = RPYConcept.class)
	public static final String CONCEPT_KEY = "concept";

	@PropertyIdentifier(type = String.class)
	public static final String ID_KEY = "ID";

	@Getter(value = ID_KEY)
	public String getID();

	@Setter(ID_KEY)
	public void setID(String anID);

	/**
	 * Return serialization identifier of this object<br>
	 * Assert that the {@link RPYProject} (the ResourceData) in which this object is stored is kwown<br>
	 * (You dont have to serialize RPYSystem)
	 * 
	 * @return
	 */
	public String getSerializationIdentifier();

	@Getter(value = CONCEPT_KEY)
	public RPYConcept getConcept();

	@Setter(CONCEPT_KEY)
	public void setConcept(RPYConcept aConcept);

	public <T> T getPropertyValue(String propertyName);

	public <T> void setPropertyValue(String propertyName, T value);

	public <T extends RPYObject> T getReference(String propertyName);

	public void mapProperties();

	public void mapReferences();

	public void lookupReferences();

	public String toExtendedString(int indent);

	/**
	 * Default base implementation for {@link RPYObject}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYObjectImpl extends FlexoObjectImpl implements RPYObject {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYObjectImpl.class.getPackage().getName());

		@Override
		public final String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("[" + getConcept().getName() + "]");
			return sb.toString();
		}

		@Override
		public String toExtendedString(int indent) {
			StringBuffer sb = new StringBuffer();
			sb.append(StringUtils.buildWhiteSpaceIndentation(indent * 2) + "[" + getConcept().getName() + "/" + getID() + "]");
			for (RPYProperty property : getConcept().getProperties()) {
				Object value = getPropertyValue(property.getName());
				String valueAsString;
				if (value instanceof RPYRawContainer) {
					valueAsString = "{";
					boolean isFirst = true;
					for (Object item : ((RPYRawContainer) value).getValues()) {
						if (item instanceof RPYObject) {
							valueAsString = valueAsString + (isFirst ? "" : ",") + "\n" + ((RPYObject) item).toExtendedString(indent + 1);
						}
						else {
							valueAsString = valueAsString + (isFirst ? "" : ",") + item.toString();
						}
						isFirst = false;
					}
					valueAsString = valueAsString + "}";
				}
				else if (value instanceof RPYObject) {
					valueAsString = ((RPYObject) value).toExtendedString(indent + 1);
				}
				else if (value != null) {
					valueAsString = value.toString();
				}
				else {
					valueAsString = "null";
				}
				sb.append("\n" + StringUtils.buildWhiteSpaceIndentation(indent * 2) + " > " + property.getName() + " = " + valueAsString);
			}
			return sb.toString();
		}

		private Map<String, Object> propertyValues = new HashMap<>();

		@Override
		public <T> T getPropertyValue(String propertyName) {
			return (T) propertyValues.get(propertyName);
		}

		@Override
		public <T> void setPropertyValue(String propertyName, T value) {
			propertyValues.put(propertyName, value);
		}

		@Override
		public <T extends RPYObject> T getReference(String propertyName) {
			RPYHandle<T> handle = getPropertyValue(propertyName);
			return handle.getReferencedObject();
		}

		private RPYProperty getProperty(String propertyName) {
			if (getConcept() == null) {
				return null;
			}
			return getConcept().getPropertyNamed(propertyName);
		}

		@Override
		public void mapProperties() {
			setID(getPropertyValue("_id"));
		}

		@Override
		public void mapReferences() {
		}

		@Override
		public final void lookupReferences() {
			for (Object object : propertyValues.values()) {
				if (object instanceof RPYObject) {
					((RPYObject) object).lookupReferences();
				}
				if (object instanceof RPYRawContainer) {
					for (Object o : ((RPYRawContainer) object).getValues()) {
						if (o instanceof RPYObject) {
							((RPYObject) o).lookupReferences();
						}
					}
				}
			}
			mapReferences();
		}

		@Override
		public String getSerializationIdentifier() {
			return getID();
		}

	}
}
