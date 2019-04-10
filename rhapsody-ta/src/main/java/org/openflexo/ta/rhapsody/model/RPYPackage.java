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

import java.util.List;
import java.util.logging.Logger;

import org.openflexo.foundation.resource.FlexoResource;
import org.openflexo.foundation.resource.ResourceData;
import org.openflexo.pamela.annotations.Adder;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.Getter.Cardinality;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Remover;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.rm.RPYPackageResource;

/**
 * Represents the {@link ResourceData} deserialized from a {@link RPYPackageResource}<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYPackage.RPYPackageImpl.class)
public interface RPYPackage extends RPYPackageObject, RPYRootObject<RPYPackage> {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYClass.class, cardinality = Cardinality.LIST)
	public static final String CLASSES_KEY = "classes";
	@PropertyIdentifier(type = RPYEvent.class, cardinality = Cardinality.LIST)
	public static final String EVENTS_KEY = "events";
	@PropertyIdentifier(type = RPYObjectClassDiagram.class, cardinality = Cardinality.LIST)
	public static final String OBJECT_CLASS_DIAGRAMS_KEY = "objectClassDiagrams";
	@PropertyIdentifier(type = RPYSequenceDiagram.class, cardinality = Cardinality.LIST)
	public static final String SEQUENCE_DIAGRAMS_KEY = "sequenceDiagrams";

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

	@Getter(value = CLASSES_KEY, cardinality = Cardinality.LIST, inverse = RPYClass.PACKAGE_KEY)
	public List<RPYClass> getClasses();

	@Adder(CLASSES_KEY)
	public void addToClasses(RPYClass aClass);

	@Remover(CLASSES_KEY)
	public void removeFromClasses(RPYClass aClass);

	@Getter(value = EVENTS_KEY, cardinality = Cardinality.LIST, inverse = RPYEvent.PACKAGE_KEY)
	public List<RPYEvent> getEvents();

	@Adder(EVENTS_KEY)
	public void addToEvents(RPYEvent anEvent);

	@Remover(EVENTS_KEY)
	public void removeFromEvents(RPYEvent anEvent);

	@Getter(value = OBJECT_CLASS_DIAGRAMS_KEY, cardinality = Cardinality.LIST, inverse = RPYDiagram.ROOT_OBJECT_KEY)
	public List<RPYObjectClassDiagram> getObjectClassDiagrams();

	@Adder(OBJECT_CLASS_DIAGRAMS_KEY)
	public void addToObjectClassDiagrams(RPYObjectClassDiagram aDiagram);

	@Remover(OBJECT_CLASS_DIAGRAMS_KEY)
	public void removeFromObjectClassDiagrams(RPYObjectClassDiagram aDiagram);

	@Getter(value = SEQUENCE_DIAGRAMS_KEY, cardinality = Cardinality.LIST, inverse = RPYDiagram.ROOT_OBJECT_KEY)
	public List<RPYSequenceDiagram> getSequenceDiagrams();

	@Adder(SEQUENCE_DIAGRAMS_KEY)
	public void addToSequenceDiagrams(RPYSequenceDiagram aDiagram);

	@Remover(SEQUENCE_DIAGRAMS_KEY)
	public void removeFromSequenceDiagrams(RPYSequenceDiagram aDiagram);

	@Override
	public FlexoResource<RPYPackage> getResource();

	@Override
	public void setResource(FlexoResource<RPYPackage> resource);

	public ClassesList getClassesList();

	public EventsList getEventsList();

	public ObjectModelDiagramsList getObjectModelDiagramsList();

	public SequenceDiagramsList getSequenceDiagramsList();

	/**
	 * Default base implementation for {@link RPYPackage}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYPackageImpl extends RPYPackageObjectImpl implements RPYPackage {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYPackageImpl.class.getPackage().getName());

		private ClassesList classesList = new ClassesList() {
			@Override
			public List<RPYClass> getClasses() {
				return RPYPackageImpl.this.getClasses();
			}
		};

		private EventsList eventsList = new EventsList() {
			@Override
			public List<RPYEvent> getEvents() {
				return RPYPackageImpl.this.getEvents();
			}
		};

		private ObjectModelDiagramsList objectModelDiagramsList = new ObjectModelDiagramsList() {

			@Override
			public List<RPYObjectClassDiagram> getDiagrams() {
				return RPYPackageImpl.this.getObjectClassDiagrams();
			}
		};

		private SequenceDiagramsList sequenceDiagramsList = new SequenceDiagramsList() {

			@Override
			public List<RPYSequenceDiagram> getDiagrams() {
				return RPYPackageImpl.this.getSequenceDiagrams();
			}
		};

		@Override
		public ClassesList getClassesList() {
			return classesList;
		}

		@Override
		public EventsList getEventsList() {
			return eventsList;
		}

		@Override
		public ObjectModelDiagramsList getObjectModelDiagramsList() {
			return objectModelDiagramsList;
		}

		@Override
		public SequenceDiagramsList getSequenceDiagramsList() {
			return sequenceDiagramsList;
		}

		@Override
		public RPYPackage getResourceData() {
			return this;
		}

		@Override
		public RPYPackageResource getResource() {
			return (RPYPackageResource) performSuperGetter(FLEXO_RESOURCE);
		}

		@Override
		public void setResource(FlexoResource<RPYPackage> resource) {
			performSuperSetter(FLEXO_RESOURCE, resource);
		}

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("_name"));
			RPYRawContainer classes = getPropertyValue("Classes");
			for (Object object : classes.getValues()) {
				if (object instanceof RPYClass) {
					addToClasses((RPYClass) object);
				}
				else {
					logger.warning("Unexpected object: " + object);
				}
			}
			RPYRawContainer events = getPropertyValue("Events");
			for (Object object : events.getValues()) {
				if (object instanceof RPYEvent) {
					addToEvents((RPYEvent) object);
				}
				else {
					logger.warning("Unexpected object: " + object);
				}
			}
			RPYRawContainer diagrams = getPropertyValue("Declaratives");
			for (Object object : diagrams.getValues()) {
				if (object instanceof RPYObjectClassDiagram) {
					addToObjectClassDiagrams((RPYObjectClassDiagram) object);
				}
				else if (object instanceof RPYSequenceDiagram) {
					addToSequenceDiagrams((RPYSequenceDiagram) object);
				}
				else {
					logger.warning("Unexpected object: " + object);
				}
			}
		}

		/**
		 * Retrieve object with supplied serialization identifier, asserting this object resides in this {@link RPYRootObject}
		 * 
		 * @param objectId
		 * @return
		 */
		@Override
		public RPYObject getObjectWithID(String objectId, String className) {

			RPYObject returned = findObjectWithID(objectId, className);
			if (returned != null) {
				return returned;
			}

			// System.out.println("Tiens je cherche l'objet: " + objectId + " of " + className + " in " + this);
			logger.warning("Cannot find object with ID: " + objectId + " class: " + className + " in " + this);
			Thread.dumpStack();
			return null;
		}

	}

	public static interface ClassesList extends RPYFacet {
		public List<RPYClass> getClasses();
	}

	public static interface EventsList extends RPYFacet {
		public List<RPYEvent> getEvents();
	}

	public static interface ObjectModelDiagramsList extends RPYFacet {
		public List<RPYObjectClassDiagram> getDiagrams();
	}

	public static interface SequenceDiagramsList extends RPYFacet {
		public List<RPYSequenceDiagram> getDiagrams();
	}

}
