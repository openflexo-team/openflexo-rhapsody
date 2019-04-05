/*
 * (c) Copyright 2013- Openflexo
 *
 * This file is part of OpenFlexo.
 *
 * OpenFlexo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenFlexo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenFlexo. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.openflexo.technologyadapter.rhapsody.controller;

import java.util.logging.Logger;

import javax.swing.ImageIcon;

import org.openflexo.foundation.fml.FlexoRole;
import org.openflexo.foundation.fml.editionaction.EditionAction;
import org.openflexo.foundation.technologyadapter.TechnologyObject;
import org.openflexo.gina.utils.InspectorGroup;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYProject;
import org.openflexo.technologyadapter.rhapsody.gui.RPYIconLibrary;
import org.openflexo.technologyadapter.rhapsody.view.RPYProjectModuleView;
import org.openflexo.view.EmptyPanel;
import org.openflexo.view.ModuleView;
import org.openflexo.view.controller.ControllerActionInitializer;
import org.openflexo.view.controller.FlexoController;
import org.openflexo.view.controller.TechnologyAdapterController;
import org.openflexo.view.controller.model.FlexoPerspective;

public class RPYAdapterController extends TechnologyAdapterController<RPYTechnologyAdapter> {
	static final Logger logger = Logger.getLogger(RPYAdapterController.class.getPackage().getName());

	private InspectorGroup inspectorGroup;

	@Override
	public Class<RPYTechnologyAdapter> getTechnologyAdapterClass() {
		return RPYTechnologyAdapter.class;
	}

	/**
	 * Initialize inspectors for supplied module using supplied {@link FlexoController}
	 * 
	 * @param controller
	 */
	@Override
	protected void initializeInspectors(FlexoController controller) {

		inspectorGroup = controller.loadInspectorGroup("RPY", getTechnologyAdapter().getLocales(), getFMLTechnologyAdapterInspectorGroup());
	}

	/**
	 * Return inspector group for this technology
	 * 
	 * @return
	 */
	@Override
	public InspectorGroup getTechnologyAdapterInspectorGroup() {
		return inspectorGroup;
	}

	@Override
	protected void initializeActions(ControllerActionInitializer actionInitializer) {

		// You can initialize here actions specific to that technology
	}

	/**
	 * Return icon representing underlying technology, required size is 32x32
	 * 
	 * @return
	 */
	@Override
	public ImageIcon getTechnologyBigIcon() {
		return RPYIconLibrary.RPY_TECHNOLOGY_BIG_ICON;
	}

	/**
	 * Return icon representing underlying technology
	 * 
	 * @return
	 */
	@Override
	public ImageIcon getTechnologyIcon() {
		return RPYIconLibrary.RPY_TECHNOLOGY_ICON;
	}

	/**
	 * Return icon representing a model of underlying technology
	 * 
	 * @return
	 */
	@Override
	public ImageIcon getModelIcon() {
		return RPYIconLibrary.RPY_FILE_ICON;
	}

	/**
	 * Return icon representing a model of underlying technology
	 * 
	 * @return
	 */
	@Override
	public ImageIcon getMetaModelIcon() {
		return RPYIconLibrary.RPY_FILE_ICON;
	}

	/**
	 * Return icon representing supplied ontology object
	 * 
	 * @param object
	 * @return
	 */
	@Override
	public ImageIcon getIconForTechnologyObject(Class<? extends TechnologyObject<?>> objectClass) {
		if (RPYObject.class.isAssignableFrom(objectClass)) {
			return RPYIconLibrary.iconForObject((Class<? extends RPYObject>) objectClass);
		}
		return null;
	}

	/**
	 * Return icon representing supplied role
	 * 
	 * @param object
	 * @return
	 */
	@Override
	public ImageIcon getIconForFlexoRole(Class<? extends FlexoRole<?>> roleClass) {
		/*if (BComponentRole.class.isAssignableFrom(roleClass)) {
			return getIconForTechnologyObject(BComponent.class);
		}*/
		return null;
	}

	/**
	 * Return icon representing supplied edition action
	 * 
	 * @param object
	 * @return
	 */
	@Override
	public ImageIcon getIconForEditionAction(Class<? extends EditionAction> editionActionClass) {
		/*if (AddAtelierBComponent.class.isAssignableFrom(editionActionClass)) {
			return IconFactory.getImageIcon(getIconForTechnologyObject(AtelierBComponent.class), IconLibrary.DUPLICATE);
		}*/
		return super.getIconForEditionAction(editionActionClass);
	}

	@Override
	public boolean hasModuleViewForObject(TechnologyObject<RPYTechnologyAdapter> object, FlexoController controller) {
		return object instanceof RPYProject;
	}

	@Override
	public String getWindowTitleforObject(TechnologyObject<RPYTechnologyAdapter> object, FlexoController controller) {
		if (object instanceof RPYProject) {
			return ((RPYProject) object).getResource().getName();
		}
		return object.toString();
	}

	@Override
	public ModuleView<?> createModuleViewForObject(TechnologyObject<RPYTechnologyAdapter> object, FlexoController controller,
			FlexoPerspective perspective) {
		if (object instanceof RPYProject) {
			RPYProjectModuleView returned = new RPYProjectModuleView((RPYProject) object, controller, perspective);
			return returned;
		}
		return new EmptyPanel<>(controller, perspective, object);
	}

}
