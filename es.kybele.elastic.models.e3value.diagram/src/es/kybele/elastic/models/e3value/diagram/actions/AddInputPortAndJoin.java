package es.kybele.elastic.models.e3value.diagram.actions;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import e3value.AndJoin;
import e3value.diagram.edit.parts.AndJoinAndJoinInputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndJoinEditPart;
import e3value.diagram.providers.E3valueElementTypes;

public class AddInputPortAndJoin implements IObjectActionDelegate {

	public AddInputPortAndJoin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		
		AndJoinEditPart andJoinEditPart = null;
		IStructuredSelection selectedElement = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();		
		if (selectedElement.getFirstElement() instanceof AndJoinEditPart)
		{
			andJoinEditPart = (AndJoinEditPart) selectedElement.getFirstElement();
		}
		CompoundCommand cc = new CompoundCommand("Create InputPort on AndJoin");
		if (andJoinEditPart.getDiagramPreferencesHint() != null)
		{			
			CreateViewRequest opReq = CreateViewRequestFactory.getCreateShapeRequest(E3valueElementTypes.InputPort_3057, andJoinEditPart.getDiagramPreferencesHint());
			if (andJoinEditPart.getChildren().get(0) instanceof AndJoinAndJoinInputPortsCompartmentDiagramEditPart)
			{
				AndJoinAndJoinInputPortsCompartmentDiagramEditPart _compartment = (AndJoinAndJoinInputPortsCompartmentDiagramEditPart)andJoinEditPart.getChildren().get(0);				
				Command createInputPort = _compartment.getCommand(opReq);
				cc.add(createInputPort);
			}
		}

		andJoinEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		AndJoinAndJoinInputPortsCompartmentDiagramEditPart _compartment = (AndJoinAndJoinInputPortsCompartmentDiagramEditPart)andJoinEditPart.getChildren().get(0);
		andJoinEditPart.setLayoutConstraint(_compartment, _compartment.getFigure(), new Rectangle(0,0,10,50));
		Insets insets = _compartment.getContentPane().getInsets();
		EObject _eobject = ((View) andJoinEditPart.getModel()).getElement();
			if(_eobject instanceof AndJoin)
		{
			AndJoin _andJoin = (AndJoin) _eobject;
			if(_andJoin.getHasInputPorts().size() > 2)
			{
				insets.top = 5;
				insets.bottom = 0;
				insets.left = 0;
				insets.right = 0;
			}
			else
			{
				insets.top = 10;
				insets.bottom = 0;
				insets.left = 0;
				insets.right = 0;
			}
		}		
		ConstrainedToolbarLayout _lm = (ConstrainedToolbarLayout) _compartment.getContentPane().getLayoutManager();
		_lm.setSpacing(4);
		_eobject = ((View) andJoinEditPart.getModel()).getElement();
		if(_eobject instanceof AndJoin)
		{
			AndJoin _andJoin = (AndJoin) _eobject;
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

}
