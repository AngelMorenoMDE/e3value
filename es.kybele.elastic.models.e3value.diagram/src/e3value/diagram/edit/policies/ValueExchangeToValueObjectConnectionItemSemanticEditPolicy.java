package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueExchangeToValueObjectConnectionItemSemanticEditPolicy extends
		E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueExchangeToValueObjectConnectionItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueExchange_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
