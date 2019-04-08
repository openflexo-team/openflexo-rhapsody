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

import java.util.logging.Logger;

import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.model.RPYDiagram;
import org.openflexo.ta.rhapsody.model.RPYDiagram.RPYDiagramImpl;
import org.openflexo.ta.rhapsody.model.RPYObject;

/**
 * Represents a class chart<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity(isAbstract = true)
@ImplementationClass(value = CGIChart.CGIChartImpl.class)
public interface CGIChart extends RPYObject {

	@PropertyIdentifier(type = CGIText.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYDiagram.class)
	public static final String MODEL_OBJECT_KEY = "modelObject";

	@Getter(value = NAME_KEY, inverse = CGIText.CHART_KEY)
	public CGIText getName();

	@Setter(NAME_KEY)
	public void setName(CGIText aName);

	@Getter(value = MODEL_OBJECT_KEY)
	public RPYDiagram getModelObject();

	@Setter(MODEL_OBJECT_KEY)
	public void setModelObject(RPYDiagram aDiagram);

	/**
	 * Default base implementation for {@link CGIChart}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class CGIChartImpl extends RPYObjectImpl implements CGIChart {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYDiagramImpl.class.getPackage().getName());

		@Override
		public RPYTechnologyAdapter getTechnologyAdapter() {
			if (getModelObject() != null) {
				return getModelObject().getTechnologyAdapter();
			}
			return null;
		}

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("m_name"));
		}

		@Override
		public void mapReferences() {
			System.out.println("OK avec " + getPropertyValue("m_pModelObject"));
			setModelObject(getReference("m_pModelObject"));
		}

	}

}
