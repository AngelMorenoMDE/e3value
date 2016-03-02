package e3value.diagram.edit.parts.listeners;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import e3value.diagram.edit.parts.AndForkAndForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart;

public class OutputPortFigureListener implements FigureListener {

	protected OutputPortEditPart outputport = null;
	
	public OutputPortFigureListener(OutputPortEditPart outputPortEditPart) {
		this.outputport = outputPortEditPart;
	}

	@Override
	public void figureMoved(IFigure source) {

	}

}
