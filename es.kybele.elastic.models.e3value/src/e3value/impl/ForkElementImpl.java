/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ForkElement;
import e3value.InputPort;
import e3value.OutputPort;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ForkElementImpl#getHasOutputPorts <em>Has Output Ports</em>}</li>
 *   <li>{@link e3value.impl.ForkElementImpl#getHasInputPort <em>Has Input Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ForkElementImpl extends LogicalElementImpl implements ForkElement {
	/**
	 * The cached value of the '{@link #getHasOutputPorts() <em>Has Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> hasOutputPorts;

	/**
	 * The cached value of the '{@link #getHasInputPort() <em>Has Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort hasInputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.FORK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getHasOutputPorts() {
		if (hasOutputPorts == null) {
			hasOutputPorts = new EObjectContainmentWithInverseEList<OutputPort>(OutputPort.class, this, E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS, E3valuePackage.OUTPUT_PORT__IN_FORK_ELEMENT);
		}
		return hasOutputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getHasInputPort() {
		return hasInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInputPort(InputPort newHasInputPort, NotificationChain msgs) {
		InputPort oldHasInputPort = hasInputPort;
		hasInputPort = newHasInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT, oldHasInputPort, newHasInputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInputPort(InputPort newHasInputPort) {
		if (newHasInputPort != hasInputPort) {
			NotificationChain msgs = null;
			if (hasInputPort != null)
				msgs = ((InternalEObject)hasInputPort).eInverseRemove(this, E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT, InputPort.class, msgs);
			if (newHasInputPort != null)
				msgs = ((InternalEObject)newHasInputPort).eInverseAdd(this, E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT, InputPort.class, msgs);
			msgs = basicSetHasInputPort(newHasInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT, newHasInputPort, newHasInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasOutputPorts()).basicAdd(otherEnd, msgs);
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				if (hasInputPort != null)
					msgs = ((InternalEObject)hasInputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT, null, msgs);
				return basicSetHasInputPort((InputPort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				return ((InternalEList<?>)getHasOutputPorts()).basicRemove(otherEnd, msgs);
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return basicSetHasInputPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				return getHasOutputPorts();
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return getHasInputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				getHasOutputPorts().clear();
				getHasOutputPorts().addAll((Collection<? extends OutputPort>)newValue);
				return;
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				setHasInputPort((InputPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				getHasOutputPorts().clear();
				return;
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				setHasInputPort((InputPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case E3valuePackage.FORK_ELEMENT__HAS_OUTPUT_PORTS:
				return hasOutputPorts != null && !hasOutputPorts.isEmpty();
			case E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return hasInputPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkElementImpl
