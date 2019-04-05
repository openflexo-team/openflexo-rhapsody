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

import java.util.logging.Logger;

import org.openflexo.ta.rhapsody.parser.analysis.DepthFirstAdapter;
import org.openflexo.ta.rhapsody.parser.node.Node;
import org.openflexo.ta.rhapsody.parser.node.Token;

/**
 * 
 * 
 * @author sylvain
 * 
 */
public class TextRetriever extends DepthFirstAdapter {

	private static final Logger logger = Logger.getLogger(TextRetriever.class.getPackage().getName());

	private Node node;
	private StringBuffer sb = new StringBuffer();

	public TextRetriever(Node node) {
		this.node = node;
		sb = new StringBuffer();
		node.apply(this);
	}

	public Node getNode() {
		return node;
	}

	public String getText() {
		return sb.toString();
	}

	@Override
	public void defaultCase(Node node) {
		super.defaultCase(node);
		if (node instanceof Token) {
			handleToken((Token) node);
		}
	}

	private void handleToken(Token token) {
		sb.append(token.getText());
	}

}
