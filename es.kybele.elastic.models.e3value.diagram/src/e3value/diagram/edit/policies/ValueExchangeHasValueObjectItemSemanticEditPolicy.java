package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueExchangeHasValueObjectItemSemanticEditPolicy extends
		E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueExchangeHasValueObjectItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueExchangeHasValueObject_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
