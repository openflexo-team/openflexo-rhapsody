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

package org.openflexo.ta.rhapsody.model.cgi;

import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.pamela.annotations.XMLAttribute;

/**
 * Represents a {@link CGIObject} that defines a shape<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity(isAbstract = true)
public interface CGIShape extends CGIObject {

	@PropertyIdentifier(type = Double.class)
	public static final String X_KEY = "x";
	@PropertyIdentifier(type = Double.class)
	public static final String Y_KEY = "y";
	@PropertyIdentifier(type = Double.class)
	public static final String WIDTH_KEY = "width";
	@PropertyIdentifier(type = Double.class)
	public static final String HEIGHT_KEY = "height";

	@Getter(value = X_KEY, defaultValue = "0.0")
	@XMLAttribute
	public double getX();

	@Setter(value = X_KEY)
	public void setX(double aValue);

	@Getter(value = Y_KEY, defaultValue = "0.0")
	@XMLAttribute
	public double getY();

	@Setter(value = Y_KEY)
	public void setY(double aValue);

	@Getter(value = WIDTH_KEY, defaultValue = "100.0")
	@XMLAttribute
	public abstract double getWidth();

	@Setter(value = WIDTH_KEY)
	public abstract void setWidth(double aValue);

	@Getter(value = HEIGHT_KEY, defaultValue = "60.0")
	@XMLAttribute
	public abstract double getHeight();

	@Setter(value = HEIGHT_KEY)
	public abstract void setHeight(double aValue);

}
