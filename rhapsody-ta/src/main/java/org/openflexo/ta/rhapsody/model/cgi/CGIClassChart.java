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

import org.openflexo.pamela.annotations.Adder;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.Getter.Cardinality;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Remover;
import org.openflexo.ta.rhapsody.model.RPYClass;

/**
 * Represents a class chart<br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = CGIClassChart.CGIClassChartImpl.class)
public interface CGIClassChart extends CGIChart {

	@PropertyIdentifier(type = CGIClass.class, cardinality = Cardinality.LIST)
	public static final String CLASSES_KEY = "classes";
	@PropertyIdentifier(type = CGIObjectInstance.class, cardinality = Cardinality.LIST)
	public static final String INSTANCES_KEY = "instances";
	@PropertyIdentifier(type = CGIAssociationEnd.class, cardinality = Cardinality.LIST)
	public static final String ASSOCIATION_ENDS_KEY = "associationEnds";

	@Getter(value = CLASSES_KEY, cardinality = Cardinality.LIST, inverse = CGIClass.CHART_KEY)
	public List<CGIClass> getClasses();

	@Adder(CLASSES_KEY)
	public void addToClasses(CGIClass aClass);

	@Remover(CLASSES_KEY)
	public void removeFromClasses(CGIClass aClass);

	@Getter(value = INSTANCES_KEY, cardinality = Cardinality.LIST, inverse = CGIObjectInstance.CHART_KEY)
	public List<CGIObjectInstance> getInstances();

	@Adder(INSTANCES_KEY)
	public void addToInstances(CGIObjectInstance anInstance);

	@Remover(INSTANCES_KEY)
	public void removeFromInstances(CGIObjectInstance anInstance);

	@Getter(value = ASSOCIATION_ENDS_KEY, cardinality = Cardinality.LIST, inverse = CGIClass.CHART_KEY)
	public List<CGIAssociationEnd> getAssociationEnds();

	@Adder(ASSOCIATION_ENDS_KEY)
	public void addToAssociationEnds(CGIAssociationEnd anAssociationEnd);

	@Remover(ASSOCIATION_ENDS_KEY)
	public void removeFromAssociationEnds(CGIAssociationEnd anAssociationEnd);

	public CGIClass getCGIClass(RPYClass aClass);

	/**
	 * Default base implementation for {@link CGIClassChart}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class CGIClassChartImpl extends CGIChartImpl implements CGIClassChart {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(CGIClassChartImpl.class.getPackage().getName());

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("m_name"));
			List<Object> elements = getPropertyValue("elementList");
			for (Object element : elements) {
				if (element instanceof CGIClass) {
					addToClasses((CGIClass) element);
				}
				if (element instanceof CGIObjectInstance) {
					addToInstances((CGIObjectInstance) element);
				}
				if (element instanceof CGIAssociationEnd) {
					addToAssociationEnds((CGIAssociationEnd) element);
				}
			}
		}

		@Override
		public CGIClass getCGIClass(RPYClass aClass) {
			for (CGIClass cgiClass : getClasses()) {
				if (cgiClass.getModelObject() == aClass) {
					return cgiClass;
				}
			}
			return null;
		}

	}

}
