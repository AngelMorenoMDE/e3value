package e3value.diagram.edit.parts.listeners;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.ElementaryActorEditPart.ElementaryActorFigure;
import e3value.diagram.edit.parts.MarketSegmentEditPart.MarketSegmentFigure;

public class ElementaryActorFigureListener implements FigureListener {

	@Override
	public void figureMoved(IFigure source) {
		if (source instanceof DefaultSizeNodeFigure) 
		{
			DefaultSizeNodeFigure _dsnf = (DefaultSizeNodeFigure) source;				
			if (_dsnf.getChildren().get(0) instanceof ElementaryActorFigure) 
			{				
				ElementaryActorFigure _eaf = (ElementaryActorFigure) _dsnf.getChildren().get(0);
				List<IFigure> listChildrens = _eaf.getChildren();
				IMapMode mm = _eaf.getMapModeUnWrapping();
				for (int i = 0; i < listChildrens.size(); i++) 
				{
					if (listChildrens.get(i) instanceof RectangleFigure) 
					{
						RectangleFigure rf = (RectangleFigure) listChildrens.get(i);
						Point locationParent = _dsnf.getBounds().getTopLeft();
						rf.setSize(mm.DPtoLP(_dsnf.getBounds().getSize().width), mm.DPtoLP(_dsnf.getBounds().getSize().height));						
						_eaf.add(rf, i);
						
					}		
				}
			}
		}
	}

}
