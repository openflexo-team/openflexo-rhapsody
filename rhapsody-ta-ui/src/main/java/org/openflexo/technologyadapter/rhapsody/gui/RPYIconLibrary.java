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

package org.openflexo.technologyadapter.rhapsody.gui;

import java.util.logging.Logger;

import javax.swing.ImageIcon;

import org.openflexo.icon.ImageIconResource;
import org.openflexo.rm.ResourceLocator;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYProject;

public class RPYIconLibrary {
	private static final Logger logger = Logger.getLogger(RPYIconLibrary.class.getPackage().getName());

	public static final ImageIcon RPY_TECHNOLOGY_BIG_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYTechnology.png"));
	public static final ImageIcon RPY_TECHNOLOGY_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));
	public static final ImageIcon RPY_FILE_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));

	public static final ImageIcon RPY_PROJECT_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));
	public static final ImageIcon RPY_PACKAGE_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));
	public static final ImageIcon RPY_FOLDER_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/Folder_16x16.png"));

	/*public static ImageIcon iconForObject(Class<? extends TechnologyObject<?>> objectClass) {
		return null;
	}*/

	public static ImageIcon iconForObject(Class<? extends RPYObject> objectClass) {
		if (RPYProject.class.isAssignableFrom(objectClass)) {
			return RPY_PROJECT_ICON;
		}
		else if (RPYProject.class.isAssignableFrom(objectClass)) {
			return RPY_PACKAGE_ICON;
		}
		logger.warning("No icon for " + objectClass);
		return null;
	}

}
