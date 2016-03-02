package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import e3value.diagram.edit.commands.ConnectionElementCreateCommand;
import e3value.diagram.edit.commands.ConnectionElementReorientCommand;
import e3value.diagram.edit.parts.ConnectionElementEditPart;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ConnectionElementItemSemanticEditPolicy extends
		E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionElementItemSemanticEditPolicy() {
		super(E3valueElementTypes.ConnectionElement_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (E3valueElementTypes.ConnectionElement_4001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (E3valueElementTypes.ConnectionElement_4001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConnectionElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionElementReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
