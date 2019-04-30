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

import java.util.List;
import java.util.logging.Logger;

import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.model.RPYDiagram.RPYDiagramImpl;
import org.openflexo.ta.rhapsody.model.RPYObject;

/**
 * Represents a class representation<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = CGICompartment.CGICompartmentImpl.class)
public interface CGICompartment extends CGIShape {

	public enum DisplayOption {
		Explicit, All, Public
	}

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = CGIContainer.class)
	public static final String CONTAINER_KEY = "container";
	@PropertyIdentifier(type = DisplayOption.class)
	public static final String DISPLAY_OPTION_KEY = "displayOption";

	@Getter(value = NAME_KEY)
	public String getName();

	@Setter(NAME_KEY)
	public void setName(String aName);

	@Getter(value = CONTAINER_KEY)
	public CGIContainer getContainer();

	@Setter(CONTAINER_KEY)
	public void setContainer(CGIContainer aContainer);

	@Getter(value = DISPLAY_OPTION_KEY)
	public DisplayOption getDisplayOption();

	@Setter(DISPLAY_OPTION_KEY)
	public void setDisplayOption(DisplayOption option);

	public int getIndex();

	public List<? extends RPYObject> getContents();

	/**
	 * Default base implementation for {@link CGICompartment}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class CGICompartmentImpl extends CGIObjectImpl implements CGICompartment {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYDiagramImpl.class.getPackage().getName());

		@Override
		public CGIChart getChart() {
			if (getContainer() != null) {
				return getContainer().getChart();
			}
			return null;
		}

		@Override
		public void mapProperties() {
			super.mapProperties();

			setName(getPropertyValue("m_name"));

			String dOption = getPropertyValue("m_displayOption");
			if (dOption != null) {
				setDisplayOption(DisplayOption.valueOf(dOption));
			}

		}

		@Override
		public int getIndex() {
			if (getContainer() != null) {
				return getContainer().getCompartments().indexOf(this);
			}
			return -1;
		}

		@Override
		public double getX() {
			return 0;
		}

		@Override
		public double getY() {
			return 20 + getIndex() * getHeight();
		}

		@Override
		public double getWidth() {
			if (getContainer() != null) {
				return getContainer().getWidth();
			}
			return 0;
		}

		@Override
		public double getHeight() {
			if (getContainer() != null && getContainer().getCompartments().size() > 0) {
				return (getContainer().getHeight() - 20) / getContainer().getCompartments().size();
			}
			return 0;
		}

		@Override
		public List<? extends RPYObject> getContents() {
			if (getName().equals("Operation")) {
				if (getContainer() instanceof CGIClass) {
					return ((CGIClass) getContainer()).getModelObject().getOperations();
				}
			}
			return null;
		}

	}

}
