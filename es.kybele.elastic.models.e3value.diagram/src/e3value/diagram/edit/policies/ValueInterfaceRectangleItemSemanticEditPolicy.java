package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.ValuePortInCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueInterfaceRectangleItemSemanticEditPolicy extends
		E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueInterfaceRectangleItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueInterface_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.ValuePortIn_3002 == req.getElementType()) {
			return getGEFWrapper(new ValuePortInCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
