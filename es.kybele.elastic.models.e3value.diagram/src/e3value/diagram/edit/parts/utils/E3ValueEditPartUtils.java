package e3value.diagram.edit.parts.utils;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.swt.widgets.Shell;

import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;

public class E3ValueEditPartUtils {

	public static Point calculateCenterLocationForShell(Shell shell, Point sizeWindow)
	{
		Point calculatedPoint = new Point(0, 0);
		int middleHorizontalDisplay = shell.getBounds().width / 2;
		int middleVerticalDisplay = shell.getBounds().height / 2;
		calculatedPoint.x = middleHorizontalDisplay - (sizeWindow.x/2);
		calculatedPoint.y = middleVerticalDisplay - (sizeWindow.y/2);
		
		return calculatedPoint;
	}
	
	public static Point calculateCenterFigure(ShapeEditPart _shapeEditPart)
	{
		Point _location = _shapeEditPart.getLocation();
		Dimension _size = _shapeEditPart.getSize();
		
		return new Point(Integer.valueOf(_size.width/2)+_location.x,Integer.valueOf(_size.height/2)+_location.y);  
		
	}

	public static int getPositionMarketSegmentRespectValueInterface(MarketSegmentEditPart _marketsegment,  Point p)
	{
		Rectangle _msr = _marketsegment.getFigure().getBounds();

		Point top = _msr.getTop();
		Point bottom = _msr.getBottom();
		Point left = _msr.getLeft();
		Point right = _msr.getRight();
		p.x = _msr.getTopLeft().x + p.x;
		p.y = _msr.getTopLeft().y + p.y;
		if ((p.y <= top.y) && (p.x >= _msr.getTopLeft().x) && (p.x <= _msr.getTopRight().x))
		{
			return 2;
		}
		else
		if ((p.x <= (left.x+10))&& (p.y >= _msr.getTopLeft().y) && (p.y <= _msr.getBottomLeft().y))
		{
			return 4;
		}
		else
		if ((p.x >= (right.x-10)) && (p.y >= _msr.getTopRight().y) && (p.y <= _msr.getBottomRight().y))
		{
			return 5;
		}
		else
		{
			return 7;
		}

	}
	
	public static int getPositionValueActivityRespectValueInterface(ValueActivityEditPart _valueActivity,  Point p)
	{
		Rectangle _var = _valueActivity.getFigure().getBounds();
		Point top = _var.getTop();
		Point bottom = _var.getBottom();
		Point left = _var.getLeft();
		Point right = _var.getRight();
		p.x = _var.getTopLeft().x + p.x;
		p.y = _var.getTopLeft().y + p.y;
		if ((p.y <= top.y) && (p.x >= _var.getTopLeft().x) && (p.x <= _var.getTopRight().x))
		{
			return 2;
		}
		else
		if ((p.x <= (left.x+10))&& (p.y >= _var.getTopLeft().y) && (p.y <= _var.getBottomLeft().y))
		{
			return 4;
		}
		else
		if ((p.x >= (right.x-10)) && (p.y >= _var.getTopRight().y) && (p.y <= _var.getBottomRight().y))
		{
			return 5;
		}
		else
		{
			return 7;
		}

	}
	
	
	public static int getPositionElementaryActorRespectValueInterface(ElementaryActorEditPart _elementaryActor,  Point p)
	{
		Rectangle _ear = _elementaryActor.getFigure().getBounds();
		Point top = _ear.getTop();
		Point bottom = _ear.getBottom();
		Point left = _ear.getLeft();
		Point right = _ear.getRight();
		p.x = _ear.getTopLeft().x + p.x;
		p.y = _ear.getTopLeft().y + p.y;
		if ((p.y <= top.y) && (p.x >= _ear.getTopLeft().x) && (p.x <= _ear.getTopRight().x))
		{
			return 2;
		}
		else
		if ((p.x <= (left.x+10))&& (p.y >= _ear.getTopLeft().y) && (p.y <= _ear.getBottomLeft().y))
		{
			return 4;
		}
		else
		if ((p.x >= (right.x-10)) && (p.y >= _ear.getTopRight().y) && (p.y <= _ear.getBottomRight().y))
		{
			return 5;
		}
		else
		{
			return 7;
		}

	}
	
	public static int getPositionCompositeActorRespectValueInterface(CompositeActorEditPart _compositeActor,  Point p)
	{
		Rectangle _car = _compositeActor.getFigure().getBounds();
		Point top = _car.getTop();
		Point bottom = _car.getBottom();
		Point left = _car.getLeft();
		Point right = _car.getRight();
		p.x = _car.getTopLeft().x + p.x;
		p.y = _car.getTopLeft().y + p.y;
		if ((p.y <= top.y) && (p.x >= _car.getTopLeft().x) && (p.x <= _car.getTopRight().x))
		{
			return 2;
		}
		else
		if ((p.x <= (left.x+10))&& (p.y >= _car.getTopLeft().y) && (p.y <= _car.getBottomLeft().y))
		{
			return 4;
		}
		else
		if ((p.x >= (right.x-10)) && (p.y >= _car.getTopRight().y) && (p.y <= _car.getBottomRight().y))
		{
			return 5;
		}
		else
		{
			return 7;
		}

	}	
	
	
	public static String translatePositionToString(int position)
	{
		switch (position) {
		case 2: return "UP";
		case 4: return "LEFT";
		case 5: return "RIGHT";
		case 7: return "DOWN";
		default:
			return "";
		}
	}
	
}
