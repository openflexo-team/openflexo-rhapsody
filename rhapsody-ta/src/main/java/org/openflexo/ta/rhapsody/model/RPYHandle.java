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
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;

/**
 * Represents a reference to an object
 * 
 * @author sylvain
 *
 */
@ModelEntity
@ImplementationClass(value = RPYHandle.RPYHandleImpl.class)
public interface RPYHandle<T extends RPYObject> extends RPYObject {

	@PropertyIdentifier(type = String.class)
	public static final String CLASS_NAME_KEY = "className";
	@PropertyIdentifier(type = String.class)
	public static final String FILE_NAME_KEY = "fileName";
	@PropertyIdentifier(type = RPYObject.class)
	public static final String REFERENCED_OBJECT_KEY = "referencedObject";
	@PropertyIdentifier(type = RPYRootObject.class)
	public static final String ROOT_OBJECT_KEY = "rootObject";

	@Getter(value = CLASS_NAME_KEY)
	public String getClassName();

	@Setter(CLASS_NAME_KEY)
	public void setClassName(String aName);

	@Getter(value = FILE_NAME_KEY)
	public String getFileName();

	@Setter(FILE_NAME_KEY)
	public void setFileName(String aFileName);

	@Getter(value = REFERENCED_OBJECT_KEY)
	public T getReferencedObject();

	@Setter(REFERENCED_OBJECT_KEY)
	public void setReferencedObject(T referencedObject);

	@Getter(value = ROOT_OBJECT_KEY)
	public RPYRootObject<?> getRootObject();

	@Setter(ROOT_OBJECT_KEY)
	public void setRootObject(RPYRootObject<?> aRootObject);

	/**
	 * Default base implementation for {@link RPYHandle}
	 * 
	 * @author sylvain
	 *
	 */
	public static abstract class RPYHandleImpl<T extends RPYObject> extends RPYObjectImpl implements RPYHandle<T> {

		@SuppressWarnings("unused")
		private static final Logger logger = Logger.getLogger(RPYHandleImpl.class.getPackage().getName());

		@Override
		public RPYTechnologyAdapter getTechnologyAdapter() {
			if (getRootObject() != null) {
				return getRootObject().getTechnologyAdapter();
			}
			return null;
		}

		@Override
		public void mapProperties() {
			super.mapProperties();
			setClassName(getPropertyValue("_m2Class"));
			setFileName(getPropertyValue("_filename"));
		}

		@Override
		public T getReferencedObject() {
			T returned = (T) getRootObject().getObjectWithID(getID(), getClassName());
			if (returned == null) {
				logger.warning("Cannot find object with ID: " + getID() + " in " + getRootObject());
			}
			return returned;
		}
	}

}
