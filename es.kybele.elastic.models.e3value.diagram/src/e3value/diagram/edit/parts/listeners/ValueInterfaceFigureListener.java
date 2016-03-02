package e3value.diagram.edit.parts.listeners;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import e3value.BusinessActor;
import e3value.ValueInterface;
import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart.ValueInterfaceFigureDescriptor;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;
import e3value.diagram.part.E3valueDiagramEditor;

public class ValueInterfaceFigureListener implements FigureListener 
{
	
	ValueInterfaceEditPart _viep = null;
	public ValueInterfaceFigureListener(ValueInterfaceEditPart viep)
	{
		_viep = viep;
	}
	
	@Override
	public void figureMoved(IFigure source) {
		Point org = source.getBounds().getLocation();
		
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
		String locStr = E3ValueEditPartUtils.translatePositionToString(positionVIMS);	
		IMapMode mm = _viep.getMapModeUnWrapping();
		_viep.getFigure().setForegroundColor(ColorConstants.white);
		if (source.getBounds().getSize().width > source.getBounds().getSize().height)
		{
			if (source.getChildren().get(0) instanceof ValueInterfaceFigureDescriptor)
			{
				source.setConstraint((IFigure) source.getChildren().get(0), source.getBounds());
				ValueInterfaceFigureDescriptor _vifd = (ValueInterfaceFigureDescriptor) source.getChildren().get(0);

				if (locStr.equals("UP"))
				{
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(0), new Rectangle(mm.DPtoLP(60), mm.DPtoLP(0), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(1), new Rectangle(mm.DPtoLP(20), mm.DPtoLP(0), mm.DPtoLP(20), mm.DPtoLP(20)));				
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(2), new Rectangle(mm.DPtoLP(45), mm.DPtoLP(10), mm.DPtoLP(10), mm.DPtoLP(10)));
				}
				else
				{
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(1), new Rectangle(mm.DPtoLP(60), mm.DPtoLP(0), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(0), new Rectangle(mm.DPtoLP(20), mm.DPtoLP(0), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(2), new Rectangle(mm.DPtoLP(45), mm.DPtoLP(0), mm.DPtoLP(10), mm.DPtoLP(10)));
				}
				
				
			}
		}
		else
		{
			if (source.getChildren().get(0) instanceof ValueInterfaceFigureDescriptor)
			{
				source.setConstraint((IFigure) source.getChildren().get(0), source.getBounds());
				ValueInterfaceFigureDescriptor _vifd = (ValueInterfaceFigureDescriptor) source.getChildren().get(0);				

				if(locStr.equals("LEFT"))
				{
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(0), new Rectangle(mm.DPtoLP(-2), mm.DPtoLP(20), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(1), new Rectangle(mm.DPtoLP(-2), mm.DPtoLP(60), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(2), new Rectangle(mm.DPtoLP(10), mm.DPtoLP(45), mm.DPtoLP(10), mm.DPtoLP(10)));
				}
				else
				{
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(1), new Rectangle(mm.DPtoLP(-2), mm.DPtoLP(20), mm.DPtoLP(20), mm.DPtoLP(20)));
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(0), new Rectangle(mm.DPtoLP(-2), mm.DPtoLP(60), mm.DPtoLP(20), mm.DPtoLP(20)));					
					_vifd.setConstraint((IFigure) _vifd.getChildren().get(2), new Rectangle(mm.DPtoLP(0), mm.DPtoLP(45), mm.DPtoLP(10), mm.DPtoLP(10)));
				}
			}					
		}
	}
}
