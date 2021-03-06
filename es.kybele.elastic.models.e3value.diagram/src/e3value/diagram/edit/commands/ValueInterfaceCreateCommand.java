package e3value.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import e3value.BusinessActor;
import e3value.E3valueFactory;
import e3value.ResponsabilityElement;
import e3value.ValueActivity;
import e3value.ValueInterface;
import e3value.ValuePortIn;
import e3value.ValuePortOut;

/**
 * @generated
 */
public class ValueInterfaceCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public ValueInterfaceCreateCommand(CreateElementRequest req) {
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
		ValueInterface _newValueInterface = E3valueFactory.eINSTANCE
				.createValueInterface();

		ValuePortIn _newValuePortIn = E3valueFactory.eINSTANCE
				.createValuePortIn();
		_newValueInterface.setHasValuePortIn(_newValuePortIn);
		ValuePortOut _newValuePortOut = E3valueFactory.eINSTANCE
				.createValuePortOut();
		_newValueInterface.setHasValuePortOut(_newValuePortOut);

		ResponsabilityElement _newResponsabilityElement = E3valueFactory.eINSTANCE
				.createResponsabilityElement();
		
		_newValueInterface.setBindsResponsabilityElement(_newResponsabilityElement);
		
		if (getElementToEdit() instanceof BusinessActor) {

			BusinessActor owner = (BusinessActor) getElementToEdit();
			owner.getHasValueInterfaces().add(_newValueInterface);
		}

		if (getElementToEdit() instanceof ValueActivity) {

			ValueActivity owner = (ValueActivity) getElementToEdit();
			owner.getHasValueInterfaces().add(_newValueInterface);
		}

		doConfigure(_newValueInterface, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(_newValueInterface);
		return CommandResult.newOKCommandResult(_newValueInterface);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(ValueInterface newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
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
