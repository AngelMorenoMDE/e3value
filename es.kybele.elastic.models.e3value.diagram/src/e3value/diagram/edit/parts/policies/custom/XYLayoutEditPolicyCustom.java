package e3value.diagram.edit.parts.policies.custom;

import java.util.Iterator;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;

import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart.ValueInterfaceFigureDescriptor;
import e3value.diagram.edit.parts.listeners.BorderItemSelectionEditPolicyCustom;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;
import e3value.diagram.part.E3valueVisualIDRegistry;

public class XYLayoutEditPolicyCustom extends XYLayoutEditPolicy {
	@Override
	protected Command getCreateCommand(CreateRequest request) 
	{
		CreateViewRequest req = (CreateViewRequest) request;
        
		
        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
            .getEditingDomain();

		CompositeTransactionalCommand cc = 
				new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
		
		
        Iterator iter = req.getViewDescriptors().iterator();

		final Rectangle BOUNDS = (Rectangle) getConstraintFor(request);
		while (iter.hasNext()) {

			CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor)iter.next(); 
			Rectangle rect = getBoundsOffest(req, BOUNDS,viewDescriptor);
			
			int position = -1;
			
			
			if (getHost() instanceof MarketSegmentEditPart)
			{
				position = E3ValueEditPartUtils.getPositionMarketSegmentRespectValueInterface((MarketSegmentEditPart)getHost(), rect.getLocation().getCopy());
			}
			if (getHost() instanceof CompositeActorEditPart)
			{
				position = E3ValueEditPartUtils.getPositionCompositeActorRespectValueInterface((CompositeActorEditPart)getHost(), rect.getLocation().getCopy());
			}
			if (getHost() instanceof ValueActivityEditPart)
			{
				position = E3ValueEditPartUtils.getPositionValueActivityRespectValueInterface((ValueActivityEditPart)getHost(), rect.getLocation().getCopy());
			}
			if (getHost() instanceof ElementaryActorEditPart)
			{
				position = E3ValueEditPartUtils.getPositionElementaryActorRespectValueInterface((ElementaryActorEditPart)getHost(), rect.getLocation().getCopy());
			}
			String locationString = E3ValueEditPartUtils.translatePositionToString(position);	
			int widthHorizontal = 100;
			int heightHorizontal = 20;
			int widthVertical = 20;
			int heightVertical = 100;
			
			if ("LEFT".equals(locationString)) 
			{
				rect.setSize(widthVertical, heightVertical);
			}
			else if ("RIGHT".equals(locationString))
			{
				rect.setSize(widthVertical, heightVertical);				
			}
			else if ("UP".equals(locationString))
			{
				rect.setSize(widthHorizontal, heightHorizontal);				
			}					
			else
			{
				rect.setSize(widthHorizontal,heightHorizontal);
			}
			
			cc.compose(new SetBoundsCommand(editingDomain, 
				DiagramUIMessages.SetLocationCommand_Label_Resize,
				viewDescriptor,
				rect));
		}
		
		if( cc.reduce() == null )
			return null;

		return chainGuideAttachmentCommands( request,
			new ICommandProxy(cc.reduce()));
	};

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) 
	{
		View childView = (View) child.getModel();
		
		if (child instanceof ValueInterfaceEditPart)
		{
			ValueInterfaceEditPart _viep = (ValueInterfaceEditPart) child;
			ValueInterfaceFigureDescriptor _vifd = (ValueInterfaceFigureDescriptor) _viep.getPrimaryShape();
		}
		
		switch (E3valueVisualIDRegistry.getVisualID(childView)) 
		{
			case ValueInterfaceEditPart.VISUAL_ID:
				return new BorderItemSelectionEditPolicyCustom();

		}
		EditPolicy result = super.createChildEditPolicy(child);
		if (result == null) 
		{
			return new ResizableShapeEditPolicy();
		}
		return result;
	}
}
