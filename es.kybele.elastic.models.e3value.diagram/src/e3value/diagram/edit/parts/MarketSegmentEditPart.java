package e3value.diagram.edit.parts;

import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import e3value.diagram.edit.parts.listeners.BorderItemSelectionEditPolicyCustom;
import e3value.diagram.edit.parts.listeners.MarketSegmentFigureListener;
import e3value.diagram.edit.parts.listeners.ValueInterfaceFigureListener;
import e3value.diagram.edit.parts.policies.custom.CreationEditPolicyWithCustomReparentCustom;
import e3value.diagram.edit.parts.policies.custom.XYLayoutEditPolicyCustom;
import e3value.diagram.edit.policies.MarketSegmentCanonicalEditPolicy;
import e3value.diagram.edit.policies.MarketSegmentItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class MarketSegmentEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3008;

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
	public MarketSegmentEditPart(View view) {
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MarketSegmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MarketSegmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 * Adds the supplied child to the editpart's border item container figure if
	 * it is an instanceof {@link IBorderItemEditPart}.
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {

		IFigure childFigure = ((GraphicalEditPart) childEditPart).getFigure();
		if (childEditPart instanceof MarketSegmentNameEditPart) {
			((MarketSegmentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMarketSegmentLabelName());

		} else if (childEditPart instanceof IBorderItemEditPart) {
			IFigure borderItemContainer = getContentPaneFor((IGraphicalEditPart) childEditPart);
			addBorderItem(borderItemContainer,
					(IBorderItemEditPart) childEditPart);

			if (childEditPart instanceof ValueInterfaceEditPart) {
				ValueInterfaceEditPart _viep = (ValueInterfaceEditPart) childEditPart;

				BorderItemLocator _border = (BorderItemLocator) _viep
						.getBorderItemLocator();

				_border.setBorderItemOffset(new Dimension(_viep
						.getMapModeUnWrapping().DPtoLP(10), _viep
						.getMapModeUnWrapping().DPtoLP(10)));
			}

		} else {

			IFigure parent = getContentPaneFor((IGraphicalEditPart) childEditPart);

			// If there are a mixture of border items and other contained
			// figures, the index may be incorrect and could result in out of
			// bounds exceptions.

			if (parent != null) {
				index = Math.min(parent.getChildren().size(), index);
			}
			parent.add(childFigure, index);
		}
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
		if (editPart instanceof MarketSegmentMarketSegmentComparmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureMarketSegmentInvisibleRectangleComparment();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// Modify the Edit Policy of MarketSegment Figure
		XYLayoutEditPolicyCustom lep = new XYLayoutEditPolicyCustom();

		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MarketSegmentFigure() {
			protected boolean useLocalCoordinates() {
				return true;
			}
		};
	}

	/**
	 * @generated
	 */
	public MarketSegmentFigure getPrimaryShape() {
		return (MarketSegmentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MarketSegmentNameEditPart) {
			((MarketSegmentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMarketSegmentLabelName());
			return true;
		}
		if (childEditPart instanceof MarketSegmentMarketSegmentComparmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMarketSegmentInvisibleRectangleComparment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MarketSegmentMarketSegmentComparmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ValueInterfaceEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NONE);
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
		if (childEditPart instanceof MarketSegmentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof MarketSegmentMarketSegmentComparmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMarketSegmentInvisibleRectangleComparment();
			pane.remove(((MarketSegmentMarketSegmentComparmentDiagramEditPart) childEditPart)
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
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 100);
		result.setMinimumSize(new Dimension(200, 100));
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
		figure.addFigureListener(new MarketSegmentFigureListener(this));
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(E3valueVisualIDRegistry
				.getType(MarketSegmentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MarketSegmentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMarketSegmentLabelName;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMarketSegmentInvisibleRectangleComparment;

		/**
		 * @generated
		 */
		public MarketSegmentFigure() {
			this.setLayoutManager(new XYLayout());
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			//this.setForegroundColor(ColorConstants.red);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure r10 = new RectangleFigure();

			r10.setBackgroundColor(ColorConstants.white);
			r10.setBorder(new LineBorder(ColorConstants.black, getMapMode()
					.DPtoLP(2)));

			this.add(
					r10,
					new Rectangle(getMapMode().DPtoLP(10), getMapMode().DPtoLP(
							10), getMapMode().DPtoLP(200), getMapMode().DPtoLP(
							100)));

			RectangleFigure r20 = new RectangleFigure();

			r20.setBackgroundColor(ColorConstants.white);
			r20.setBorder(new LineBorder(ColorConstants.black, getMapMode()
					.DPtoLP(2)));

			this.add(r20,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode()
							.DPtoLP(5), getMapMode().DPtoLP(200), getMapMode()
							.DPtoLP(100)));

			fFigureMarketSegmentInvisibleRectangleComparment = new RectangleFigure();

			fFigureMarketSegmentInvisibleRectangleComparment.setOutline(false);
			fFigureMarketSegmentInvisibleRectangleComparment.setFill(true);
			fFigureMarketSegmentInvisibleRectangleComparment.setOpaque(true);
			fFigureMarketSegmentInvisibleRectangleComparment
					.setBackgroundColor(ColorConstants.lightGray);
			fFigureMarketSegmentInvisibleRectangleComparment
					.setBorder(new LineBorder(ColorConstants.black,
							getMapMode().DPtoLP(2)));
			fFigureMarketSegmentInvisibleRectangleComparment
					.setLayoutManager(new StackLayout());
			this.add(fFigureMarketSegmentInvisibleRectangleComparment,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(200), getMapMode()
							.DPtoLP(100)));

			fFigureMarketSegmentLabelName = new WrappingLabel();

			fFigureMarketSegmentLabelName.setText("Market Segment Name");

			fFigureMarketSegmentLabelName
					.setFont(FFIGUREMARKETSEGMENTLABELNAME_FONT);

			this.add(fFigureMarketSegmentLabelName, new Rectangle(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(100), getMapMode().DPtoLP(30)));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMarketSegmentLabelName() {
			return fFigureMarketSegmentLabelName;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMarketSegmentInvisibleRectangleComparment() {
			return fFigureMarketSegmentInvisibleRectangleComparment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMARKETSEGMENTLABELNAME_FONT = new Font(
			Display.getCurrent(), "Arial", 9, SWT.BOLD);

	/**
	 * @generated
	 */
	public IMapMode getMapModeUnWrapping() {
		// TODO Auto-generated method stub
		return getMapMode();
	}

}
