/**
 */
package e3value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see e3value.E3valueFactory
 * @model kind="package"
 * @generated
 */
public interface E3valuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "e3value";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/elastic/models/e3value/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "e3value";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	E3valuePackage eINSTANCE = e3value.impl.E3valuePackageImpl.init();

	/**
	 * The meta object id for the '{@link e3value.impl.E3ValueModelImpl <em>E3 Value Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.E3ValueModelImpl
	 * @see e3value.impl.E3valuePackageImpl#getE3ValueModel()
	 * @generated
	 */
	int E3_VALUE_MODEL = 1;

	/**
	 * The meta object id for the '{@link e3value.impl.BusinessActorImpl <em>Business Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.BusinessActorImpl
	 * @see e3value.impl.E3valuePackageImpl#getBusinessActor()
	 * @generated
	 */
	int BUSINESS_ACTOR = 2;

	/**
	 * The meta object id for the '{@link e3value.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.MarketSegmentImpl
	 * @see e3value.impl.E3valuePackageImpl#getMarketSegment()
	 * @generated
	 */
	int MARKET_SEGMENT = 4;

	/**
	 * The meta object id for the '{@link e3value.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ActorImpl
	 * @see e3value.impl.E3valuePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The meta object id for the '{@link e3value.impl.ElementaryActorImpl <em>Elementary Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ElementaryActorImpl
	 * @see e3value.impl.E3valuePackageImpl#getElementaryActor()
	 * @generated
	 */
	int ELEMENTARY_ACTOR = 5;

	/**
	 * The meta object id for the '{@link e3value.impl.CompositeActorImpl <em>Composite Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.CompositeActorImpl
	 * @see e3value.impl.E3valuePackageImpl#getCompositeActor()
	 * @generated
	 */
	int COMPOSITE_ACTOR = 6;

	/**
	 * The meta object id for the '{@link e3value.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.DependencyElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getDependencyElement()
	 * @generated
	 */
	int DEPENDENCY_ELEMENT = 7;

	/**
	 * The meta object id for the '{@link e3value.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.LogicalElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 8;

	/**
	 * The meta object id for the '{@link e3value.impl.PortElementImpl <em>Port Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.PortElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getPortElement()
	 * @generated
	 */
	int PORT_ELEMENT = 26;

	/**
	 * The meta object id for the '{@link e3value.impl.ResponsabilityElementImpl <em>Responsability Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ResponsabilityElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getResponsabilityElement()
	 * @generated
	 */
	int RESPONSABILITY_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link e3value.impl.ValuePortImpl <em>Value Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValuePortImpl
	 * @see e3value.impl.E3valuePackageImpl#getValuePort()
	 * @generated
	 */
	int VALUE_PORT = 10;

	/**
	 * The meta object id for the '{@link e3value.impl.ValuePortInImpl <em>Value Port In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValuePortInImpl
	 * @see e3value.impl.E3valuePackageImpl#getValuePortIn()
	 * @generated
	 */
	int VALUE_PORT_IN = 11;

	/**
	 * The meta object id for the '{@link e3value.impl.ValuePortOutImpl <em>Value Port Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValuePortOutImpl
	 * @see e3value.impl.E3valuePackageImpl#getValuePortOut()
	 * @generated
	 */
	int VALUE_PORT_OUT = 12;

	/**
	 * The meta object id for the '{@link e3value.impl.ForkElementImpl <em>Fork Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ForkElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getForkElement()
	 * @generated
	 */
	int FORK_ELEMENT = 14;

	/**
	 * The meta object id for the '{@link e3value.impl.AndForkImpl <em>And Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.AndForkImpl
	 * @see e3value.impl.E3valuePackageImpl#getAndFork()
	 * @generated
	 */
	int AND_FORK = 15;

	/**
	 * The meta object id for the '{@link e3value.impl.JoinElementImpl <em>Join Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.JoinElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getJoinElement()
	 * @generated
	 */
	int JOIN_ELEMENT = 13;

	/**
	 * The meta object id for the '{@link e3value.impl.AndJoinImpl <em>And Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.AndJoinImpl
	 * @see e3value.impl.E3valuePackageImpl#getAndJoin()
	 * @generated
	 */
	int AND_JOIN = 16;

	/**
	 * The meta object id for the '{@link e3value.impl.OrForkImpl <em>Or Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.OrForkImpl
	 * @see e3value.impl.E3valuePackageImpl#getOrFork()
	 * @generated
	 */
	int OR_FORK = 17;

	/**
	 * The meta object id for the '{@link e3value.impl.OrJoinImpl <em>Or Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.OrJoinImpl
	 * @see e3value.impl.E3valuePackageImpl#getOrJoin()
	 * @generated
	 */
	int OR_JOIN = 18;

	/**
	 * The meta object id for the '{@link e3value.impl.StimulusElementImpl <em>Stimulus Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.StimulusElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getStimulusElement()
	 * @generated
	 */
	int STIMULUS_ELEMENT = 19;

	/**
	 * The meta object id for the '{@link e3value.impl.StartStimulusImpl <em>Start Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.StartStimulusImpl
	 * @see e3value.impl.E3valuePackageImpl#getStartStimulus()
	 * @generated
	 */
	int START_STIMULUS = 20;

	/**
	 * The meta object id for the '{@link e3value.impl.EndStimulusImpl <em>End Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.EndStimulusImpl
	 * @see e3value.impl.E3valuePackageImpl#getEndStimulus()
	 * @generated
	 */
	int END_STIMULUS = 21;

	/**
	 * The meta object id for the '{@link e3value.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ConnectionElementImpl
	 * @see e3value.impl.E3valuePackageImpl#getConnectionElement()
	 * @generated
	 */
	int CONNECTION_ELEMENT = 22;

	/**
	 * The meta object id for the '{@link e3value.impl.ValueInterfaceImpl <em>Value Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValueInterfaceImpl
	 * @see e3value.impl.E3valuePackageImpl#getValueInterface()
	 * @generated
	 */
	int VALUE_INTERFACE = 23;

	/**
	 * The meta object id for the '{@link e3value.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValueExchangeImpl
	 * @see e3value.impl.E3valuePackageImpl#getValueExchange()
	 * @generated
	 */
	int VALUE_EXCHANGE = 24;

	/**
	 * The meta object id for the '{@link e3value.impl.ValueActivityImpl <em>Value Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValueActivityImpl
	 * @see e3value.impl.E3valuePackageImpl#getValueActivity()
	 * @generated
	 */
	int VALUE_ACTIVITY = 25;

	/**
	 * The meta object id for the '{@link e3value.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.InputPortImpl
	 * @see e3value.impl.E3valuePackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 27;

	/**
	 * The meta object id for the '{@link e3value.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.OutputPortImpl
	 * @see e3value.impl.E3valuePackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 28;

	/**
	 * The meta object id for the '{@link e3value.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.ValueObjectImpl
	 * @see e3value.impl.E3valuePackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 29;

	/**
	 * The meta object id for the '{@link e3value.impl.E3ValueDiagramImpl <em>E3 Value Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3value.impl.E3ValueDiagramImpl
	 * @see e3value.impl.E3valuePackageImpl#getE3ValueDiagram()
	 * @generated
	 */
	int E3_VALUE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Has E3 Value Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS = 0;

	/**
	 * The number of structural features of the '<em>E3 Value Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>E3 Value Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Has Value Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_VALUE_EXCHANGES = 0;

	/**
	 * The feature id for the '<em><b>In E3 Value Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Has Business Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_BUSINESS_ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_VALUE_OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS = 4;

	/**
	 * The number of structural features of the '<em>E3 Value Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>E3 Value Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_VALUE_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES = 2;

	/**
	 * The feature id for the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_VALUE_OBJECTS = 5;

	/**
	 * The number of structural features of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = BUSINESS_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_VALUE_INTERFACES = BUSINESS_ACTOR__HAS_VALUE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_VALUE_ACTIVITIES = BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_STIMULUS_ELEMENTS = BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_DEPENDENCE_ELEMENTS = BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_VALUE_OBJECTS = BUSINESS_ACTOR__HAS_VALUE_OBJECTS;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = BUSINESS_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = BUSINESS_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__NAME = BUSINESS_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_VALUE_INTERFACES = BUSINESS_ACTOR__HAS_VALUE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_VALUE_ACTIVITIES = BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_STIMULUS_ELEMENTS = BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_DEPENDENCE_ELEMENTS = BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_VALUE_OBJECTS = BUSINESS_ACTOR__HAS_VALUE_OBJECTS;

	/**
	 * The number of structural features of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_FEATURE_COUNT = BUSINESS_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_OPERATION_COUNT = BUSINESS_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_VALUE_INTERFACES = ACTOR__HAS_VALUE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_VALUE_ACTIVITIES = ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_STIMULUS_ELEMENTS = ACTOR__HAS_STIMULUS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_DEPENDENCE_ELEMENTS = ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_VALUE_OBJECTS = ACTOR__HAS_VALUE_OBJECTS;

	/**
	 * The number of structural features of the '<em>Elementary Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementary Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_VALUE_INTERFACES = ACTOR__HAS_VALUE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_VALUE_ACTIVITIES = ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_STIMULUS_ELEMENTS = ACTOR__HAS_STIMULUS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_DEPENDENCE_ELEMENTS = ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_VALUE_OBJECTS = ACTOR__HAS_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Has Elementary Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__IN_BUSINESS_ACTOR = DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__IN_VALUE_ACTIVITY = DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT__IN_BUSINESS_ACTOR = DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT__IN_VALUE_ACTIVITY = DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Port Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT__IN_BUSINESS_ACTOR = PORT_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT__IN_VALUE_ACTIVITY = PORT_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Bounds To Value Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Responsability Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Responsability Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>In Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE = VALUE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Value Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN__IN_VALUE_INTERFACE = VALUE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN_FEATURE_COUNT = VALUE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN_OPERATION_COUNT = VALUE_PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE = VALUE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Value Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT__IN_VALUE_INTERFACE = VALUE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT_FEATURE_COUNT = VALUE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT_OPERATION_COUNT = VALUE_PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__IN_BUSINESS_ACTOR = LOGICAL_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__IN_VALUE_ACTIVITY = LOGICAL_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__HAS_INPUT_PORTS = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__HAS_OUTPUT_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__IN_BUSINESS_ACTOR = LOGICAL_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__IN_VALUE_ACTIVITY = LOGICAL_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__HAS_OUTPUT_PORTS = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__HAS_INPUT_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fork Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__IN_BUSINESS_ACTOR = FORK_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__IN_VALUE_ACTIVITY = FORK_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__HAS_OUTPUT_PORTS = FORK_ELEMENT__HAS_OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__HAS_INPUT_PORT = FORK_ELEMENT__HAS_INPUT_PORT;

	/**
	 * The number of structural features of the '<em>And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK_FEATURE_COUNT = FORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK_OPERATION_COUNT = FORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__IN_BUSINESS_ACTOR = JOIN_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__IN_VALUE_ACTIVITY = JOIN_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__HAS_INPUT_PORTS = JOIN_ELEMENT__HAS_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__HAS_OUTPUT_PORT = JOIN_ELEMENT__HAS_OUTPUT_PORT;

	/**
	 * The number of structural features of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_FEATURE_COUNT = JOIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_OPERATION_COUNT = JOIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__IN_BUSINESS_ACTOR = FORK_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__IN_VALUE_ACTIVITY = FORK_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__HAS_OUTPUT_PORTS = FORK_ELEMENT__HAS_OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__HAS_INPUT_PORT = FORK_ELEMENT__HAS_INPUT_PORT;

	/**
	 * The number of structural features of the '<em>Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK_FEATURE_COUNT = FORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK_OPERATION_COUNT = FORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__IN_BUSINESS_ACTOR = JOIN_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__IN_VALUE_ACTIVITY = JOIN_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__HAS_INPUT_PORTS = JOIN_ELEMENT__HAS_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__HAS_OUTPUT_PORT = JOIN_ELEMENT__HAS_OUTPUT_PORT;

	/**
	 * The number of structural features of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_FEATURE_COUNT = JOIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_OPERATION_COUNT = JOIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT__IN_BUSINESS_ACTOR = DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT__IN_VALUE_ACTIVITY = DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Stimulus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS__IN_BUSINESS_ACTOR = STIMULUS_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS__IN_VALUE_ACTIVITY = STIMULUS_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Start Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS_FEATURE_COUNT = STIMULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS_OPERATION_COUNT = STIMULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS__IN_BUSINESS_ACTOR = STIMULUS_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS__IN_VALUE_ACTIVITY = STIMULUS_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>End Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS_FEATURE_COUNT = STIMULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS_OPERATION_COUNT = STIMULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__IN_BUSINESS_ACTOR = DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__IN_VALUE_ACTIVITY = DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Source Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__IN_BUSINESS_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__IN_VALUE_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Has Value Port In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__HAS_VALUE_PORT_IN = 2;

	/**
	 * The feature id for the '<em><b>Has Value Port Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__HAS_VALUE_PORT_OUT = 3;

	/**
	 * The feature id for the '<em><b>Binds Responsability Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Value Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Value Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Source Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__SOURCE_VALUE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Target Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__TARGET_VALUE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Has Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__HAS_VALUE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>In E3 Value Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__IN_E3_VALUE_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Value Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Value Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__IN_BUSINESS_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__HAS_VALUE_INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS = 4;

	/**
	 * The number of structural features of the '<em>Value Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Value Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IN_BUSINESS_ACTOR = PORT_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IN_VALUE_ACTIVITY = PORT_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Fork Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IN_FORK_ELEMENT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Join Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IN_JOIN_ELEMENT = PORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Business Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__IN_BUSINESS_ACTOR = PORT_ELEMENT__IN_BUSINESS_ACTOR;

	/**
	 * The feature id for the '<em><b>In Value Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__IN_VALUE_ACTIVITY = PORT_ELEMENT__IN_VALUE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Fork Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__IN_FORK_ELEMENT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Join Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__IN_JOIN_ELEMENT = PORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IN_VALUE_EXCHANGE = 1;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link e3value.E3ValueModel <em>E3 Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E3 Value Model</em>'.
	 * @see e3value.E3ValueModel
	 * @generated
	 */
	EClass getE3ValueModel();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.E3ValueModel#getHasBusinessActors <em>Has Business Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Business Actors</em>'.
	 * @see e3value.E3ValueModel#getHasBusinessActors()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasBusinessActors();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.E3ValueModel#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3value.E3ValueModel#getHasDependenceElements()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasDependenceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.E3ValueModel#getHasValueExchanges <em>Has Value Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Exchanges</em>'.
	 * @see e3value.E3ValueModel#getHasValueExchanges()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasValueExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.E3ValueModel#getHasValueObjects <em>Has Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Objects</em>'.
	 * @see e3value.E3ValueModel#getHasValueObjects()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasValueObjects();

	/**
	 * Returns the meta object for the container reference '{@link e3value.E3ValueModel#getInE3ValueDiagram <em>In E3 Value Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In E3 Value Diagram</em>'.
	 * @see e3value.E3ValueModel#getInE3ValueDiagram()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_InE3ValueDiagram();

	/**
	 * Returns the meta object for class '{@link e3value.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Actor</em>'.
	 * @see e3value.BusinessActor
	 * @generated
	 */
	EClass getBusinessActor();

	/**
	 * Returns the meta object for the attribute '{@link e3value.BusinessActor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3value.BusinessActor#getName()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EAttribute getBusinessActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.BusinessActor#getHasValueInterfaces <em>Has Value Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Interfaces</em>'.
	 * @see e3value.BusinessActor#getHasValueInterfaces()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasValueInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.BusinessActor#getHasValueActivities <em>Has Value Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Activities</em>'.
	 * @see e3value.BusinessActor#getHasValueActivities()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasValueActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.BusinessActor#getHasStimulusElements <em>Has Stimulus Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Stimulus Elements</em>'.
	 * @see e3value.BusinessActor#getHasStimulusElements()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasStimulusElements();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.BusinessActor#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3value.BusinessActor#getHasDependenceElements()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasDependenceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.BusinessActor#getHasValueObjects <em>Has Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Objects</em>'.
	 * @see e3value.BusinessActor#getHasValueObjects()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasValueObjects();

	/**
	 * Returns the meta object for class '{@link e3value.MarketSegment <em>Market Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Segment</em>'.
	 * @see e3value.MarketSegment
	 * @generated
	 */
	EClass getMarketSegment();

	/**
	 * Returns the meta object for class '{@link e3value.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see e3value.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link e3value.ElementaryActor <em>Elementary Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Actor</em>'.
	 * @see e3value.ElementaryActor
	 * @generated
	 */
	EClass getElementaryActor();

	/**
	 * Returns the meta object for class '{@link e3value.CompositeActor <em>Composite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Actor</em>'.
	 * @see e3value.CompositeActor
	 * @generated
	 */
	EClass getCompositeActor();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.CompositeActor#getHasElementaryActors <em>Has Elementary Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Elementary Actors</em>'.
	 * @see e3value.CompositeActor#getHasElementaryActors()
	 * @see #getCompositeActor()
	 * @generated
	 */
	EReference getCompositeActor_HasElementaryActors();

	/**
	 * Returns the meta object for class '{@link e3value.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Element</em>'.
	 * @see e3value.DependencyElement
	 * @generated
	 */
	EClass getDependencyElement();

	/**
	 * Returns the meta object for the container reference '{@link e3value.DependencyElement#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Business Actor</em>'.
	 * @see e3value.DependencyElement#getInBusinessActor()
	 * @see #getDependencyElement()
	 * @generated
	 */
	EReference getDependencyElement_InBusinessActor();

	/**
	 * Returns the meta object for the container reference '{@link e3value.DependencyElement#getInValueActivity <em>In Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Value Activity</em>'.
	 * @see e3value.DependencyElement#getInValueActivity()
	 * @see #getDependencyElement()
	 * @generated
	 */
	EReference getDependencyElement_InValueActivity();

	/**
	 * Returns the meta object for class '{@link e3value.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see e3value.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for class '{@link e3value.ResponsabilityElement <em>Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsability Element</em>'.
	 * @see e3value.ResponsabilityElement
	 * @generated
	 */
	EClass getResponsabilityElement();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ResponsabilityElement#getBoundsToValueInterface <em>Bounds To Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bounds To Value Interface</em>'.
	 * @see e3value.ResponsabilityElement#getBoundsToValueInterface()
	 * @see #getResponsabilityElement()
	 * @generated
	 */
	EReference getResponsabilityElement_BoundsToValueInterface();

	/**
	 * Returns the meta object for class '{@link e3value.ValuePort <em>Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port</em>'.
	 * @see e3value.ValuePort
	 * @generated
	 */
	EClass getValuePort();

	/**
	 * Returns the meta object for class '{@link e3value.ValuePortIn <em>Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port In</em>'.
	 * @see e3value.ValuePortIn
	 * @generated
	 */
	EClass getValuePortIn();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Connect With Value Exchange</em>'.
	 * @see e3value.ValuePortIn#getInConnectWithValueExchange()
	 * @see #getValuePortIn()
	 * @generated
	 */
	EReference getValuePortIn_InConnectWithValueExchange();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValuePortIn#getInValueInterface <em>In Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Value Interface</em>'.
	 * @see e3value.ValuePortIn#getInValueInterface()
	 * @see #getValuePortIn()
	 * @generated
	 */
	EReference getValuePortIn_InValueInterface();

	/**
	 * Returns the meta object for class '{@link e3value.ValuePortOut <em>Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port Out</em>'.
	 * @see e3value.ValuePortOut
	 * @generated
	 */
	EClass getValuePortOut();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValuePortOut#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Connect With Value Exchange</em>'.
	 * @see e3value.ValuePortOut#getOutConnectWithValueExchange()
	 * @see #getValuePortOut()
	 * @generated
	 */
	EReference getValuePortOut_OutConnectWithValueExchange();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValuePortOut#getInValueInterface <em>In Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Value Interface</em>'.
	 * @see e3value.ValuePortOut#getInValueInterface()
	 * @see #getValuePortOut()
	 * @generated
	 */
	EReference getValuePortOut_InValueInterface();

	/**
	 * Returns the meta object for class '{@link e3value.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Fork</em>'.
	 * @see e3value.AndFork
	 * @generated
	 */
	EClass getAndFork();

	/**
	 * Returns the meta object for class '{@link e3value.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join</em>'.
	 * @see e3value.AndJoin
	 * @generated
	 */
	EClass getAndJoin();

	/**
	 * Returns the meta object for class '{@link e3value.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Fork</em>'.
	 * @see e3value.OrFork
	 * @generated
	 */
	EClass getOrFork();

	/**
	 * Returns the meta object for class '{@link e3value.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Join</em>'.
	 * @see e3value.OrJoin
	 * @generated
	 */
	EClass getOrJoin();

	/**
	 * Returns the meta object for class '{@link e3value.StimulusElement <em>Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Element</em>'.
	 * @see e3value.StimulusElement
	 * @generated
	 */
	EClass getStimulusElement();

	/**
	 * Returns the meta object for class '{@link e3value.StartStimulus <em>Start Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Stimulus</em>'.
	 * @see e3value.StartStimulus
	 * @generated
	 */
	EClass getStartStimulus();

	/**
	 * Returns the meta object for class '{@link e3value.EndStimulus <em>End Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Stimulus</em>'.
	 * @see e3value.EndStimulus
	 * @generated
	 */
	EClass getEndStimulus();

	/**
	 * Returns the meta object for class '{@link e3value.ConnectionElement <em>Connection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Element</em>'.
	 * @see e3value.ConnectionElement
	 * @generated
	 */
	EClass getConnectionElement();

	/**
	 * Returns the meta object for the reference '{@link e3value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Dependence Element</em>'.
	 * @see e3value.ConnectionElement#getSourceDependenceElement()
	 * @see #getConnectionElement()
	 * @generated
	 */
	EReference getConnectionElement_SourceDependenceElement();

	/**
	 * Returns the meta object for the reference '{@link e3value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Dependence Element</em>'.
	 * @see e3value.ConnectionElement#getTargetDependenceElement()
	 * @see #getConnectionElement()
	 * @generated
	 */
	EReference getConnectionElement_TargetDependenceElement();

	/**
	 * Returns the meta object for class '{@link e3value.ValueInterface <em>Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Interface</em>'.
	 * @see e3value.ValueInterface
	 * @generated
	 */
	EClass getValueInterface();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValueInterface#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Business Actor</em>'.
	 * @see e3value.ValueInterface#getInBusinessActor()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_InBusinessActor();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValueInterface#getInValueActivity <em>In Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Value Activity</em>'.
	 * @see e3value.ValueInterface#getInValueActivity()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_InValueActivity();

	/**
	 * Returns the meta object for the containment reference '{@link e3value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Value Port In</em>'.
	 * @see e3value.ValueInterface#getHasValuePortIn()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_HasValuePortIn();

	/**
	 * Returns the meta object for the containment reference '{@link e3value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Value Port Out</em>'.
	 * @see e3value.ValueInterface#getHasValuePortOut()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_HasValuePortOut();

	/**
	 * Returns the meta object for the containment reference '{@link e3value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binds Responsability Element</em>'.
	 * @see e3value.ValueInterface#getBindsResponsabilityElement()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_BindsResponsabilityElement();

	/**
	 * Returns the meta object for class '{@link e3value.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Exchange</em>'.
	 * @see e3value.ValueExchange
	 * @generated
	 */
	EClass getValueExchange();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValueExchange#getSourceValuePort <em>Source Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Value Port</em>'.
	 * @see e3value.ValueExchange#getSourceValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_SourceValuePort();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValueExchange#getTargetValuePort <em>Target Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value Port</em>'.
	 * @see e3value.ValueExchange#getTargetValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_TargetValuePort();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValueExchange#getHasValueObject <em>Has Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Value Object</em>'.
	 * @see e3value.ValueExchange#getHasValueObject()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_HasValueObject();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValueExchange#getInE3ValueModel <em>In E3 Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In E3 Value Model</em>'.
	 * @see e3value.ValueExchange#getInE3ValueModel()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_InE3ValueModel();

	/**
	 * Returns the meta object for class '{@link e3value.ValueActivity <em>Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Activity</em>'.
	 * @see e3value.ValueActivity
	 * @generated
	 */
	EClass getValueActivity();

	/**
	 * Returns the meta object for the attribute '{@link e3value.ValueActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3value.ValueActivity#getName()
	 * @see #getValueActivity()
	 * @generated
	 */
	EAttribute getValueActivity_Name();

	/**
	 * Returns the meta object for the container reference '{@link e3value.ValueActivity#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Business Actor</em>'.
	 * @see e3value.ValueActivity#getInBusinessActor()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_InBusinessActor();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.ValueActivity#getHasValueInterfaces <em>Has Value Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Interfaces</em>'.
	 * @see e3value.ValueActivity#getHasValueInterfaces()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_HasValueInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link e3value.ValueActivity#getHasStimulusElement <em>Has Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Stimulus Element</em>'.
	 * @see e3value.ValueActivity#getHasStimulusElement()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_HasStimulusElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.ValueActivity#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3value.ValueActivity#getHasDependenceElements()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_HasDependenceElements();

	/**
	 * Returns the meta object for class '{@link e3value.PortElement <em>Port Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Element</em>'.
	 * @see e3value.PortElement
	 * @generated
	 */
	EClass getPortElement();

	/**
	 * Returns the meta object for class '{@link e3value.JoinElement <em>Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Element</em>'.
	 * @see e3value.JoinElement
	 * @generated
	 */
	EClass getJoinElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.JoinElement#getHasInputPorts <em>Has Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input Ports</em>'.
	 * @see e3value.JoinElement#getHasInputPorts()
	 * @see #getJoinElement()
	 * @generated
	 */
	EReference getJoinElement_HasInputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link e3value.JoinElement#getHasOutputPort <em>Has Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Output Port</em>'.
	 * @see e3value.JoinElement#getHasOutputPort()
	 * @see #getJoinElement()
	 * @generated
	 */
	EReference getJoinElement_HasOutputPort();

	/**
	 * Returns the meta object for class '{@link e3value.ForkElement <em>Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Element</em>'.
	 * @see e3value.ForkElement
	 * @generated
	 */
	EClass getForkElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.ForkElement#getHasOutputPorts <em>Has Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output Ports</em>'.
	 * @see e3value.ForkElement#getHasOutputPorts()
	 * @see #getForkElement()
	 * @generated
	 */
	EReference getForkElement_HasOutputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link e3value.ForkElement#getHasInputPort <em>Has Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Input Port</em>'.
	 * @see e3value.ForkElement#getHasInputPort()
	 * @see #getForkElement()
	 * @generated
	 */
	EReference getForkElement_HasInputPort();

	/**
	 * Returns the meta object for class '{@link e3value.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see e3value.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the container reference '{@link e3value.InputPort#getInForkElement <em>In Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Fork Element</em>'.
	 * @see e3value.InputPort#getInForkElement()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_InForkElement();

	/**
	 * Returns the meta object for the container reference '{@link e3value.InputPort#getInJoinElement <em>In Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Join Element</em>'.
	 * @see e3value.InputPort#getInJoinElement()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_InJoinElement();

	/**
	 * Returns the meta object for class '{@link e3value.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see e3value.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the container reference '{@link e3value.OutputPort#getInForkElement <em>In Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Fork Element</em>'.
	 * @see e3value.OutputPort#getInForkElement()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_InForkElement();

	/**
	 * Returns the meta object for the container reference '{@link e3value.OutputPort#getInJoinElement <em>In Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Join Element</em>'.
	 * @see e3value.OutputPort#getInJoinElement()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_InJoinElement();

	/**
	 * Returns the meta object for class '{@link e3value.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see e3value.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link e3value.ValueObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3value.ValueObject#getName()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Name();

	/**
	 * Returns the meta object for the reference '{@link e3value.ValueObject#getInValueExchange <em>In Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Value Exchange</em>'.
	 * @see e3value.ValueObject#getInValueExchange()
	 * @see #getValueObject()
	 * @generated
	 */
	EReference getValueObject_InValueExchange();

	/**
	 * Returns the meta object for class '{@link e3value.E3ValueDiagram <em>E3 Value Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E3 Value Diagram</em>'.
	 * @see e3value.E3ValueDiagram
	 * @generated
	 */
	EClass getE3ValueDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link e3value.E3ValueDiagram#getHasE3ValueModels <em>Has E3 Value Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has E3 Value Models</em>'.
	 * @see e3value.E3ValueDiagram#getHasE3ValueModels()
	 * @see #getE3ValueDiagram()
	 * @generated
	 */
	EReference getE3ValueDiagram_HasE3ValueModels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	E3valueFactory getE3valueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link e3value.impl.E3ValueModelImpl <em>E3 Value Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.E3ValueModelImpl
		 * @see e3value.impl.E3valuePackageImpl#getE3ValueModel()
		 * @generated
		 */
		EClass E3_VALUE_MODEL = eINSTANCE.getE3ValueModel();

		/**
		 * The meta object literal for the '<em><b>Has Business Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_BUSINESS_ACTORS = eINSTANCE.getE3ValueModel_HasBusinessActors();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getE3ValueModel_HasDependenceElements();

		/**
		 * The meta object literal for the '<em><b>Has Value Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_VALUE_EXCHANGES = eINSTANCE.getE3ValueModel_HasValueExchanges();

		/**
		 * The meta object literal for the '<em><b>Has Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_VALUE_OBJECTS = eINSTANCE.getE3ValueModel_HasValueObjects();

		/**
		 * The meta object literal for the '<em><b>In E3 Value Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM = eINSTANCE.getE3ValueModel_InE3ValueDiagram();

		/**
		 * The meta object literal for the '{@link e3value.impl.BusinessActorImpl <em>Business Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.BusinessActorImpl
		 * @see e3value.impl.E3valuePackageImpl#getBusinessActor()
		 * @generated
		 */
		EClass BUSINESS_ACTOR = eINSTANCE.getBusinessActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ACTOR__NAME = eINSTANCE.getBusinessActor_Name();

		/**
		 * The meta object literal for the '<em><b>Has Value Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_VALUE_INTERFACES = eINSTANCE.getBusinessActor_HasValueInterfaces();

		/**
		 * The meta object literal for the '<em><b>Has Value Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES = eINSTANCE.getBusinessActor_HasValueActivities();

		/**
		 * The meta object literal for the '<em><b>Has Stimulus Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS = eINSTANCE.getBusinessActor_HasStimulusElements();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getBusinessActor_HasDependenceElements();

		/**
		 * The meta object literal for the '<em><b>Has Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_VALUE_OBJECTS = eINSTANCE.getBusinessActor_HasValueObjects();

		/**
		 * The meta object literal for the '{@link e3value.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.MarketSegmentImpl
		 * @see e3value.impl.E3valuePackageImpl#getMarketSegment()
		 * @generated
		 */
		EClass MARKET_SEGMENT = eINSTANCE.getMarketSegment();

		/**
		 * The meta object literal for the '{@link e3value.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ActorImpl
		 * @see e3value.impl.E3valuePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link e3value.impl.ElementaryActorImpl <em>Elementary Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ElementaryActorImpl
		 * @see e3value.impl.E3valuePackageImpl#getElementaryActor()
		 * @generated
		 */
		EClass ELEMENTARY_ACTOR = eINSTANCE.getElementaryActor();

		/**
		 * The meta object literal for the '{@link e3value.impl.CompositeActorImpl <em>Composite Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.CompositeActorImpl
		 * @see e3value.impl.E3valuePackageImpl#getCompositeActor()
		 * @generated
		 */
		EClass COMPOSITE_ACTOR = eINSTANCE.getCompositeActor();

		/**
		 * The meta object literal for the '<em><b>Has Elementary Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS = eINSTANCE.getCompositeActor_HasElementaryActors();

		/**
		 * The meta object literal for the '{@link e3value.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.DependencyElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getDependencyElement()
		 * @generated
		 */
		EClass DEPENDENCY_ELEMENT = eINSTANCE.getDependencyElement();

		/**
		 * The meta object literal for the '<em><b>In Business Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR = eINSTANCE.getDependencyElement_InBusinessActor();

		/**
		 * The meta object literal for the '<em><b>In Value Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY = eINSTANCE.getDependencyElement_InValueActivity();

		/**
		 * The meta object literal for the '{@link e3value.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.LogicalElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.ResponsabilityElementImpl <em>Responsability Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ResponsabilityElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getResponsabilityElement()
		 * @generated
		 */
		EClass RESPONSABILITY_ELEMENT = eINSTANCE.getResponsabilityElement();

		/**
		 * The meta object literal for the '<em><b>Bounds To Value Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE = eINSTANCE.getResponsabilityElement_BoundsToValueInterface();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValuePortImpl <em>Value Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValuePortImpl
		 * @see e3value.impl.E3valuePackageImpl#getValuePort()
		 * @generated
		 */
		EClass VALUE_PORT = eINSTANCE.getValuePort();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValuePortInImpl <em>Value Port In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValuePortInImpl
		 * @see e3value.impl.E3valuePackageImpl#getValuePortIn()
		 * @generated
		 */
		EClass VALUE_PORT_IN = eINSTANCE.getValuePortIn();

		/**
		 * The meta object literal for the '<em><b>In Connect With Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE = eINSTANCE.getValuePortIn_InConnectWithValueExchange();

		/**
		 * The meta object literal for the '<em><b>In Value Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_IN__IN_VALUE_INTERFACE = eINSTANCE.getValuePortIn_InValueInterface();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValuePortOutImpl <em>Value Port Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValuePortOutImpl
		 * @see e3value.impl.E3valuePackageImpl#getValuePortOut()
		 * @generated
		 */
		EClass VALUE_PORT_OUT = eINSTANCE.getValuePortOut();

		/**
		 * The meta object literal for the '<em><b>Out Connect With Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE = eINSTANCE.getValuePortOut_OutConnectWithValueExchange();

		/**
		 * The meta object literal for the '<em><b>In Value Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_OUT__IN_VALUE_INTERFACE = eINSTANCE.getValuePortOut_InValueInterface();

		/**
		 * The meta object literal for the '{@link e3value.impl.AndForkImpl <em>And Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.AndForkImpl
		 * @see e3value.impl.E3valuePackageImpl#getAndFork()
		 * @generated
		 */
		EClass AND_FORK = eINSTANCE.getAndFork();

		/**
		 * The meta object literal for the '{@link e3value.impl.AndJoinImpl <em>And Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.AndJoinImpl
		 * @see e3value.impl.E3valuePackageImpl#getAndJoin()
		 * @generated
		 */
		EClass AND_JOIN = eINSTANCE.getAndJoin();

		/**
		 * The meta object literal for the '{@link e3value.impl.OrForkImpl <em>Or Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.OrForkImpl
		 * @see e3value.impl.E3valuePackageImpl#getOrFork()
		 * @generated
		 */
		EClass OR_FORK = eINSTANCE.getOrFork();

		/**
		 * The meta object literal for the '{@link e3value.impl.OrJoinImpl <em>Or Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.OrJoinImpl
		 * @see e3value.impl.E3valuePackageImpl#getOrJoin()
		 * @generated
		 */
		EClass OR_JOIN = eINSTANCE.getOrJoin();

		/**
		 * The meta object literal for the '{@link e3value.impl.StimulusElementImpl <em>Stimulus Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.StimulusElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getStimulusElement()
		 * @generated
		 */
		EClass STIMULUS_ELEMENT = eINSTANCE.getStimulusElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.StartStimulusImpl <em>Start Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.StartStimulusImpl
		 * @see e3value.impl.E3valuePackageImpl#getStartStimulus()
		 * @generated
		 */
		EClass START_STIMULUS = eINSTANCE.getStartStimulus();

		/**
		 * The meta object literal for the '{@link e3value.impl.EndStimulusImpl <em>End Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.EndStimulusImpl
		 * @see e3value.impl.E3valuePackageImpl#getEndStimulus()
		 * @generated
		 */
		EClass END_STIMULUS = eINSTANCE.getEndStimulus();

		/**
		 * The meta object literal for the '{@link e3value.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ConnectionElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getConnectionElement()
		 * @generated
		 */
		EClass CONNECTION_ELEMENT = eINSTANCE.getConnectionElement();

		/**
		 * The meta object literal for the '<em><b>Source Dependence Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT = eINSTANCE.getConnectionElement_SourceDependenceElement();

		/**
		 * The meta object literal for the '<em><b>Target Dependence Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT = eINSTANCE.getConnectionElement_TargetDependenceElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValueInterfaceImpl <em>Value Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValueInterfaceImpl
		 * @see e3value.impl.E3valuePackageImpl#getValueInterface()
		 * @generated
		 */
		EClass VALUE_INTERFACE = eINSTANCE.getValueInterface();

		/**
		 * The meta object literal for the '<em><b>In Business Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__IN_BUSINESS_ACTOR = eINSTANCE.getValueInterface_InBusinessActor();

		/**
		 * The meta object literal for the '<em><b>In Value Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__IN_VALUE_ACTIVITY = eINSTANCE.getValueInterface_InValueActivity();

		/**
		 * The meta object literal for the '<em><b>Has Value Port In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__HAS_VALUE_PORT_IN = eINSTANCE.getValueInterface_HasValuePortIn();

		/**
		 * The meta object literal for the '<em><b>Has Value Port Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__HAS_VALUE_PORT_OUT = eINSTANCE.getValueInterface_HasValuePortOut();

		/**
		 * The meta object literal for the '<em><b>Binds Responsability Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT = eINSTANCE.getValueInterface_BindsResponsabilityElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValueExchangeImpl
		 * @see e3value.impl.E3valuePackageImpl#getValueExchange()
		 * @generated
		 */
		EClass VALUE_EXCHANGE = eINSTANCE.getValueExchange();

		/**
		 * The meta object literal for the '<em><b>Source Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__SOURCE_VALUE_PORT = eINSTANCE.getValueExchange_SourceValuePort();

		/**
		 * The meta object literal for the '<em><b>Target Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__TARGET_VALUE_PORT = eINSTANCE.getValueExchange_TargetValuePort();

		/**
		 * The meta object literal for the '<em><b>Has Value Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__HAS_VALUE_OBJECT = eINSTANCE.getValueExchange_HasValueObject();

		/**
		 * The meta object literal for the '<em><b>In E3 Value Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__IN_E3_VALUE_MODEL = eINSTANCE.getValueExchange_InE3ValueModel();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValueActivityImpl <em>Value Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValueActivityImpl
		 * @see e3value.impl.E3valuePackageImpl#getValueActivity()
		 * @generated
		 */
		EClass VALUE_ACTIVITY = eINSTANCE.getValueActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ACTIVITY__NAME = eINSTANCE.getValueActivity_Name();

		/**
		 * The meta object literal for the '<em><b>In Business Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__IN_BUSINESS_ACTOR = eINSTANCE.getValueActivity_InBusinessActor();

		/**
		 * The meta object literal for the '<em><b>Has Value Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__HAS_VALUE_INTERFACES = eINSTANCE.getValueActivity_HasValueInterfaces();

		/**
		 * The meta object literal for the '<em><b>Has Stimulus Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT = eINSTANCE.getValueActivity_HasStimulusElement();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getValueActivity_HasDependenceElements();

		/**
		 * The meta object literal for the '{@link e3value.impl.PortElementImpl <em>Port Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.PortElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getPortElement()
		 * @generated
		 */
		EClass PORT_ELEMENT = eINSTANCE.getPortElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.JoinElementImpl <em>Join Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.JoinElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getJoinElement()
		 * @generated
		 */
		EClass JOIN_ELEMENT = eINSTANCE.getJoinElement();

		/**
		 * The meta object literal for the '<em><b>Has Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ELEMENT__HAS_INPUT_PORTS = eINSTANCE.getJoinElement_HasInputPorts();

		/**
		 * The meta object literal for the '<em><b>Has Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ELEMENT__HAS_OUTPUT_PORT = eINSTANCE.getJoinElement_HasOutputPort();

		/**
		 * The meta object literal for the '{@link e3value.impl.ForkElementImpl <em>Fork Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ForkElementImpl
		 * @see e3value.impl.E3valuePackageImpl#getForkElement()
		 * @generated
		 */
		EClass FORK_ELEMENT = eINSTANCE.getForkElement();

		/**
		 * The meta object literal for the '<em><b>Has Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ELEMENT__HAS_OUTPUT_PORTS = eINSTANCE.getForkElement_HasOutputPorts();

		/**
		 * The meta object literal for the '<em><b>Has Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ELEMENT__HAS_INPUT_PORT = eINSTANCE.getForkElement_HasInputPort();

		/**
		 * The meta object literal for the '{@link e3value.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.InputPortImpl
		 * @see e3value.impl.E3valuePackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>In Fork Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__IN_FORK_ELEMENT = eINSTANCE.getInputPort_InForkElement();

		/**
		 * The meta object literal for the '<em><b>In Join Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__IN_JOIN_ELEMENT = eINSTANCE.getInputPort_InJoinElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.OutputPortImpl
		 * @see e3value.impl.E3valuePackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>In Fork Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__IN_FORK_ELEMENT = eINSTANCE.getOutputPort_InForkElement();

		/**
		 * The meta object literal for the '<em><b>In Join Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__IN_JOIN_ELEMENT = eINSTANCE.getOutputPort_InJoinElement();

		/**
		 * The meta object literal for the '{@link e3value.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.ValueObjectImpl
		 * @see e3value.impl.E3valuePackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__NAME = eINSTANCE.getValueObject_Name();

		/**
		 * The meta object literal for the '<em><b>In Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT__IN_VALUE_EXCHANGE = eINSTANCE.getValueObject_InValueExchange();

		/**
		 * The meta object literal for the '{@link e3value.impl.E3ValueDiagramImpl <em>E3 Value Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3value.impl.E3ValueDiagramImpl
		 * @see e3value.impl.E3valuePackageImpl#getE3ValueDiagram()
		 * @generated
		 */
		EClass E3_VALUE_DIAGRAM = eINSTANCE.getE3ValueDiagram();

		/**
		 * The meta object literal for the '<em><b>Has E3 Value Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS = eINSTANCE.getE3ValueDiagram_HasE3ValueModels();

	}

} //E3valuePackage
