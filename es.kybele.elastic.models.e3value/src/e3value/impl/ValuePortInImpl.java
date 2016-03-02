/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ValueExchange;
import e3value.ValueInterface;
import e3value.ValuePortIn;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Port In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValuePortInImpl#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}</li>
 *   <li>{@link e3value.impl.ValuePortInImpl#getInValueInterface <em>In Value Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePortInImpl extends ValuePortImpl implements ValuePortIn {
	/**
	 * The cached value of the '{@link #getInConnectWithValueExchange() <em>In Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInConnectWithValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange inConnectWithValueExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_PORT_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange getInConnectWithValueExchange() {
		if (inConnectWithValueExchange != null && inConnectWithValueExchange.eIsProxy()) {
			InternalEObject oldInConnectWithValueExchange = (InternalEObject)inConnectWithValueExchange;
			inConnectWithValueExchange = (ValueExchange)eResolveProxy(oldInConnectWithValueExchange);
			if (inConnectWithValueExchange != oldInConnectWithValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE, oldInConnectWithValueExchange, inConnectWithValueExchange));
			}
		}
		return inConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetInConnectWithValueExchange() {
		return inConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInConnectWithValueExchange(ValueExchange newInConnectWithValueExchange) {
		ValueExchange oldInConnectWithValueExchange = inConnectWithValueExchange;
		inConnectWithValueExchange = newInConnectWithValueExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE, oldInConnectWithValueExchange, inConnectWithValueExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterface getInValueInterface() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE) return null;
		return (ValueInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInValueInterface(ValueInterface newInValueInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInValueInterface, E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValueInterface(ValueInterface newInValueInterface) {
		if (newInValueInterface != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE && newInValueInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInValueInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInValueInterface != null)
				msgs = ((InternalEObject)newInValueInterface).eInverseAdd(this, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, ValueInterface.class, msgs);
			msgs = basicSetInValueInterface(newInValueInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE, newInValueInterface, newInValueInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInValueInterface((ValueInterface)otherEnd, msgs);
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
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				return basicSetInValueInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, ValueInterface.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				if (resolve) return getInConnectWithValueExchange();
				return basicGetInConnectWithValueExchange();
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				return getInValueInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				setInConnectWithValueExchange((ValueExchange)newValue);
				return;
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				setInValueInterface((ValueInterface)newValue);
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
			case E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				setInConnectWithValueExchange((ValueExchange)null);
				return;
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				setInValueInterface((ValueInterface)null);
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
			case E3valuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				return inConnectWithValueExchange != null;
			case E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE:
				return getInValueInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePortInImpl
