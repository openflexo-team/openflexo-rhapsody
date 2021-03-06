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

package org.openflexo.ta.rhapsody.view.diagram;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openflexo.diana.ConnectorGraphicalRepresentation;
import org.openflexo.diana.DianaModelFactory;
import org.openflexo.diana.DianaModelFactoryImpl;
import org.openflexo.diana.ShapeGraphicalRepresentation;
import org.openflexo.diana.impl.DrawingImpl;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.rhapsody.model.RPYDiagram;
import org.openflexo.ta.rhapsody.model.RPYObject;

/**
 * This is the abstraction of a drawing representing a {@link RPYDiagram}<br>
 * 
 * @author sylvain
 * 
 */
public abstract class RPYDiagramDrawing<D extends RPYDiagram> extends DrawingImpl<D> {

	private static final Logger logger = Logger.getLogger(RPYDiagramDrawing.class.getPackage().getName());

	private static DianaModelFactory FACTORY;

	static {
		try {
			FACTORY = new DianaModelFactoryImpl();
		} catch (ModelDefinitionException e) {
			e.printStackTrace();
		}
	}

	public RPYDiagramDrawing(D diagram) {
		super(diagram, FACTORY, PersistenceMode.UniqueGraphicalRepresentations);
	}

	@Override
	public void delete() {
		shapesMap.clear();
		super.delete();
	}

	private Map<String, Map<RPYObject, ShapeGraphicalRepresentation>> shapesMap = new HashMap<>();
	private Map<String, Map<RPYObject, ConnectorGraphicalRepresentation>> connectorsMap = new HashMap<>();

	protected ShapeGraphicalRepresentation getShapeGraphicalRepresentation(RPYObject anObject, String name) {
		Map<RPYObject, ShapeGraphicalRepresentation> map = shapesMap.get(name);
		if (map == null) {
			map = new HashMap<>();
			shapesMap.put(name, map);
		}
		ShapeGraphicalRepresentation returned = map.get(anObject);
		if (returned == null) {
			returned = makeShapeGraphicalRepresentation(anObject, name);
			map.put(anObject, returned);
		}
		return returned;
	}

	protected abstract ShapeGraphicalRepresentation makeShapeGraphicalRepresentation(RPYObject object, String name);

	protected ConnectorGraphicalRepresentation getConnectorGraphicalRepresentation(RPYObject anObject, String name) {
		Map<RPYObject, ConnectorGraphicalRepresentation> map = connectorsMap.get(name);
		if (map == null) {
			map = new HashMap<>();
			connectorsMap.put(name, map);
		}
		ConnectorGraphicalRepresentation returned = map.get(anObject);
		if (returned == null) {
			returned = makeConnectorGraphicalRepresentation(anObject, name);
			map.put(anObject, returned);
		}
		return returned;
	}

	protected abstract ConnectorGraphicalRepresentation makeConnectorGraphicalRepresentation(RPYObject object, String name);

}
