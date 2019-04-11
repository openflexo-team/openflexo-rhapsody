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

import java.awt.Color;
import java.util.logging.Logger;

import org.openflexo.connie.DataBinding;
import org.openflexo.diana.ColorGradientBackgroundStyle.ColorGradientDirection;
import org.openflexo.diana.ConnectorGraphicalRepresentation;
import org.openflexo.diana.DianaConstants;
import org.openflexo.diana.DianaModelFactory;
import org.openflexo.diana.DrawingGraphicalRepresentation;
import org.openflexo.diana.GRBinding.ConnectorGRBinding;
import org.openflexo.diana.GRBinding.DrawingGRBinding;
import org.openflexo.diana.GRBinding.ShapeGRBinding;
import org.openflexo.diana.GRProvider.ConnectorGRProvider;
import org.openflexo.diana.GRProvider.DrawingGRProvider;
import org.openflexo.diana.GRProvider.ShapeGRProvider;
import org.openflexo.diana.GRStructureVisitor;
import org.openflexo.diana.ShapeGraphicalRepresentation;
import org.openflexo.diana.ShapeGraphicalRepresentation.DimensionConstraints;
import org.openflexo.diana.ShapeGraphicalRepresentation.LocationConstraints;
import org.openflexo.diana.connectors.ConnectorSpecification.ConnectorType;
import org.openflexo.diana.shapes.ShapeSpecification.ShapeType;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.model.RPYObjectClassDiagram;
import org.openflexo.ta.rhapsody.model.cgi.CGIAssociationEnd;
import org.openflexo.ta.rhapsody.model.cgi.CGIClass;

/**
 * This is the abstraction of a drawing representing a {@link RPYObjectClassDiagram}<br>
 * 
 * @author sylvain
 * 
 */
public class ObjectClassDiagramDrawing extends RPYDiagramDrawing<RPYObjectClassDiagram> {

	private static final Logger logger = Logger.getLogger(ObjectClassDiagramDrawing.class.getPackage().getName());

	private static final String CLASS = "Class";
	private static final String HEADER = "Header";
	private static final String ASSOCIATION = "Association";
	private static final String INVERSE_ASSOCIATION = "InverseAssociation";

	private static Color BLUE_COLOR = new Color(109, 163, 217);

	private DrawingGraphicalRepresentation drawingRepresentation;

	public ObjectClassDiagramDrawing(RPYObjectClassDiagram diagram) {
		super(diagram);
	}

	@Override
	public void delete() {
		drawingRepresentation = null;
		// classRepresentation = null;
		super.delete();
	}

	@Override
	protected ShapeGraphicalRepresentation makeShapeGraphicalRepresentation(RPYObject object, String name) {
		ShapeGraphicalRepresentation returned = null;
		if (object instanceof CGIClass) {
			CGIClass aClass = (CGIClass) object;
			if (name.equals(CLASS)) {
				returned = getFactory().makeShapeGraphicalRepresentation(ShapeType.RECTANGLE);
				returned.setBackground(getFactory().makeColoredBackground(Color.white));
				returned.setForeground(getFactory().makeForegroundStyle(BLUE_COLOR, 0.5f));
				returned.setSelectedForeground(getFactory().makeForegroundStyle(Color.BLUE, 1.0f));
				returned.setShadowStyle(getFactory().makeDefaultShadowStyle());
				returned.setLocationConstraints(LocationConstraints.FREELY_MOVABLE);
				returned.setDimensionConstraints(DimensionConstraints.FREELY_RESIZABLE);
				returned.setIsFloatingLabel(false);
				returned.setX(aClass.getX());
				returned.setY(aClass.getY());
				returned.setWidth(aClass.getWidth());
				returned.setHeight(aClass.getHeight());
			}
			else if (name.equals(HEADER)) {
				returned = getFactory().makeShapeGraphicalRepresentation(ShapeType.RECTANGLE);
				returned.setBackground(
						getFactory().makeColorGradientBackground(BLUE_COLOR, Color.white, ColorGradientDirection.NORTH_WEST_SOUTH_EAST));
				returned.setForeground(getFactory().makeForegroundStyle(BLUE_COLOR, 0.5f));
				returned.setIsFocusable(false);
				returned.setIsFloatingLabel(false);
				returned.setShadowStyle(getFactory().makeNoneShadowStyle());
				returned.setX(0);
				returned.setY(0);
				returned.setWidth(((CGIClass) object).getWidth());
				returned.setHeight(20);
				returned.setXConstraints(new DataBinding<>("0"));
				returned.setYConstraints(new DataBinding<>("0"));
				returned.setWidthConstraints(new DataBinding<>("parent.width"));
				returned.setHeightConstraints(new DataBinding<>("20"));
			}
		}
		return returned;
	}

