package org.openflexo.ta.rhapsody.model;
/**
 * 
 * Copyright (c) 2018, Openflexo
 * 
 * This file is part of OpenflexoTechnologyAdapter, a component of the software infrastructure 
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

import static org.junit.Assert.assertNotNull;

import java.util.Collection;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.technologyadapter.TechnologyAdapterService;
import org.openflexo.ta.rhapsody.AbstractRPYTest;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;
import org.openflexo.ta.rhapsody.rm.RPYProjectResourceRepository;
import org.openflexo.test.OrderedRunner;
import org.openflexo.test.TestOrder;

@RunWith(OrderedRunner.class)
public class TestRampeV7 extends AbstractRPYTest {
	protected static final Logger logger = Logger.getLogger(TestRampeV7.class.getPackage().getName());

	@Test
	@TestOrder(1)
	public void testInitializeServiceManager() throws Exception {
		instanciateTestServiceManager(RPYTechnologyAdapter.class);
	}

	@Test
	@TestOrder(3)
	public void testRPYLoading() {
		RPYTechnologyAdapter technologicalAdapter = serviceManager.getTechnologyAdapterService()
				.getTechnologyAdapter(RPYTechnologyAdapter.class);

		for (FlexoResourceCenter<?> resourceCenter : serviceManager.getResourceCenterService().getResourceCenters()) {
			RPYProjectResourceRepository<?> rpyProjectRepository = technologicalAdapter.getRPYProjectResourceRepository(resourceCenter);
			assertNotNull(rpyProjectRepository);
			Collection<RPYProjectResource> allRPYProjectResources = rpyProjectRepository.getAllResources();
			for (RPYProjectResource rpyProjectResource : allRPYProjectResources) {
				System.out.println("Found RPY Project: " + rpyProjectResource);
			}
		}
	}

	private static RPYProject project;

	@Test
	@TestOrder(4)
	public void testRPYContents() {

		project = getRPYProject("Rampe/V7");
		System.out.println("V7:\n" + project);

		// debugMetaModel();

		// System.out.println("*************************");

		System.out.println(project.toExtendedString(0));

		/*assertEquals(1, project.getResource().getContents().size());
		assertTrue(project.getResource().getContents().get(0) instanceof RPYPackageResource);
		
		RPYPackageResource defaultPackageResource = (RPYPackageResource) project.getResource().getContents().get(0);
		assertFalse(defaultPackageResource.isLoaded());
		
		assertEquals(1, project.getProfiles().size());
		RPYProfile profile = project.getProfiles().get(0);
		assertSame(project, profile.getResourceData());
		
		assertEquals(1, project.getDiagrams().size());
		RPYObjectClassDiagram rootDiagram = project.getDiagrams().get(0);
		assertNotNull(rootDiagram);
		assertNotNull(rootDiagram.getClassChart());
		assertSame(rootDiagram, rootDiagram.getClassChart().getModelObject());
		
		assertEquals("Model1", rootDiagram.getName());*/
	}

	private void debugMetaModel() {

		TechnologyAdapterService taService = serviceManager.getTechnologyAdapterService();
		RPYTechnologyAdapter ta = taService.getTechnologyAdapter(RPYTechnologyAdapter.class);
		RPYTechnologyContextManager cm = (RPYTechnologyContextManager) taService.getTechnologyContextManager(ta);

		for (RPYConcept concept : cm.getRPYConcepts()) {
			System.out.println("***** " + concept.getName());
			for (RPYProperty property : concept.getProperties()) {
				System.out.println("  > " + property.getName() + " : " + property.getType());
			}
		}
	}
}
