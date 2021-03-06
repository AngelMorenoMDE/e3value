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

import e3value.E3valueFactory;
import e3value.ForkElement;
import e3value.InputPort;
import e3value.JoinElement;
import e3value.LogicalElement;

/**
 * @generated
 */
public class InputPortCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public InputPortCreateCommand(CreateElementRequest req) {
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
	 * 
	 * Con modificación por tipo incompatible
	 * 
	 */
	public boolean canExecute() {

		/*
		 * Se agrega estas instrucciones con el objetivo de que se puedan
		 * crear nuevos InputPort si el elemento a editar es un JoinElement
		 * el cual posee N InputPorts
		 * */
		if (getElementToEdit() instanceof JoinElement) {
			return true;
		}

		ForkElement container = (ForkElement) getElementToEdit();
		if (container.getHasInputPort() != null) {
			return false;
		}
		return true;

	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		InputPort newElement = E3valueFactory.eINSTANCE.createInputPort();

		if (getElementToEdit() instanceof ForkElement)
		{
			ForkElement owner = (ForkElement) getElementToEdit();
			owner.setHasInputPort(newElement);
		}
		else if (getElementToEdit() instanceof JoinElement)
		{
			JoinElement owner = (JoinElement) getElementToEdit();
			owner.getHasInputPorts().add(newElement);
		}
		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(InputPort newElement, IProgressMonitor monitor,
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
