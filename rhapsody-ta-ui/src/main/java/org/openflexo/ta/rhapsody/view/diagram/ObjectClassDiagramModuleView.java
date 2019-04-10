package org.openflexo.ta.rhapsody.view.diagram;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import org.openflexo.diana.Drawing.DrawingTreeNode;
import org.openflexo.diana.swing.JDianaInteractiveEditor;
import org.openflexo.diana.swing.SwingViewFactory;
import org.openflexo.diana.swing.control.SwingToolFactory;
import org.openflexo.diana.swing.control.tools.JDianaInspectors;
import org.openflexo.diana.swing.control.tools.JDianaScaleSelector;
import org.openflexo.foundation.FlexoObject;
import org.openflexo.selection.SelectionListener;
import org.openflexo.ta.rhapsody.model.RPYObjectClassDiagram;
import org.openflexo.view.ModuleView;
import org.openflexo.view.controller.FlexoController;
import org.openflexo.view.controller.model.FlexoPerspective;

@SuppressWarnings("serial")
public class ObjectClassDiagramModuleView extends JPanel implements ModuleView<RPYObjectClassDiagram> {

	static final Logger logger = Logger.getLogger(ObjectClassDiagramModuleView.class.getPackage().getName());

	private RPYObjectClassDiagram diagram;

	private final ObjectClassDiagramDrawing drawing;
	private final DiagramDrawingEditor editor;
	private final FlexoPerspective perspective;

	private List<SelectionListener> selectionListeners;

	public ObjectClassDiagramModuleView(RPYObjectClassDiagram diagram, FlexoPerspective perspective) {
		super(new BorderLayout());
		this.diagram = diagram;
		this.perspective = perspective;

		selectionListeners = new ArrayList<>();

		drawing = new ObjectClassDiagramDrawing(diagram);
		editor = new DiagramDrawingEditor(drawing, this);
		// dc.disablePaintingCache();
		editor.getDrawingView().setName(diagram.getName());
		add(new JScrollPane(editor.getDrawingView()), BorderLayout.CENTER);
		add(editor.scaleSelector.getComponent(), BorderLayout.NORTH);
	}

	public DiagramDrawingEditor getController() {
		return editor;
	}

	public RPYObjectClassDiagram getDiagram() {
		return diagram;
	}

	public void addToSelectionListeners(SelectionListener listener) {
		selectionListeners.add(listener);
	}

	public void removeFromSelectionListeners(SelectionListener listener) {
		selectionListeners.remove(listener);
	}

	public void delete() {
		this.removeAll();
		selectionListeners.clear();
		diagram = null;
		editor.delete(); // controllers delete drawingView & drawing
	}

	@Override
	public void finalize() {
		logger.warning("ObjectClassDiagramModuleView has been garbage collected");
	}

	@Override
	public RPYObjectClassDiagram getRepresentedObject() {
		return diagram;
	}

	@Override
	public void deleteModuleView() {
		diagram = null;
		this.removeAll();
	}

	@Override
	public FlexoPerspective getPerspective() {
		return perspective;
	}

	@Override
	public void show(FlexoController controller, FlexoPerspective perspective) {
	}

	public static class DiagramDrawingEditor extends JDianaInteractiveEditor<RPYObjectClassDiagram> {
		private final ObjectClassDiagramModuleView panel;
		private final JPopupMenu contextualMenu;
		private final JDianaScaleSelector scaleSelector;
		private final JDianaInspectors inspectors;

		public DiagramDrawingEditor(ObjectClassDiagramDrawing drawing, ObjectClassDiagramModuleView panel) {
			super(drawing, drawing.getFactory(), SwingViewFactory.INSTANCE, SwingToolFactory.DEFAULT);
			this.panel = panel;
			scaleSelector = (JDianaScaleSelector) getToolFactory().makeDianaScaleSelector(this);
			inspectors = (JDianaInspectors) getToolFactory().makeDianaInspectors();
			inspectors.attachToEditor(this);

			contextualMenu = new JPopupMenu();
			contextualMenu.add(new JMenuItem("Item"));
		}

