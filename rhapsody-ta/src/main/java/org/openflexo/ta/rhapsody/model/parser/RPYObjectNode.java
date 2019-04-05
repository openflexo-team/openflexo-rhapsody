/**
 * 
 * Copyright (c) 2019, Openflexo
 * 
 * This file is part of B-parser, a component of the software infrastructure 
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

import org.openflexo.p2pp.P2PPNode;
import org.openflexo.ta.rhapsody.parser.node.Node;

/**
 * Maintains consistency between the model (represented by an {@link BObject}) and source code represented in B language
 * 
 * Works
 * 
 * @author sylvain
 * 
 */
@Deprecated
public abstract class RPYObjectNode<N extends Node, T> extends P2PPNode<N, T> {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RPYObjectNode.class.getPackage().getName());

	private final RPYSemanticsAnalyzer analyser;

	public RPYObjectNode(N astNode, RPYSemanticsAnalyzer analyser) {
		super(null, astNode, null /*analyser.getFragmentManager()*/);
		this.analyser = analyser;

		// modelObject = buildModelObjectFromAST(astNode);
		// modelObject.setPrettyPrintDelegate(this);
		// modelObject.initializeDeserialization(getModelFactory());
	}

	/*
	public RPYObjectNode(T aBObject, BSemanticsAnalyzer analyser) {
		super(aBObject, null, null);
		this.analyser = analyser;
	
		modelObject.setPrettyPrintDelegate(this);
		preparePrettyPrint(false);
	}
	
	public BModelFactory getModelFactory() {
		return analyser.getModelFactory();
	}
	
	public BSemanticsAnalyzer getAnalyser() {
		return analyser;
	}
	
	public PredicateFactory getPredicateFactory() {
		return analyser.getPredicateFactory();
	}
	
	public ExpressionFactory getExpressionFactory() {
		return analyser.getExpressionFactory();
	}
	
	public OperationFactory getOperationFactory() {
		return analyser.getOperationFactory();
	}
	
	public SubstitutionFactory getSubstitutionFactory() {
		return analyser.getSubstitutionFactory();
	}
	
	// Make this method visible
	@Override
	public void addToChildren(P2PPNode<?, ?> child) {
		super.addToChildren(child);
	}
	
	// Make this method visible
	@Override
	public void preparePrettyPrint(boolean hasParsedVersion) {
		super.preparePrettyPrint(hasParsedVersion);
	}
	
	@Override
	public RawSource getRawSource() {
		if (analyser != null) {
			return analyser.getRawSource();
		}
		return null;
	}
	
	@Override
	public String getRepresentation(PrettyPrintContext context) {
		return getTextualRepresentation(context);
	}
	
	@Override
	public String getNormalizedRepresentation(PrettyPrintContext context) {
		return getNormalizedTextualRepresentation(context);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <C> P2PPNode<?, C> makeObjectNode(C object) {
		if (object instanceof BExtendsClause) {
			return (P2PPNode<?, C>) new BExtendsClauseNode((BExtendsClause) object, getAnalyser());
		}
		if (object instanceof BImportsClause) {
			return (P2PPNode<?, C>) new BImportsClauseNode((BImportsClause) object, getAnalyser());
		}
		if (object instanceof BIncludesClause) {
			return (P2PPNode<?, C>) new BIncludesClauseNode((BIncludesClause) object, getAnalyser());
		}
		if (object instanceof BSeesClause) {
			return (P2PPNode<?, C>) new BSeesClauseNode((BSeesClause) object, getAnalyser());
		}
		if (object instanceof BUsesClause) {
			return (P2PPNode<?, C>) new BUsesClauseNode((BUsesClause) object, getAnalyser());
		}
		if (object instanceof BSet) {
			return (P2PPNode<?, C>) new BSetNode((BSet) object, getAnalyser());
		}
		if (object instanceof BSetValue) {
			return (P2PPNode<?, C>) new BSetValueNode((BSetValue) object, getAnalyser());
		}
		if (object instanceof BAbstractConstant) {
			return (P2PPNode<?, C>) new BAbstractConstantNode((BAbstractConstant) object, getAnalyser());
		}
		if (object instanceof BConcreteConstant) {
			return (P2PPNode<?, C>) new BConcreteConstantNode((BConcreteConstant) object, getAnalyser());
		}
		if (object instanceof BAbstractVariable) {
			return (P2PPNode<?, C>) new BAbstractVariableNode((BAbstractVariable) object, getAnalyser());
		}
		if (object instanceof BConcreteVariable) {
			return (P2PPNode<?, C>) new BConcreteVariableNode((BConcreteVariable) object, getAnalyser());
		}
	
		if (object instanceof BExpression) {
			return (P2PPNode<?, C>) getExpressionFactory().makeExpressionNode((BExpression) object);
		}
		if (object instanceof BPredicate) {
			return (P2PPNode<?, C>) getPredicateFactory().makePredicateNode((BPredicate) object);
		}
		if (object instanceof BSubstitution) {
			return (P2PPNode<?, C>) getSubstitutionFactory().makeSubstitutionNode((BSubstitution) object);
		}
		if (object instanceof BOperation) {
			return (P2PPNode<?, C>) getOperationFactory().makeOperationNode((BOperation) object);
		}
	
		System.err.println("Not supported: " + object);
		Thread.dumpStack();
		return null;
	}
	
	public RawSourceFragment getFragment(Node node) {
		if (node instanceof Token) {
			Token token = (Token) node;
			RawSourcePosition start = getAnalyser().getFragmentManager()
					.translatePosition(getRawSource().makePositionBeforeChar(token.getLine(), token.getPos()));
			RawSourcePosition end = getAnalyser().getFragmentManager()
					.translatePosition(getRawSource().makePositionBeforeChar(token.getLine(), token.getPos() + token.getText().length()));
			return getRawSource().makeFragment(start, end);
		}
		else {
			return getAnalyser().getFragmentManager().retrieveFragment(node);
		}
	}
	
	public RawSourceFragment getFragment(Node node, List<? extends Node> otherNodes) {
		ChainedCollection<Node> collection = new ChainedCollection<>();
		collection.add(node);
		collection.add(otherNodes);
		return getAnalyser().getFragmentManager().getFragment(collection);
	}
	
	protected RawSourceFragment getFragment(List<TIdentifierLiteral> idLitList) {
		return getAnalyser().getFragmentManager().getFragment(idLitList);
	}
	
	protected String getText(List<TIdentifierLiteral> idLitList) {
		return getAnalyser().getText(idLitList);
	}
	
	protected String getText(PExpression expression) {
		return getAnalyser().getText(expression);
	}
	
	protected Integer getInteger(TIntegerLiteral literal) {
		return getAnalyser().getInteger(literal);
	}
	*/
}
