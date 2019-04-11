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

package org.openflexo.ta.rhapsody.gui;

import java.util.logging.Logger;

import javax.swing.ImageIcon;

import org.openflexo.icon.ImageIconResource;
import org.openflexo.rm.ResourceLocator;
import org.openflexo.ta.rhapsody.model.RPYAssociationEnd;
import org.openflexo.ta.rhapsody.model.RPYClass;
import org.openflexo.ta.rhapsody.model.RPYEvent;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYObjectClassDiagram;
import org.openflexo.ta.rhapsody.model.RPYPackage;
import org.openflexo.ta.rhapsody.model.RPYPrimitiveOperation;
import org.openflexo.ta.rhapsody.model.RPYProfile;
import org.openflexo.ta.rhapsody.model.RPYProject;
import org.openflexo.ta.rhapsody.model.RPYReception;
import org.openflexo.ta.rhapsody.model.RPYSequenceDiagram;
import org.openflexo.ta.rhapsody.model.RPYUnmappedObject;
import org.openflexo.ta.rhapsody.model.cgi.CGIAssociationEnd;
import org.openflexo.ta.rhapsody.model.cgi.CGIClass;

public class RPYIconLibrary {
	private static final Logger logger = Logger.getLogger(RPYIconLibrary.class.getPackage().getName());

	public static final ImageIcon RPY_TECHNOLOGY_BIG_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYTechnology.png"));
	public static final ImageIcon RPY_TECHNOLOGY_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));
	public static final ImageIcon RPY_FILE_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));

	public static final ImageIcon RPY_PROJECT_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProject_16x16.png"));
	public static final ImageIcon RPY_PACKAGE_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYPackage_16x16.png"));
	public static final ImageIcon RPY_FOLDER_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/Folder_16x16.png"));
	public static final ImageIcon RPY_PROFILE_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYProfile_16x16.png"));
	public static final ImageIcon RPY_CLASS_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYClass_16x16.png"));
	public static final ImageIcon RPY_EVENT_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/RPYEvent_16x16.png"));
	public static final ImageIcon RPY_OBJECT_CLASS_DIAGRAM_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYObjectClassDiagram_16x16.png"));
	public static final ImageIcon RPY_SEQUENCE_DIAGRAM_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYSequenceDiagram_16x16.png"));

	public static final ImageIcon CLASSES_LIST_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/ClassesList_16x16.png"));
	public static final ImageIcon EVENTS_LIST_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/EventsList_16x16.png"));
	public static final ImageIcon ASSOCIATION_ENDS_LIST_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/AssociationEndsList_16x16.png"));
	public static final ImageIcon OPERATION_LIST_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/OperationsList_16x16.png"));
	public static final ImageIcon STATECHART_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/Statechart_16x16.png"));
	public static final ImageIcon RPY_ASSOCIATION_ENDS_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYAssociationEnd_16x16.png"));
	public static final ImageIcon RPY_RECEPTION_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYReception_16x16.png"));
	public static final ImageIcon RPY_PRIMITIVE_OPERATION_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/RPYPrimitiveOperation_16x16.png"));

	public static final ImageIcon SIMPLE_PROPERTY_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EEnumLiteral.gif"));
	public static final ImageIcon ID_PROPERTY_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EOperation.gif"));
	public static final ImageIcon REFERENCE_PROPERTY_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EReference.gif"));
	public static final ImageIcon OBJECT_PROPERTY_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EClass.gif"));
	public static final ImageIcon UNMAPPED_OBJECT_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EDataType.gif"));

	public static final ImageIcon CGI_CLASS_ICON = new ImageIconResource(ResourceLocator.locateResource("Icons/MetaModel/EClass.gif"));
	public static final ImageIcon CGI_ASSOCIATION_ICON = new ImageIconResource(
			ResourceLocator.locateResource("Icons/MetaModel/EEnumLiteral.gif"));

	/*public static ImageIcon iconForObject(Class<? extends TechnologyObject<?>> objectClass) {
		return null;
	}*/

	public static ImageIcon iconForObject(Class<? extends RPYObject> objectClass) {
		if (RPYProject.class.isAssignableFrom(objectClass)) {
			return RPY_PROJECT_ICON;
		}
		else if (RPYPackage.class.isAssignableFrom(objectClass)) {
			return RPY_PACKAGE_ICON;
		}
		else if (RPYProfile.class.isAssignableFrom(objectClass)) {
			return RPY_PROFILE_ICON;
		}
		else if (RPYClass.class.isAssignableFrom(objectClass)) {
			return RPY_CLASS_ICON;
		}
		else if (RPYEvent.class.isAssignableFrom(objectClass)) {
			return RPY_EVENT_ICON;
		}
		else if (RPYReception.class.isAssignableFrom(objectClass)) {
			return RPY_RECEPTION_ICON;
		}
		else if (RPYPrimitiveOperation.class.isAssignableFrom(objectClass)) {
			return RPY_PRIMITIVE_OPERATION_ICON;
		}
		else if (RPYAssociationEnd.class.isAssignableFrom(objectClass)) {
			return RPY_ASSOCIATION_ENDS_ICON;
		}
		else if (RPYObjectClassDiagram.class.isAssignableFrom(objectClass)) {
			return RPY_OBJECT_CLASS_DIAGRAM_ICON;
		}
		else if (RPYSequenceDiagram.class.isAssignableFrom(objectClass)) {
			return RPY_SEQUENCE_DIAGRAM_ICON;
		}
		else if (CGIClass.class.isAssignableFrom(objectClass)) {
			return CGI_CLASS_ICON;
		}
		else if (CGIAssociationEnd.class.isAssignableFrom(objectClass)) {
			return CGI_ASSOCIATION_ICON;
		}
		else if (RPYUnmappedObject.class.isAssignableFrom(objectClass)) {
			return UNMAPPED_OBJECT_ICON;
		}
		logger.warning("No icon for " + objectClass);
		return UNMAPPED_OBJECT_ICON;
	}

}
