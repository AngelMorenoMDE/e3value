package e3value.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import e3value.E3valuePackage;
import e3value.diagram.edit.parts.AndForkEditPart;
import e3value.diagram.edit.parts.AndJoinEditPart;
import e3value.diagram.edit.parts.CompositeActorEditPart;
import e3value.diagram.edit.parts.ConnectionElementEditPart;
import e3value.diagram.edit.parts.E3ValueDiagramEditPart;
import e3value.diagram.edit.parts.E3ValueModelEditPart;
import e3value.diagram.edit.parts.ElementaryActorEditPart;
import e3value.diagram.edit.parts.EndStimulusEditPart;
import e3value.diagram.edit.parts.InputPortEditPart;
import e3value.diagram.edit.parts.MarketSegmentEditPart;
import e3value.diagram.edit.parts.OrForkEditPart;
import e3value.diagram.edit.parts.OrJoinEditPart;
import e3value.diagram.edit.parts.OutputPortEditPart;
import e3value.diagram.edit.parts.ResponsabilityElementEditPart;
import e3value.diagram.edit.parts.StartStimulusEditPart;
import e3value.diagram.edit.parts.ValueActivityEditPart;
import e3value.diagram.edit.parts.ValueExchangeEditPart;
import e3value.diagram.edit.parts.ValueExchangeHasValueObjectEditPart;
import e3value.diagram.edit.parts.ValueExchangeToValueObjectConnectionEditPart;
import e3value.diagram.edit.parts.ValueInterfaceEditPart;
import e3value.diagram.edit.parts.ValueObjectEditPart;
import e3value.diagram.edit.parts.ValuePortIn2EditPart;
import e3value.diagram.edit.parts.ValuePortInEditPart;
import e3value.diagram.edit.parts.ValuePortOutEditPart;
import e3value.diagram.part.E3valueDiagramEditorPlugin;

/**
 * @generated
 */
public class E3valueElementTypes {

	/**
	 * @generated
	 */
	private E3valueElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			E3valueDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType E3ValueDiagram_1000 = getElementType("es.kybele.elastic.models.e3value.diagram.E3ValueDiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType E3ValueModel_2007 = getElementType("es.kybele.elastic.models.e3value.diagram.E3ValueModel_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MarketSegment_3008 = getElementType("es.kybele.elastic.models.e3value.diagram.MarketSegment_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueInterface_3001 = getElementType("es.kybele.elastic.models.e3value.diagram.ValueInterface_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValuePortIn_3002 = getElementType("es.kybele.elastic.models.e3value.diagram.ValuePortIn_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValuePortOut_3003 = getElementType("es.kybele.elastic.models.e3value.diagram.ValuePortOut_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ResponsabilityElement_3004 = getElementType("es.kybele.elastic.models.e3value.diagram.ResponsabilityElement_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueActivity_3005 = getElementType("es.kybele.elastic.models.e3value.diagram.ValueActivity_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StartStimulus_3010 = getElementType("es.kybele.elastic.models.e3value.diagram.StartStimulus_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndStimulus_3011 = getElementType("es.kybele.elastic.models.e3value.diagram.EndStimulus_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AndFork_3012 = getElementType("es.kybele.elastic.models.e3value.diagram.AndFork_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPort_3057 = getElementType("es.kybele.elastic.models.e3value.diagram.InputPort_3057"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPort_3058 = getElementType("es.kybele.elastic.models.e3value.diagram.OutputPort_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AndJoin_3013 = getElementType("es.kybele.elastic.models.e3value.diagram.AndJoin_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OrFork_3014 = getElementType("es.kybele.elastic.models.e3value.diagram.OrFork_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OrJoin_3015 = getElementType("es.kybele.elastic.models.e3value.diagram.OrJoin_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementaryActor_3009 = getElementType("es.kybele.elastic.models.e3value.diagram.ElementaryActor_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeActor_3016 = getElementType("es.kybele.elastic.models.e3value.diagram.CompositeActor_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueObject_3023 = getElementType("es.kybele.elastic.models.e3value.diagram.ValueObject_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectionElement_4001 = getElementType("es.kybele.elastic.models.e3value.diagram.ConnectionElement_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueExchangeHasValueObject_4005 = getElementType("es.kybele.elastic.models.e3value.diagram.ValueExchangeHasValueObject_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ValueExchange_4002 = getElementType("es.kybele.elastic.models.e3value.diagram.ValueExchange_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(E3ValueDiagram_1000,
					E3valuePackage.eINSTANCE.getE3ValueDiagram());

			elements.put(E3ValueModel_2007,
					E3valuePackage.eINSTANCE.getE3ValueModel());

			elements.put(MarketSegment_3008,
					E3valuePackage.eINSTANCE.getMarketSegment());

			elements.put(ValueInterface_3001,
					E3valuePackage.eINSTANCE.getValueInterface());

			elements.put(ValuePortIn_3002,
					E3valuePackage.eINSTANCE.getValuePortIn());

			elements.put(ValuePortOut_3003,
					E3valuePackage.eINSTANCE.getValuePortOut());

			elements.put(ResponsabilityElement_3004,
					E3valuePackage.eINSTANCE.getResponsabilityElement());

			elements.put(ValueActivity_3005,
					E3valuePackage.eINSTANCE.getValueActivity());

			elements.put(InputPort_3057,
					E3valuePackage.eINSTANCE.getInputPort());

			elements.put(OutputPort_3058,
					E3valuePackage.eINSTANCE.getOutputPort());

			elements.put(StartStimulus_3010,
					E3valuePackage.eINSTANCE.getStartStimulus());

			elements.put(EndStimulus_3011,
					E3valuePackage.eINSTANCE.getEndStimulus());

			elements.put(AndFork_3012, E3valuePackage.eINSTANCE.getAndFork());

			elements.put(AndJoin_3013, E3valuePackage.eINSTANCE.getAndJoin());

			elements.put(OrFork_3014, E3valuePackage.eINSTANCE.getOrFork());

			elements.put(OrJoin_3015, E3valuePackage.eINSTANCE.getOrJoin());

			elements.put(ElementaryActor_3009,
					E3valuePackage.eINSTANCE.getElementaryActor());

			elements.put(CompositeActor_3016,
					E3valuePackage.eINSTANCE.getCompositeActor());

			elements.put(ValueObject_3023,
					E3valuePackage.eINSTANCE.getValueObject());

			elements.put(ConnectionElement_4001,
					E3valuePackage.eINSTANCE.getConnectionElement());

			elements.put(ValueExchangeHasValueObject_4005,
					E3valuePackage.eINSTANCE.getValueExchange_HasValueObject());

			elements.put(ValueExchange_4002,
					E3valuePackage.eINSTANCE.getValueExchange());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(E3ValueDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(E3ValueModel_2007);
			KNOWN_ELEMENT_TYPES.add(MarketSegment_3008);
			KNOWN_ELEMENT_TYPES.add(ValueInterface_3001);
			KNOWN_ELEMENT_TYPES.add(ValuePortIn_3002);
			KNOWN_ELEMENT_TYPES.add(ValuePortOut_3003);
			KNOWN_ELEMENT_TYPES.add(ResponsabilityElement_3004);
			KNOWN_ELEMENT_TYPES.add(ValueActivity_3005);
			KNOWN_ELEMENT_TYPES.add(InputPort_3057);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3058);
			KNOWN_ELEMENT_TYPES.add(StartStimulus_3010);
			KNOWN_ELEMENT_TYPES.add(EndStimulus_3011);
			KNOWN_ELEMENT_TYPES.add(AndFork_3012);
			KNOWN_ELEMENT_TYPES.add(AndJoin_3013);
			KNOWN_ELEMENT_TYPES.add(OrFork_3014);
			KNOWN_ELEMENT_TYPES.add(OrJoin_3015);
			KNOWN_ELEMENT_TYPES.add(ElementaryActor_3009);
			KNOWN_ELEMENT_TYPES.add(CompositeActor_3016);
			KNOWN_ELEMENT_TYPES.add(ValueObject_3023);
			KNOWN_ELEMENT_TYPES.add(ConnectionElement_4001);
			KNOWN_ELEMENT_TYPES.add(ValueExchangeHasValueObject_4005);
			KNOWN_ELEMENT_TYPES.add(ValueExchange_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case E3ValueDiagramEditPart.VISUAL_ID:
			return E3ValueDiagram_1000;
		case E3ValueModelEditPart.VISUAL_ID:
			return E3ValueModel_2007;
		case MarketSegmentEditPart.VISUAL_ID:
			return MarketSegment_3008;
		case ValueInterfaceEditPart.VISUAL_ID:
			return ValueInterface_3001;
		case ValuePortInEditPart.VISUAL_ID:
			return ValuePortIn_3002;
		case ValuePortOutEditPart.VISUAL_ID:
			return ValuePortOut_3003;
		case ResponsabilityElementEditPart.VISUAL_ID:
			return ResponsabilityElement_3004;
		case ValueActivityEditPart.VISUAL_ID:
			return ValueActivity_3005;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_3057;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_3058;
		case StartStimulusEditPart.VISUAL_ID:
			return StartStimulus_3010;
		case EndStimulusEditPart.VISUAL_ID:
			return EndStimulus_3011;
		case AndForkEditPart.VISUAL_ID:
			return AndFork_3012;
		case AndJoinEditPart.VISUAL_ID:
			return AndJoin_3013;
		case OrForkEditPart.VISUAL_ID:
			return OrFork_3014;
		case OrJoinEditPart.VISUAL_ID:
			return OrJoin_3015;
		case ElementaryActorEditPart.VISUAL_ID:
			return ElementaryActor_3009;
		case CompositeActorEditPart.VISUAL_ID:
			return CompositeActor_3016;
		case ValueObjectEditPart.VISUAL_ID:
			return ValueObject_3023;
		case ConnectionElementEditPart.VISUAL_ID:
			return ConnectionElement_4001;
		case ValueExchangeHasValueObjectEditPart.VISUAL_ID:
			return ValueExchangeHasValueObject_4005;
		case ValueExchangeEditPart.VISUAL_ID:
			return ValueExchange_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return e3value.diagram.providers.E3valueElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return e3value.diagram.providers.E3valueElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return e3value.diagram.providers.E3valueElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
