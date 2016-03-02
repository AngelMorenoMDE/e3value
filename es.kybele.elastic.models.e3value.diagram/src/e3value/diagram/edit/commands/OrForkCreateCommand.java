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

import e3value.AndFork;
import e3value.BusinessActor;
import e3value.E3valueFactory;
import e3value.InputPort;
import e3value.OrFork;
import e3value.OutputPort;
import e3value.ValueActivity;

/**
 * @generated
 */
public class OrForkCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public OrForkCreateCommand(CreateElementRequest req) {
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
		OrFork OrForkElement = E3valueFactory.eINSTANCE.createOrFork();

		OutputPort outputPort1 = E3valueFactory.eINSTANCE.createOutputPort();
		OutputPort outputPort2 = E3valueFactory.eINSTANCE.createOutputPort();

		InputPort inputPort = E3valueFactory.eINSTANCE.createInputPort();

		OrForkElement.setHasInputPort(inputPort);
		OrForkElement.getHasOutputPorts().add(outputPort1);
		OrForkElement.getHasOutputPorts().add(outputPort2);

		if (getElementToEdit() instanceof BusinessActor) {

			BusinessActor owner = (BusinessActor) getElementToEdit();
			owner.getHasDependenceElements().add(OrForkElement);
		} else if (getElementToEdit() instanceof ValueActivity) {
			ValueActivity owner = (ValueActivity) getElementToEdit();
			owner.getHasDependenceElements().add(OrForkElement);
		}

		doConfigure(OrForkElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(OrForkElement);
		return CommandResult.newOKCommandResult(OrForkElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(OrFork newElement, IProgressMonitor monitor,
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
