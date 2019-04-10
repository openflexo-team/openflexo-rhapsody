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

import java.util.List;
import java.util.logging.Logger;

import org.openflexo.pamela.annotations.Adder;
import org.openflexo.pamela.annotations.Getter;
import org.openflexo.pamela.annotations.Getter.Cardinality;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.PropertyIdentifier;
import org.openflexo.pamela.annotations.Remover;
import org.openflexo.pamela.annotations.Setter;
import org.openflexo.ta.rhapsody.model.RPYProjectObject.RPYProjectObjectImpl;

/**
 * Represents a RPY class in a RPYPackage <br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYClass.RPYClassImpl.class)
public interface RPYClass extends RPYPackageObject {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYAssociationEnd.class, cardinality = Cardinality.LIST)
	public static final String ASSOCIATION_ENDS_KEY = "associationEnds";
	@PropertyIdentifier(type = RPYOperation.class, cardinality = Cardinality.LIST)
	public static final String OPERATIONS_KEY = "operations";

	@Getter(value = NAME_KEY)
	public String getName();

	@Setter(NAME_KEY)
	public void setName(String aName);

	@Getter(value = ASSOCIATION_ENDS_KEY, cardinality = Cardinality.LIST, inverse = RPYAssociationEnd.OWNER_CLASS_KEY)
	public List<RPYAssociationEnd> getAssociationEnds();

	@Adder(ASSOCIATION_ENDS_KEY)
	public void addToAssociationEnds(RPYAssociationEnd anAssociation);

	@Remover(ASSOCIATION_ENDS_KEY)
	public void removeFromAssociationEnds(RPYAssociationEnd anAssociation);

	@Getter(value = OPERATIONS_KEY, cardinality = Cardinality.LIST, inverse = RPYOperation.OWNER_CLASS_KEY)
	public List<RPYOperation> getOperations();

	@Adder(OPERATIONS_KEY)
	public void addToOperations(RPYOperation anOperation);

	@Remover(OPERATIONS_KEY)
	public void removeFromOperations(RPYOperation anOperation);

	public AssociationEndsList getAssociationEndsList();

	public OperationsList getOperationsList();

	public Statechart getStatechart();

	/**
	 * Default base implementation for {@link RPYClass}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYClassImpl extends RPYPackageObjectImpl implements RPYClass {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYProjectObjectImpl.class.getPackage().getName());

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("_name"));
			RPYRawContainer associations = getPropertyValue("Associations");
			if (associations != null) {
				for (Object object : associations.getValues()) {
					if (object instanceof RPYAssociationEnd) {
						addToAssociationEnds((RPYAssociationEnd) object);
					}
					else {
						logger.warning("Unexpected object: " + object);
					}
				}
			}
			RPYRawContainer operations = getPropertyValue("Operations");
			if (operations != null) {
				for (Object object : operations.getValues()) {
					if (object instanceof RPYOperation) {
						addToOperations((RPYOperation) object);
					}
					else {
						logger.warning("Unexpected object: " + object);
					}
				}
			}
		}

		private AssociationEndsList associationEndsList = new AssociationEndsList() {
			@Override
			public List<RPYAssociationEnd> getAssociationEnds() {
				return RPYClassImpl.this.getAssociationEnds();
			}
		};

		private OperationsList operationsList = new OperationsList() {

			@Override
			public List<RPYOperation> getOperations() {
				return RPYClassImpl.this.getOperations();
			}
		};

		private Statechart statechart = new Statechart() {

		};

		@Override
		public AssociationEndsList getAssociationEndsList() {
			return associationEndsList;
		}

		@Override
		public OperationsList getOperationsList() {
			return operationsList;
		}

		@Override
		public Statechart getStatechart() {
			return statechart;
		}

	}

	public static interface AssociationEndsList extends RPYFacet {
		public List<RPYAssociationEnd> getAssociationEnds();
	}

	public static interface OperationsList extends RPYFacet {
		public List<RPYOperation> getOperations();
	}

	public static interface Statechart extends RPYFacet {
		// public List<RPYSequenceDiagram> getDiagrams();
	}

}
