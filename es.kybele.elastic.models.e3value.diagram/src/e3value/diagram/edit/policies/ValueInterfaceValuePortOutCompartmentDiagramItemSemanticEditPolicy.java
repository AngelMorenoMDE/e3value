package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.ValuePortOutCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueInterfaceValuePortOutCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueInterfaceValuePortOutCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueInterface_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.ValuePortOut_3003 == req.getElementType()) {
			return getGEFWrapper(new ValuePortOutCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
