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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.resource.PamelaResource;
import org.openflexo.foundation.technologyadapter.TechnologyAdapterResource;
import org.openflexo.foundation.technologyadapter.TechnologyObject;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.Import;
import org.openflexo.pamela.annotations.Imports;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.pamela.factory.PamelaModelFactory;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.model.cgi.CGIText;
import org.openflexo.toolbox.StringUtils;

/**
 * Common API for all objects involved in Rhapsody model
 * 
 * @author sylvain
 *
 */
@ModelEntity(isAbstract = true)
@ImplementationClass(value = RPYObject.RPYObjectImpl.class)
@Imports({ @Import(RPYRawContainer.class), @Import(RPYHandle.class), @Import(RPYUnmappedObject.class), @Import(RPYStyle.class) })
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

	public String getLabel();

	public <T> T getPropertyValue(String propertyName);

	public <T> void setPropertyValue(String propertyName, T value);

	public <T extends RPYObject> T getReference(String propertyName);

	public String getPropertyValueAsString(String propertyName);

	public void mapProperties();

	public void mapReferences();

	public void lookupReferences();

	public String toExtendedString(int indent);

	public RPYRootObject<?> getRootObject();

	public List<RPYObject> getUnmappedChildren();

	/**
	 * Retrieve object with supplied serialization identifier, asserting this object resides in this {@link RPYObject}
	 * 
	 * @param objectId
	 * @return
	 */
	public RPYObject findObjectWithID(String objectId, String className);

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
		public final RPYTechnologyAdapter getTechnologyAdapter() {
			if (getRootObject() != null && getRootObject().getResource() != null) {
				return (RPYTechnologyAdapter) ((TechnologyAdapterResource) getRootObject().getResource()).getTechnologyAdapter();
			}
			return null;
		}

		@Override
		public String getLabel() {
			return toString();
		}

		@Override
		public String toString() {
			return "[" + getConcept().getName() /*+ ":" + getID()*/ + "]";
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
			if (handle != null) {
				return handle.getReferencedObject();
			}
			return null;
		}

		@Override
		public String getPropertyValueAsString(String propertyName) {
			Object value = getPropertyValue(propertyName);
			if (value instanceof RPYHandle) {
				RPYHandle handle = (RPYHandle) value;
				if (handle.isNullReference()) {
					return "<null reference>";
				}
				Object referencedObject = handle.getReferencedObject();
				if (referencedObject == null) {
					return "<unkwown reference to " + handle.getClassName() + ":" + handle.getID() + ">";
				}
				else {
					return "<reference to " + ((RPYObject) referencedObject).toString() + ">";
				}
			}
			if (value instanceof RPYRawContainer) {
				List<?> list = ((RPYRawContainer) value).getValues();
				if (list.size() == 0) {
					return "<Empty list>";
				}
				else {
					Object firstObject = list.get(0);
					if (firstObject instanceof RPYObject) {
						return "<" + list.size() + " instances of " + ((RPYObject) firstObject).getConcept().getName() + ">";
					}
					else {
						return "<" + list.size() + " instances of " + firstObject.getClass().getSimpleName() + ">";
					}
				}
			}
			if (value != null) {
				return value.toString();
			}
			return "null";
		}

		@Override
		public Class<?> getImplementedInterface() {
			if (getRootObject() != null) {
				PamelaModelFactory f = ((PamelaResource<?, ?>) getRootObject().getResource()).getFactory();
				if (f != null) {
					return f.getModelEntityForInstance(this).getImplementedInterface();
				}
			}
			return getClass();
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
		public void lookupReferences() {
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
				if (object instanceof List) {
					for (Object o : (List) object) {
						if (o instanceof RPYObject) {
							((RPYObject) o).lookupReferences();
						}
					}
				}
			}
			mapReferences();
		}

		/**
		 * Retrieve object with supplied serialization identifier, asserting this object resides in this {@link RPYRootObject}
		 * 
		 * @param objectId
		 * @return
		 */
		@Override
		public final RPYObject findObjectWithID(String objectId, String className) {

			if (!(this instanceof RPYHandle) && objectId.equals(getID())) {
				if (getConcept() == null) {
					logger.warning("Unexpected null concept");
				}
				else if (!className.equals(getConcept().getName())) {
					logger.warning("Unexpected concept " + getConcept().getName() + " instead of " + className);
				}
				return this;
			}

			for (Object object : propertyValues.values()) {
				if (object instanceof RPYObject) {
					RPYObject returned = ((RPYObject) object).findObjectWithID(objectId, className);
					if (returned != null) {
						return returned;
					}
				}
				if (object instanceof RPYRawContainer) {
					for (Object o : ((RPYRawContainer) object).getValues()) {
						if (o instanceof RPYObject) {
							RPYObject returned = ((RPYObject) o).findObjectWithID(objectId, className);
							if (returned != null) {
								return returned;
							}
						}
					}
				}
				if (object instanceof List) {
					for (Object o : (List) object) {
						if (o instanceof RPYObject) {
							RPYObject returned = ((RPYObject) o).findObjectWithID(objectId, className);
							if (returned != null) {
								return returned;
							}
						}
					}
				}
			}

			return null;
		}

		@Override
		public String getSerializationIdentifier() {
			return getID();
		}

		private List<RPYObject> unmappedChildren = null;

		@Override
		public List<RPYObject> getUnmappedChildren() {
			if (unmappedChildren == null) {
				unmappedChildren = new ArrayList<>();
				for (Object object : propertyValues.values()) {
					if (object instanceof RPYRawContainer) {
						for (Object object2 : ((RPYRawContainer) object).getValues()) {
							if (object2 instanceof RPYObject) {
								unmappedChildren.add((RPYObject) object2);
							}
						}
					}
					else if (object instanceof RPYHandle) {
						/*if (((RPYHandle) object).getReferencedObject() instanceof RPYObject) {
							unmappedChildren.add(((RPYHandle) object).getReferencedObject());
						}*/
					}
					else if (object instanceof RPYObject) {
						if (!(object instanceof CGIText)) {
							unmappedChildren.add((RPYObject) object);
						}
					}
					else if (object instanceof List) {
						for (Object object2 : (List) object) {
							if (object2 instanceof RPYObject) {
								unmappedChildren.add((RPYObject) object2);
							}
						}
					}
				}
			}
			return unmappedChildren;
		}
	}

	public static interface RPYFacet {
	}

}
