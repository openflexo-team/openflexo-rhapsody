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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openflexo.foundation.FlexoException;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.resource.ResourceLoadingCancelledException;
import org.openflexo.foundation.technologyadapter.TechnologyAdapterService;
import org.openflexo.ta.rhapsody.AbstractRPYTest;
import org.openflexo.ta.rhapsody.RPYTechnologyAdapter;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.model.cgi.CGIClass;
import org.openflexo.ta.rhapsody.model.cgi.CGIClassChart;
import org.openflexo.ta.rhapsody.rm.RPYPackageResource;
import org.openflexo.ta.rhapsody.rm.RPYProjectResource;
import org.openflexo.ta.rhapsody.rm.RPYProjectResourceRepository;
import org.openflexo.test.OrderedRunner;
import org.openflexo.test.TestOrder;

@RunWith(OrderedRunner.class)
public class TestLoadRPYProjects extends AbstractRPYTest {
	protected static final Logger logger = Logger.getLogger(TestLoadRPYProjects.class.getPackage().getName());

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
				try {
					rpyProjectResource.loadResourceData();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (ResourceLoadingCancelledException e) {
					e.printStackTrace();
				} catch (FlexoException e) {
					e.printStackTrace();
				}
				assertNotNull(rpyProjectResource.getLoadedResourceData());
				System.out.println("URI of document: " + rpyProjectResource.getURI());
				System.out.println("ResourceData: " + rpyProjectResource.getLoadedResourceData());
			}
		}
	}

	private static RPYProject project;

	@Test
	@TestOrder(4)
	public void testRPYContents() {

		project = getRPYProject("PingPongProject");
		System.out.println("PingPongProject:\n" + project);

		// debugMetaModel();

		// System.out.println("*************************");

		System.out.println(project.toExtendedString(0));

		assertEquals(1, project.getResource().getContents().size());
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

		assertEquals("Model1", rootDiagram.getName());
	}

	@Test
	@TestOrder(5)
	public void testRPYPackages() {
		assertEquals(1, project.getPackages().size());
		RPYPackageResource defaultPackageResource = (RPYPackageResource) project.getResource().getContents().get(0);
		assertTrue(defaultPackageResource.isLoaded());

		RPYPackage defaultPackage = defaultPackageResource.getLoadedResourceData();

		assertEquals(3, defaultPackage.getEvents().size());
		RPYEvent event1 = defaultPackage.getEvents().get(0);
		RPYEvent event2 = defaultPackage.getEvents().get(1);
		RPYEvent event3 = defaultPackage.getEvents().get(2);
		assertEquals("receivePing", event1.getName());
		assertEquals("sendFromPing", event2.getName());
		assertEquals("sendFromPong", event3.getName());

		assertEquals(3, defaultPackage.getClasses().size());
		RPYClass topLevel = defaultPackage.getClasses().get(0);
		RPYClass ping = defaultPackage.getClasses().get(1);
		RPYClass pong = defaultPackage.getClasses().get(2);

		assertEquals(1, ping.getAssociationEnds().size());
		assertEquals(4, ping.getOperations().size());
		RPYReception reception1 = (RPYReception) ping.getOperations().get(0);
		assertSame(event1, reception1.getEvent());
		RPYReception reception2 = (RPYReception) ping.getOperations().get(1);
		assertSame(event3, reception2.getEvent());
		RPYPrimitiveOperation operation1 = (RPYPrimitiveOperation) ping.getOperations().get(2);
		assertEquals("sendMessagePong", operation1.getName());
		RPYPrimitiveOperation operation2 = (RPYPrimitiveOperation) ping.getOperations().get(3);
		assertEquals("sendMessageToPong", operation2.getName());

		assertEquals(1, pong.getAssociationEnds().size());
		assertEquals(4, pong.getOperations().size());

		assertEquals(2, defaultPackage.getObjectClassDiagrams().size());
		RPYObjectClassDiagram diagram1 = defaultPackage.getObjectClassDiagrams().get(0);
		assertNotNull(diagram1);
		assertNotNull(diagram1.getClassChart());
		assertSame(diagram1, diagram1.getClassChart().getModelObject());
		assertEquals("DiagramClassPingPong", diagram1.getName());

		assertNotNull(diagram1.getClassChart());
		CGIClassChart chart = diagram1.getClassChart();
		assertSame(defaultPackage, chart.getRootObject());
		assertEquals(3, chart.getClasses().size());
		CGIClass topLevelCGI = chart.getClasses().get(0);
		CGIClass pingCGI = chart.getClasses().get(1);
		CGIClass pongCGI = chart.getClasses().get(2);
		assertEquals("Ping", pingCGI.getName().getText());
		assertSame(defaultPackage, pingCGI.getRootObject());

		assertSame(topLevel, topLevelCGI.getModelObject());

		/*List<Object> elementList = (List) diagram1.getClassChart().getPropertyValue("elementList");
		System.out.println("elementList=" + elementList);
		System.out.println("elementList of " + elementList.getClass());
		
		for (Object object : elementList) {
			System.out.println("object: " + object);
		}
		
		RPYUnmappedObject cgiClass = (RPYUnmappedObject) elementList.get(2);
		System.out.println("et donc: " + cgiClass.getPropertyValue("m_transform"));
		
		RPYConcept concept = cgiClass.getConcept();
		System.out.println("concept=" + concept);
		for (RPYProperty rpyProperty : concept.getProperties()) {
			System.out.println("property: " + rpyProperty.getName());
		}*/

		RPYObjectClassDiagram diagram2 = defaultPackage.getObjectClassDiagrams().get(1);
		assertNotNull(diagram2);
		assertNotNull(diagram2.getClassChart());
		assertSame(diagram2, diagram2.getClassChart().getModelObject());
		assertEquals("DiagramInstanceClass", diagram2.getName());

		assertEquals(2, defaultPackage.getSequenceDiagrams().size());
		RPYSequenceDiagram seqDiag1 = defaultPackage.getSequenceDiagrams().get(0);
		assertNotNull(seqDiag1);
		/*assertNotNull(seqDiag1.getClassChart());
		assertSame(seqDiag1, seqDiag1.getClassChart().getModelObject());
		RPYSequenceDiagram seqDiag2 = defaultPackage.getSequenceDiagrams().get(1);
		assertNotNull(seqDiag2);
		assertNotNull(seqDiag2.getClassChart());
		assertSame(seqDiag2, seqDiag2.getClassChart().getModelObject());*/

		// debugMetaModel();
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