		@Override
		public void addToSelectedObjects(DrawingTreeNode<?, ?> anObject) {
			super.addToSelectedObjects(anObject);
			// System.out.println("Tiens j'ai selectionne " + anObject.getDrawable());
			if (anObject.getDrawable() instanceof FlexoObject) {
				for (SelectionListener l : panel.selectionListeners) {
					l.fireObjectSelected((FlexoObject) anObject.getDrawable());
				}
			}
		}

		@Override
		public void removeFromSelectedObjects(DrawingTreeNode<?, ?> anObject) {
			super.removeFromSelectedObjects(anObject);
			// System.out.println("Tiens j'ai deselectionne " + anObject.getDrawable());
			if (anObject.getDrawable() instanceof FlexoObject) {
				for (SelectionListener l : panel.selectionListeners) {
					l.fireObjectDeselected((FlexoObject) anObject.getDrawable());
				}
			}
		}

		@Override
		public void clearSelection() {
			super.clearSelection();
			// System.out.println("clear de la selection");
			for (SelectionListener l : panel.selectionListeners) {
				l.fireResetSelection();
			}
		}

		/*@Override
		public void selectDrawing() {
			super.selectDrawing();
			System.out.println("selection du drawing");
		}*/

		/*@Override
		protected void fireSelectionUpdated() {
			super.fireSelectionUpdated();
			System.out.println("******* Nouvelle selection: " + getSelectedObjects());
		}*/

		/*@Override
		public JDrawingView<Graph> makeDrawingView() {
			JDrawingView<Graph> returned = super.makeDrawingView();
			returned.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (e.isPopupTrigger() || e.getButton() == MouseEvent.BUTTON3) {
						logger.info("Display contextual menu");
					}
				}
			});
			return returned;
		}*/

	}

	@Override
	public boolean isAutoscrolled() {
		return true;
	}

	@Override
	public void willHide() {

		perspective.setTopRightView(null);
		perspective.setBottomRightView(null);

		/*System.out.println("FMLControlledDiagramModuleView WILL HIDE !!!!!!");
		
		getEditor().getFlexoController().getControllerModel().setRightViewVisible(false);
		
		perspective.setTopRightView(null);
		perspective.setBottomRightView(null);
		
		getEditor().getFlexoController().getEditingContext().unregisterPasteHandler(getEditor().getPasteHandler());
		
		bottomPanel.remove(getDiagramTechnologyAdapterController(getEditor().getFlexoController()).getScaleSelector().getComponent());
		*/
	}

	@Override
	public void willShow() {

		perspective.setBottomRightView(editor.inspectors.getPanelGroup());

		/*System.out.println("FMLControlledDiagramModuleView WILL SHOW !!!!!!");
		
		// Sets palette view of editor to be the top right view
		perspective.setTopRightView(getEditor().getPaletteView());
		// perspective.setHeader(((FreeDiagramModuleView) moduleView).getEditor().getS());
		
		DiagramTechnologyAdapterController diagramTAController = getDiagramTechnologyAdapterController(getEditor().getFlexoController());
		
		diagramTAController.getInspectors().attachToEditor(getEditor());
		diagramTAController.getDialogInspectors().attachToEditor(getEditor());
		diagramTAController.getScaleSelector().attachToEditor(getEditor());
		
		perspective.setBottomRightView(
				getDiagramTechnologyAdapterController(getEditor().getFlexoController()).getInspectors().getPanelGroup());
		
		getEditor().getFlexoController().getControllerModel().setRightViewVisible(true);
		
		getEditor().getFlexoController().getEditingContext().registerPasteHandler(getEditor().getPasteHandler());
		
		bottomPanel.add(getDiagramTechnologyAdapterController(getEditor().getFlexoController()).getScaleSelector().getComponent(),
				BorderLayout.EAST);
		
		getPerspective().focusOnObject(getRepresentedObject());*/
	}

	/*public DiagramTechnologyAdapterController getDiagramTechnologyAdapterController(FlexoController controller) {
		TechnologyAdapterControllerService tacService = controller.getApplicationContext().getTechnologyAdapterControllerService();
		return tacService.getTechnologyAdapterController(DiagramTechnologyAdapterController.class);
	}*/

}
