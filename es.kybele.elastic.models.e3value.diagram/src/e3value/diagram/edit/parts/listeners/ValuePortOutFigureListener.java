package e3value.diagram.edit.parts.listeners;

import java.util.LinkedList;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart.ValuePortInFigureDescriptor;
import e3value.diagram.edit.parts.ValuePortOutEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart.ValuePortOutFigureDescriptor;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;

public class ValuePortOutFigureListener implements FigureListener {

	private ValuePortOutEditPart _container = null;
	
	public ValuePortOutFigureListener(ValuePortOutEditPart valuePortOutEditPart) {
		// TODO Auto-generated constructor stub
		_container = valuePortOutEditPart;
	}

	@Override
	public void figureMoved(IFigure source) {
		// TODO Auto-generated method stub
		ValuePortOutFigureDescriptor _vpifd = (ValuePortOutFigureDescriptor) source.getChildren().get(0);
		
		if (_container.getParent().getParent() instanceof ValueInterfaceEditPart)
		{
			ValueInterfaceEditPart _viep = (ValueInterfaceEditPart) _container.getParent().getParent();
			int positionVIMS = -1;
			Point parentOrigin = null;
	
			
			if (_viep.getParent() instanceof MarketSegmentEditPart)
			{
				MarketSegmentEditPart _msep = (MarketSegmentEditPart) _viep.getParent();
				parentOrigin = _msep.getFigure().getBounds().getTopLeft();
				Dimension d = _viep.getFigure().getBounds().getTopLeft().getDifference(parentOrigin);
				Point location = new Point(d.width, d.height);						
				positionVIMS = E3ValueEditPartUtils.getPositionMarketSegmentRespectValueInterface(_msep, location.getCopy());
			}
			
			if (_viep.getParent() instanceof ValueActivityEditPart)
			{
				ValueActivityEditPart _vaep = (ValueActivityEditPart) _viep.getParent();
				parentOrigin = _vaep.getFigure().getBounds().getTopLeft();
				Dimension d = _viep.getFigure().getBounds().getTopLeft().getDifference(parentOrigin);
				Point location = new Point(d.width, d.height);						
				positionVIMS = E3ValueEditPartUtils.getPositionValueActivityRespectValueInterface(_vaep, location.getCopy());
			} 
			
			if (_viep.getParent() instanceof ElementaryActorEditPart)
			{
				ElementaryActorEditPart _eaep = (ElementaryActorEditPart) _viep.getParent();
				parentOrigin = _eaep.getFigure().getBounds().getTopLeft();
				Dimension d = _viep.getFigure().getBounds().getTopLeft().getDifference(parentOrigin);
				Point location = new Point(d.width, d.height);						
				positionVIMS = E3ValueEditPartUtils.getPositionElementaryActorRespectValueInterface(_eaep, location.getCopy());
			} 
			
			if (_viep.getParent() instanceof CompositeActorEditPart)
			{
				CompositeActorEditPart _caep = (CompositeActorEditPart) _viep.getParent();
				parentOrigin = _caep.getFigure().getBounds().getTopLeft();
				Dimension d = _viep.getFigure().getBounds().getTopLeft().getDifference(parentOrigin);
				Point location = new Point(d.width, d.height);						
				positionVIMS = E3ValueEditPartUtils.getPositionCompositeActorRespectValueInterface(_caep, location.getCopy());
			} 


			
			
			String locationString = E3ValueEditPartUtils.translatePositionToString(positionVIMS);	
			
			LinkedList<Point> _lps = new LinkedList<Point>();
			if (_viep.getSize().width > _viep.getSize().height)
			{
				if (locationString.equals("UP"))
				{
					_lps.add(new Point(7,0));
					_lps.add(new Point(14,14));
					_lps.add(new Point(0,14));
					_lps.add(new Point(7,0));					

				}
				else
				{
					_lps.add(new Point(0,0));
					_lps.add(new Point(14,0));
					_lps.add(new Point(7,14));
					_lps.add(new Point(0,0));					
				}
			
			}
			else
			{
				if (locationString.equals("LEFT"))
				{
					_lps.add(new Point(0,7));
					_lps.add(new Point(14,0));
					_lps.add(new Point(14,14));
					_lps.add(new Point(0,7));				
				}
				else
				{

					_lps.add(new Point(0,0));
					_lps.add(new Point(0,14));
					_lps.add(new Point(14,7));
					_lps.add(new Point(0,0));	
				}
			}
			
			for(int i=0; i<_lps.size(); i++)
			{
				_vpifd.getPoints().setPoint(_lps.get(i), i);
			}				
			
			
		}
		


	}

}
