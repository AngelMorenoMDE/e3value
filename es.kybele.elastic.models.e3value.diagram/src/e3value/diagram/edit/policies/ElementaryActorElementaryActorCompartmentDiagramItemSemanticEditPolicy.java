package e3value.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import e3value.diagram.edit.commands.AndForkCreateCommand;
import e3value.diagram.edit.commands.AndJoinCreateCommand;
import e3value.diagram.edit.commands.EndStimulusCreateCommand;
import e3value.diagram.edit.commands.OrForkCreateCommand;
import e3value.diagram.edit.commands.OrJoinCreateCommand;
import e3value.diagram.edit.commands.StartStimulusCreateCommand;
import e3value.diagram.edit.commands.ValueActivity2CreateCommand;
import e3value.diagram.edit.commands.ValueActivityCreateCommand;
import e3value.diagram.edit.commands.ValueInterfaceCreateCommand;
import e3value.diagram.edit.commands.ValueObjectCreateCommand;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class ElementaryActorElementaryActorCompartmentDiagramItemSemanticEditPolicy
		extends E3valueBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElementaryActorElementaryActorCompartmentDiagramItemSemanticEditPolicy() {
		super(E3valueElementTypes.ElementaryActor_3009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (E3valueElementTypes.ValueActivity_3005 == req.getElementType()) {
			return getGEFWrapper(new ValueActivityCreateCommand(req));
		}
		if (E3valueElementTypes.StartStimulus_3010 == req.getElementType()) {
			return getGEFWrapper(new StartStimulusCreateCommand(req));
		}
		if (E3valueElementTypes.EndStimulus_3011 == req.getElementType()) {
			return getGEFWrapper(new EndStimulusCreateCommand(req));
		}
		if (E3valueElementTypes.AndFork_3012 == req.getElementType()) {
			return getGEFWrapper(new AndForkCreateCommand(req));
		}
		if (E3valueElementTypes.AndJoin_3013 == req.getElementType()) {
			return getGEFWrapper(new AndJoinCreateCommand(req));
		}
		if (E3valueElementTypes.OrFork_3014 == req.getElementType()) {
			return getGEFWrapper(new OrForkCreateCommand(req));
		}
		if (E3valueElementTypes.OrJoin_3015 == req.getElementType()) {
			return getGEFWrapper(new OrJoinCreateCommand(req));
		}
		if (E3valueElementTypes.ValueObject_3023 == req.getElementType()) {
			return getGEFWrapper(new ValueObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
