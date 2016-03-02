package e3value.diagram.edit.parts;

import javax.sound.sampled.Line;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import e3value.diagram.edit.parts.listeners.CompositeActorFigureListener;
import e3value.diagram.edit.parts.listeners.ElementaryActorFigureListener;
import e3value.diagram.edit.parts.policies.custom.CreationEditPolicyWithCustomReparentCustom;
import e3value.diagram.edit.parts.policies.custom.XYLayoutEditPolicyCustom;
import e3value.diagram.edit.policies.ElementaryActorCanonicalEditPolicy;
import e3value.diagram.edit.policies.ElementaryActorItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ElementaryActorEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3009;

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
	public ElementaryActorEditPart(View view) {
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
				new ElementaryActorItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ElementaryActorCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicyCustom lep = new XYLayoutEditPolicyCustom();
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ElementaryActorFigure() {
			protected boolean useLocalCoordinates() {
				return true;
			}
		};
	}

	/**
	 * @generated
	 */
	public ElementaryActorFigure getPrimaryShape() {
		return (ElementaryActorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ElementaryActorNameEditPart) {
			((ElementaryActorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureElementaryActorLabelName());
			return true;
		}
		if (childEditPart instanceof ElementaryActorElementaryActorCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureElementaryActorInvisibleRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ElementaryActorElementaryActorCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceEditPart) {
			
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NONE);
			locator.setBorderItemOffset(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));			
			getBorderedFigure().getBorderItemContainer().add(
					((ValueInterfaceEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ElementaryActorNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ElementaryActorElementaryActorCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureElementaryActorInvisibleRectangleCompartment();
			pane.remove(((ElementaryActorElementaryActorCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ValueInterfaceEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 * Adds the supplied child to the editpart's border item container figure if
	 * it is an instanceof {@link IBorderItemEditPart}.
	 */
	@Override
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
		if (editPart instanceof ElementaryActorElementaryActorCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureElementaryActorInvisibleRectangleCompartment();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 100);
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
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		figure.addFigureListener(new ElementaryActorFigureListener());
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(E3valueVisualIDRegistry
				.getType(ElementaryActorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ElementaryActorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureElementaryActorInvisibleRectangleCompartment;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureElementaryActorLabelName;

		/**
		 * @generated
		 */
		public ElementaryActorFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.lightGray);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(100)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(100)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureElementaryActorInvisibleRectangleCompartment = new RectangleFigure();

			fFigureElementaryActorInvisibleRectangleCompartment
					.setOutline(false);
			fFigureElementaryActorInvisibleRectangleCompartment.setFill(false);
			fFigureElementaryActorInvisibleRectangleCompartment
					.setOpaque(false);

			this.add(fFigureElementaryActorInvisibleRectangleCompartment,
					new Rectangle(getMapMode().DPtoLP(2), getMapMode()
							.DPtoLP(2), getMapMode().DPtoLP(98), getMapMode()
							.DPtoLP(98)));
			fFigureElementaryActorInvisibleRectangleCompartment
					.setLayoutManager(new StackLayout());

			fFigureElementaryActorLabelName = new WrappingLabel();

			fFigureElementaryActorLabelName.setText("Elementary Actor Name");

			fFigureElementaryActorLabelName
					.setFont(FFIGUREELEMENTARYACTORLABELNAME_FONT);

			this.add(fFigureElementaryActorLabelName, new Rectangle(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(100), getMapMode().DPtoLP(30)));

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureElementaryActorInvisibleRectangleCompartment() {
			return fFigureElementaryActorInvisibleRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureElementaryActorLabelName() {
			return fFigureElementaryActorLabelName;
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
	static final Font FFIGUREELEMENTARYACTORLABELNAME_FONT = new Font(
			Display.getCurrent(), "Arial", 9, SWT.BOLD);

}
