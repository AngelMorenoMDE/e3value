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

import e3value.OrFork;
import e3value.diagram.edit.parts.OrForkOrForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OrForkEditPart;
import e3value.diagram.providers.E3valueElementTypes;

public class AddOutputPortOrFork implements IObjectActionDelegate {

	public AddOutputPortOrFork() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		
		OrForkEditPart andForkEditPart = null;
		IStructuredSelection selectedElement = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		
		if (selectedElement.getFirstElement() instanceof OrForkEditPart)
		{
			andForkEditPart = (OrForkEditPart) selectedElement.getFirstElement();
		}
		CompoundCommand cc = new CompoundCommand("Create Output Port in Or Fork");
		if (andForkEditPart.getDiagramPreferencesHint() != null)
		{
			
			CreateViewRequest outputPortRequest = CreateViewRequestFactory.getCreateShapeRequest(E3valueElementTypes.OutputPort_3058, andForkEditPart.getDiagramPreferencesHint());
			if (andForkEditPart.getChildren().get(1) instanceof OrForkOrForkOutputPortsCompartmentDiagramEditPart)
			{
				OrForkOrForkOutputPortsCompartmentDiagramEditPart _compartment = (OrForkOrForkOutputPortsCompartmentDiagramEditPart)andForkEditPart.getChildren().get(1);				
				Command createOutputPort = _compartment.getCommand(outputPortRequest);				
				cc.add(createOutputPort);
			}

		}
		andForkEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		OrForkOrForkOutputPortsCompartmentDiagramEditPart _compartment = (OrForkOrForkOutputPortsCompartmentDiagramEditPart)andForkEditPart.getChildren().get(1);
		andForkEditPart.setLayoutConstraint(_compartment, _compartment.getFigure(), new Rectangle(30,0,10,50));
		Insets insets = _compartment.getContentPane().getInsets();
		EObject _eobject = ((View) andForkEditPart.getModel()).getElement();
			if(_eobject instanceof OrFork)
		{
			OrFork _orFork = (OrFork) _eobject;
			if(_orFork.getHasOutputPorts().size() > 2)
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
		_eobject = ((View) andForkEditPart.getModel()).getElement();
		if(_eobject instanceof OrFork)
		{
			OrFork _orFork = (OrFork) _eobject;
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
