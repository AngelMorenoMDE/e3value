/**
 */
package e3value.impl;

import e3value.Actor;
import e3value.AndFork;
import e3value.AndJoin;
import e3value.BusinessActor;
import e3value.CompositeActor;
import e3value.ConnectionElement;
import e3value.DependencyElement;
import e3value.E3ValueDiagram;
import e3value.E3ValueModel;
import e3value.E3valueFactory;
import e3value.E3valuePackage;
import e3value.ElementaryActor;
import e3value.EndStimulus;
import e3value.ForkElement;
import e3value.InputPort;
import e3value.JoinElement;
import e3value.LogicalElement;
import e3value.MarketSegment;
import e3value.OrFork;
import e3value.OrJoin;
import e3value.OutputPort;
import e3value.PortElement;
import e3value.ResponsabilityElement;
import e3value.StartStimulus;
import e3value.StimulusElement;
import e3value.ValueActivity;
import e3value.ValueExchange;
import e3value.ValueInterface;
import e3value.ValueObject;
import e3value.ValuePort;
import e3value.ValuePortIn;
import e3value.ValuePortOut;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E3valuePackageImpl extends EPackageImpl implements E3valuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e3ValueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsabilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e3ValueDiagramEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see e3value.E3valuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private E3valuePackageImpl() {
		super(eNS_URI, E3valueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link E3valuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static E3valuePackage init() {
		if (isInited) return (E3valuePackage)EPackage.Registry.INSTANCE.getEPackage(E3valuePackage.eNS_URI);

		// Obtain or create and register package
		E3valuePackageImpl theE3valuePackage = (E3valuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof E3valuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new E3valuePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theE3valuePackage.createPackageContents();

		// Initialize created meta-data
		theE3valuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theE3valuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(E3valuePackage.eNS_URI, theE3valuePackage);
		return theE3valuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE3ValueModel() {
		return e3ValueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueModel_HasBusinessActors() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueModel_HasDependenceElements() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueModel_HasValueExchanges() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueModel_HasValueObjects() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueModel_InE3ValueDiagram() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessActor() {
		return businessActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessActor_Name() {
		return (EAttribute)businessActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessActor_HasValueInterfaces() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessActor_HasValueActivities() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessActor_HasStimulusElements() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessActor_HasDependenceElements() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessActor_HasValueObjects() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarketSegment() {
		return marketSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryActor() {
		return elementaryActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeActor() {
		return compositeActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeActor_HasElementaryActors() {
		return (EReference)compositeActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyElement() {
		return dependencyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyElement_InBusinessActor() {
		return (EReference)dependencyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyElement_InValueActivity() {
		return (EReference)dependencyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalElement() {
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsabilityElement() {
		return responsabilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsabilityElement_BoundsToValueInterface() {
		return (EReference)responsabilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePort() {
		return valuePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePortIn() {
		return valuePortInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePortIn_InConnectWithValueExchange() {
		return (EReference)valuePortInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePortIn_InValueInterface() {
		return (EReference)valuePortInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePortOut() {
		return valuePortOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePortOut_OutConnectWithValueExchange() {
		return (EReference)valuePortOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePortOut_InValueInterface() {
		return (EReference)valuePortOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndFork() {
		return andForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJoin() {
		return andJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrFork() {
		return orForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrJoin() {
		return orJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulusElement() {
		return stimulusElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartStimulus() {
		return startStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndStimulus() {
		return endStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionElement() {
		return connectionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionElement_SourceDependenceElement() {
		return (EReference)connectionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionElement_TargetDependenceElement() {
		return (EReference)connectionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueInterface() {
		return valueInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInterface_InBusinessActor() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInterface_InValueActivity() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInterface_HasValuePortIn() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInterface_HasValuePortOut() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInterface_BindsResponsabilityElement() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExchange() {
		return valueExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_SourceValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_TargetValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_HasValueObject() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_InE3ValueModel() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueActivity() {
		return valueActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueActivity_Name() {
		return (EAttribute)valueActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueActivity_InBusinessActor() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueActivity_HasValueInterfaces() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueActivity_HasStimulusElement() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueActivity_HasDependenceElements() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortElement() {
		return portElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinElement() {
		return joinElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinElement_HasInputPorts() {
		return (EReference)joinElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinElement_HasOutputPort() {
		return (EReference)joinElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkElement() {
		return forkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkElement_HasOutputPorts() {
		return (EReference)forkElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkElement_HasInputPort() {
		return (EReference)forkElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InForkElement() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InJoinElement() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_InForkElement() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_InJoinElement() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueObject() {
		return valueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueObject_Name() {
		return (EAttribute)valueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueObject_InValueExchange() {
		return (EReference)valueObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE3ValueDiagram() {
		return e3ValueDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE3ValueDiagram_HasE3ValueModels() {
		return (EReference)e3ValueDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3valueFactory getE3valueFactory() {
		return (E3valueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		e3ValueDiagramEClass = createEClass(E3_VALUE_DIAGRAM);
		createEReference(e3ValueDiagramEClass, E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS);

		e3ValueModelEClass = createEClass(E3_VALUE_MODEL);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_VALUE_EXCHANGES);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_BUSINESS_ACTORS);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_VALUE_OBJECTS);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS);

		businessActorEClass = createEClass(BUSINESS_ACTOR);
		createEAttribute(businessActorEClass, BUSINESS_ACTOR__NAME);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_VALUE_INTERFACES);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_VALUE_OBJECTS);

		actorEClass = createEClass(ACTOR);

		marketSegmentEClass = createEClass(MARKET_SEGMENT);

		elementaryActorEClass = createEClass(ELEMENTARY_ACTOR);

		compositeActorEClass = createEClass(COMPOSITE_ACTOR);
		createEReference(compositeActorEClass, COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS);

		dependencyElementEClass = createEClass(DEPENDENCY_ELEMENT);
		createEReference(dependencyElementEClass, DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR);
		createEReference(dependencyElementEClass, DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY);

		logicalElementEClass = createEClass(LOGICAL_ELEMENT);

		responsabilityElementEClass = createEClass(RESPONSABILITY_ELEMENT);
		createEReference(responsabilityElementEClass, RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE);

		valuePortEClass = createEClass(VALUE_PORT);

		valuePortInEClass = createEClass(VALUE_PORT_IN);
		createEReference(valuePortInEClass, VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE);
		createEReference(valuePortInEClass, VALUE_PORT_IN__IN_VALUE_INTERFACE);

		valuePortOutEClass = createEClass(VALUE_PORT_OUT);
		createEReference(valuePortOutEClass, VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE);
		createEReference(valuePortOutEClass, VALUE_PORT_OUT__IN_VALUE_INTERFACE);

		joinElementEClass = createEClass(JOIN_ELEMENT);
		createEReference(joinElementEClass, JOIN_ELEMENT__HAS_INPUT_PORTS);
		createEReference(joinElementEClass, JOIN_ELEMENT__HAS_OUTPUT_PORT);

		forkElementEClass = createEClass(FORK_ELEMENT);
		createEReference(forkElementEClass, FORK_ELEMENT__HAS_OUTPUT_PORTS);
		createEReference(forkElementEClass, FORK_ELEMENT__HAS_INPUT_PORT);

		andForkEClass = createEClass(AND_FORK);

		andJoinEClass = createEClass(AND_JOIN);

		orForkEClass = createEClass(OR_FORK);

		orJoinEClass = createEClass(OR_JOIN);

		stimulusElementEClass = createEClass(STIMULUS_ELEMENT);

		startStimulusEClass = createEClass(START_STIMULUS);

		endStimulusEClass = createEClass(END_STIMULUS);

		connectionElementEClass = createEClass(CONNECTION_ELEMENT);
		createEReference(connectionElementEClass, CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT);
		createEReference(connectionElementEClass, CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT);

		valueInterfaceEClass = createEClass(VALUE_INTERFACE);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__IN_BUSINESS_ACTOR);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__IN_VALUE_ACTIVITY);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__HAS_VALUE_PORT_IN);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__HAS_VALUE_PORT_OUT);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT);

		valueExchangeEClass = createEClass(VALUE_EXCHANGE);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__SOURCE_VALUE_PORT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__TARGET_VALUE_PORT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__HAS_VALUE_OBJECT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__IN_E3_VALUE_MODEL);

		valueActivityEClass = createEClass(VALUE_ACTIVITY);
		createEAttribute(valueActivityEClass, VALUE_ACTIVITY__NAME);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__IN_BUSINESS_ACTOR);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__HAS_VALUE_INTERFACES);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS);

		portElementEClass = createEClass(PORT_ELEMENT);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__IN_FORK_ELEMENT);
		createEReference(inputPortEClass, INPUT_PORT__IN_JOIN_ELEMENT);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__IN_FORK_ELEMENT);
		createEReference(outputPortEClass, OUTPUT_PORT__IN_JOIN_ELEMENT);

		valueObjectEClass = createEClass(VALUE_OBJECT);
		createEAttribute(valueObjectEClass, VALUE_OBJECT__NAME);
		createEReference(valueObjectEClass, VALUE_OBJECT__IN_VALUE_EXCHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actorEClass.getESuperTypes().add(this.getBusinessActor());
		marketSegmentEClass.getESuperTypes().add(this.getBusinessActor());
		elementaryActorEClass.getESuperTypes().add(this.getActor());
		compositeActorEClass.getESuperTypes().add(this.getActor());
		logicalElementEClass.getESuperTypes().add(this.getDependencyElement());
		responsabilityElementEClass.getESuperTypes().add(this.getPortElement());
		valuePortInEClass.getESuperTypes().add(this.getValuePort());
		valuePortOutEClass.getESuperTypes().add(this.getValuePort());
		joinElementEClass.getESuperTypes().add(this.getLogicalElement());
		forkElementEClass.getESuperTypes().add(this.getLogicalElement());
		andForkEClass.getESuperTypes().add(this.getForkElement());
		andJoinEClass.getESuperTypes().add(this.getJoinElement());
		orForkEClass.getESuperTypes().add(this.getForkElement());
		orJoinEClass.getESuperTypes().add(this.getJoinElement());
		stimulusElementEClass.getESuperTypes().add(this.getDependencyElement());
		startStimulusEClass.getESuperTypes().add(this.getStimulusElement());
		endStimulusEClass.getESuperTypes().add(this.getStimulusElement());
		connectionElementEClass.getESuperTypes().add(this.getDependencyElement());
		portElementEClass.getESuperTypes().add(this.getDependencyElement());
		inputPortEClass.getESuperTypes().add(this.getPortElement());
		outputPortEClass.getESuperTypes().add(this.getPortElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(e3ValueDiagramEClass, E3ValueDiagram.class, "E3ValueDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE3ValueDiagram_HasE3ValueModels(), this.getE3ValueModel(), this.getE3ValueModel_InE3ValueDiagram(), "hasE3ValueModels", null, 0, -1, E3ValueDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(e3ValueModelEClass, E3ValueModel.class, "E3ValueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE3ValueModel_HasValueExchanges(), this.getValueExchange(), this.getValueExchange_InE3ValueModel(), "hasValueExchanges", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_InE3ValueDiagram(), this.getE3ValueDiagram(), this.getE3ValueDiagram_HasE3ValueModels(), "inE3ValueDiagram", null, 1, 1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_HasBusinessActors(), this.getBusinessActor(), null, "hasBusinessActors", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_HasValueObjects(), this.getValueObject(), null, "hasValueObjects", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_HasDependenceElements(), this.getDependencyElement(), null, "hasDependenceElements", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessActorEClass, BusinessActor.class, "BusinessActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasValueInterfaces(), this.getValueInterface(), this.getValueInterface_InBusinessActor(), "hasValueInterfaces", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasValueActivities(), this.getValueActivity(), this.getValueActivity_InBusinessActor(), "hasValueActivities", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasStimulusElements(), this.getStimulusElement(), null, "hasStimulusElements", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasDependenceElements(), this.getDependencyElement(), this.getDependencyElement_InBusinessActor(), "hasDependenceElements", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasValueObjects(), this.getValueObject(), null, "hasValueObjects", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(marketSegmentEClass, MarketSegment.class, "MarketSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementaryActorEClass, ElementaryActor.class, "ElementaryActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeActorEClass, CompositeActor.class, "CompositeActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeActor_HasElementaryActors(), this.getElementaryActor(), null, "hasElementaryActors", null, 0, -1, CompositeActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyElementEClass, DependencyElement.class, "DependencyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyElement_InBusinessActor(), this.getBusinessActor(), this.getBusinessActor_HasDependenceElements(), "inBusinessActor", null, 0, 1, DependencyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyElement_InValueActivity(), this.getValueActivity(), this.getValueActivity_HasDependenceElements(), "inValueActivity", null, 0, 1, DependencyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalElementEClass, LogicalElement.class, "LogicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responsabilityElementEClass, ResponsabilityElement.class, "ResponsabilityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsabilityElement_BoundsToValueInterface(), this.getValueInterface(), this.getValueInterface_BindsResponsabilityElement(), "boundsToValueInterface", null, 1, 1, ResponsabilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePortEClass, ValuePort.class, "ValuePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuePortInEClass, ValuePortIn.class, "ValuePortIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePortIn_InConnectWithValueExchange(), this.getValueExchange(), null, "inConnectWithValueExchange", null, 0, 1, ValuePortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuePortIn_InValueInterface(), this.getValueInterface(), this.getValueInterface_HasValuePortIn(), "inValueInterface", null, 0, 1, ValuePortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePortOutEClass, ValuePortOut.class, "ValuePortOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePortOut_OutConnectWithValueExchange(), this.getValueExchange(), null, "outConnectWithValueExchange", null, 0, 1, ValuePortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuePortOut_InValueInterface(), this.getValueInterface(), this.getValueInterface_HasValuePortOut(), "inValueInterface", null, 0, 1, ValuePortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinElementEClass, JoinElement.class, "JoinElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinElement_HasInputPorts(), this.getInputPort(), this.getInputPort_InJoinElement(), "hasInputPorts", null, 0, -1, JoinElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinElement_HasOutputPort(), this.getOutputPort(), this.getOutputPort_InJoinElement(), "hasOutputPort", null, 0, 1, JoinElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkElementEClass, ForkElement.class, "ForkElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkElement_HasOutputPorts(), this.getOutputPort(), this.getOutputPort_InForkElement(), "hasOutputPorts", null, 0, -1, ForkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkElement_HasInputPort(), this.getInputPort(), this.getInputPort_InForkElement(), "hasInputPort", null, 0, 1, ForkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andForkEClass, AndFork.class, "AndFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andJoinEClass, AndJoin.class, "AndJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orForkEClass, OrFork.class, "OrFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orJoinEClass, OrJoin.class, "OrJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stimulusElementEClass, StimulusElement.class, "StimulusElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startStimulusEClass, StartStimulus.class, "StartStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endStimulusEClass, EndStimulus.class, "EndStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionElementEClass, ConnectionElement.class, "ConnectionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionElement_SourceDependenceElement(), this.getDependencyElement(), null, "sourceDependenceElement", null, 1, 1, ConnectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionElement_TargetDependenceElement(), this.getDependencyElement(), null, "targetDependenceElement", null, 1, 1, ConnectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueInterfaceEClass, ValueInterface.class, "ValueInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueInterface_InBusinessActor(), this.getBusinessActor(), this.getBusinessActor_HasValueInterfaces(), "inBusinessActor", null, 0, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_InValueActivity(), this.getValueActivity(), this.getValueActivity_HasValueInterfaces(), "inValueActivity", null, 0, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_HasValuePortIn(), this.getValuePortIn(), this.getValuePortIn_InValueInterface(), "hasValuePortIn", null, 1, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_HasValuePortOut(), this.getValuePortOut(), this.getValuePortOut_InValueInterface(), "hasValuePortOut", null, 1, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_BindsResponsabilityElement(), this.getResponsabilityElement(), this.getResponsabilityElement_BoundsToValueInterface(), "bindsResponsabilityElement", null, 1, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExchangeEClass, ValueExchange.class, "ValueExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueExchange_SourceValuePort(), this.getValuePort(), null, "sourceValuePort", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_TargetValuePort(), this.getValuePort(), null, "targetValuePort", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_HasValueObject(), this.getValueObject(), this.getValueObject_InValueExchange(), "hasValueObject", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_InE3ValueModel(), this.getE3ValueModel(), this.getE3ValueModel_HasValueExchanges(), "inE3ValueModel", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueActivityEClass, ValueActivity.class, "ValueActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_InBusinessActor(), this.getBusinessActor(), this.getBusinessActor_HasValueActivities(), "inBusinessActor", null, 0, 1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_HasValueInterfaces(), this.getValueInterface(), this.getValueInterface_InValueActivity(), "hasValueInterfaces", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_HasStimulusElement(), this.getStimulusElement(), null, "hasStimulusElement", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_HasDependenceElements(), this.getDependencyElement(), this.getDependencyElement_InValueActivity(), "hasDependenceElements", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portElementEClass, PortElement.class, "PortElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_InForkElement(), this.getForkElement(), this.getForkElement_HasInputPort(), "inForkElement", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_InJoinElement(), this.getJoinElement(), this.getJoinElement_HasInputPorts(), "inJoinElement", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_InForkElement(), this.getForkElement(), this.getForkElement_HasOutputPorts(), "inForkElement", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_InJoinElement(), this.getJoinElement(), this.getJoinElement_HasOutputPort(), "inJoinElement", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueObjectEClass, ValueObject.class, "ValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueObject_InValueExchange(), this.getValueExchange(), this.getValueExchange_HasValueObject(), "inValueExchange", null, 1, 1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //E3valuePackageImpl
