package e3value.diagram.edit.parts.listeners;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.CompositeActorEditPart.CompositeActorFigure;
import e3value.diagram.edit.parts.E3ValueModelEditPart.E3ValueModelFigureDescriptor;
import e3value.diagram.edit.parts.ElementaryActorEditPart.ElementaryActorFigure;

public class E3ValueModelFigureListener implements FigureListener {

	@Override
	public void figureMoved(IFigure source) {
		// TODO Auto-generated method stub
		if (source instanceof DefaultSizeNodeFigure) {
			
			// Redimension of E3Value - Market Segment based on Figure Listener
			
			// Capa base del Market Segment - DefaultSizeNodeFigure
			DefaultSizeNodeFigure _dsnf = (DefaultSizeNodeFigure) source;
			
			// Get the figure of the MarketSegment Node					
			if (_dsnf.getChildren().get(0) instanceof E3ValueModelFigureDescriptor) 
			{
				
				E3ValueModelFigureDescriptor _e3vf = (E3ValueModelFigureDescriptor) _dsnf.getChildren().get(0);
				List<IFigure> listChildrens = _e3vf.getChildren();
				IMapMode mapMode = _e3vf.getMapModeUnWrapping();
				
				// Resizing & Relocation of MarketSegment Children Figures 
				for (int i = 0; i < listChildrens.size(); i++) 
				{
					if (listChildrens.get(i) instanceof RectangleFigure) 
					{
						RectangleFigure rf = (RectangleFigure) listChildrens.get(i);

						Point locationParent = _dsnf.getBounds().getTopLeft();

						rf.setSize(mapMode.DPtoLP(_dsnf.getBounds().getSize().width),
								   mapMode.DPtoLP(_dsnf.getBounds().getSize().height));
						
						
						_e3vf.add(rf, i);
						
					}
				}
			}
		}
	}

}
