package e3value.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import e3value.AndJoin;
import e3value.BusinessActor;
import e3value.E3valueFactory;
import e3value.InputPort;
import e3value.OutputPort;
import e3value.ValueActivity;

/**
 * @generated
 */
public class AndJoinCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public AndJoinCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		AndJoin andJoin = E3valueFactory.eINSTANCE.createAndJoin();
		InputPort inputport1 = E3valueFactory.eINSTANCE.createInputPort();
		InputPort inputport2 = E3valueFactory.eINSTANCE.createInputPort();
		OutputPort outputport2 = E3valueFactory.eINSTANCE.createOutputPort();
		
		andJoin.getHasInputPorts().add(inputport1);
		andJoin.getHasInputPorts().add(inputport2);
		andJoin.setHasOutputPort(outputport2);
		
		if (getElementToEdit() instanceof ValueActivity) {
			ValueActivity owner = (ValueActivity) getElementToEdit();
			owner.getHasDependenceElements().add(andJoin);
		} else {
			BusinessActor owner = (BusinessActor) getElementToEdit();
			owner.getHasDependenceElements().add(andJoin);
		}

		doConfigure(andJoin, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(andJoin);
		return CommandResult.newOKCommandResult(andJoin);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(AndJoin newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
