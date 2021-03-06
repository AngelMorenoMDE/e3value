package e3value.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import e3value.OrFork;
import e3value.diagram.edit.policies.OrForkOrForkOutputPortsCompartmentDiagramCanonicalEditPolicy;
import e3value.diagram.edit.policies.OrForkOrForkOutputPortsCompartmentDiagramItemSemanticEditPolicy;
import e3value.diagram.part.E3valueVisualIDRegistry;
import e3value.diagram.part.Messages;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class OrForkOrForkOutputPortsCompartmentDiagramEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7031;

	/**
	 * @generated
	 */
	public OrForkOrForkOutputPortsCompartmentDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.OrForkOrForkOutputPortsCompartmentDiagramEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		//result.addFigureListener(new AndForkAndForkOutputPortsCompartmentDiagramFigureListener(this));
		result.setTitleVisibility(false);
		Insets insets = result.getContentPane().getInsets();
		EObject _eobject = ((View) this.getParent().getModel()).getElement();
		if(_eobject instanceof OrFork)
		{
			OrFork _orFork = (OrFork) _eobject;
			if(_orFork.getHasOutputPorts().size() > 2)
			{
				insets.top = 5;
				insets.bottom = 0;
				insets.left = 0;
				insets.right = 0;
			}
			else
			{
				insets.top = 10;
				insets.bottom = 0;
				insets.left = 0;
				insets.right = 0;
			}
		}		

		// Layout behavior modification : data must be represented horizontally
		ConstrainedToolbarLayout layoutMgr = (ConstrainedToolbarLayout) result
				.getContentPane().getLayoutManager();
		layoutMgr.setVertical(true);
		layoutMgr.setStretchMajorAxis(false); // uses all the avalaible space
		layoutMgr.setStretchMinorAxis(false); // uses all the avalaible space
		
		
		_eobject = ((View) this.getParent().getModel()).getElement();
		if(_eobject instanceof OrFork)
		{
			OrFork _orFork = (OrFork) _eobject;
			if(_orFork.getHasOutputPorts().size() > 2)
			{
				layoutMgr.setSpacing(4);
			}
			else
			{
				layoutMgr.setSpacing(10);
			}
		}		
		
		return result;
	}
	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OrForkOrForkOutputPortsCompartmentDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						E3valueVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new OrForkOrForkOutputPortsCompartmentDiagramCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature)
				|| NotationPackage.eINSTANCE.getSize_Height().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_X().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_Y())).intValue();
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Height())).intValue();
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), new Rectangle(x, y, width, height));
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
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
			if (type == E3valueElementTypes.OutputPort_3058) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request)
						.getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType
								.equals(E3valueElementTypes.ConnectionElement_4001))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
