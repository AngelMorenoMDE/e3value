package org.kybele.elastic.e3value.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.console.ConsolePlugin;

public class E3ValueUtils 
{
	public static EObject getEObjectFromEditPart(EditPart _ep)
	{
		return ((View) _ep.getModel()).getElement();
	}
	
	public static boolean hasEditPartEObject(EditPart _editpart, EObject _eobject)
	{
		if (_editpart instanceof RootEditPart) 
			return false;
		return getEObjectFromEditPart(_editpart).equals(_eobject);
	}
	
	public static EditPart findEditPartByEObjectOnEditPart(EditPart _editpart, EObject _eobject)
	{
		EditPart _result = null;
		
		if (hasEditPartEObject(_editpart, _eobject))
		{
			return _editpart;
		}
		
		if (_editpart.getChildren().size() > 0)
		{
			int count = 0;
			for(Object _object : _editpart.getChildren())
			{
				if (_object instanceof EditPart)
				{
					EditPart editpart = (EditPart) _object;
					_result = findEditPartByEObjectOnEditPart(editpart, _eobject);
					
					if (_result != null) return _result;
				}
				count++;
			}
		}
		return _result;
	}
	
	public static EditPart showAllEditPartByEObjectOnEditPart(EditPart _editpart, EObject _eobject)
	{
		EditPart _result = null;		
		if (hasEditPartEObject(_editpart, _eobject))
		{
			return _editpart;
		}
		
		if (_editpart.getChildren().size() > 0)
		{
			
			int count = 0;
			for(Object _object : _editpart.getChildren())
			{
				if (_object instanceof EditPart)
				{
					EditPart editpart = (EditPart) _object;			
					_result = showAllEditPartByEObjectOnEditPart(editpart, _eobject);
					if (_result != null)
						return _result;
				}
				count++;
			}
		}
		return _result;
	}	

	
}
