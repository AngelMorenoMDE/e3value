package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.ResponsabilityElementCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ValueInterfaceResponsabilityElementCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValueInterfaceResponsabilityElementCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.ValueInterface_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.ResponsabilityElement_3004 == req
				.getElementType()) {
			return getGEFWrapper(new ResponsabilityElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
