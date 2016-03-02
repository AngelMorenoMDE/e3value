package e3value.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import e3value.E3ValueDiagram;
import e3value.E3valuePackage;
import e3value.diagram.edit.parts.AndForkAndForkInputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndForkAndForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndForkEditPart;
import e3value.diagram.edit.parts.AndJoinAndJoinInputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndJoinAndJoinOutputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndJoinEditPart;
import e3value.diagram.edit.parts.CompositeActorCompositeActorCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.CompositeActorNameEditPart;
import e3value.diagram.edit.parts.ConnectionElementEditPart;
import e3value.diagram.edit.parts.E3ValueDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelE3ValueModelCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorElementaryActorCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ElementaryActorNameEditPart;
import e3value.diagram.edit.parts.EndStimulusEditPart;
import e3value.diagram.edit.parts.InputPortEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.MarketSegmentMarketSegmentComparmentDiagramEditPart;
import e3value.diagram.edit.parts.MarketSegmentNameEditPart;
import e3value.diagram.edit.parts.OrForkEditPart;
import e3value.diagram.edit.parts.OrForkOrForkInputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OrForkOrForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OrJoinEditPart;
import e3value.diagram.edit.parts.OrJoinOrJoinInputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OrJoinOrJoinOutputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart;
import e3value.diagram.edit.parts.ResponsabilityElementEditPart;
import e3value.diagram.edit.parts.StartStimulusEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueActivityNameEditPart;
import e3value.diagram.edit.parts.ValueActivityValueActivityCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueExchangeEditPart;
import e3value.diagram.edit.parts.ValueExchangeToValueObjectConnectionEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueInterfaceResponsabilityElementCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueInterfaceValuePortInCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueInterfaceValuePortOutCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueObjectEditPart;
import e3value.diagram.edit.parts.ValueObjectName3EditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class E3valueVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.kybele.elastic.models.e3value.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (E3ValueDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return E3ValueDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return e3value.diagram.part.E3valueVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				E3valueDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (E3valuePackage.eINSTANCE.getE3ValueDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((E3ValueDiagram) domainElement)) {
			return E3ValueDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = e3value.diagram.part.E3valueVisualIDRegistry
				.getModelID(containerView);
		if (!E3ValueDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (E3ValueDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = e3value.diagram.part.E3valueVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = E3ValueDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getE3ValueModel().isSuperTypeOf(
					domainElement.eClass())) {
				return E3ValueModelEditPart.VISUAL_ID;
			}
			break;
		case MarketSegmentEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueInterfaceEditPart.VISUAL_ID;
			}
			break;
		case ValueActivityEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueInterfaceEditPart.VISUAL_ID;
			}
			break;
		case ElementaryActorEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueInterfaceEditPart.VISUAL_ID;
			}
			break;
		case CompositeActorEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueInterfaceEditPart.VISUAL_ID;
			}
			break;
		case E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getMarketSegment().isSuperTypeOf(
					domainElement.eClass())) {
				return MarketSegmentEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getElementaryActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ElementaryActorEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getCompositeActor().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActorEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getValueObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueObjectEditPart.VISUAL_ID;
			}
			break;
		case MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueActivityEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getStartStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return StartStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getEndStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return EndStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndFork().isSuperTypeOf(
					domainElement.eClass())) {
				return AndForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return AndJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrFork().isSuperTypeOf(
					domainElement.eClass())) {
				return OrForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return OrJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getValueObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueObjectEditPart.VISUAL_ID;
			}
			break;
		case ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValuePortOut().isSuperTypeOf(
					domainElement.eClass())) {
				return ValuePortOutEditPart.VISUAL_ID;
			}
			break;
		case ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValuePortIn().isSuperTypeOf(
					domainElement.eClass())) {
				return ValuePortInEditPart.VISUAL_ID;
			}
			break;
		case ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getResponsabilityElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ResponsabilityElementEditPart.VISUAL_ID;
			}
			break;
		case AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			break;
		case AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			break;
		case AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			break;
		case OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			break;
		case OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueActivityEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getStartStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return StartStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getEndStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return EndStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndFork().isSuperTypeOf(
					domainElement.eClass())) {
				return AndForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return AndJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrFork().isSuperTypeOf(
					domainElement.eClass())) {
				return OrForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return OrJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getValueObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueObjectEditPart.VISUAL_ID;
			}
			break;
		case ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getStartStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return StartStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getEndStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return EndStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndFork().isSuperTypeOf(
					domainElement.eClass())) {
				return AndForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return AndJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrFork().isSuperTypeOf(
					domainElement.eClass())) {
				return OrForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return OrJoinEditPart.VISUAL_ID;
			}
			break;
		case CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID:
			if (E3valuePackage.eINSTANCE.getValueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueActivityEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getStartStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return StartStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getEndStimulus().isSuperTypeOf(
					domainElement.eClass())) {
				return EndStimulusEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndFork().isSuperTypeOf(
					domainElement.eClass())) {
				return AndForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getAndJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return AndJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrFork().isSuperTypeOf(
					domainElement.eClass())) {
				return OrForkEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getOrJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return OrJoinEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getElementaryActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ElementaryActorEditPart.VISUAL_ID;
			}
			if (E3valuePackage.eINSTANCE.getValueObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = e3value.diagram.part.E3valueVisualIDRegistry
				.getModelID(containerView);
		if (!E3ValueDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (E3ValueDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = e3value.diagram.part.E3valueVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = E3ValueDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			if (E3ValueModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case E3ValueModelEditPart.VISUAL_ID:
			if (E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MarketSegmentEditPart.VISUAL_ID:
			if (MarketSegmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueInterfaceEditPart.VISUAL_ID:
			if (ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueActivityEditPart.VISUAL_ID:
			if (ValueActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndForkEditPart.VISUAL_ID:
			if (AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndJoinEditPart.VISUAL_ID:
			if (AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrForkEditPart.VISUAL_ID:
			if (OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrJoinEditPart.VISUAL_ID:
			if (OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementaryActorEditPart.VISUAL_ID:
			if (ElementaryActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActorEditPart.VISUAL_ID:
			if (CompositeActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueObjectEditPart.VISUAL_ID:
			if (ValueObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID:
			if (MarketSegmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementaryActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID:
			if (ValueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID:
			if (ValuePortOutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID:
			if (ValuePortInEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID:
			if (ResponsabilityElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID:
			if (ValueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID:
			if (StartStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID:
			if (ValueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndStimulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrForkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementaryActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (E3valuePackage.eINSTANCE.getConnectionElement().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionElementEditPart.VISUAL_ID;
		}
		if (E3valuePackage.eINSTANCE.getValueExchange().isSuperTypeOf(
				domainElement.eClass())) {
			return ValueExchangeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(E3ValueDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID:
		case MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID:
		case ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID:
		case ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID:
		case ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID:
		case AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
		case AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
		case AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
		case AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
		case OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
		case OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
		case OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
		case OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
		case ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID:
		case ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID:
		case CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			return false;
		case ValuePortInEditPart.VISUAL_ID:
		case ValuePortOutEditPart.VISUAL_ID:
		case ResponsabilityElementEditPart.VISUAL_ID:
		case StartStimulusEditPart.VISUAL_ID:
		case EndStimulusEditPart.VISUAL_ID:
		case ValueObjectEditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case OutputPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return e3value.diagram.part.E3valueVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
