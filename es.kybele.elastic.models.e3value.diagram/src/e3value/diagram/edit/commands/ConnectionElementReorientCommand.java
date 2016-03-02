package e3value.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import e3value.ConnectionElement;
import e3value.DependencyElement;
import e3value.E3ValueModel;
import e3value.diagram.edit.policies.E3valueBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionElementReorientCommand extends EditElementCommand {

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
	public ConnectionElementReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ConnectionElement) {
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
		if (!(oldEnd instanceof DependencyElement && newEnd instanceof DependencyElement)) {
			return false;
		}
		DependencyElement target = getLink().getTargetDependenceElement();
		if (!(getLink().eContainer() instanceof E3ValueModel)) {
			return false;
		}
		E3ValueModel container = (E3ValueModel) getLink().eContainer();
		return E3valueBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionElement_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DependencyElement && newEnd instanceof DependencyElement)) {
			return false;
		}
		DependencyElement source = getLink().getSourceDependenceElement();
		if (!(getLink().eContainer() instanceof E3ValueModel)) {
			return false;
		}
		E3ValueModel container = (E3ValueModel) getLink().eContainer();
		return E3valueBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionElement_4001(container, getLink(), source,
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
		getLink().setSourceDependenceElement(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetDependenceElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ConnectionElement getLink() {
		return (ConnectionElement) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DependencyElement getOldSource() {
		return (DependencyElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DependencyElement getNewSource() {
		return (DependencyElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected DependencyElement getOldTarget() {
		return (DependencyElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DependencyElement getNewTarget() {
		return (DependencyElement) newEnd;
	}
}
