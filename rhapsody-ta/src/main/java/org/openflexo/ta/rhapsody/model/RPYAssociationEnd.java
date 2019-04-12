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
import org.openflexo.ta.rhapsody.model.RPYProjectObject.RPYProjectObjectImpl;

/**
 * Represents a RPY association end in a RPYClass <br>
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYAssociationEnd.RPYAssociationEndImpl.class)
public interface RPYAssociationEnd extends RPYPackageObject {

	@PropertyIdentifier(type = String.class)
	public static final String NAME_KEY = "name";
	@PropertyIdentifier(type = RPYClass.class)
	public static final String OWNER_CLASS_KEY = "ownerClass";
	@PropertyIdentifier(type = RPYClass.class)
	public static final String OTHER_CLASS_KEY = "otherClass";
	@PropertyIdentifier(type = RPYAssociationEnd.class)
	public static final String INVERSE_KEY = "inverse";

	@Getter(value = NAME_KEY)
	public String getName();

	@Setter(NAME_KEY)
	public void setName(String aName);

	@Getter(value = OWNER_CLASS_KEY)
	public RPYClass getOwnerClass();

	@Setter(OWNER_CLASS_KEY)
	public void setOwnerClass(RPYClass aClass);

	@Getter(value = OTHER_CLASS_KEY)
	public RPYClass getOtherClass();

	@Setter(OTHER_CLASS_KEY)
	public void setOtherClass(RPYClass aClass);

	@Getter(value = INVERSE_KEY)
	public RPYAssociationEnd getInverse();

	@Setter(INVERSE_KEY)
	public void setInverse(RPYAssociationEnd anAssociationEnd);

	/**
	 * Default base implementation for {@link RPYAssociationEnd}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYAssociationEndImpl extends RPYPackageObjectImpl implements RPYAssociationEnd {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYProjectObjectImpl.class.getPackage().getName());

		@Override
		public void mapProperties() {
			super.mapProperties();
			setName(getPropertyValue("_name"));
		}

		@Override
		public void mapReferences() {
			super.mapReferences();
			setInverse(getReference("_inverse"));
			setOtherClass(getReference("_otherClass"));
		}

		@Override
		public RPYPackage getPackage() {
			if (getOwnerClass() != null) {
				return getOwnerClass().getPackage();
			}
			return null;
		}

	}

}