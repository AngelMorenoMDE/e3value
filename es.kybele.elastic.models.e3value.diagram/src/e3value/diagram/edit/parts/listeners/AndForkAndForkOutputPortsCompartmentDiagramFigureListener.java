package e3value.diagram.edit.parts.listeners;



import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

import e3value.diagram.edit.parts.AndForkAndForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart.OutputPortFigureDescriptor;

public class AndForkAndForkOutputPortsCompartmentDiagramFigureListener
		implements FigureListener {
	protected AndForkAndForkOutputPortsCompartmentDiagramEditPart editpart = null;
	public AndForkAndForkOutputPortsCompartmentDiagramFigureListener(AndForkAndForkOutputPortsCompartmentDiagramEditPart andForkAndForkOutputPortsCompartmentDiagramEditPart) {
		this.editpart = andForkAndForkOutputPortsCompartmentDiagramEditPart;
	}

	public void figureMoved(IFigure source) {	
		OutputPortEditPart out = (OutputPortEditPart) this.editpart.getChildren().get(0);		
		Dimension d = new Dimension(15, 15);
		Point p = new Point(100, 20);	
		DefaultSizeNodeFigure f = (DefaultSizeNodeFigure) out.getFigure();		
		OutputPortFigureDescriptor op = (OutputPortFigureDescriptor) f.getChildren().get(0);
		op.setBackgroundColor(ColorConstants.black);
		op.setLocation(new Point(5,30));
		IMapMode m = this.editpart.getFigureMapMode();
		f.setConstraint(op, new Rectangle(new Point(m.DPtoLP(10),m.DPtoLP(30)), new Dimension(20, 20)));		
		out.refresh(); 
		
	}

}
