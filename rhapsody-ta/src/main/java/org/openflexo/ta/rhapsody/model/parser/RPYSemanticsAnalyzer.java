/**
 * 
 * Copyright (c) 2013-2014, Openflexo
 * Copyright (c) 2012-2012, AgileBirds
 * 
 * This file is part of Connie-core, a component of the software infrastructure 
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

import org.openflexo.ta.rhapsody.model.RPYModelFactory;
import org.openflexo.ta.rhapsody.model.RPYRootObject;
import org.openflexo.ta.rhapsody.parser.analysis.DepthFirstAdapter;
import org.openflexo.ta.rhapsody.parser.node.ARpyComplexObject;
import org.openflexo.ta.rhapsody.parser.node.ARpyRoot;

/**
 * This class implements the semantics analyzer for a parsed DSL.<br>
 * 
 * @author sylvain
 * 
 */
public class RPYSemanticsAnalyzer<RD extends RPYRootObject<RD>> extends DepthFirstAdapter {

	private RPYModelFactory<RD, ?> modelFactory;
	private RD rootObject;

	private RPYObjectFactory objectFactory;

	public RPYSemanticsAnalyzer(RPYModelFactory<RD, ?> modelFactory) {
		this.modelFactory = modelFactory;
		objectFactory = new RPYObjectFactory(modelFactory);
	}

	public RPYModelFactory<RD, ?> getModelFactory() {
		return modelFactory;
	}

	public RD getRootObject() {
		return rootObject;
	}

	@Override
	public void inARpyRoot(ARpyRoot node) {
		// TODO Auto-generated method stub
		super.inARpyRoot(node);
		rootObject = (RD) objectFactory.makeRPYObject((ARpyComplexObject) node.getRpyComplexObject());
		System.out.println("RootObject : " + rootObject);
	}

}
