package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.CompositeActorCreateCommand;
import e3value.diagram.edit.commands.ElementaryActorCreateCommand;
import e3value.diagram.edit.commands.MarketSegmentCreateCommand;
import e3value.diagram.edit.commands.ValueObjectCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class E3ValueModelE3ValueModelCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public E3ValueModelE3ValueModelCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.E3ValueModel_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.MarketSegment_3008 == req.getElementType()) {
			return getGEFWrapper(new MarketSegmentCreateCommand(req));
		}
		if (E3valueElementTypes.ElementaryActor_3009 == req.getElementType()) {
			return getGEFWrapper(new ElementaryActorCreateCommand(req));
		}
		if (E3valueElementTypes.CompositeActor_3016 == req.getElementType()) {
			return getGEFWrapper(new CompositeActorCreateCommand(req));
		}
		if (E3valueElementTypes.ValueObject_3023 == req.getElementType()) {
			return getGEFWrapper(new ValueObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
