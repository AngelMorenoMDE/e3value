/**
 */
package e3value.util;

import e3value.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see e3value.E3valuePackage
 * @generated
 */
public class E3valueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static E3valuePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3valueSwitch() {
		if (modelPackage == null) {
			modelPackage = E3valuePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case E3valuePackage.E3_VALUE_DIAGRAM: {
				E3ValueDiagram e3ValueDiagram = (E3ValueDiagram)theEObject;
				T result = caseE3ValueDiagram(e3ValueDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.E3_VALUE_MODEL: {
				E3ValueModel e3ValueModel = (E3ValueModel)theEObject;
				T result = caseE3ValueModel(e3ValueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.BUSINESS_ACTOR: {
				BusinessActor businessActor = (BusinessActor)theEObject;
				T result = caseBusinessActor(businessActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseBusinessActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.MARKET_SEGMENT: {
				MarketSegment marketSegment = (MarketSegment)theEObject;
				T result = caseMarketSegment(marketSegment);
				if (result == null) result = caseBusinessActor(marketSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.ELEMENTARY_ACTOR: {
				ElementaryActor elementaryActor = (ElementaryActor)theEObject;
				T result = caseElementaryActor(elementaryActor);
				if (result == null) result = caseActor(elementaryActor);
				if (result == null) result = caseBusinessActor(elementaryActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.COMPOSITE_ACTOR: {
				CompositeActor compositeActor = (CompositeActor)theEObject;
				T result = caseCompositeActor(compositeActor);
				if (result == null) result = caseActor(compositeActor);
				if (result == null) result = caseBusinessActor(compositeActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.DEPENDENCY_ELEMENT: {
				DependencyElement dependencyElement = (DependencyElement)theEObject;
				T result = caseDependencyElement(dependencyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.LOGICAL_ELEMENT: {
				LogicalElement logicalElement = (LogicalElement)theEObject;
				T result = caseLogicalElement(logicalElement);
				if (result == null) result = caseDependencyElement(logicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.RESPONSABILITY_ELEMENT: {
				ResponsabilityElement responsabilityElement = (ResponsabilityElement)theEObject;
				T result = caseResponsabilityElement(responsabilityElement);
				if (result == null) result = casePortElement(responsabilityElement);
				if (result == null) result = caseDependencyElement(responsabilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_PORT: {
				ValuePort valuePort = (ValuePort)theEObject;
				T result = caseValuePort(valuePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_PORT_IN: {
				ValuePortIn valuePortIn = (ValuePortIn)theEObject;
				T result = caseValuePortIn(valuePortIn);
				if (result == null) result = caseValuePort(valuePortIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_PORT_OUT: {
				ValuePortOut valuePortOut = (ValuePortOut)theEObject;
				T result = caseValuePortOut(valuePortOut);
				if (result == null) result = caseValuePort(valuePortOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.JOIN_ELEMENT: {
				JoinElement joinElement = (JoinElement)theEObject;
				T result = caseJoinElement(joinElement);
				if (result == null) result = caseLogicalElement(joinElement);
				if (result == null) result = caseDependencyElement(joinElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.FORK_ELEMENT: {
				ForkElement forkElement = (ForkElement)theEObject;
				T result = caseForkElement(forkElement);
				if (result == null) result = caseLogicalElement(forkElement);
				if (result == null) result = caseDependencyElement(forkElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.AND_FORK: {
				AndFork andFork = (AndFork)theEObject;
				T result = caseAndFork(andFork);
				if (result == null) result = caseForkElement(andFork);
				if (result == null) result = caseLogicalElement(andFork);
				if (result == null) result = caseDependencyElement(andFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.AND_JOIN: {
				AndJoin andJoin = (AndJoin)theEObject;
				T result = caseAndJoin(andJoin);
				if (result == null) result = caseJoinElement(andJoin);
				if (result == null) result = caseLogicalElement(andJoin);
				if (result == null) result = caseDependencyElement(andJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.OR_FORK: {
				OrFork orFork = (OrFork)theEObject;
				T result = caseOrFork(orFork);
				if (result == null) result = caseForkElement(orFork);
				if (result == null) result = caseLogicalElement(orFork);
				if (result == null) result = caseDependencyElement(orFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.OR_JOIN: {
				OrJoin orJoin = (OrJoin)theEObject;
				T result = caseOrJoin(orJoin);
				if (result == null) result = caseJoinElement(orJoin);
				if (result == null) result = caseLogicalElement(orJoin);
				if (result == null) result = caseDependencyElement(orJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.STIMULUS_ELEMENT: {
				StimulusElement stimulusElement = (StimulusElement)theEObject;
				T result = caseStimulusElement(stimulusElement);
				if (result == null) result = caseDependencyElement(stimulusElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.START_STIMULUS: {
				StartStimulus startStimulus = (StartStimulus)theEObject;
				T result = caseStartStimulus(startStimulus);
				if (result == null) result = caseStimulusElement(startStimulus);
				if (result == null) result = caseDependencyElement(startStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.END_STIMULUS: {
				EndStimulus endStimulus = (EndStimulus)theEObject;
				T result = caseEndStimulus(endStimulus);
				if (result == null) result = caseStimulusElement(endStimulus);
				if (result == null) result = caseDependencyElement(endStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.CONNECTION_ELEMENT: {
				ConnectionElement connectionElement = (ConnectionElement)theEObject;
				T result = caseConnectionElement(connectionElement);
				if (result == null) result = caseDependencyElement(connectionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_INTERFACE: {
				ValueInterface valueInterface = (ValueInterface)theEObject;
				T result = caseValueInterface(valueInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_EXCHANGE: {
				ValueExchange valueExchange = (ValueExchange)theEObject;
				T result = caseValueExchange(valueExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_ACTIVITY: {
				ValueActivity valueActivity = (ValueActivity)theEObject;
				T result = caseValueActivity(valueActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.PORT_ELEMENT: {
				PortElement portElement = (PortElement)theEObject;
				T result = casePortElement(portElement);
				if (result == null) result = caseDependencyElement(portElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = casePortElement(inputPort);
				if (result == null) result = caseDependencyElement(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = casePortElement(outputPort);
				if (result == null) result = caseDependencyElement(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case E3valuePackage.VALUE_OBJECT: {
				ValueObject valueObject = (ValueObject)theEObject;
				T result = caseValueObject(valueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E3 Value Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E3 Value Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE3ValueModel(E3ValueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessActor(BusinessActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketSegment(MarketSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryActor(ElementaryActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeActor(CompositeActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyElement(DependencyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalElement(LogicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsability Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsability Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsabilityElement(ResponsabilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePort(ValuePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Port In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Port In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePortIn(ValuePortIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Port Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Port Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePortOut(ValuePortOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndFork(AndFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJoin(AndJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrFork(OrFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJoin(OrJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulusElement(StimulusElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartStimulus(StartStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndStimulus(EndStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionElement(ConnectionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueInterface(ValueInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExchange(ValueExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueActivity(ValueActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortElement(PortElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinElement(JoinElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkElement(ForkElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueObject(ValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E3 Value Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E3 Value Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE3ValueDiagram(E3ValueDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //E3valueSwitch
