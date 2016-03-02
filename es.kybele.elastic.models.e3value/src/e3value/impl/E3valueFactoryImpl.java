/**
 */
package e3value.impl;

import e3value.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E3valueFactoryImpl extends EFactoryImpl implements E3valueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static E3valueFactory init() {
		try {
			E3valueFactory theE3valueFactory = (E3valueFactory)EPackage.Registry.INSTANCE.getEFactory(E3valuePackage.eNS_URI);
			if (theE3valueFactory != null) {
				return theE3valueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new E3valueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3valueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case E3valuePackage.E3_VALUE_DIAGRAM: return createE3ValueDiagram();
			case E3valuePackage.E3_VALUE_MODEL: return createE3ValueModel();
			case E3valuePackage.MARKET_SEGMENT: return createMarketSegment();
			case E3valuePackage.ELEMENTARY_ACTOR: return createElementaryActor();
			case E3valuePackage.COMPOSITE_ACTOR: return createCompositeActor();
			case E3valuePackage.RESPONSABILITY_ELEMENT: return createResponsabilityElement();
			case E3valuePackage.VALUE_PORT_IN: return createValuePortIn();
			case E3valuePackage.VALUE_PORT_OUT: return createValuePortOut();
			case E3valuePackage.AND_FORK: return createAndFork();
			case E3valuePackage.AND_JOIN: return createAndJoin();
			case E3valuePackage.OR_FORK: return createOrFork();
			case E3valuePackage.OR_JOIN: return createOrJoin();
			case E3valuePackage.START_STIMULUS: return createStartStimulus();
			case E3valuePackage.END_STIMULUS: return createEndStimulus();
			case E3valuePackage.CONNECTION_ELEMENT: return createConnectionElement();
			case E3valuePackage.VALUE_INTERFACE: return createValueInterface();
			case E3valuePackage.VALUE_EXCHANGE: return createValueExchange();
			case E3valuePackage.VALUE_ACTIVITY: return createValueActivity();
			case E3valuePackage.INPUT_PORT: return createInputPort();
			case E3valuePackage.OUTPUT_PORT: return createOutputPort();
			case E3valuePackage.VALUE_OBJECT: return createValueObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueModel createE3ValueModel() {
		E3ValueModelImpl e3ValueModel = new E3ValueModelImpl();
		return e3ValueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketSegment createMarketSegment() {
		MarketSegmentImpl marketSegment = new MarketSegmentImpl();
		return marketSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryActor createElementaryActor() {
		ElementaryActorImpl elementaryActor = new ElementaryActorImpl();
		return elementaryActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeActor createCompositeActor() {
		CompositeActorImpl compositeActor = new CompositeActorImpl();
		return compositeActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsabilityElement createResponsabilityElement() {
		ResponsabilityElementImpl responsabilityElement = new ResponsabilityElementImpl();
		return responsabilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortIn createValuePortIn() {
		ValuePortInImpl valuePortIn = new ValuePortInImpl();
		return valuePortIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortOut createValuePortOut() {
		ValuePortOutImpl valuePortOut = new ValuePortOutImpl();
		return valuePortOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndFork createAndFork() {
		AndForkImpl andFork = new AndForkImpl();
		return andFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoin createAndJoin() {
		AndJoinImpl andJoin = new AndJoinImpl();
		return andJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrFork createOrFork() {
		OrForkImpl orFork = new OrForkImpl();
		return orFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrJoin createOrJoin() {
		OrJoinImpl orJoin = new OrJoinImpl();
		return orJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStimulus createStartStimulus() {
		StartStimulusImpl startStimulus = new StartStimulusImpl();
		return startStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndStimulus createEndStimulus() {
		EndStimulusImpl endStimulus = new EndStimulusImpl();
		return endStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionElement createConnectionElement() {
		ConnectionElementImpl connectionElement = new ConnectionElementImpl();
		return connectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterface createValueInterface() {
		ValueInterfaceImpl valueInterface = new ValueInterfaceImpl();
		return valueInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange createValueExchange() {
		ValueExchangeImpl valueExchange = new ValueExchangeImpl();
		return valueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueActivity createValueActivity() {
		ValueActivityImpl valueActivity = new ValueActivityImpl();
		return valueActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueDiagram createE3ValueDiagram() {
		E3ValueDiagramImpl e3ValueDiagram = new E3ValueDiagramImpl();
		return e3ValueDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3valuePackage getE3valuePackage() {
		return (E3valuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static E3valuePackage getPackage() {
		return E3valuePackage.eINSTANCE;
	}

} //E3valueFactoryImpl
