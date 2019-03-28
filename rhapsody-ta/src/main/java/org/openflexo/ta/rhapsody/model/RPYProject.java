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

import org.openflexo.foundation.resource.ResourceData;
import org.openflexo.foundation.technologyadapter.TechnologyAdapter;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;

/**
 * Represents the {@link ResourceData} deserialized from a {@link RPYProjectResource}<br>
 * 
 * Note: Purpose of that class is to demonstrate API of a {@link TechnologyAdapter}, thus the semantics is here trivial
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYProject.RPYProjectImpl.class)
public interface RPYProject extends RPYProjectObject, RPYRootObject<RPYProject> {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";

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
	public RPYProjectResource getResource();

	/**
	 * Retrieve object with supplied serialization identifier, asserting this object resides in this {@link RPYProject}
	 * 
	 * @param objectId
	 * @return
	 */
	@Override
	public RPYObject getObjectWithSerializationIdentifier(String objectId);

	/**
	 * Default base implementation for {@link RPYProject}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYProjectImpl extends RPYProjectObjectImpl implements RPYProject {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYProjectObjectImpl.class.getPackage().getName());

		@Override
		public RPYProject getResourceData() {
			return this;
		}

		@Override
		public RPYProjectResource getResource() {
			return (RPYProjectResource) performSuperGetter(FLEXO_RESOURCE);
		}

		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("[RPYProject]\n");
			/*for (DSLComponent component : getComponents()) {
				sb.append(component.toString() + "\n");
			}
			for (DSLLink link : getLinks()) {
				sb.append(link.toString() + "\n");
			}*/
			return sb.toString();
		}

	}

}
