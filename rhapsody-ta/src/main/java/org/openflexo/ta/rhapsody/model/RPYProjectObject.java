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

import org.openflexo.foundation.InnerResourceData;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;

/**
 * Common API for all objects involved in Rhapsody model of a {@link RPYProject}
 * 
 * @author sylvain
 *
 */
@ModelEntity(isAbstract = true)
public interface RPYProjectObject extends RPYObject, InnerResourceData<RPYProject> {

	@PropertyIdentifier(type = RPYProject.class)
	public static final String PROJECT_KEY = "project";

	@Getter(value = PROJECT_KEY)
	public RPYProject getProject();

	@Setter(PROJECT_KEY)
	public void setProject(RPYProject aProject);

	/**
	 * Return the model factory which manages this {@link RPYProjectObject}
	 * 
	 * @return
	 */
	public RPYProjectFactory getFactory();

	/**
	 * Default base implementation for {@link RPYProjectObject}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYProjectObjectImpl extends RPYObjectImpl implements RPYProjectObject {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYObjectImpl.class.getPackage().getName());

		@Override
		public RPYProjectFactory getFactory() {
			return ((RPYProjectResource) getResourceData().getResource()).getFactory();
		}

		@Override
		public RPYProject getResourceData() {
			return getProject();
		}

		@Override
		public final RPYRootObject<?> getRootObject() {
			return getResourceData();
		}
	}
}
