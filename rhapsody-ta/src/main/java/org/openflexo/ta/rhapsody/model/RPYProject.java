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
import java.util.List;
import java.util.logging.Logger;

import org.openflexo.foundation.resource.FlexoResource;
import org.openflexo.foundation.resource.ResourceData;
import org.openflexo.pamela.annotations.Adder;
import org.openflexo.pamela.annotations.Finder;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.Getter.Cardinality;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Remover;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.rm.RPYPackageResource;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;

/**
 * Represents the {@link ResourceData} deserialized from a {@link RPYProjectResource}<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYProject.RPYProjectImpl.class)
public interface RPYProject extends RPYProjectObject, RPYRootObject<RPYProject> {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYPackage.class, cardinality = Cardinality.LIST)
	public static final String PACKAGES_KEY = "packages";
	@PropertyIdentifier(type = RPYProfile.class, cardinality = Cardinality.LIST)
	public static final String PROFILES_KEY = "profiles";
	@PropertyIdentifier(type = RPYObjectClassDiagram.class, cardinality = Cardinality.LIST)
	public static final String DIAGRAMS_KEY = "diagrams";

	/**
	 * Return name of this project
	 * 
	 * @return
	 */
	@Getter(value = NAME_KEY)
	public String getName();

	/**
	 * Sets name of this project
	 * 
	 * @return
	 */
	@Setter(NAME_KEY)
	public void setName(String aName);

	@Override
	public FlexoResource<RPYProject> getResource();

	@Override
	public void setResource(FlexoResource<RPYProject> resource);

	@Getter(value = PACKAGES_KEY, cardinality = Cardinality.LIST, ignoreType = true)
	public List<RPYPackage> getPackages();

	@Finder(attribute = RPYPackage.NAME_KEY, collection = PACKAGES_KEY)
	public RPYPackage getPackage(String packageName);

	@Adder(PACKAGES_KEY)
	public void addToPackages(RPYPackage aPackage);

	@Remover(PACKAGES_KEY)
	public void removeFromPackages(RPYPackage aPackage);

	@Getter(value = PROFILES_KEY, cardinality = Cardinality.LIST, inverse = RPYProfile.PROJECT_KEY)
	public List<RPYProfile> getProfiles();

	@Finder(attribute = RPYProfile.FILE_NAME_KEY, collection = PROFILES_KEY)
	public RPYProfile getProfile(String profileFileName);

	@Adder(PROFILES_KEY)
	public void addToProfiles(RPYProfile aProfile);

	@Remover(PROFILES_KEY)
	public void removeFromProfiles(RPYProfile aProfile);

	@Getter(value = DIAGRAMS_KEY, cardinality = Cardinality.LIST, inverse = RPYDiagram.ROOT_OBJECT_KEY)
	public List<RPYObjectClassDiagram> getDiagrams();

	@Adder(DIAGRAMS_KEY)
	public void addToDiagrams(RPYObjectClassDiagram aDiagram);

	@Remover(DIAGRAMS_KEY)
	public void removeFromDiagrams(RPYObjectClassDiagram aDiagram);

	public ComponentsList getComponentsList();

	public ObjectModelDiagramsList getObjectModelDiagramsList();

	public PackagesList getPackagesList();

	public ProfilesList getProfilesList();

	/**
	 * Default base implementation for {@link RPYProject}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYProjectImpl extends RPYProjectObjectImpl implements RPYProject {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYProjectObjectImpl.class.getPackage().getName());

		private List<RPYPackage> packages;

		private ComponentsList componentsList = new ComponentsList() {
		};

		private ObjectModelDiagramsList objectModelDiagramsList = new ObjectModelDiagramsList() {

			@Override
			public List<RPYObjectClassDiagram> getDiagrams() {
				return RPYProjectImpl.this.getDiagrams();
			}
		};

		private PackagesList packagesList = new PackagesList() {
			@Override
			public List<RPYPackage> getPackages() {
				return RPYProjectImpl.this.getPackages();
			}
		};

		private ProfilesList profilesList = new ProfilesList() {
			@Override
			public List<RPYProfile> getProfiles() {
				return RPYProjectImpl.this.getProfiles();
			}
		};

		@Override
		public ComponentsList getComponentsList() {
			return componentsList;
		}

		@Override
		public ObjectModelDiagramsList getObjectModelDiagramsList() {
			return objectModelDiagramsList;
		}

		@Override
		public PackagesList getPackagesList() {
			return packagesList;
		}

		@Override
		public ProfilesList getProfilesList() {
			return profilesList;
		}

		@Override
		public RPYProject getResourceData() {
			return this;
		}

		@Override
		public RPYProjectResource getResource() {
			return (RPYProjectResource) performSuperGetter(FLEXO_RESOURCE);
		}

		@Override
		public void setResource(FlexoResource<RPYProject> resource) {
			performSuperSetter(FLEXO_RESOURCE, resource);
		}

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("_name"));
			RPYRawContainer subsystems = getPropertyValue("Subsystems");
			for (Object object : subsystems.getValues()) {
				if (object instanceof RPYProfile) {
					addToProfiles((RPYProfile) object);
				}
			}
			RPYRawContainer diagrams = getPropertyValue("Diagrams");
			for (Object object : diagrams.getValues()) {
				if (object instanceof RPYObjectClassDiagram) {
					addToDiagrams((RPYObjectClassDiagram) object);
				}
				else {
					logger.warning("Unexpected object: " + object);
				}
			}
		}

		@Override
		public List<RPYPackage> getPackages() {
			if (packages == null) {
				loadPackagesWhenUnloaded();
			}
			return packages;
		}

		@Override
		public RPYPackage getPackage(String packageName) {
			if (packages == null) {
				loadPackagesWhenUnloaded();
			}
			if (packageName == null) {
				return null;
			}
			for (RPYPackage s : getPackages()) {
				if (packageName.equals(s.getName())) {
					return s;
				}
			}
			return null;
		}

		@Override
		public void addToPackages(RPYPackage aPackage) {
			if (packages == null) {
				loadPackagesWhenUnloaded();
			}
			if (!packages.contains(aPackage)) {
				packages.add(aPackage);
				getPropertyChangeSupport().firePropertyChange("packages", null, aPackage);
			}
		}

		@Override
		public void removeFromPackages(RPYPackage aPackage) {
			if (packages == null) {
				loadPackagesWhenUnloaded();
			}
			if (packages.contains(aPackage)) {
				packages.remove(aPackage);
				getPropertyChangeSupport().firePropertyChange("packages", aPackage, null);
			}
		}

		/**
		 * Load eventually unloaded packages<br>
		 * After this call return, we can assert that all {@link RPYPackage} are loaded.
		 */
		private void loadPackagesWhenUnloaded() {
			packages = new ArrayList<>();
			System.out.println("contents: " + getResource().getContents());
			if (getResource() != null) {
				for (org.openflexo.foundation.resource.FlexoResource<?> r : getResource().getContents()) {
					if (r instanceof RPYPackageResource) {
						RPYPackage aPackage = ((RPYPackageResource) r).getRPYPackage();
						if (!packages.contains(aPackage)) {
							addToPackages(aPackage);
						}
					}
				}
			}
		}

		@Override
		public RPYProject getProject() {
			return this;
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
			if (packages != null) {
				for (RPYPackage rpyPackage : packages) {
					returned = rpyPackage.findObjectWithID(objectId, className);
					if (returned != null) {
						return returned;
					}
				}
			}

			// System.out.println("Tiens je cherche l'objet: " + objectId + " of " + className + " in " + this);
			logger.warning("Cannot find object with ID: " + objectId + " class: " + className + " in " + this);
			// Thread.dumpStack();
			return null;
		}

		@Override
		public void lookupReferences() {
			// In order to lookup references, we must be sure that all packages are loaded, because
			// we may reference some objects that are contained in packages
			loadPackagesWhenUnloaded();
			super.lookupReferences();
		}
	}

	public static interface ComponentsList extends RPYFacet {
		// public List<RPYComponent> getComponents();
	}

	public static interface ObjectModelDiagramsList extends RPYFacet {
		public List<RPYObjectClassDiagram> getDiagrams();
	}

	public static interface PackagesList extends RPYFacet {
		public List<RPYPackage> getPackages();
	}

	public static interface ProfilesList extends RPYFacet {
		public List<RPYProfile> getProfiles();
	}

}
