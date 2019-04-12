/**
 * 
 * Copyright (c) 2014, Openflexo
 * 
 * This file is part of Openflexo-technology-adapters-ui, a component of the software infrastructure 
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

package org.openflexo.ta.rhapsody.controller;

import java.util.logging.Logger;

import javax.swing.ImageIcon;

import org.openflexo.connie.annotations.NotificationUnsafe;
import org.openflexo.gina.model.FIBComponent;
import org.openflexo.gina.view.GinaViewFactory;
import org.openflexo.logging.FlexoLogger;
import org.openflexo.ta.rhapsody.gui.RPYIconLibrary;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.model.RPYClass.AssociationsList;
import org.openflexo.ta.rhapsody.model.RPYClass.OperationsList;
import org.openflexo.ta.rhapsody.model.RPYClass.Statechart;
import org.openflexo.ta.rhapsody.model.RPYObject.RPYFacet;
import org.openflexo.ta.rhapsody.model.RPYPackage.ClassesList;
import org.openflexo.ta.rhapsody.model.RPYPackage.EventsList;
import org.openflexo.ta.rhapsody.model.RPYUnmappedObject;
import org.openflexo.view.controller.FlexoController;
import org.openflexo.view.controller.FlexoFIBController;

public class RPYFIBController extends FlexoFIBController {

	protected static final Logger logger = FlexoLogger.getLogger(RPYFIBController.class.getPackage().getName());

	public RPYFIBController(FIBComponent component, GinaViewFactory<?> viewFactory) {
		super(component, viewFactory);
	}

	public RPYFIBController(FIBComponent component, GinaViewFactory<?> viewFactory, FlexoController controller) {
		super(component, viewFactory, controller);
	}

	@Override
	@NotificationUnsafe
	protected ImageIcon retrieveIconForObject(Object object) {
		if (object instanceof ClassesList) {
			return RPYIconLibrary.CLASSES_LIST_ICON;
		}
		if (object instanceof EventsList) {
			return RPYIconLibrary.EVENTS_LIST_ICON;
		}
		if (object instanceof AssociationsList) {
			return RPYIconLibrary.ASSOCIATIONS_LIST_ICON;
		}
		if (object instanceof OperationsList) {
			return RPYIconLibrary.OPERATION_LIST_ICON;
		}
		if (object instanceof Statechart) {
			return RPYIconLibrary.STATECHART_ICON;
		}
		if (object instanceof RPYFacet) {
			return RPYIconLibrary.RPY_FOLDER_ICON;
		}
		if (object instanceof RPYUnmappedObject) {
			return RPYIconLibrary.UNMAPPED_OBJECT_ICON;
		}
		if (object instanceof RPYProperty) {
			switch (((RPYProperty) object).getType()) {
				case Id:
					return RPYIconLibrary.ID_PROPERTY_ICON;
				case Object:
					return RPYIconLibrary.OBJECT_PROPERTY_ICON;
				default:
					return RPYIconLibrary.SIMPLE_PROPERTY_ICON;
			}
		}
		return super.retrieveIconForObject(object);
	}

}
