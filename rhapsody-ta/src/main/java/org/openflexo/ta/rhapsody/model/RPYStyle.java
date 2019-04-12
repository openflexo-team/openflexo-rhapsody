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

import org.openflexo.foundation.FlexoObject;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;

/**
 * Represents a style
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYStyle.RPYStyleImpl.class)
public interface RPYStyle extends FlexoObject {

	@PropertyIdentifier(type = String.class)
	public static final String FONT_NAME_KEY = "name";
	@PropertyIdentifier(type = Integer.class)
	public static final String V1_KEY = "v1";
	@PropertyIdentifier(type = Integer.class)
	public static final String V2_KEY = "v2";
	@PropertyIdentifier(type = Integer.class)
	public static final String V3_KEY = "v3";
	@PropertyIdentifier(type = Integer.class)
	public static final String V4_KEY = "v4";
	@PropertyIdentifier(type = Integer.class)
	public static final String V5_KEY = "v5";

	@Getter(value = FONT_NAME_KEY)
	public String getFontName();

	@Setter(FONT_NAME_KEY)
	public void setFontName(String aName);

	@Getter(value = V1_KEY, defaultValue = "0")
	public int getV1();

	@Setter(V1_KEY)
	public void setV1(int v);

	@Getter(value = V2_KEY, defaultValue = "0")
	public int getV2();

	@Setter(V2_KEY)
	public void setV2(int v);

	@Getter(value = V3_KEY, defaultValue = "0")
	public int getV3();

	@Setter(V3_KEY)
	public void setV3(int v);

	@Getter(value = V4_KEY, defaultValue = "0")
	public int getV4();

	@Setter(V4_KEY)
	public void setV4(int v);

	@Getter(value = V5_KEY, defaultValue = "0")
	public int getV5();

	@Setter(V5_KEY)
	public void setV5(int v);

	/**
	 * Default base implementation for {@link RPYStyle}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYStyleImpl extends FlexoObjectImpl implements RPYStyle {

		@Override
		public String toString() {
			return getFontName() + " " + getV1() + " " + getV2() + " " + getV3() + " " + getV4() + " " + getV5();
		}
	}

}
