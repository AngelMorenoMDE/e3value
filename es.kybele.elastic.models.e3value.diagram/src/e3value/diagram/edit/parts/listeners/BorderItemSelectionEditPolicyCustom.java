package e3value.diagram.edit.parts.listeners;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.kybele.elastic.e3value.utils.E3ValueUtils;

import e3value.CompositeActor;
import e3value.ElementaryActor;
import e3value.MarketSegment;
import e3value.ValueActivity;
import e3value.ValueInterface;
import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;

public class BorderItemSelectionEditPolicyCustom extends
		BorderItemSelectionEditPolicy {

	protected Command getMoveCommand(ChangeBoundsRequest request) 
	{
		
			IBorderItemEditPart _biep = (IBorderItemEditPart) getHost();
			BorderItemLocator bil = (BorderItemLocator) _biep.getBorderItemLocator();
			ValueInterfaceEditPart _viep = null;
			ValueInterface _vieo = null;
			MarketSegmentEditPart _msep = null;
			MarketSegment _mseo = null;
			EditPart ep = null;			
			if (_biep instanceof ValueInterfaceEditPart)
			{
				_viep = (ValueInterfaceEditPart) _biep;
				_vieo = (ValueInterface) ((View)_viep.getModel()).getElement();								
				if (_vieo.getInBusinessActor() != null)
				{
					if (_vieo.getInBusinessActor() instanceof MarketSegment)
						ep = (MarketSegmentEditPart) E3ValueUtils.findEditPartByEObjectOnEditPart(_viep.getRoot(), (MarketSegment) _vieo.getInBusinessActor());					
					if (_vieo.getInBusinessActor() instanceof ElementaryActor)
						ep = (ElementaryActorEditPart) E3ValueUtils.findEditPartByEObjectOnEditPart(_viep.getRoot(), (ElementaryActor) _vieo.getInBusinessActor());					
					if (_vieo.getInBusinessActor() instanceof CompositeActor)
						ep = (CompositeActorEditPart) E3ValueUtils.findEditPartByEObjectOnEditPart(_viep.getRoot(), (CompositeActor) _vieo.getInBusinessActor());								
				}
				else
				{
					if (_vieo.getInValueActivity() != null &  _vieo.getInValueActivity() instanceof ValueActivity)
						ep = (ValueActivityEditPart) E3ValueUtils.findEditPartByEObjectOnEditPart(_viep.getRoot(), (ValueActivity) _vieo.getInValueActivity());					
				}
		
			}			
			if (bil != null) {
				PrecisionRectangle rect = new PrecisionRectangle(getInitialFeedbackBounds().getCopy());
				getHostFigure().translateToAbsolute(rect);
				rect.translate(request.getMoveDelta());
				rect.resize(request.getSizeDelta());
				getHostFigure().translateToRelative(rect);
				Rectangle loc = bil.getValidLocation(rect.getCopy(), _biep.getFigure());	
				Point parentOrigin = _biep.getFigure().getParent().getBounds().getTopLeft();
				Dimension d = loc.getTopLeft().getDifference(parentOrigin);
				Point p = new Point(d.width, d.height);		
				
				int position = -1;
				
				if (ep instanceof MarketSegmentEditPart)
				{
					position = E3ValueEditPartUtils.getPositionMarketSegmentRespectValueInterface((MarketSegmentEditPart)ep, p.getCopy());
				}
				if (ep instanceof CompositeActorEditPart)
				{
					position = E3ValueEditPartUtils.getPositionCompositeActorRespectValueInterface((CompositeActorEditPart)ep, p.getCopy());
				}
				if (ep instanceof ValueActivityEditPart)
				{
					position = E3ValueEditPartUtils.getPositionValueActivityRespectValueInterface((ValueActivityEditPart)ep, p.getCopy());
				}
				if (ep instanceof ElementaryActorEditPart)
				{
					position = E3ValueEditPartUtils.getPositionElementaryActorRespectValueInterface((ElementaryActorEditPart)ep, p.getCopy());
				}
				String locationString = E3ValueEditPartUtils.translatePositionToString(position);					
				loc.setLocation(p);
				if ("LEFT".equals(locationString)) 
				{
					loc.setSize(20, 100);		
					bil.setBorderItemOffset(new Dimension(_viep.getMapModeUnWrapping().DPtoLP(10), _viep.getMapModeUnWrapping().DPtoLP(0)));
				}
				else if ("RIGHT".equals(locationString))
				{
					loc.setSize(20, 100);
					bil.setBorderItemOffset(new Dimension(_viep.getMapModeUnWrapping().DPtoLP(10), _viep.getMapModeUnWrapping().DPtoLP(0)));					
				}
				else if ("TOP".equals(locationString))
				{
					loc.setSize(100, 20);	
					bil.setBorderItemOffset(new Dimension(_viep.getMapModeUnWrapping().DPtoLP(0), _viep.getMapModeUnWrapping().DPtoLP(10)));
				}					
				else
				{
					loc.setSize(100,20);	
					bil.setBorderItemOffset(new Dimension(_viep.getMapModeUnWrapping().DPtoLP(0), _viep.getMapModeUnWrapping().DPtoLP(10)));
				}				
				
				ICommand moveCommand = new SetBoundsCommand(_biep.getEditingDomain(), DiagramUIMessages.Commands_MoveElement, new EObjectAdapter((View) getHost().getModel()), loc);
				return new ICommandProxy(moveCommand);
			}
			return null;
	}
}
