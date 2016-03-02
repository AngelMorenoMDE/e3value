package e3value.diagram.edit.parts.listeners;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.ElementaryActorEditPart.ElementaryActorFigure;
import e3value.diagram.edit.parts.MarketSegmentEditPart.MarketSegmentFigure;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart.ValueActivityFigureDescriptor;

public class ValueActivityFigureListener implements FigureListener {

	protected ValueActivityEditPart editpart = null;
	
	public ValueActivityFigureListener(ValueActivityEditPart valueActivityEditPart)
	{
		this.editpart = valueActivityEditPart;
	}
	
	@Override
	public void figureMoved(IFigure source) {
		// TODO Auto-generated method stub
		if (source instanceof DefaultSizeNodeFigure) {
			
			// Redimension of E3Value - Market Segment based on Figure Listener
			
			// Capa base del Market Segment - DefaultSizeNodeFigure
			DefaultSizeNodeFigure _dsnf = (DefaultSizeNodeFigure) source;
			
			// Get the figure of the MarketSegment Node					
			if (_dsnf.getChildren().get(0) instanceof ValueActivityFigureDescriptor) 
			{
				
				ValueActivityFigureDescriptor _vafd = (ValueActivityFigureDescriptor) _dsnf.getChildren().get(0);
				List<IFigure> listChildrens = _vafd.getChildren();
				IMapMode mapMode = _vafd.getFigureMapMode();

				// Resizing & Relocation of MarketSegment Children Figures 

					if (listChildrens.get(0) instanceof RectangleFigure) 
					{
						RectangleFigure rf = (RectangleFigure) listChildrens.get(0);

						

						rf.setSize(mapMode.DPtoLP(_dsnf.getBounds().getSize().width),
								   mapMode.DPtoLP(_dsnf.getBounds().getSize().height));
						
						
						rf.setLocation(new Point(rf.getBounds().x, rf.getBounds().y-2));
						_vafd.add(rf, 0);
						
					}



			}
		}
	}

}