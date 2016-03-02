package e3value.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import e3value.AndFork;
import e3value.AndJoin;
import e3value.BusinessActor;
import e3value.CompositeActor;
import e3value.ConnectionElement;
import e3value.DependencyElement;
import e3value.E3ValueDiagram;
import e3value.E3ValueModel;
import e3value.E3valuePackage;
import e3value.ElementaryActor;
import e3value.EndStimulus;
import e3value.InputPort;
import e3value.MarketSegment;
import e3value.OrFork;
import e3value.OrJoin;
import e3value.OutputPort;
import e3value.ResponsabilityElement;
import e3value.StartStimulus;
import e3value.ValueActivity;
import e3value.ValueExchange;
import e3value.ValueInterface;
import e3value.ValueObject;
import e3value.ValuePort;
import e3value.ValuePortIn;
import e3value.ValuePortOut;
import e3value.diagram.edit.parts.AndForkAndForkInputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndForkAndForkOutputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndForkEditPart;
import e3value.diagram.edit.parts.AndJoinAndJoinInputPortsCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndJoinAndJoinOutputPortCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.AndJoinEditPart;
import e3value.diagram.edit.parts.CompositeActorCompositeActorCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ConnectionElementEditPart;
import e3value.diagram.edit.parts.E3ValueDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelE3ValueModelCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.ElementaryActorElementaryActorCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.EndStimulusEditPart;
import e3value.diagram.edit.parts.InputPortEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.MarketSegmentMarketSegmentComparmentDiagramEditPart;
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
import e3value.diagram.edit.parts.ValueActivityValueActivityCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueExchangeEditPart;
import e3value.diagram.edit.parts.ValueExchangeHasValueObjectEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueInterfaceResponsabilityElementCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueInterfaceValuePortInCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueInterfaceValuePortOutCompartmentDiagramEditPart;
import e3value.diagram.edit.parts.ValueObjectEditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart;
import e3value.diagram.providers.E3valueElementTypes;

/**
 * @generated
 */
