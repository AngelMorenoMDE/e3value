package e3value.diagram.edit.parts.listeners;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.CompositeActorEditPart.CompositeActorFigure;
import e3value.diagram.edit.parts.ElementaryActorEditPart.ElementaryActorFigure;

public class CompositeActorFigureListener implements FigureListener {

	@Override
	public void figureMoved(IFigure source) 
	{
		if (source instanceof DefaultSizeNodeFigure) 
		{			
			DefaultSizeNodeFigure _dsnf = (DefaultSizeNodeFigure) source;		
			if (_dsnf.getChildren().get(0) instanceof CompositeActorFigure) 
			{				
				CompositeActorFigure _caf = (CompositeActorFigure) _dsnf.getChildren().get(0);
				List<IFigure> listChildrens = _caf.getChildren();
				IMapMode mapMode = _caf.getMapModeUnWrapping();
				for (int i = 0; i < listChildrens.size(); i++) 
				{
					if (listChildrens.get(i) instanceof RectangleFigure) 
					{
						RectangleFigure rf = (RectangleFigure) listChildrens.get(i);
						Point locationParent = _dsnf.getBounds().getTopLeft();
						rf.setSize(mapMode.DPtoLP(_dsnf.getBounds().getSize().width), mapMode.DPtoLP(_dsnf.getBounds().getSize().height));
						_caf.add(rf, i);						
					}			
				}
			}
		}
	}

}
