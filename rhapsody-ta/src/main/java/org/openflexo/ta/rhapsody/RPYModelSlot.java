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

package org.openflexo.ta.rhapsody;

import java.lang.reflect.Type;
import java.util.logging.Logger;

import org.openflexo.foundation.fml.FlexoRole;
import org.openflexo.foundation.fml.annotations.DeclareActorReferences;
import org.openflexo.foundation.fml.annotations.FML;
import org.openflexo.foundation.technologyadapter.FreeModelSlot;
import org.openflexo.foundation.technologyadapter.ModelSlot;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.XMLElement;
import org.openflexo.ta.rhapsody.fml.RPYObjectActorReference;
import org.openflexo.ta.rhapsody.model.RPYProject;

/**
 * Implementation of the {@link ModelSlot} class for the Rhapsody technology adapter
 * 
 * @author sylvain
 * 
 */
// @DeclareFlexoRoles({ DSLComponentRole.class, DSLSlotRole.class, DSLLinkRole.class })
// @DeclareEditionActions({ AddDSLComponent.class, AddDSLLink.class })
// @DeclareFetchRequests({ SelectUniqueDSLComponent.class, SelectUniqueDSLComponent.class, SelectUniqueDSLLink.class,
// SelectUniqueDSLLink.class })
@DeclareActorReferences({ RPYObjectActorReference.class })
@ModelEntity
@ImplementationClass(RPYModelSlot.DSLModelSlotImpl.class)
@XMLElement
@FML("RPYModelSlot")
public interface RPYModelSlot extends FreeModelSlot<RPYProject> {

	public static abstract class DSLModelSlotImpl extends FreeModelSlotImpl<RPYProject> implements RPYModelSlot {

		private static final Logger logger = Logger.getLogger(RPYModelSlot.class.getPackage().getName());

		@Override
		public Class<RPYTechnologyAdapter> getTechnologyAdapterClass() {
			return RPYTechnologyAdapter.class;
		}

		@Override
		public <PR extends FlexoRole<?>> String defaultFlexoRoleName(Class<PR> roleClass) {
			/*if (DSLComponentRole.class.isAssignableFrom(roleClass)) {
				return "component";
			}
			if (DSLSlotRole.class.isAssignableFrom(roleClass)) {
				return "slot";
			}
			if (DSLLinkRole.class.isAssignableFrom(roleClass)) {
				return "link";
			}*/
			return null;
		}

		@Override
		public Type getType() {
			return RPYProject.class;
		}

		@Override
		public RPYTechnologyAdapter getModelSlotTechnologyAdapter() {
			return (RPYTechnologyAdapter) super.getModelSlotTechnologyAdapter();
		}

	}
}
