package e3value.diagram.edit.parts.policies.custom;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RefreshConnectionsRequest;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.EditPartService;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;

public class CreationEditPolicyWithCustomReparentCustom extends
		CreationEditPolicyWithCustomReparent {

	public CreationEditPolicyWithCustomReparentCustom(DiagramStructure diagramStructure) {		
		super(diagramStructure);
	}
	
	protected Command getCreateCommand(CreateViewRequest request) {

        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
            .getEditingDomain();
        
        CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);        
        Iterator descriptors = request.getViewDescriptors().iterator();
        View _v = (View)(getHost().getModel());

        
		while (descriptors.hasNext()) {
			CreateViewRequest.ViewDescriptor descriptor =
				(CreateViewRequest.ViewDescriptor)descriptors.next();

			CreateCommand createCommand =
				new CreateCommand(editingDomain,
					descriptor, 
					(View)(getHost().getModel()))
			{    
				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			
					        throws ExecutionException {

						View view =
							ViewService.getInstance().createView(
								viewDescriptor.getViewKind(),
								viewDescriptor.getElementAdapter(),
								containerView,
								viewDescriptor.getSemanticHint(),
								viewDescriptor.getIndex(),
								viewDescriptor.isPersisted(),
								viewDescriptor.getPreferencesHint());

						Assert.isNotNull(view, "failed to create a view"); //$NON-NLS-1$
						viewDescriptor.setView(view);
				        
				        return CommandResult.newOKCommandResult(viewDescriptor);
				
			}};

			cc.compose(createCommand);
		}
		return new ICommandProxy(cc.reduce());

	}

	protected Command getCreateElementAndViewCommand(CreateViewAndElementRequest request) {		
		
		CreateElementRequestAdapter requestAdapter =
			request.getViewAndElementDescriptor().getCreateElementRequestAdapter();

		CreateElementRequest createElementRequest =
			(CreateElementRequest) requestAdapter.getAdapter(
				CreateElementRequest.class);

		if (createElementRequest.getContainer() == null) {
			View view = (View)getHost().getModel();
			
			if (view instanceof MarketSegmentEditPart)
			{
				MarketSegmentEditPart _msep = (MarketSegmentEditPart) view;
			}
			
			EObject hostElement = ViewUtil.resolveSemanticElement(view);
			if (hostElement == null && view.getElement() == null) {
				hostElement = view;
			}			

			if (hostElement == null) {
				return null;
			}
			createElementRequest.setContainer(hostElement);
		}

		Command createElementCommand =
			getHost().getCommand(
				new EditCommandRequestWrapper(
					(CreateElementRequest)requestAdapter.getAdapter(
						CreateElementRequest.class), request.getExtendedData()));

		if (createElementCommand == null) { 
			return UnexecutableCommand.INSTANCE;
		}		
		if(!createElementCommand.canExecute()){
			return createElementCommand;
		}
		SemanticCreateCommand semanticCommand =	new SemanticCreateCommand(requestAdapter, createElementCommand);
		Command viewCommand = getCreateCommand(request);
		Command refreshConnectionCommand = getHost().getCommand(new RefreshConnectionsRequest(((List)request.getNewObject())));
        CompositeCommand cc = new CompositeCommand(semanticCommand.getLabel());
		cc.compose(semanticCommand);
		cc.compose(new CommandProxy(viewCommand));
		if ( refreshConnectionCommand != null ) {
			cc.compose(new CommandProxy(refreshConnectionCommand));
		}

		return new ICommandProxy(cc);
	}

}
