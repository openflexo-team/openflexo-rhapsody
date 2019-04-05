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

package org.openflexo.ta.rhapsody;

import java.util.logging.Logger;

import org.openflexo.foundation.fml.annotations.DeclareModelSlots;
import org.openflexo.foundation.fml.annotations.DeclareResourceFactories;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.foundation.resource.FlexoResourceCenterService;
import org.openflexo.foundation.technologyadapter.TechnologyAdapter;
import org.openflexo.ta.rhapsody.fml.binding.RPYBindingFactory;
import org.openflexo.ta.rhapsody.rm.RPYProjectResourceFactory;
import org.openflexo.ta.rhapsody.rm.RPYProjectResourceRepository;

/**
 * This class defines and implements an archetype of a DSL technology adapter based on a sablecc grammar<br>
 * 
 * The idea is to demonstrate TechnologyAdapter API using a sablecc grammar
 * 
 * We offer the connection to a file conform to DSL grammar
 * 
 * @author sylvain
 * 
 */
@DeclareModelSlots({ RPYModelSlot.class })
// You might declare your own types here
// @DeclareTechnologySpecificTypes({ YourCustomType.class })
@DeclareResourceFactories({ RPYProjectResourceFactory.class })
public class RPYTechnologyAdapter extends TechnologyAdapter<RPYTechnologyAdapter> {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RPYTechnologyAdapter.class.getPackage().getName());

	private static final RPYBindingFactory BINDING_FACTORY = new RPYBindingFactory();

	@Override
	public String getName() {
		return "Rhapsody technology adapter";
	}

	@Override
	protected String getLocalizationDirectory() {
		return "FlexoLocalization/RPYTechnologyAdapter";
	}

	@Override
	public void ensureAllRepositoriesAreCreated(FlexoResourceCenter<?> rc) {
		super.ensureAllRepositoriesAreCreated(rc);
		getRPYProjectResourceRepository(rc);

	}

	@Override
	public <I> boolean isIgnorable(FlexoResourceCenter<I> resourceCenter, I contents) {
		return false;
	}

	@Override
	public RPYBindingFactory getTechnologyAdapterBindingFactory() {
		return BINDING_FACTORY;
	}

	@Override
	public String getIdentifier() {
		return "RPY";
	}

	public RPYProjectResourceFactory getRPYProjectResourceFactory() {
		return getResourceFactory(RPYProjectResourceFactory.class);
	}

	@SuppressWarnings("unchecked")
	public <I> RPYProjectResourceRepository<I> getRPYProjectResourceRepository(FlexoResourceCenter<I> resourceCenter) {
		RPYProjectResourceRepository<I> returned = resourceCenter.retrieveRepository(RPYProjectResourceRepository.class, this);
		if (returned == null) {
			returned = RPYProjectResourceRepository.instanciateNewRepository(this, resourceCenter);
			resourceCenter.registerRepository(returned, RPYProjectResourceRepository.class, this);
		}
		return returned;
	}

	@Override
	public RPYTechnologyContextManager createTechnologyContextManager(FlexoResourceCenterService service) {
		return new RPYTechnologyContextManager(this, getTechnologyAdapterService().getServiceManager().getResourceCenterService());
	}

	@Override
	public RPYTechnologyContextManager getTechnologyContextManager() {
		return (RPYTechnologyContextManager) super.getTechnologyContextManager();
	}

}
