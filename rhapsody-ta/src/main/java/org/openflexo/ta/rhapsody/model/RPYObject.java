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

import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.technologyadapter.TechnologyObject;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;

/**
 * Common API for all objects involved in Rhapsody model
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYObject.RPYObjectImpl.class)
public interface RPYObject extends FlexoObject, TechnologyObject<RPYTechnologyAdapter> {

	@PropertyIdentifier(type = RPYConcept.class)
	public static final String CONCEPT_KEY = "concept";

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
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("[" + getConcept().getName() + "]\n");
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
