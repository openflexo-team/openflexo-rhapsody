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

import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;

/**
 * Represents a RPY profile<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYProfile.RPYProfileImpl.class)
public interface RPYProfile extends RPYProjectObject {

	@PropertyIdentifier(type = String.class)
	public static final String PERSIST_AS_KEY = "persistAs";
	@PropertyIdentifier(type = String.class)
	public static final String FILE_NAME_KEY = "fileName";

	@Getter(value = PERSIST_AS_KEY)
	public String getPersistAs();

	@Setter(PERSIST_AS_KEY)
	public void setPersistAs(String persistAs);

	@Getter(value = FILE_NAME_KEY)
	public String getFileName();

	@Setter(FILE_NAME_KEY)
	public void setFileName(String aFileName);

	/**
	 * Default base implementation for {@link RPYProfile}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYProfileImpl extends RPYProjectObjectImpl implements RPYProfile {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYProjectObjectImpl.class.getPackage().getName());

		@Override
		public void mapProperties() {
			super.mapProperties();
			setFileName(getPropertyValue("fileName"));
			setPersistAs(getPropertyValue("_persistAs"));
		}

	}

}
