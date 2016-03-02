/**
 */
package e3value.util;

import e3value.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e3value.E3valuePackage
 * @generated
 */
public class E3valueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static E3valuePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3valueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = E3valuePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3valueSwitch<Adapter> modelSwitch =
		new E3valueSwitch<Adapter>() {
			@Override
			public Adapter caseE3ValueDiagram(E3ValueDiagram object) {
				return createE3ValueDiagramAdapter();
			}
			@Override
			public Adapter caseE3ValueModel(E3ValueModel object) {
				return createE3ValueModelAdapter();
			}
			@Override
			public Adapter caseBusinessActor(BusinessActor object) {
				return createBusinessActorAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseMarketSegment(MarketSegment object) {
				return createMarketSegmentAdapter();
			}
			@Override
			public Adapter caseElementaryActor(ElementaryActor object) {
				return createElementaryActorAdapter();
			}
			@Override
			public Adapter caseCompositeActor(CompositeActor object) {
				return createCompositeActorAdapter();
			}
			@Override
			public Adapter caseDependencyElement(DependencyElement object) {
				return createDependencyElementAdapter();
			}
			@Override
			public Adapter caseLogicalElement(LogicalElement object) {
				return createLogicalElementAdapter();
			}
			@Override
			public Adapter caseResponsabilityElement(ResponsabilityElement object) {
				return createResponsabilityElementAdapter();
			}
			@Override
			public Adapter caseValuePort(ValuePort object) {
				return createValuePortAdapter();
			}
			@Override
			public Adapter caseValuePortIn(ValuePortIn object) {
				return createValuePortInAdapter();
			}
			@Override
			public Adapter caseValuePortOut(ValuePortOut object) {
				return createValuePortOutAdapter();
			}
			@Override
			public Adapter caseJoinElement(JoinElement object) {
				return createJoinElementAdapter();
			}
			@Override
			public Adapter caseForkElement(ForkElement object) {
				return createForkElementAdapter();
			}
			@Override
			public Adapter caseAndFork(AndFork object) {
				return createAndForkAdapter();
			}
			@Override
			public Adapter caseAndJoin(AndJoin object) {
				return createAndJoinAdapter();
			}
			@Override
			public Adapter caseOrFork(OrFork object) {
				return createOrForkAdapter();
			}
			@Override
			public Adapter caseOrJoin(OrJoin object) {
				return createOrJoinAdapter();
			}
			@Override
			public Adapter caseStimulusElement(StimulusElement object) {
				return createStimulusElementAdapter();
			}
			@Override
			public Adapter caseStartStimulus(StartStimulus object) {
				return createStartStimulusAdapter();
			}
			@Override
			public Adapter caseEndStimulus(EndStimulus object) {
				return createEndStimulusAdapter();
			}
			@Override
			public Adapter caseConnectionElement(ConnectionElement object) {
				return createConnectionElementAdapter();
			}
			@Override
			public Adapter caseValueInterface(ValueInterface object) {
				return createValueInterfaceAdapter();
			}
			@Override
			public Adapter caseValueExchange(ValueExchange object) {
				return createValueExchangeAdapter();
			}
			@Override
			public Adapter caseValueActivity(ValueActivity object) {
				return createValueActivityAdapter();
			}
			@Override
			public Adapter casePortElement(PortElement object) {
				return createPortElementAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object) {
				return createValueObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link e3value.E3ValueModel <em>E3 Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.E3ValueModel
	 * @generated
	 */
	public Adapter createE3ValueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.BusinessActor
	 * @generated
	 */
	public Adapter createBusinessActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.MarketSegment <em>Market Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.MarketSegment
	 * @generated
	 */
	public Adapter createMarketSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ElementaryActor <em>Elementary Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ElementaryActor
	 * @generated
	 */
	public Adapter createElementaryActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.CompositeActor <em>Composite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.CompositeActor
	 * @generated
	 */
	public Adapter createCompositeActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.DependencyElement
	 * @generated
	 */
	public Adapter createDependencyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.LogicalElement
	 * @generated
	 */
	public Adapter createLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ResponsabilityElement <em>Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ResponsabilityElement
	 * @generated
	 */
	public Adapter createResponsabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValuePort <em>Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValuePort
	 * @generated
	 */
	public Adapter createValuePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValuePortIn <em>Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValuePortIn
	 * @generated
	 */
	public Adapter createValuePortInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValuePortOut <em>Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValuePortOut
	 * @generated
	 */
	public Adapter createValuePortOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.AndFork
	 * @generated
	 */
	public Adapter createAndForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.AndJoin
	 * @generated
	 */
	public Adapter createAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.OrFork
	 * @generated
	 */
	public Adapter createOrForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.OrJoin
	 * @generated
	 */
	public Adapter createOrJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.StimulusElement <em>Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.StimulusElement
	 * @generated
	 */
	public Adapter createStimulusElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.StartStimulus <em>Start Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.StartStimulus
	 * @generated
	 */
	public Adapter createStartStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.EndStimulus <em>End Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.EndStimulus
	 * @generated
	 */
	public Adapter createEndStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ConnectionElement <em>Connection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ConnectionElement
	 * @generated
	 */
	public Adapter createConnectionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValueInterface <em>Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValueInterface
	 * @generated
	 */
	public Adapter createValueInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValueExchange
	 * @generated
	 */
	public Adapter createValueExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValueActivity <em>Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValueActivity
	 * @generated
	 */
	public Adapter createValueActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.PortElement <em>Port Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.PortElement
	 * @generated
	 */
	public Adapter createPortElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.JoinElement <em>Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.JoinElement
	 * @generated
	 */
	public Adapter createJoinElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ForkElement <em>Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ForkElement
	 * @generated
	 */
	public Adapter createForkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3value.E3ValueDiagram <em>E3 Value Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3value.E3ValueDiagram
	 * @generated
	 */
	public Adapter createE3ValueDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //E3valueAdapterFactory
