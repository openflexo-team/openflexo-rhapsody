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

package org.openflexo.ta.rhapsody.model;

import java.util.logging.Logger;

import org.openflexo.foundation.PamelaResourceModelFactory;
import org.openflexo.foundation.action.FlexoUndoManager;
import org.openflexo.foundation.resource.PamelaResourceImpl.IgnoreLoadingEdits;
import org.openflexo.pamela.ModelContextLibrary;
import org.openflexo.pamela.converter.RelativePathResourceConverter;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.pamela.factory.EditingContext;
import org.openflexo.pamela.factory.ModelFactory;
import org.openflexo.ta.rhapsody.RPYTechnologyContextManager;
import org.openflexo.ta.rhapsody.metamodel.RPYConcept;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty;
import org.openflexo.ta.rhapsody.metamodel.RPYProperty.PropertyType;
import org.openflexo.ta.rhapsody.model.cgi.CGIClass;
import org.openflexo.ta.rhapsody.model.cgi.CGIClassChart;
import org.openflexo.ta.rhapsody.model.cgi.CGIText;
import org.openflexo.ta.rhapsody.rm.RPYResource;

/**
 * Abstract base {@link ModelFactory} for a Rhapsody resource
 * 
 * @author sylvain
 * 
 */
public abstract class RPYModelFactory<RD extends RPYRootObject<RD>, R extends RPYResource<RD, ?>> extends ModelFactory
		implements PamelaResourceModelFactory<R> {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RPYModelFactory.class.getPackage().getName());

	private final R resource;
	private IgnoreLoadingEdits ignoreHandler = null;
	private FlexoUndoManager undoManager = null;

	private RelativePathResourceConverter relativePathResourceConverter;

	private RPYTechnologyContextManager technologyContextManager;

	private RD rootObject;

	public RPYModelFactory(Class<RD> resourceDataClass, R resource, RPYTechnologyContextManager technologyContextManager)
			throws ModelDefinitionException {
		super(ModelContextLibrary.getCompoundModelContext(resourceDataClass));
		this.resource = resource;
		this.technologyContextManager = technologyContextManager;
		setEditingContext(technologyContextManager.getServiceManager().getEditingContext());
		addConverter(relativePathResourceConverter = new RelativePathResourceConverter(null));
		if (resource != null && resource.getIODelegate() != null && resource.getIODelegate().getSerializationArtefactAsResource() != null) {
			relativePathResourceConverter
					.setContainerResource(resource.getIODelegate().getSerializationArtefactAsResource().getContainer());
		}
	}

	@Override
	public R getResource() {
		return resource;
	}

	@Override
	public synchronized void startDeserializing() {
		EditingContext editingContext = getResource().getServiceManager().getEditingContext();

		if (editingContext != null && editingContext.getUndoManager() instanceof FlexoUndoManager) {
			undoManager = (FlexoUndoManager) editingContext.getUndoManager();
			undoManager.addToIgnoreHandlers(ignoreHandler = new IgnoreLoadingEdits(resource));
			// System.out.println("@@@@@@@@@@@@@@@@ START LOADING RESOURCE " + resource.getURI());
		}

	}

	@Override
	public synchronized void stopDeserializing() {
		if (ignoreHandler != null) {
			undoManager.removeFromIgnoreHandlers(ignoreHandler);
			// System.out.println("@@@@@@@@@@@@@@@@ END LOADING RESOURCE " + resource.getURI());
		}
	}

	public RPYConcept getRPYConcept(String conceptName) {
		return technologyContextManager.getRPYConcept(conceptName);
	}

	public RPYObject makeObject(RPYConcept concept) {
		if (concept.getName().contains("Handle")) {
			RPYHandle<?> returned = newInstance(RPYHandle.class);
			returned.setConcept(concept);
			returned.setRootObject(getRootObject());
			return returned;
		}
		if (concept.getName().equals("IRPYRawContainer")) {
			RPYRawContainer returned = newInstance(RPYRawContainer.class);
			returned.setRootObject(getRootObject());
			returned.setConcept(concept);
			return returned;
		}
		if (concept.getName().equals("IDiagram")) {
			RPYObjectClassDiagram returned = newInstance(RPYObjectClassDiagram.class);
			returned.setConcept(concept);
			return returned;
		}
		if (concept.getName().equals("IMSC")) {
			RPYSequenceDiagram returned = newInstance(RPYSequenceDiagram.class);
			returned.setConcept(concept);
			return returned;
		}
		if (concept.getName().equals("CGIClassChart")) {
			CGIClassChart returned = newInstance(CGIClassChart.class);
			returned.setConcept(concept);
			return returned;
		}
		if (concept.getName().equals("CGIClass")) {
			CGIClass returned = newInstance(CGIClass.class);
			returned.setConcept(concept);
			return returned;
		}
		if (concept.getName().equals("CGIText")) {
			CGIText returned = newInstance(CGIText.class);
			returned.setConcept(concept);
			return returned;
		}
		RPYUnmappedObject returned = newInstance(RPYUnmappedObject.class);
		returned.setRootObject(getRootObject());
		returned.setConcept(concept);
		return returned;
	}

	public RPYProperty ensureProperty(String propertyName, PropertyType type, RPYConcept concept) {
		return technologyContextManager.ensureProperty(propertyName, type, concept);
	}

	public RD getRootObject() {
		return rootObject;
	}

	protected void setRootObject(RD rootObject) {
		this.rootObject = rootObject;
	}
}
