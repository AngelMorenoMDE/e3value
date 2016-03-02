package e3value.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import e3value.E3ValueModel;
import e3value.ValueExchange;
import e3value.ValueObject;
import e3value.ValuePort;
import e3value.ValuePortIn;
import e3value.ValuePortOut;
import e3value.diagram.edit.policies.E3valueBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ValueExchangeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ValueExchangeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ValueExchange) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ValuePort && newEnd instanceof ValuePort)) {
			return false;
		}
		ValuePort target = getLink().getTargetValuePort();
		if (!(getLink().eContainer() instanceof E3ValueModel)) {
			return false;
		}
		E3ValueModel container = (E3ValueModel) getLink().eContainer();
		return E3valueBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistValueExchange_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ValuePort && newEnd instanceof ValuePort)) {
			return false;
		}
		ValuePort source = getLink().getSourceValuePort();
		if (!(getLink().eContainer() instanceof E3ValueModel)) {
			return false;
		}
		E3ValueModel container = (E3ValueModel) getLink().eContainer();
		return E3valueBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistValueExchange_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSourceValuePort(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetValuePort(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ValueExchange getLink() {
		return (ValueExchange) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ValuePort getOldSource() {
		return (ValuePort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ValuePort getNewSource() {
		return (ValuePort) newEnd;
	}

	/**
	 * @generated
	 */
	protected ValuePort getOldTarget() {
		return (ValuePort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ValuePort getNewTarget() {
		return (ValuePort) newEnd;
	}
}
