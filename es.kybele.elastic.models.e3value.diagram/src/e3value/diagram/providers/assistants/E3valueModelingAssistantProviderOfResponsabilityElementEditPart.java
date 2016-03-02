package e3value.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import e3value.diagram.edit.parts.AndForkEditPart;
import e3value.diagram.edit.parts.AndJoinEditPart;
import e3value.diagram.edit.parts.EndStimulusEditPart;
import e3value.diagram.edit.parts.InputPortEditPart;
import e3value.diagram.edit.parts.OrForkEditPart;
import e3value.diagram.edit.parts.OrJoinEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart;
import e3value.diagram.edit.parts.ResponsabilityElementEditPart;
import e3value.diagram.edit.parts.StartStimulusEditPart;
import e3value.diagram.providers.E3valueElementTypes;
import e3value.diagram.providers.E3valueModelingAssistantProvider;

/**
 * @generated
 */
public class E3valueModelingAssistantProviderOfResponsabilityElementEditPart
		extends E3valueModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ResponsabilityElementEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			ResponsabilityElementEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(E3valueElementTypes.ConnectionElement_4001);
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
				(ResponsabilityElementEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ResponsabilityElementEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ResponsabilityElementEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof InputPortEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof StartStimulusEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof EndStimulusEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof AndForkEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof AndJoinEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof OrForkEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
		}
		if (targetEditPart instanceof OrJoinEditPart) {
			types.add(E3valueElementTypes.ConnectionElement_4001);
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
		return doGetTypesForTarget(
				(ResponsabilityElementEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			ResponsabilityElementEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == E3valueElementTypes.ConnectionElement_4001) {
			types.add(E3valueElementTypes.ResponsabilityElement_3004);
			types.add(E3valueElementTypes.InputPort_3057);
			types.add(E3valueElementTypes.OutputPort_3058);
			types.add(E3valueElementTypes.StartStimulus_3010);
			types.add(E3valueElementTypes.EndStimulus_3011);
			types.add(E3valueElementTypes.AndFork_3012);
			types.add(E3valueElementTypes.AndJoin_3013);
			types.add(E3valueElementTypes.OrFork_3014);
			types.add(E3valueElementTypes.OrJoin_3015);
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
		return doGetRelTypesOnTarget((ResponsabilityElementEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ResponsabilityElementEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(E3valueElementTypes.ConnectionElement_4001);
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
		return doGetTypesForSource(
				(ResponsabilityElementEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ResponsabilityElementEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == E3valueElementTypes.ConnectionElement_4001) {
			types.add(E3valueElementTypes.ResponsabilityElement_3004);
			types.add(E3valueElementTypes.InputPort_3057);
			types.add(E3valueElementTypes.OutputPort_3058);
			types.add(E3valueElementTypes.StartStimulus_3010);
			types.add(E3valueElementTypes.EndStimulus_3011);
			types.add(E3valueElementTypes.AndFork_3012);
			types.add(E3valueElementTypes.AndJoin_3013);
			types.add(E3valueElementTypes.OrFork_3014);
			types.add(E3valueElementTypes.OrJoin_3015);
		}
		return types;
	}

}
