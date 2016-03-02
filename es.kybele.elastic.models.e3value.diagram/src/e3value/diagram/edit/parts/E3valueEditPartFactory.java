package e3value.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import e3value.diagram.part.E3valueVisualIDRegistry;

/**
 * @generated
 */
public class E3valueEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (E3valueVisualIDRegistry.getVisualID(view)) {

			case E3ValueDiagramEditPart.VISUAL_ID:
				return new E3ValueDiagramEditPart(view);

			case E3ValueModelEditPart.VISUAL_ID:
				return new E3ValueModelEditPart(view);

			case MarketSegmentEditPart.VISUAL_ID:
				return new MarketSegmentEditPart(view);

			case MarketSegmentNameEditPart.VISUAL_ID:
				return new MarketSegmentNameEditPart(view);

			case ValueInterfaceEditPart.VISUAL_ID:
				return new ValueInterfaceEditPart(view);

			case ValuePortInEditPart.VISUAL_ID:
				return new ValuePortInEditPart(view);

			case ValuePortOutEditPart.VISUAL_ID:
				return new ValuePortOutEditPart(view);

			case ResponsabilityElementEditPart.VISUAL_ID:
				return new ResponsabilityElementEditPart(view);

			case ValueActivityEditPart.VISUAL_ID:
				return new ValueActivityEditPart(view);

			case ValueActivityNameEditPart.VISUAL_ID:
				return new ValueActivityNameEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case StartStimulusEditPart.VISUAL_ID:
				return new StartStimulusEditPart(view);

			case EndStimulusEditPart.VISUAL_ID:
				return new EndStimulusEditPart(view);

			case AndForkEditPart.VISUAL_ID:
				return new AndForkEditPart(view);

			case AndJoinEditPart.VISUAL_ID:
				return new AndJoinEditPart(view);

			case OrForkEditPart.VISUAL_ID:
				return new OrForkEditPart(view);

			case OrJoinEditPart.VISUAL_ID:
				return new OrJoinEditPart(view);

			case ElementaryActorEditPart.VISUAL_ID:
				return new ElementaryActorEditPart(view);

			case ElementaryActorNameEditPart.VISUAL_ID:
				return new ElementaryActorNameEditPart(view);

			case CompositeActorEditPart.VISUAL_ID:
				return new CompositeActorEditPart(view);

			case CompositeActorNameEditPart.VISUAL_ID:
				return new CompositeActorNameEditPart(view);

			case ValueObjectEditPart.VISUAL_ID:
				return new ValueObjectEditPart(view);

			case ValueObjectName3EditPart.VISUAL_ID:
				return new ValueObjectName3EditPart(view);

			case E3ValueModelE3ValueModelCompartmentDiagramEditPart.VISUAL_ID:
				return new E3ValueModelE3ValueModelCompartmentDiagramEditPart(
						view);

			case MarketSegmentMarketSegmentComparmentDiagramEditPart.VISUAL_ID:
				return new MarketSegmentMarketSegmentComparmentDiagramEditPart(
						view);

			case ValueInterfaceValuePortOutCompartmentDiagramEditPart.VISUAL_ID:
				return new ValueInterfaceValuePortOutCompartmentDiagramEditPart(
						view);

			case ValueInterfaceValuePortInCompartmentDiagramEditPart.VISUAL_ID:
				return new ValueInterfaceValuePortInCompartmentDiagramEditPart(
						view);

			case ValueInterfaceResponsabilityElementCompartmentDiagramEditPart.VISUAL_ID:
				return new ValueInterfaceResponsabilityElementCompartmentDiagramEditPart(
						view);

			case AndForkAndForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
				return new AndForkAndForkInputPortCompartmentDiagramEditPart(
						view);

			case AndForkAndForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
				return new AndForkAndForkOutputPortsCompartmentDiagramEditPart(
						view);

			case AndJoinAndJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
				return new AndJoinAndJoinInputPortsCompartmentDiagramEditPart(
						view);

			case AndJoinAndJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
				return new AndJoinAndJoinOutputPortCompartmentDiagramEditPart(
						view);

			case OrForkOrForkInputPortCompartmentDiagramEditPart.VISUAL_ID:
				return new OrForkOrForkInputPortCompartmentDiagramEditPart(view);

			case OrForkOrForkOutputPortsCompartmentDiagramEditPart.VISUAL_ID:
				return new OrForkOrForkOutputPortsCompartmentDiagramEditPart(
						view);

			case OrJoinOrJoinInputPortsCompartmentDiagramEditPart.VISUAL_ID:
				return new OrJoinOrJoinInputPortsCompartmentDiagramEditPart(
						view);

			case OrJoinOrJoinOutputPortCompartmentDiagramEditPart.VISUAL_ID:
				return new OrJoinOrJoinOutputPortCompartmentDiagramEditPart(
						view);

			case ElementaryActorElementaryActorCompartmentDiagramEditPart.VISUAL_ID:
				return new ElementaryActorElementaryActorCompartmentDiagramEditPart(
						view);

			case ValueActivityValueActivityCompartmentDiagramEditPart.VISUAL_ID:
				return new ValueActivityValueActivityCompartmentDiagramEditPart(
						view);

			case CompositeActorCompositeActorCompartmentDiagramEditPart.VISUAL_ID:
				return new CompositeActorCompositeActorCompartmentDiagramEditPart(
						view);

			case ConnectionElementEditPart.VISUAL_ID:
				return new ConnectionElementEditPart(view);

			case ValueExchangeHasValueObjectEditPart.VISUAL_ID:
				return new ValueExchangeHasValueObjectEditPart(view);

			case ValueExchangeEditPart.VISUAL_ID:
				return new ValueExchangeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
