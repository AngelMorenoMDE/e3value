package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import e3value.diagram.edit.commands.ValueExchangeHasValueObjectCreateCommand;
import e3value.diagram.edit.commands.ValueExchangeHasValueObjectReorientCommand;
import e3value.diagram.edit.parts.ValueExchangeHasValueObjectEditPart;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueExchangeItemSemanticEditPolicy extends
		E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueExchangeItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueExchange_4002);
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
		if (E3valueElementTypes.ValueExchangeHasValueObject_4005 == req
				.getElementType()) {
			return getGEFWrapper(new ValueExchangeHasValueObjectCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (E3valueElementTypes.ValueExchangeHasValueObject_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ValueExchangeHasValueObjectEditPart.VISUAL_ID:
			return getGEFWrapper(new ValueExchangeHasValueObjectReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
