package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.InputPortCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class OrForkOrForkInputPortCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OrForkOrForkInputPortCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.OrFork_3014);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.InputPort_3057 == req.getElementType()) {
			return getGEFWrapper(new InputPortCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
