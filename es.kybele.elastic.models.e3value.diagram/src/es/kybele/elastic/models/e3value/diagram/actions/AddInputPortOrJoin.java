package es.kybele.elastic.models.e3value.diagram.actions;

import java.awt.LayoutManager;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
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

import e3value.OrJoin;
import e3value.diagram.edit.parts.OrJoinOrJoinInputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OrJoinEditPart;
import e3value.diagram.providers.E3valueElementTypes;

public class AddInputPortOrJoin implements IObjectActionDelegate {

	public AddInputPortOrJoin() {
		
	}

	@Override
	public void run(IAction action) {
		
		OrJoinEditPart orJoinEditPart = null;
		IStructuredSelection selectedElement = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		if (selectedElement.getFirstElement() instanceof OrJoinEditPart)
		{
			orJoinEditPart = (OrJoinEditPart) selectedElement.getFirstElement();
		}
		CompoundCommand cc = new CompoundCommand("Create InputPort on OrJoin");		
		if (orJoinEditPart.getDiagramPreferencesHint() != null)
		{			
			CreateViewRequest outputPortRequest = CreateViewRequestFactory.getCreateShapeRequest(E3valueElementTypes.InputPort_3057, orJoinEditPart.getDiagramPreferencesHint());
			if (orJoinEditPart.getChildren().get(0) instanceof OrJoinOrJoinInputPortsCompartmentDiagramEditPart)
			{
				OrJoinOrJoinInputPortsCompartmentDiagramEditPart _compartment = (OrJoinOrJoinInputPortsCompartmentDiagramEditPart)orJoinEditPart.getChildren().get(0);				
				Command createInputPort = _compartment.getCommand(outputPortRequest);		 
				cc.add(createInputPort);
			}
		}

		orJoinEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		OrJoinOrJoinInputPortsCompartmentDiagramEditPart _compartment = (OrJoinOrJoinInputPortsCompartmentDiagramEditPart)orJoinEditPart.getChildren().get(0);
		orJoinEditPart.setLayoutConstraint(_compartment, _compartment.getFigure(), new Rectangle(0,0,10,50));
		Insets insets = _compartment.getContentPane().getInsets();
		EObject _eobject = ((View) orJoinEditPart.getModel()).getElement();
		if(_eobject instanceof OrJoin)
		{
			OrJoin _orJoin = (OrJoin) _eobject;
			if(_orJoin.getHasInputPorts().size() > 2)
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
		_eobject = ((View) orJoinEditPart.getModel()).getElement();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

}
