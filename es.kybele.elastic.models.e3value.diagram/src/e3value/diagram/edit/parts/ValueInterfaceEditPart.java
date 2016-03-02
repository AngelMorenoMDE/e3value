package e3value.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;
import org.kybele.elastic.e3value.utils.E3ValueUtils;

import e3value.BusinessActor;
import e3value.ValueInterface;
import e3value.diagram.edit.parts.listeners.ValueInterfaceFigureListener;
import e3value.diagram.edit.parts.policies.custom.CreationEditPolicyWithCustomReparentCustom;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;
import e3value.diagram.edit.policies.ValueInterfaceItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueInterfaceEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public ValueInterfaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparentCustom(
						E3valueVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ValueInterfaceItemSemanticEditPolicy());
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
		return primaryShape = new ValueInterfaceFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public ValueInterfaceFigureDescriptor getPrimaryShape() {
		return (ValueInterfaceFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValueInterfaceValuePortOutCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureValuePortOutInvisibleRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ValueInterfaceValuePortOutCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceValuePortInCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureValuePortInInvisibleRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ValueInterfaceValuePortInCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceResponsabilityElementCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureResponsabilityElementInvisibleRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ValueInterfaceResponsabilityElementCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValueInterfaceValuePortOutCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureValuePortOutInvisibleRectangle();
			pane.remove(((ValueInterfaceValuePortOutCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceValuePortInCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureValuePortInInvisibleRectangle();
			pane.remove(((ValueInterfaceValuePortInCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceResponsabilityElementCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureResponsabilityElementInvisibleRectangle();
			pane.remove(((ValueInterfaceResponsabilityElementCompartmentDiagramEditPart) childEditPart)
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
		if (editPart instanceof ValueInterfaceValuePortOutCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureValuePortOutInvisibleRectangle();
		}
		if (editPart instanceof ValueInterfaceValuePortInCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureValuePortInInvisibleRectangle();
		}
		if (editPart instanceof ValueInterfaceResponsabilityElementCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureResponsabilityElementInvisibleRectangle();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 20);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.addFigureListener(new ValueInterfaceFigureListener(this));
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
			if (type == E3valueElementTypes.ValuePortOut_3003) {
				return getChildBySemanticHint(E3valueVisualIDRegistry
						.getType(ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID));
			}
			if (type == E3valueElementTypes.ValuePortIn_3002) {
				return getChildBySemanticHint(E3valueVisualIDRegistry
						.getType(ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID));
			}
			if (type == E3valueElementTypes.ResponsabilityElement_3004) {
				return getChildBySemanticHint(E3valueVisualIDRegistry
						.getType(ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ValueInterfaceFigureDescriptor extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureValuePortInInvisibleRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureResponsabilityElementInvisibleRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureValuePortOutInvisibleRectangle;

		/**
		 * @generated
		 */
		public ValueInterfaceFigureDescriptor() {
			this.setLayoutManager(new XYLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(20)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(20)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureValuePortInInvisibleRectangle = new RectangleFigure();


			fFigureValuePortInInvisibleRectangle.setLineWidth(0);
			fFigureValuePortInInvisibleRectangle.setOutline(false);
			fFigureValuePortInInvisibleRectangle.setFill(false);
			fFigureValuePortInInvisibleRectangle.setOpaque(false);
			fFigureValuePortInInvisibleRectangle
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
							getMapMode().DPtoLP(20)));
			fFigureValuePortInInvisibleRectangle.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			this.add(fFigureValuePortInInvisibleRectangle, new Rectangle(
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));
			fFigureValuePortInInvisibleRectangle
					.setLayoutManager(new XYLayout());

			fFigureValuePortOutInvisibleRectangle = new RectangleFigure();
			fFigureValuePortOutInvisibleRectangle.setLineWidth(0);
			fFigureValuePortOutInvisibleRectangle.setOutline(false);
			fFigureValuePortOutInvisibleRectangle.setFill(false);
			fFigureValuePortOutInvisibleRectangle.setOpaque(false);
			fFigureValuePortOutInvisibleRectangle
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
							getMapMode().DPtoLP(20)));
			fFigureValuePortOutInvisibleRectangle.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			this.add(fFigureValuePortOutInvisibleRectangle, new Rectangle(
					getMapMode().DPtoLP(60), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));
			fFigureValuePortOutInvisibleRectangle
					.setLayoutManager(new XYLayout());

			fFigureResponsabilityElementInvisibleRectangle = new RectangleFigure();

			fFigureResponsabilityElementInvisibleRectangle.setOutline(false);
			fFigureResponsabilityElementInvisibleRectangle.setFill(false);
			fFigureResponsabilityElementInvisibleRectangle.setOpaque(false);
			fFigureResponsabilityElementInvisibleRectangle
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(12),
							getMapMode().DPtoLP(12)));
			fFigureResponsabilityElementInvisibleRectangle
					.setMinimumSize(new Dimension(getMapMode().DPtoLP(12),
							getMapMode().DPtoLP(12)));
			fFigureResponsabilityElementInvisibleRectangle.setBackgroundColor(ColorConstants.black);
			this.add(
					fFigureResponsabilityElementInvisibleRectangle,
					new Rectangle(getMapMode().DPtoLP(46), getMapMode().DPtoLP(
							-1), getMapMode().DPtoLP(12), getMapMode().DPtoLP(12)));
			fFigureResponsabilityElementInvisibleRectangle
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureValuePortInInvisibleRectangle() {
			return fFigureValuePortInInvisibleRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureResponsabilityElementInvisibleRectangle() {
			return fFigureResponsabilityElementInvisibleRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureValuePortOutInvisibleRectangle() {
			return fFigureValuePortOutInvisibleRectangle;
		}

	}

	/**
	 * @generated
	 */
	public IMapMode getMapModeUnWrapping() {
		// TODO Auto-generated method stub
		return getMapMode();
	}

}