	@Override
	protected ConnectorGraphicalRepresentation makeConnectorGraphicalRepresentation(RPYObject object, String name) {
		ConnectorGraphicalRepresentation returned = null;
		if (object instanceof CGIAssociationEnd) {
			CGIAssociationEnd anAssociation = (CGIAssociationEnd) object;
			if (name.equals(ASSOCIATION) || name.equals(INVERSE_ASSOCIATION)) {
				Color darkBlueColor = new Color(0, 17, 153);
				returned = getFactory().makeConnectorGraphicalRepresentation(ConnectorType.RECT_POLYLIN);
				returned.setForeground(getFactory().makeForegroundStyle(darkBlueColor, 0.5f));
				returned.setIsMultilineAllowed(true);
				returned.setTextStyle(getFactory().makeTextStyle(darkBlueColor, DianaConstants.DEFAULT_TEXT_FONT.deriveFont(9.0f)));
				returned.getConnectorSpecification().setRelativeLabelLocation(0.9);
			}
		}
		return returned;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void init() {
		drawingRepresentation = getFactory().makeDrawingGraphicalRepresentation();
		drawingRepresentation.setWidth(1000);
		drawingRepresentation.setHeight(1000);

		Color BLUE_COLOR = new Color(109, 163, 217);

		final DrawingGRBinding<RPYObjectClassDiagram> drawingBinding = bindDrawing(RPYObjectClassDiagram.class, "drawing",
				new DrawingGRProvider<RPYObjectClassDiagram>() {
					@Override
					public DrawingGraphicalRepresentation provideGR(RPYObjectClassDiagram drawable, DianaModelFactory factory) {
						return drawingRepresentation;
					}
				});
		final ShapeGRBinding<CGIClass> cgiClassBinding = bindShape(CGIClass.class, CLASS, new ShapeGRProvider<CGIClass>() {
			@Override
			public ShapeGraphicalRepresentation provideGR(CGIClass drawable, DianaModelFactory factory) {
				return getShapeGraphicalRepresentation(drawable, CLASS);
			}
		});
		final ShapeGRBinding<CGIClass> cgiClassHeaderBinding = bindShape(CGIClass.class, HEADER, new ShapeGRProvider<CGIClass>() {
			@Override
			public ShapeGraphicalRepresentation provideGR(CGIClass drawable, DianaModelFactory factory) {
				return getShapeGraphicalRepresentation(drawable, HEADER);
			}
		});

		final ConnectorGRBinding<CGIAssociationEnd> cgiAssociationEndBinding = bindConnector(CGIAssociationEnd.class, ASSOCIATION,
				new ConnectorGRProvider<CGIAssociationEnd>() {
					@Override
					public ConnectorGraphicalRepresentation provideGR(CGIAssociationEnd drawable, DianaModelFactory factory) {
						return getConnectorGraphicalRepresentation(drawable, ASSOCIATION);
					}
				});
		final ConnectorGRBinding<CGIAssociationEnd> cgiAssociationEndInverseBinding = bindConnector(CGIAssociationEnd.class,
				INVERSE_ASSOCIATION, new ConnectorGRProvider<CGIAssociationEnd>() {
					@Override
					public ConnectorGraphicalRepresentation provideGR(CGIAssociationEnd drawable, DianaModelFactory factory) {
						return getConnectorGraphicalRepresentation(drawable, INVERSE_ASSOCIATION);
					}
				});

		drawingBinding.addToWalkers(new GRStructureVisitor<RPYObjectClassDiagram>() {
			@Override
			public void visit(RPYObjectClassDiagram diagram) {
				for (CGIClass cgiClass : diagram.getClassChart().getClasses()) {
					if (cgiClass.hasShape()) {
						drawShape(cgiClassBinding, cgiClass);
					}
				}
				for (CGIAssociationEnd cgiAssociationEnd : diagram.getClassChart().getAssociationEnds()) {
					CGIClass startClass = diagram.getClassChart().getCGIClass(cgiAssociationEnd.getModelObject().getOwnerClass());
					CGIClass endClass = diagram.getClassChart().getCGIClass(cgiAssociationEnd.getModelObject().getOtherClass());
					drawConnector(cgiAssociationEndBinding, cgiAssociationEnd, cgiClassBinding, startClass, cgiClassBinding, endClass);
					if (cgiAssociationEnd.getModelObject().getInverse() != null) {
						drawConnector(cgiAssociationEndInverseBinding, cgiAssociationEnd, cgiClassBinding, endClass, cgiClassBinding,
								startClass);
					}
				}
			}
		});

		cgiClassBinding.addToWalkers(new GRStructureVisitor<CGIClass>() {
			@Override
			public void visit(CGIClass aClass) {
				drawShape(cgiClassHeaderBinding, aClass);
			}
		});

		cgiClassBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.X, new DataBinding<Double>("drawable.x"), false);
		cgiClassBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.Y, new DataBinding<Double>("drawable.y"), false);
		cgiClassBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.WIDTH, new DataBinding<Double>("drawable.width"), true);
		cgiClassBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.HEIGHT, new DataBinding<Double>("drawable.height"), true);

		cgiClassHeaderBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.TEXT, new DataBinding<String>("drawable.name.text"),
				true);

		cgiAssociationEndBinding.setDynamicPropertyValue(ConnectorGraphicalRepresentation.TEXT, new DataBinding<String>("drawable.label"),
				false);
		cgiAssociationEndInverseBinding.setDynamicPropertyValue(ShapeGraphicalRepresentation.TEXT,
				new DataBinding<String>("drawable.inverseLabel"), false);

	}
}
