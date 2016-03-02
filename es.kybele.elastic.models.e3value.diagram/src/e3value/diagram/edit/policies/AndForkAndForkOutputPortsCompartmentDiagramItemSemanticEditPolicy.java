package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.OutputPortCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class AndForkAndForkOutputPortsCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AndForkAndForkOutputPortsCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.AndFork_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.OutputPort_3058 == req.getElementType()) {
			return getGEFWrapper(new OutputPortCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
