package e3value.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import e3value.diagram.edit.policies.EndStimulusItemSemanticEditPolicy;

/**
 * @generated
 */
public class EndStimulusEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

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
	public EndStimulusEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EndStimulusItemSemanticEditPolicy());
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
		return primaryShape = new EndStimulusFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public EndStimulusFigureDescriptor getPrimaryShape() {
		return (EndStimulusFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);
		result.setMaximumSize(new Dimension(getMapMode().DPtoLP(20),
				getMapMode().DPtoLP(20)));
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
	public class EndStimulusFigureDescriptor extends Ellipse {

		/**
		 * @generated
		 */
		public EndStimulusFigureDescriptor() {
			this.setLayoutManager(new XYLayout());
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.white);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse ellipseRedEndStimulus0 = new Ellipse();

			ellipseRedEndStimulus0.setForegroundColor(ColorConstants.black);
			ellipseRedEndStimulus0.setBackgroundColor(ColorConstants.red);
			ellipseRedEndStimulus0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(16)));
			ellipseRedEndStimulus0.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(16), getMapMode().DPtoLP(16)));

			this.add(ellipseRedEndStimulus0,
					new Rectangle(getMapMode().DPtoLP(2), getMapMode()
							.DPtoLP(2), getMapMode().DPtoLP(16), getMapMode()
							.DPtoLP(16)));

			Ellipse ellipseInternalEndStimulus0 = new Ellipse();

			ellipseInternalEndStimulus0
					.setForegroundColor(ColorConstants.black);
			ellipseInternalEndStimulus0
					.setBackgroundColor(ColorConstants.black);

			this.add(ellipseInternalEndStimulus0, new Rectangle(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8), getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(4)));

		}

	}

}