public class E3valueDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getSemanticChildren(View view) {
		switch (E3valueVisualIDRegistry.getVisualID(view)) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			return getE3ValueDiagram_1000SemanticChildren(view);
		case MarketSegmentEditPart.VISUAL_ID:
			return getMarketSegment_3008SemanticChildren(view);
		case ValueActivityEditPart.VISUAL_ID:
			return getValueActivity_3005SemanticChildren(view);
		case ElementaryActorEditPart.VISUAL_ID:
			return getElementaryActor_3009SemanticChildren(view);
		case CompositeActorEditPart.VISUAL_ID:
			return getCompositeActor_3016SemanticChildren(view);
		case E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID:
			return getE3ValueModelE3ValueModelCompartmentDiagram_7006SemanticChildren(view);
		case MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID:
			return getMarketSegmentMarketSegmentComparmentDiagram_7007SemanticChildren(view);
		case ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID:
			return getValueInterfaceValuePortOutCompartmentDiagram_7001SemanticChildren(view);
		case ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID:
			return getValueInterfaceValuePortInCompartmentDiagram_7002SemanticChildren(view);
		case ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID:
			return getValueInterfaceResponsabilityElementCompartmentDiagram_7003SemanticChildren(view);
		case AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			return getAndForkAndForkInputPortCompartmentDiagram_7026SemanticChildren(view);
		case AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			return getAndForkAndForkOutputPortsCompartmentDiagram_7027SemanticChildren(view);
		case AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			return getAndJoinAndJoinInputPortsCompartmentDiagram_7028SemanticChildren(view);
		case AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			return getAndJoinAndJoinOutputPortCompartmentDiagram_7029SemanticChildren(view);
		case OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
			return getOrForkOrForkInputPortCompartmentDiagram_7030SemanticChildren(view);
		case OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
			return getOrForkOrForkOutputPortsCompartmentDiagram_7031SemanticChildren(view);
		case OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
			return getOrJoinOrJoinInputPortsCompartmentDiagram_7032SemanticChildren(view);
		case OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
			return getOrJoinOrJoinOutputPortCompartmentDiagram_7033SemanticChildren(view);
		case ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID:
			return getElementaryActorElementaryActorCompartmentDiagram_7008SemanticChildren(view);
		case ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID:
			return getValueActivityValueActivityCompartmentDiagram_7025SemanticChildren(view);
		case CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID:
			return getCompositeActorCompositeActorCompartmentDiagram_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getE3ValueDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		E3ValueDiagram modelElement = (E3ValueDiagram) view.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasE3ValueModels().iterator(); it
				.hasNext();) {
			E3ValueModel childElement = (E3ValueModel) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == E3ValueModelEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getMarketSegment_3008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MarketSegment modelElement = (MarketSegment) view.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueInterfaces().iterator(); it
				.hasNext();) {
			ValueInterface childElement = (ValueInterface) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueInterfaceEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getValueActivity_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ValueActivity modelElement = (ValueActivity) view.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueInterfaces().iterator(); it
				.hasNext();) {
			ValueInterface childElement = (ValueInterface) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueInterfaceEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getElementaryActor_3009SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ElementaryActor modelElement = (ElementaryActor) view.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueInterfaces().iterator(); it
				.hasNext();) {
			ValueInterface childElement = (ValueInterface) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueInterfaceEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getCompositeActor_3016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeActor modelElement = (CompositeActor) view.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueInterfaces().iterator(); it
				.hasNext();) {
			ValueInterface childElement = (ValueInterface) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueInterfaceEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getE3ValueModelE3ValueModelCompartmentDiagram_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		E3ValueModel modelElement = (E3ValueModel) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasBusinessActors().iterator(); it
				.hasNext();) {
			BusinessActor childElement = (BusinessActor) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MarketSegmentEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ElementaryActorEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeActorEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasValueObjects().iterator(); it
				.hasNext();) {
			ValueObject childElement = (ValueObject) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueObjectEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getMarketSegmentMarketSegmentComparmentDiagram_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MarketSegment modelElement = (MarketSegment) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueActivities().iterator(); it
				.hasNext();) {
			ValueActivity childElement = (ValueActivity) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueActivityEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasDependenceElements()
				.iterator(); it.hasNext();) {
			DependencyElement childElement = (DependencyElement) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasValueObjects().iterator(); it
				.hasNext();) {
			ValueObject childElement = (ValueObject) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueObjectEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getValueInterfaceValuePortOutCompartmentDiagram_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValueInterface modelElement = (ValueInterface) containerView
				.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		{
			ValuePortOut childElement = modelElement.getHasValuePortOut();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValuePortOutEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getValueInterfaceValuePortInCompartmentDiagram_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValueInterface modelElement = (ValueInterface) containerView
				.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		{
			ValuePortIn childElement = modelElement.getHasValuePortIn();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValuePortInEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getValueInterfaceResponsabilityElementCompartmentDiagram_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValueInterface modelElement = (ValueInterface) containerView
				.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		{
			ResponsabilityElement childElement = modelElement
					.getBindsResponsabilityElement();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResponsabilityElementEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getAndForkAndForkInputPortCompartmentDiagram_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndFork modelElement = (AndFork) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		{
			InputPort childElement = modelElement.getHasInputPort();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getAndForkAndForkOutputPortsCompartmentDiagram_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndFork modelElement = (AndFork) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasOutputPorts().iterator(); it
				.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getAndJoinAndJoinInputPortsCompartmentDiagram_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndJoin modelElement = (AndJoin) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getAndJoinAndJoinOutputPortCompartmentDiagram_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndJoin modelElement = (AndJoin) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();

		OutputPort childElement = (OutputPort) modelElement.getHasOutputPort();
		int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
				childElement);
		if (visualID == OutputPortEditPart.VISUAL_ID) {
			result.add(new E3valueNodeDescriptor(childElement, visualID));

		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getOrForkOrForkInputPortCompartmentDiagram_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrFork modelElement = (OrFork) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		{
			InputPort childElement = modelElement.getHasInputPort();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getOrForkOrForkOutputPortsCompartmentDiagram_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrFork modelElement = (OrFork) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasOutputPorts().iterator(); it
				.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getOrJoinOrJoinInputPortsCompartmentDiagram_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrJoin modelElement = (OrJoin) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getOrJoinOrJoinOutputPortCompartmentDiagram_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrJoin modelElement = (OrJoin) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();

		OutputPort childElement = (OutputPort) modelElement.getHasOutputPort();
		int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
				childElement);
		if (visualID == OutputPortEditPart.VISUAL_ID) {
			result.add(new E3valueNodeDescriptor(childElement, visualID));

		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getElementaryActorElementaryActorCompartmentDiagram_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ElementaryActor modelElement = (ElementaryActor) containerView
				.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueActivities().iterator(); it
				.hasNext();) {
			ValueActivity childElement = (ValueActivity) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueActivityEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasDependenceElements()
				.iterator(); it.hasNext();) {
			DependencyElement childElement = (DependencyElement) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasValueObjects().iterator(); it
				.hasNext();) {
			ValueObject childElement = (ValueObject) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueObjectEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getValueActivityValueActivityCompartmentDiagram_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ValueActivity modelElement = (ValueActivity) containerView.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasDependenceElements()
				.iterator(); it.hasNext();) {
			DependencyElement childElement = (DependencyElement) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueNodeDescriptor> getCompositeActorCompositeActorCompartmentDiagram_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeActor modelElement = (CompositeActor) containerView
				.getElement();
		LinkedList<E3valueNodeDescriptor> result = new LinkedList<E3valueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValueActivities().iterator(); it
				.hasNext();) {
			ValueActivity childElement = (ValueActivity) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueActivityEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasDependenceElements()
				.iterator(); it.hasNext();) {
			DependencyElement childElement = (DependencyElement) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndStimulusEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrForkEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrJoinEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasElementaryActors().iterator(); it
				.hasNext();) {
			BusinessActor childElement = (BusinessActor) it.next();
			int visualID = E3valueVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElementaryActorEditPart.VISUAL_ID) {
				result.add(new E3valueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getContainedLinks(View view) {
		switch (E3valueVisualIDRegistry.getVisualID(view)) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			return getE3ValueDiagram_1000ContainedLinks(view);
		case E3ValueModelEditPart.VISUAL_ID:
			return getE3ValueModel_2007ContainedLinks(view);
		case MarketSegmentEditPart.VISUAL_ID:
			return getMarketSegment_3008ContainedLinks(view);
		case ValueInterfaceEditPart.VISUAL_ID:
			return getValueInterface_3001ContainedLinks(view);
		case ValuePortInEditPart.VISUAL_ID:
			return getValuePortIn_3002ContainedLinks(view);
		case ValuePortOutEditPart.VISUAL_ID:
			return getValuePortOut_3003ContainedLinks(view);
		case ResponsabilityElementEditPart.VISUAL_ID:
			return getResponsabilityElement_3004ContainedLinks(view);
		case ValueActivityEditPart.VISUAL_ID:
			return getValueActivity_3005ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3057ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3058ContainedLinks(view);
		case StartStimulusEditPart.VISUAL_ID:
			return getStartStimulus_3010ContainedLinks(view);
		case EndStimulusEditPart.VISUAL_ID:
			return getEndStimulus_3011ContainedLinks(view);
		case AndForkEditPart.VISUAL_ID:
			return getAndFork_3012ContainedLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_3013ContainedLinks(view);
		case OrForkEditPart.VISUAL_ID:
			return getOrFork_3014ContainedLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_3015ContainedLinks(view);
		case ElementaryActorEditPart.VISUAL_ID:
			return getElementaryActor_3009ContainedLinks(view);
		case CompositeActorEditPart.VISUAL_ID:
			return getCompositeActor_3016ContainedLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_3023ContainedLinks(view);
		case ConnectionElementEditPart.VISUAL_ID:
			return getConnectionElement_4001ContainedLinks(view);
		case ValueExchangeEditPart.VISUAL_ID:
			return getValueExchange_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getIncomingLinks(View view) {
		switch (E3valueVisualIDRegistry.getVisualID(view)) {
		case E3ValueModelEditPart.VISUAL_ID:
			return getE3ValueModel_2007IncomingLinks(view);
		case MarketSegmentEditPart.VISUAL_ID:
			return getMarketSegment_3008IncomingLinks(view);
		case ValueInterfaceEditPart.VISUAL_ID:
			return getValueInterface_3001IncomingLinks(view);
		case ValuePortInEditPart.VISUAL_ID:
			return getValuePortIn_3002IncomingLinks(view);
		case ValuePortOutEditPart.VISUAL_ID:
			return getValuePortOut_3003IncomingLinks(view);
		case ResponsabilityElementEditPart.VISUAL_ID:
			return getResponsabilityElement_3004IncomingLinks(view);
		case ValueActivityEditPart.VISUAL_ID:
			return getValueActivity_3005IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3057IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3058IncomingLinks(view);
		case StartStimulusEditPart.VISUAL_ID:
			return getStartStimulus_3010IncomingLinks(view);
		case EndStimulusEditPart.VISUAL_ID:
			return getEndStimulus_3011IncomingLinks(view);
		case AndForkEditPart.VISUAL_ID:
			return getAndFork_3012IncomingLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_3013IncomingLinks(view);
		case OrForkEditPart.VISUAL_ID:
			return getOrFork_3014IncomingLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_3015IncomingLinks(view);
		case ElementaryActorEditPart.VISUAL_ID:
			return getElementaryActor_3009IncomingLinks(view);
		case CompositeActorEditPart.VISUAL_ID:
			return getCompositeActor_3016IncomingLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_3023IncomingLinks(view);
		case ConnectionElementEditPart.VISUAL_ID:
			return getConnectionElement_4001IncomingLinks(view);
		case ValueExchangeEditPart.VISUAL_ID:
			return getValueExchange_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOutgoingLinks(View view) {
		switch (E3valueVisualIDRegistry.getVisualID(view)) {
		case E3ValueModelEditPart.VISUAL_ID:
			return getE3ValueModel_2007OutgoingLinks(view);
		case MarketSegmentEditPart.VISUAL_ID:
			return getMarketSegment_3008OutgoingLinks(view);
		case ValueInterfaceEditPart.VISUAL_ID:
			return getValueInterface_3001OutgoingLinks(view);
		case ValuePortInEditPart.VISUAL_ID:
			return getValuePortIn_3002OutgoingLinks(view);
		case ValuePortOutEditPart.VISUAL_ID:
			return getValuePortOut_3003OutgoingLinks(view);
		case ResponsabilityElementEditPart.VISUAL_ID:
			return getResponsabilityElement_3004OutgoingLinks(view);
		case ValueActivityEditPart.VISUAL_ID:
			return getValueActivity_3005OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3057OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3058OutgoingLinks(view);
		case StartStimulusEditPart.VISUAL_ID:
			return getStartStimulus_3010OutgoingLinks(view);
		case EndStimulusEditPart.VISUAL_ID:
			return getEndStimulus_3011OutgoingLinks(view);
		case AndForkEditPart.VISUAL_ID:
			return getAndFork_3012OutgoingLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_3013OutgoingLinks(view);
		case OrForkEditPart.VISUAL_ID:
			return getOrFork_3014OutgoingLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_3015OutgoingLinks(view);
		case ElementaryActorEditPart.VISUAL_ID:
			return getElementaryActor_3009OutgoingLinks(view);
		case CompositeActorEditPart.VISUAL_ID:
			return getCompositeActor_3016OutgoingLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_3023OutgoingLinks(view);
		case ConnectionElementEditPart.VISUAL_ID:
			return getConnectionElement_4001OutgoingLinks(view);
		case ValueExchangeEditPart.VISUAL_ID:
			return getValueExchange_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getE3ValueDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getE3ValueModel_2007ContainedLinks(
			View view) {
		E3ValueModel modelElement = (E3ValueModel) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ValueExchange_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getMarketSegment_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueInterface_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortIn_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortOut_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getResponsabilityElement_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueActivity_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getStartStimulus_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getEndStimulus_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndFork_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getInputPort_3057ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOutputPort_3058ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndJoin_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrFork_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrJoin_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getElementaryActor_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getCompositeActor_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueObject_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getConnectionElement_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueExchange_4002ContainedLinks(
			View view) {
		ValueExchange modelElement = (ValueExchange) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ValueExchange_HasValueObject_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getE3ValueModel_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getMarketSegment_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueInterface_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortIn_3002IncomingLinks(
			View view) {
		ValuePortIn modelElement = (ValuePortIn) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ValueExchange_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortOut_3003IncomingLinks(
			View view) {
		ValuePortOut modelElement = (ValuePortOut) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ValueExchange_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getResponsabilityElement_3004IncomingLinks(
			View view) {
		ResponsabilityElement modelElement = (ResponsabilityElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				(DependencyElement) modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueActivity_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getStartStimulus_3010IncomingLinks(
			View view) {
		StartStimulus modelElement = (StartStimulus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getEndStimulus_3011IncomingLinks(
			View view) {
		EndStimulus modelElement = (EndStimulus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndFork_3012IncomingLinks(
			View view) {
		AndFork modelElement = (AndFork) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getInputPort_3057IncomingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				(DependencyElement) modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOutputPort_3058IncomingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				(DependencyElement) modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndJoin_3013IncomingLinks(
			View view) {
		AndJoin modelElement = (AndJoin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrFork_3014IncomingLinks(
			View view) {
		OrFork modelElement = (OrFork) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrJoin_3015IncomingLinks(
			View view) {
		OrJoin modelElement = (OrJoin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getElementaryActor_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getCompositeActor_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueObject_3023IncomingLinks(
			View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ValueExchange_HasValueObject_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getConnectionElement_4001IncomingLinks(
			View view) {
		ConnectionElement modelElement = (ConnectionElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionElement_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueExchange_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getE3ValueModel_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getMarketSegment_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueInterface_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortIn_3002OutgoingLinks(
			View view) {
		ValuePortIn modelElement = (ValuePortIn) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ValueExchange_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValuePortOut_3003OutgoingLinks(
			View view) {
		ValuePortOut modelElement = (ValuePortOut) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ValueExchange_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getResponsabilityElement_3004OutgoingLinks(
			View view) {
		ResponsabilityElement modelElement = (ResponsabilityElement) view
				.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001((DependencyElement) modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueActivity_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getStartStimulus_3010OutgoingLinks(
			View view) {
		StartStimulus modelElement = (StartStimulus) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getEndStimulus_3011OutgoingLinks(
			View view) {
		EndStimulus modelElement = (EndStimulus) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndFork_3012OutgoingLinks(
			View view) {
		AndFork modelElement = (AndFork) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getInputPort_3057OutgoingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001((DependencyElement) modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOutputPort_3058OutgoingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001((DependencyElement) modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getAndJoin_3013OutgoingLinks(
			View view) {
		AndJoin modelElement = (AndJoin) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrFork_3014OutgoingLinks(
			View view) {
		OrFork modelElement = (OrFork) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getOrJoin_3015OutgoingLinks(
			View view) {
		OrJoin modelElement = (OrJoin) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getElementaryActor_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getCompositeActor_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueObject_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getConnectionElement_4001OutgoingLinks(
			View view) {
		ConnectionElement modelElement = (ConnectionElement) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionElement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<E3valueLinkDescriptor> getValueExchange_4002OutgoingLinks(
			View view) {
		ValueExchange modelElement = (ValueExchange) view.getElement();
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ValueExchange_HasValueObject_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionElement_4001(
			E3ValueModel container) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		for (Iterator<?> links = container.getHasDependenceElements()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionElement) {
				continue;
			}
			ConnectionElement link = (ConnectionElement) linkObject;
			if (ConnectionElementEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTargetDependenceElement();
			DependencyElement src = link.getSourceDependenceElement();
			result.add(new E3valueLinkDescriptor(src, dst, link,
					E3valueElementTypes.ConnectionElement_4001,
					ConnectionElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getContainedTypeModelFacetLinks_ValueExchange_4002(
			E3ValueModel container) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		for (Iterator<?> links = container.getHasValueExchanges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ValueExchange) {
				continue;
			}
			ValueExchange link = (ValueExchange) linkObject;
			if (ValueExchangeEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValuePort dst = link.getTargetValuePort();
			ValuePort src = link.getSourceValuePort();
			result.add(new E3valueLinkDescriptor(src, dst, link,
					E3valueElementTypes.ValueExchange_4002,
					ValueExchangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionElement_4001(
			DependencyElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != E3valuePackage.eINSTANCE
					.getConnectionElement_TargetDependenceElement()
					|| false == setting.getEObject() instanceof ConnectionElement) {
				continue;
			}
			ConnectionElement link = (ConnectionElement) setting.getEObject();
			if (ConnectionElementEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSourceDependenceElement();
			result.add(new E3valueLinkDescriptor(src, target, link,
					E3valueElementTypes.ConnectionElement_4001,
					ConnectionElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getIncomingFeatureModelFacetLinks_ValueExchange_HasValueObject_4005(
			ValueObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == E3valuePackage.eINSTANCE
					.getValueExchange_HasValueObject()) {
				result.add(new E3valueLinkDescriptor(setting.getEObject(),
						target,
						E3valueElementTypes.ValueExchangeHasValueObject_4005,
						ValueExchangeHasValueObjectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getIncomingTypeModelFacetLinks_ValueExchange_4002(
			ValuePort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != E3valuePackage.eINSTANCE
					.getValueExchange_TargetValuePort()
					|| false == setting.getEObject() instanceof ValueExchange) {
				continue;
			}
			ValueExchange link = (ValueExchange) setting.getEObject();
			if (ValueExchangeEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValuePort src = link.getSourceValuePort();
			result.add(new E3valueLinkDescriptor(src, target, link,
					E3valueElementTypes.ValueExchange_4002,
					ValueExchangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionElement_4001(
			DependencyElement source) {
		E3ValueModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof E3ValueModel) {
				container = (E3ValueModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		for (Iterator<?> links = container.getHasDependenceElements()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionElement) {
				continue;
			}
			ConnectionElement link = (ConnectionElement) linkObject;
			if (ConnectionElementEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTargetDependenceElement();
			DependencyElement src = link.getSourceDependenceElement();
			if (src != source) {
				continue;
			}
			result.add(new E3valueLinkDescriptor(src, dst, link,
					E3valueElementTypes.ConnectionElement_4001,
					ConnectionElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getOutgoingFeatureModelFacetLinks_ValueExchange_HasValueObject_4005(
			ValueExchange source) {
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		ValueObject destination = source.getHasValueObject();
		if (destination == null) {
			return result;
		}
		result.add(new E3valueLinkDescriptor(source, destination,
				E3valueElementTypes.ValueExchangeHasValueObject_4005,
				ValueExchangeHasValueObjectEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<E3valueLinkDescriptor> getOutgoingTypeModelFacetLinks_ValueExchange_4002(
			ValuePort source) {
		E3ValueModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof E3ValueModel) {
				container = (E3ValueModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<E3valueLinkDescriptor> result = new LinkedList<E3valueLinkDescriptor>();
		for (Iterator<?> links = container.getHasValueExchanges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ValueExchange) {
				continue;
			}
			ValueExchange link = (ValueExchange) linkObject;
			if (ValueExchangeEditPart.VISUAL_ID != E3valueVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValuePort dst = link.getTargetValuePort();
			ValuePort src = link.getSourceValuePort();
			if (src != source) {
				continue;
			}
			result.add(new E3valueLinkDescriptor(src, dst, link,
					E3valueElementTypes.ValueExchange_4002,
					ValueExchangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<E3valueNodeDescriptor> getSemanticChildren(View view) {
			return E3valueDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<E3valueLinkDescriptor> getContainedLinks(View view) {
			return E3valueDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<E3valueLinkDescriptor> getIncomingLinks(View view) {
			return E3valueDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<E3valueLinkDescriptor> getOutgoingLinks(View view) {
			return E3valueDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
