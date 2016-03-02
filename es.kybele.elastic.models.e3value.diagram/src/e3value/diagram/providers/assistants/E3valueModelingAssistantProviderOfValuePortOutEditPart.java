package e3value.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import e3value.diagram.edit.parts.ValuePortIn2EditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart;
import e3value.diagram.providers.E3valueElementTypes;
import e3value.diagram.providers.E3valueModelingAssistantProvider;

/**
 * @generated
 */
public class E3valueModelingAssistantProviderOfValuePortOutEditPart extends
		E3valueModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ValuePortOutEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ValuePortOutEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(E3valueElementTypes.ValueExchange_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(ValuePortOutEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ValuePortOutEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ValuePortInEditPart) {
			types.add(E3valueElementTypes.ValueExchange_4002);
		}
		if (targetEditPart instanceof ValuePortOutEditPart) {
			types.add(E3valueElementTypes.ValueExchange_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ValuePortOutEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ValuePortOutEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == E3valueElementTypes.ValueExchange_4002) {
			types.add(E3valueElementTypes.ValuePortIn_3002);
			types.add(E3valueElementTypes.ValuePortOut_3003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ValuePortOutEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ValuePortOutEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(E3valueElementTypes.ValueExchange_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ValuePortOutEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ValuePortOutEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == E3valueElementTypes.ValueExchange_4002) {
			types.add(E3valueElementTypes.ValuePortIn_3002);
			types.add(E3valueElementTypes.ValuePortOut_3003);
		}
		return types;
	}

}
