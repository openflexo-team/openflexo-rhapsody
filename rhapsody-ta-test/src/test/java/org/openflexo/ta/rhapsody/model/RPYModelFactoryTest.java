/**
 * 
 * Copyright (c) 2014, Openflexo
 * 
 * This file is part of Gina-core, a component of the software infrastructure 
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

package org.openflexo.ta.rhapsody.model;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openflexo.foundation.resource.FlexoResourceCenterService;
import org.openflexo.foundation.technologyadapter.TechnologyAdapterService;
import org.openflexo.foundation.test.fml.AbstractModelFactoryIntegrationTestCase;
import org.openflexo.logging.FlexoLogger;
import org.openflexo.pamela.exceptions.MissingImplementationException;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.test.OrderedRunner;
import org.openflexo.test.TestOrder;

/**
 * Test instanciation of FIBModelFactory<br>
 * TODO: instanciate all widgets
 * 
 */
@RunWith(OrderedRunner.class)
public class RPYModelFactoryTest extends AbstractModelFactoryIntegrationTestCase {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = FlexoLogger.getLogger(RPYModelFactoryTest.class.getPackage().getName());

	private static TechnologyAdapterService taService;
	private static RPYTechnologyAdapter technologyAdapter;
	private static RPYTechnologyContextManager technologyAdapterContextManager;

	private static RPYProjectFactory factory;

	/**
	 * Instanciate test ServiceManager
	 */
	@Test
	@TestOrder(1)
	public void initializeServiceManager() {
		log("initializeServiceManager()");
		instanciateTestServiceManager(RPYTechnologyAdapter.class);

		assertNotNull(serviceManager.getService(FlexoResourceCenterService.class));
		assertNotNull(serviceManager.getService(TechnologyAdapterService.class));

		assertNotNull(taService = serviceManager.getTechnologyAdapterService());
		assertNotNull(technologyAdapter = taService.getTechnologyAdapter(RPYTechnologyAdapter.class));
		assertNotNull(
				technologyAdapterContextManager = (RPYTechnologyContextManager) taService.getTechnologyContextManager(technologyAdapter));
	}

	@Test
	@TestOrder(2)
	public void testRPYProjectFactory() throws ModelDefinitionException, MissingImplementationException {
		RPYProjectFactory factory = new RPYProjectFactory(null, technologyAdapterContextManager);
		factory.checkMethodImplementations();
	}

	@Test
	@TestOrder(3)
	public void testRPYPackageFactory() throws ModelDefinitionException, MissingImplementationException {
		RPYPackageFactory factory = new RPYPackageFactory(null, technologyAdapterContextManager);
		factory.checkMethodImplementations();
	}

}
