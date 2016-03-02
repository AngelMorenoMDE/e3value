package e3value.diagram.edit.parts.listeners;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.kybele.elastic.e3value.utils.E3ValueUtils;

import e3value.BusinessActor;
import e3value.ValueInterface;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart.ValueInterfaceFigureDescriptor;

import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart;
import e3value.diagram.edit.parts.utils.E3ValueEditPartUtils;
import e3value.diagram.part.E3valueDiagramEditor;

public class ValueInterfaceFigureListenerSpecial implements FigureListener {


	ValueInterfaceEditPart _viep = null;
	public ValueInterfaceFigureListenerSpecial(ValueInterfaceEditPart valueInterfaceEditPart) {

		_viep = valueInterfaceEditPart;
	}
	
	@Override
	public void figureMoved(IFigure source) {
		EObject _eobject = ((View) _viep.getModel()).getElement();
		MarketSegmentEditPart _msep = null;
		if (_eobject instanceof ValueInterface)
		{
			ValueInterface _vi = (ValueInterface) _eobject;

			if (_vi.getInBusinessActor() != null)
			{
				EditPart _editpart = 
						E3ValueUtils.findEditPartByEObjectOnEditPart(_viep.getRoot(), _vi.getInBusinessActor());
				
				if (_editpart instanceof MarketSegmentEditPart)
				{
					_msep = (MarketSegmentEditPart) _editpart;
				}
			}
		}
		Point _mspcenter = E3ValueEditPartUtils.calculateCenterFigure(_msep);
		Point _vipcenter = E3ValueEditPartUtils.calculateCenterFigure(_viep);
	}
}
