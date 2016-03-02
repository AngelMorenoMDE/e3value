package e3value.diagram.edit.parts.listeners;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart.MarketSegmentFigure;

public class MarketSegmentFigureListener implements FigureListener {

	MarketSegmentEditPart _msep = null;
	
	public MarketSegmentFigureListener(MarketSegmentEditPart msep)
	{
		_msep = msep;
	}
	
	@Override
	public void figureMoved(IFigure source) {
		// TODO Auto-generated method stub
		if (source instanceof DefaultSizeNodeFigure) {
			
			// Redimension of E3Value - Market Segment based on Figure Listener
			
			// Capa base del Market Segment - DefaultSizeNodeFigure
			DefaultSizeNodeFigure _dsnf = (DefaultSizeNodeFigure) source;
			
			// Get the figure of the MarketSegment Node					
			if (_dsnf.getChildren().get(0) instanceof MarketSegmentFigure) 
			{
				MarketSegmentFigure _msf = (MarketSegmentFigure) _dsnf.getChildren().get(0);
				IMapMode mapMode = _msep.getMapModeUnWrapping();
				// Resizing & Relocation of MarketSegment Children Figures 
				for (int i = 0; i < _msf.getChildren().size(); i++) 
				{
					if (_msf.getChildren().get(i) instanceof RectangleFigure) 
					{
						RectangleFigure rf = (RectangleFigure) _msf.getChildren().get(i);

						Point locationParent = _dsnf.getBounds().getTopLeft();

						rf.setSize(mapMode.DPtoLP(_dsnf.getBounds().getSize().width - 10),
								   mapMode.DPtoLP(_dsnf.getBounds().getSize().height - 10));
						
						if (i == 0) 
						{
							rf.setLocation(new Point(mapMode.DPtoLP(10), 
									                 mapMode.DPtoLP(10)));
							_msf.add(rf, i);
						}
						if (i == 1) 
						{
							rf.setLocation(new Point(mapMode.DPtoLP(5), 
									      			 mapMode.DPtoLP(5)));
							_msf.add(rf, i);
						}
						if (i == 2) 
						{
							rf.setLocation(new Point(mapMode.DPtoLP(0), 
													 mapMode.DPtoLP(0)));
							_msf.add(rf, i);
						}
					}
					/*if (_msf.getChildren().get(i) instanceof WrappingLabel)
					{
						WrappingLabel wl = (WrappingLabel) _msf.getChildren().get(i);

						Point locationParent = _dsnf.getBounds().getTopLeft();

						wl.setSize(mapMode.DPtoLP(_dsnf.getBounds().getSize().width),
								   mapMode.DPtoLP(wl.getBounds().getSize().height));
						wl.setLocation(new Point(mapMode.DPtoLP(5),
								   mapMode.DPtoLP(5)));
						
						_msf.add(wl, i);
					}		*/			
				}
			}
		}
	}

}
