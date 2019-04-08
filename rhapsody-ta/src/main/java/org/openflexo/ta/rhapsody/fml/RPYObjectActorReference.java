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

package org.openflexo.ta.rhapsody.fml;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import org.openflexo.foundation.FlexoException;
import org.openflexo.foundation.fml.annotations.FML;
import org.openflexo.foundation.fml.rt.ActorReference;
import org.openflexo.foundation.fml.rt.ModelSlotInstance;
import org.openflexo.foundation.resource.ResourceLoadingCancelledException;
import org.openflexo.logging.FlexoLogger;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.pamela.annotations.XMLAttribute;
import org.openflexo.pamela.annotations.XMLElement;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYProject;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;

/**
 * Implements {@link ActorReference} for {@link RPYObjectRole}
 * 
 * @author sylvain
 * 
 */
@ModelEntity
@ImplementationClass(RPYObjectActorReference.RPYObjectActorReferenceImpl.class)
@XMLElement
@FML("RPYObjectActorReference")
public interface RPYObjectActorReference extends ActorReference<RPYObject> {

	@PropertyIdentifier(type = String.class)
	public static final String SERIALIZATION_IDENTIFIER_KEY = "serializationIdentifier";

	@Getter(value = SERIALIZATION_IDENTIFIER_KEY)
	@XMLAttribute
	public String getSerializationIdentifier();

	@Setter(SERIALIZATION_IDENTIFIER_KEY)
	public void setSerializationIdentifier(String serializationIdentifier);

	public abstract static class RPYObjectActorReferenceImpl extends ActorReferenceImpl<RPYObject> implements RPYObjectActorReference {

		private static final Logger logger = FlexoLogger.getLogger(RPYObjectActorReference.class.getPackage().toString());

		private RPYObject object;
		private String serializationId;

		public RPYProject getProject() {
			if (getRPYProjectResource() != null) {
				try {
					return getRPYProjectResource().getResourceData();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (ResourceLoadingCancelledException e) {
					e.printStackTrace();
				} catch (FlexoException e) {
					e.printStackTrace();
				}
			}
			return null;
		}

		public RPYProjectResource getRPYProjectResource() {
			ModelSlotInstance<?, ?> msInstance = getModelSlotInstance();
			if (msInstance != null && msInstance.getResource() instanceof RPYProjectResource) {
				return (RPYProjectResource) msInstance.getResource();
			}
			return null;
		}

		@Override
		public RPYObject getModellingElement(boolean forceLoading) {
			if (object == null && serializationId != null) {
				return getProject().getObjectWithID(serializationId, null);
			}
			if (object == null) {
				logger.warning("Could not retrieve object " + serializationId);
			}
			return object;

		}

		@Override
		public void setModellingElement(RPYObject object) {
			this.object = object;
			if (object != null) {
				serializationId = object.getSerializationIdentifier();
			}
		}

		@Override
		public String getSerializationIdentifier() {
			if (object != null) {
				return object.getSerializationIdentifier();
			}
			return serializationId;
		}

		@Override
		public void setSerializationIdentifier(String serializationId) {
			this.serializationId = serializationId;
		}

	}

}
