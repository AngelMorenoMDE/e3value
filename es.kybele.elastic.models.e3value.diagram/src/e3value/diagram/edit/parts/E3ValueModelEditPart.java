package e3value.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import e3value.diagram.edit.parts.listeners.E3ValueModelFigureListener;
import e3value.diagram.edit.policies.E3ValueModelItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class E3ValueModelEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public E3ValueModelEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new E3ValueModelItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new E3ValueModelFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public E3ValueModelFigureDescriptor getPrimaryShape() {
		return (E3ValueModelFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof E3ValueModelE3ValueModelCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureE3ValueModelInvisibleRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((E3ValueModelE3ValueModelCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof E3ValueModelE3ValueModelCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureE3ValueModelInvisibleRectangleCompartment();
			pane.remove(((E3ValueModelE3ValueModelCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof E3ValueModelE3ValueModelCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureE3ValueModelInvisibleRectangleCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(800, 600);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		figure.addFigureListener(new E3ValueModelFigureListener());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public class E3ValueModelFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureE3ValueModelInvisibleRectangleCompartment;

		/**
		 * @generated
		 */
		public E3ValueModelFigureDescriptor() {
			this.setLayoutManager(new XYLayout());
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(800),
					getMapMode().DPtoLP(600)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(800),
					getMapMode().DPtoLP(600)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureE3ValueModelInvisibleRectangleCompartment = new RectangleFigure();

			fFigureE3ValueModelInvisibleRectangleCompartment.setOutline(false);
			fFigureE3ValueModelInvisibleRectangleCompartment.setFill(false);
			fFigureE3ValueModelInvisibleRectangleCompartment.setOpaque(false);
			fFigureE3ValueModelInvisibleRectangleCompartment
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(800),
							getMapMode().DPtoLP(600)));
			fFigureE3ValueModelInvisibleRectangleCompartment
					.setMinimumSize(new Dimension(getMapMode().DPtoLP(800),
							getMapMode().DPtoLP(600)));

			this.add(fFigureE3ValueModelInvisibleRectangleCompartment,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(800), getMapMode()
							.DPtoLP(600)));
			fFigureE3ValueModelInvisibleRectangleCompartment
					.setLayoutManager(new StackLayout());

			WrappingLabel e3ValueModelLabelName0 = new WrappingLabel();

			e3ValueModelLabelName0.setText("E3Value Model Name");

			e3ValueModelLabelName0.setFont(E3VALUEMODELLABELNAME0_FONT);

			this.add(e3ValueModelLabelName0,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode()
							.DPtoLP(5), getMapMode().DPtoLP(300), getMapMode()
							.DPtoLP(30)));

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureE3ValueModelInvisibleRectangleCompartment() {
			return fFigureE3ValueModelInvisibleRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public IMapMode getMapModeUnWrapping() {
			// TODO Auto-generated method stub
			return getMapMode();
		}
	}

	/**
	 * @generated
	 */
	static final Font E3VALUEMODELLABELNAME0_FONT = new Font(
			Display.getCurrent(), "Arial", 12, SWT.BOLD);

}
