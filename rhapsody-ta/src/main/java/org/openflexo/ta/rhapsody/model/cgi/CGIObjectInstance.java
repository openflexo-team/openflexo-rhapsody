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
import org.openflexo.ta.rhapsody.model.RPYPart;
import org.openflexo.ta.rhapsody.model.RPYRawContainer;

/**
 * Represents a class representation<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = CGIObjectInstance.CGIObjectInstanceImpl.class)
public interface CGIObjectInstance extends CGIContainer {

	@PropertyIdentifier(type = CGIText.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYPart.class)
	public static final String MODEL_OBJECT_KEY = "modelObject";
	@PropertyIdentifier(type = CGIClassChart.class)
	public static final String CHART_KEY = "chart";

	@Getter(value = NAME_KEY, inverse = CGIText.OBJECT_KEY)
	public CGIText getName();

	@Setter(NAME_KEY)
	public void setName(CGIText aName);

	@Getter(value = MODEL_OBJECT_KEY)
	public RPYPart getModelObject();

	@Setter(MODEL_OBJECT_KEY)
	public void setModelObject(RPYPart aClass);

	@Override
	@Getter(value = CHART_KEY)
	public CGIClassChart getChart();

	@Setter(CHART_KEY)
	public void setChart(CGIClassChart aChart);

	public boolean hasShape();

	public String getLabel();

	/**
	 * Default base implementation for {@link CGIObjectInstance}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class CGIObjectInstanceImpl extends CGIObjectImpl implements CGIObjectInstance {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYDiagramImpl.class.getPackage().getName());

		@Override
		public String toString() {
			if (getName() != null) {
				return getName().getText();
			}
			return super.toString();
		}

		@Override
		public void mapProperties() {
			super.mapProperties();

			setName(getPropertyValue("m_name"));

			RPYRawContainer compartments = getPropertyValue("Compartments");
			if (compartments != null) {
				for (Object compartment : compartments.getValues()) {
					if (compartment instanceof CGICompartment) {
						addToCompartments((CGICompartment) compartment);
					}
					else {
						logger.warning("Unexpected object: " + compartment);
					}
				}
			}

			List<Number> geometry = getPropertyValue("m_transform");
			if (geometry != null) {
				setX(geometry.get(4).doubleValue());
				setY(geometry.get(5).doubleValue() + 50);
				setWidth(geometry.get(0).doubleValue() * 1000);
				setHeight(geometry.get(3).doubleValue() * 1000);
			}
		}

		@Override
		public boolean hasShape() {
			return getPropertyValue("m_transform") != null;
		}

		@Override
		public void mapReferences() {
			super.mapReferences();
			setModelObject(getReference("m_pModelObject"));
		}

		@Override
		public String getLabel() {
			return getModelObject().getName() + ":" + getModelObject().getOtherClass().getName();
		}

	}

}
