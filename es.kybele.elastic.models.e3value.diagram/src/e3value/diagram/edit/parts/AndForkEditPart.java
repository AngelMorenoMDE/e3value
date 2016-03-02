package e3value.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import e3value.diagram.edit.policies.AndForkItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class AndForkEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
	public AndForkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						E3valueVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AndForkItemSemanticEditPolicy());
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
		return primaryShape = new AndForkFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public AndForkFigureDescriptor getPrimaryShape() {
		return (AndForkFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AndForkAndForkInputPortCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAndForkInputPortInvisibleRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AndForkAndForkInputPortCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof AndForkAndForkOutputPortsCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAndForkOutputPortsInvisibleRectangleComparment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AndForkAndForkOutputPortsCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AndForkAndForkInputPortCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAndForkInputPortInvisibleRectangleCompartment();
			pane.remove(((AndForkAndForkInputPortCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof AndForkAndForkOutputPortsCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAndForkOutputPortsInvisibleRectangleComparment();
			pane.remove(((AndForkAndForkOutputPortsCompartmentDiagramEditPart) childEditPart)
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
		if (editPart instanceof AndForkAndForkInputPortCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureAndForkInputPortInvisibleRectangleCompartment();
		}
		if (editPart instanceof AndForkAndForkOutputPortsCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureAndForkOutputPortsInvisibleRectangleComparment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 50);
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == E3valueElementTypes.InputPort_3057) {
				return getChildBySemanticHint(E3valueVisualIDRegistry
						.getType(AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID));
			}
			if (type == E3valueElementTypes.OutputPort_3058) {
				return getChildBySemanticHint(E3valueVisualIDRegistry
						.getType(AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AndForkFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureAndForkInputPortInvisibleRectangleCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureAndForkOutputPortsInvisibleRectangleComparment;

		/**
		 * @generated
		 */
		public AndForkFigureDescriptor() {
			this.setLayoutManager(new XYLayout());
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(50)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(50)));					
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			/* 
			 * _____  ______ _____
			 * |    | |    | |    |
			 * |    | |    | |    |
			 * | C1 | | C2 | | C3 |
			 * |    | |    | |    |
			 * |____| |____| |____|
			 * 
			 * */
			
			fFigureAndForkInputPortInvisibleRectangleCompartment = new RectangleFigure();

			fFigureAndForkInputPortInvisibleRectangleCompartment
					.setOutline(false);
			fFigureAndForkInputPortInvisibleRectangleCompartment.setFill(false);
			fFigureAndForkInputPortInvisibleRectangleCompartment
					.setOpaque(false);


			this.add(
					fFigureAndForkInputPortInvisibleRectangleCompartment,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							20), getMapMode().DPtoLP(10), getMapMode().DPtoLP(
							20)));
			fFigureAndForkInputPortInvisibleRectangleCompartment
					.setLayoutManager(new StackLayout());

			
			// Componente Central del And Fork
			RectangleFigure andForkFigureInvisibleRectangle0 = new RectangleFigure();

			andForkFigureInvisibleRectangle0.setOutline(false);
			andForkFigureInvisibleRectangle0.setFill(false);
			andForkFigureInvisibleRectangle0.setOpaque(false);
			PolygonShape andFigure1 = new PolygonShape();

//			andFigure1.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
//					.DPtoLP(0)));
//			andFigure1.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
//					.DPtoLP(50)));
//			andFigure1.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
//					.DPtoLP(100)));
//			andFigure1.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
//					.DPtoLP(0)));
			
			andFigure1.addPoint(new Point(getMapMode().DPtoLP(16), getMapMode().DPtoLP(0)));
			andFigure1.addPoint(new Point(getMapMode().DPtoLP(2), getMapMode().DPtoLP(25)));
			andFigure1.addPoint(new Point(getMapMode().DPtoLP(16), getMapMode().DPtoLP(50)));
			andFigure1.addPoint(new Point(getMapMode().DPtoLP(16), getMapMode().DPtoLP(0)));		
			andFigure1.setFill(false);
			andFigure1.setOpaque(false);
			andFigure1.setOutline(true);
			andFigure1.setLineWidth(2);

			andFigure1.setForegroundColor(ColorConstants.black);
			andFigure1.setBackgroundColor(ColorConstants.lightGray);
			//andFigure1.setLayoutManager(new XYLayout());
			andForkFigureInvisibleRectangle0.add(andFigure1,new Rectangle(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(50)));
			
			this.add(andForkFigureInvisibleRectangle0, new Rectangle(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(50)));
			andForkFigureInvisibleRectangle0.setLayoutManager(new StackLayout());



			fFigureAndForkOutputPortsInvisibleRectangleComparment = new RectangleFigure();

			fFigureAndForkOutputPortsInvisibleRectangleComparment
					.setOutline(false);
			fFigureAndForkOutputPortsInvisibleRectangleComparment
					.setFill(false);
			fFigureAndForkOutputPortsInvisibleRectangleComparment
					.setOpaque(false);


			this.add(
					fFigureAndForkOutputPortsInvisibleRectangleComparment,
					new Rectangle(getMapMode().DPtoLP(30), getMapMode().DPtoLP(
							-1), getMapMode().DPtoLP(10), getMapMode().DPtoLP(
							50)));
			fFigureAndForkOutputPortsInvisibleRectangleComparment
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAndForkInputPortInvisibleRectangleCompartment() {
			return fFigureAndForkInputPortInvisibleRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAndForkOutputPortsInvisibleRectangleComparment() {
			return fFigureAndForkOutputPortsInvisibleRectangleComparment;
		}

	}

}
