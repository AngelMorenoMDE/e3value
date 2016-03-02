/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.InputPort;
import e3value.JoinElement;
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
 * An implementation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.JoinElementImpl#getHasInputPorts <em>Has Input Ports</em>}</li>
 *   <li>{@link e3value.impl.JoinElementImpl#getHasOutputPort <em>Has Output Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JoinElementImpl extends LogicalElementImpl implements JoinElement {
	/**
	 * The cached value of the '{@link #getHasInputPorts() <em>Has Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> hasInputPorts;

	/**
	 * The cached value of the '{@link #getHasOutputPort() <em>Has Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort hasOutputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.JOIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getHasInputPorts() {
		if (hasInputPorts == null) {
			hasInputPorts = new EObjectContainmentWithInverseEList<InputPort>(InputPort.class, this, E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS, E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT);
		}
		return hasInputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getHasOutputPort() {
		return hasOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOutputPort(OutputPort newHasOutputPort, NotificationChain msgs) {
		OutputPort oldHasOutputPort = hasOutputPort;
		hasOutputPort = newHasOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, oldHasOutputPort, newHasOutputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOutputPort(OutputPort newHasOutputPort) {
		if (newHasOutputPort != hasOutputPort) {
			NotificationChain msgs = null;
			if (hasOutputPort != null)
				msgs = ((InternalEObject)hasOutputPort).eInverseRemove(this, E3valuePackage.OUTPUT_PORT__IN_JOIN_ELEMENT, OutputPort.class, msgs);
			if (newHasOutputPort != null)
				msgs = ((InternalEObject)newHasOutputPort).eInverseAdd(this, E3valuePackage.OUTPUT_PORT__IN_JOIN_ELEMENT, OutputPort.class, msgs);
			msgs = basicSetHasOutputPort(newHasOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, newHasOutputPort, newHasOutputPort));
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInputPorts()).basicAdd(otherEnd, msgs);
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				if (hasOutputPort != null)
					msgs = ((InternalEObject)hasOutputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, null, msgs);
				return basicSetHasOutputPort((OutputPort)otherEnd, msgs);
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				return ((InternalEList<?>)getHasInputPorts()).basicRemove(otherEnd, msgs);
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return basicSetHasOutputPort(null, msgs);
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				return getHasInputPorts();
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return getHasOutputPort();
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				getHasInputPorts().clear();
				getHasInputPorts().addAll((Collection<? extends InputPort>)newValue);
				return;
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				setHasOutputPort((OutputPort)newValue);
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				getHasInputPorts().clear();
				return;
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				setHasOutputPort((OutputPort)null);
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
			case E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS:
				return hasInputPorts != null && !hasInputPorts.isEmpty();
			case E3valuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return hasOutputPort != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinElementImpl
