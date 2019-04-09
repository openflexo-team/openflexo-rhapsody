/**
 * 
 * Copyright (c) 2019, Openflexo
 * 
 * This file is part of FML-parser, a component of the software infrastructure 
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

package org.openflexo.ta.rhapsody.model.parser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty.PropertyType;
import org.openflexo.ta.rhapsody.model.RPYModelFactory;
import org.openflexo.ta.rhapsody.model.RPYObject;
import org.openflexo.ta.rhapsody.parser.analysis.DepthFirstAdapter;
import org.openflexo.ta.rhapsody.parser.node.ACharsLiteralRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.AFloatNumber;
import org.openflexo.ta.rhapsody.parser.node.AIdValueRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.AIdentifierRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.AIntNumber;
import org.openflexo.ta.rhapsody.parser.node.ANoneRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.ANumbersRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.AObjectListRpyObject;
import org.openflexo.ta.rhapsody.parser.node.ARpyComplexObject;
import org.openflexo.ta.rhapsody.parser.node.ARpyComplexObjectRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.ARpyPropertyValue;
import org.openflexo.ta.rhapsody.parser.node.ASingleObjectRpyObject;
import org.openflexo.ta.rhapsody.parser.node.AStringLiteralRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.AStyleRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.ATimeLiteralRpySingleObject;
import org.openflexo.ta.rhapsody.parser.node.Node;
import org.openflexo.ta.rhapsody.parser.node.PNumber;
import org.openflexo.ta.rhapsody.parser.node.PRpyObject;
import org.openflexo.ta.rhapsody.parser.node.PRpyPropertyValue;
import org.openflexo.ta.rhapsody.parser.node.PRpySingleObject;

/**
 * 
 * 
 * @author sylvain
 * 
 */
public class RPYObjectFactory extends DepthFirstAdapter {

	private static final Logger logger = Logger.getLogger(RPYObjectFactory.class.getPackage().getName());

	private RPYModelFactory<?, ?> modelFactory;

	public RPYObjectFactory(RPYModelFactory<?, ?> modelFactory) {
		this.modelFactory = modelFactory;
	}

	public RPYModelFactory<?, ?> getModelFactory() {
		return modelFactory;
	}

	public RPYObject makeRPYObject(ARpyComplexObject node) {
		// node.apply(this);

		String conceptIdentifier = node.getIdentifier().getText();

		/*if (conceptIdentifier.equals("IRPYRawContainer")) {
		
			System.out.println("Tiens faut gerer une liste pour ");
		
		}
		else {*/

		RPYConcept concept = getModelFactory().getRPYConcept(conceptIdentifier);
		// System.out.println("concept: " + concept);

		RPYObject returned = getModelFactory().makeObject(concept);

		for (PRpyPropertyValue pRpyPropertyValue : node.getPropertyValues()) {
			ARpyPropertyValue pv = (ARpyPropertyValue) pRpyPropertyValue;
			// System.out.println(pv.getIdentifier() + " = " + pv.getRpyObject() + " of " + pv.getRpyObject().getClass());
			String propertyName = pv.getIdentifier().getText();
			Object value = makePropertyValue(pv.getRpyObject(), propertyName, concept);
			returned.setPropertyValue(propertyName, value);
		}

		returned.mapProperties();

		return returned;
		// }
	}

	private <T> T makePropertyValue(PRpyObject node, String propertyName, RPYConcept concept) {
		if (node instanceof AObjectListRpyObject) {
			return (T) makePropertyValueAsList((AObjectListRpyObject) node, propertyName, concept);
		}
		else if (node instanceof ASingleObjectRpyObject) {
			return makePropertyValue(((ASingleObjectRpyObject) node).getRpySingleObject(), propertyName, concept);
		}
		return null;
	}

	private <T> T makePropertyValue(PRpySingleObject node, String propertyName, RPYConcept concept) {
		if (node instanceof ACharsLiteralRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Chars, concept);
			return (T) ((ACharsLiteralRpySingleObject) node).getCharsLiteral().getText();
		}
		if (node instanceof AIdentifierRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Identifier, concept);
			return (T) ((AIdentifierRpySingleObject) node).getIdentifier().getText();
		}
		if (node instanceof AIdValueRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Id, concept);
			// System.out.println("On retourne l'ID: " + getText(((AIdValueRpySingleObject) node).getExtendedHexIdentifier()));
			return (T) getText(((AIdValueRpySingleObject) node).getExtendedHexIdentifier());
		}
		if (node instanceof ANoneRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, null, concept);
			return null;
		}
		if (node instanceof ANumbersRpySingleObject) {
			// return ((ANumbersRpySingleObject) node).getCharsLiteral().getText();
			LinkedList<PNumber> nList = ((ANumbersRpySingleObject) node).getNList();
			if (nList.size() == 1) {
				RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Number, concept);
				return (T) getNumber(nList.get(0));
			}
			else {
				RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.NumberList, concept);
				return (T) getNumbers(nList);
			}
		}
		if (node instanceof ARpyComplexObjectRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Object, concept);
			ARpyComplexObject rpyComplexObject = (ARpyComplexObject) ((ARpyComplexObjectRpySingleObject) node).getRpyComplexObject();
			return (T) makeRPYObject(rpyComplexObject);
		}
		if (node instanceof AStringLiteralRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.String, concept);
			String stringWithQuotes = ((AStringLiteralRpySingleObject) node).getStringLiteral().getText();
			return (T) stringWithQuotes.substring(1, stringWithQuotes.length() - 1);
		}
		if (node instanceof AStyleRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.Style, concept);
			// return ((AStyleRpySingleObject) node).getCharsLiteral().getText();
			logger.warning("Style not implemented");
			return null;
		}
		if (node instanceof ATimeLiteralRpySingleObject) {
			RPYProperty property = getModelFactory().ensureProperty(propertyName, PropertyType.DateTime, concept);
			// return ((ATimeLiteralRpySingleObject) node).getCharsLiteral().getText();
			logger.warning("DateTime not implemented");
			return null;
		}
		return null;
	}

	public List<?> makePropertyValueAsList(AObjectListRpyObject node, String propertyName, RPYConcept concept) {

		// System.out.println("Tiens j'ai une liste de " + node + " pour " + propertyName);

		List<?> returned = new ArrayList<>();
		appendPropertyValueAsList(node, propertyName, concept, returned);
		return returned;
	}

	private <T> void appendPropertyValueAsList(AObjectListRpyObject node, String propertyName, RPYConcept concept, List<T> list) {

		list.add(makePropertyValue(node.getRpySingleObject(), propertyName, concept));
		if (node.getRpyObject() instanceof AObjectListRpyObject) {
			appendPropertyValueAsList((AObjectListRpyObject) node.getRpyObject(), propertyName, concept, list);
		}
		else if (node.getRpyObject() instanceof ASingleObjectRpyObject) {
			list.add(makePropertyValue(((ASingleObjectRpyObject) node.getRpyObject()).getRpySingleObject(), propertyName, concept));
		}
	}

	private String getText(Node node) {
		return new TextRetriever(node).getText();
	}

	private Number getNumber(PNumber node) {
		if (node instanceof AFloatNumber) {
			return Double.parseDouble(((AFloatNumber) node).getFloatLiteral().getText());
		}
		else if (node instanceof AIntNumber) {
			return Long.parseLong(((AIntNumber) node).getIntegerLiteral().getText());
		}
		logger.warning("Unexpected number: " + node);
		return null;
	}

	private List<Number> getNumbers(List<PNumber> nodeList) {
		List<Number> returned = new ArrayList<>();
		for (PNumber pNumber : nodeList) {
			returned.add(getNumber(pNumber));
		}
		return returned;
	}
}
