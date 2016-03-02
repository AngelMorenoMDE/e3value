/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ValueExchange;
import e3value.ValueInterface;
import e3value.ValuePortOut;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Port Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValuePortOutImpl#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}</li>
 *   <li>{@link e3value.impl.ValuePortOutImpl#getInValueInterface <em>In Value Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePortOutImpl extends ValuePortImpl implements ValuePortOut {
	/**
	 * The cached value of the '{@link #getOutConnectWithValueExchange() <em>Out Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutConnectWithValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange outConnectWithValueExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_PORT_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange getOutConnectWithValueExchange() {
		if (outConnectWithValueExchange != null && outConnectWithValueExchange.eIsProxy()) {
			InternalEObject oldOutConnectWithValueExchange = (InternalEObject)outConnectWithValueExchange;
			outConnectWithValueExchange = (ValueExchange)eResolveProxy(oldOutConnectWithValueExchange);
			if (outConnectWithValueExchange != oldOutConnectWithValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE, oldOutConnectWithValueExchange, outConnectWithValueExchange));
			}
		}
		return outConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetOutConnectWithValueExchange() {
		return outConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutConnectWithValueExchange(ValueExchange newOutConnectWithValueExchange) {
		ValueExchange oldOutConnectWithValueExchange = outConnectWithValueExchange;
		outConnectWithValueExchange = newOutConnectWithValueExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE, oldOutConnectWithValueExchange, outConnectWithValueExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterface getInValueInterface() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE) return null;
		return (ValueInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInValueInterface(ValueInterface newInValueInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInValueInterface, E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValueInterface(ValueInterface newInValueInterface) {
		if (newInValueInterface != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE && newInValueInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInValueInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInValueInterface != null)
				msgs = ((InternalEObject)newInValueInterface).eInverseAdd(this, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, ValueInterface.class, msgs);
			msgs = basicSetInValueInterface(newInValueInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE, newInValueInterface, newInValueInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
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
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
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
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, ValueInterface.class, msgs);
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
			case E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				if (resolve) return getOutConnectWithValueExchange();
				return basicGetOutConnectWithValueExchange();
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
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
			case E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				setOutConnectWithValueExchange((ValueExchange)newValue);
				return;
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
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
			case E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				setOutConnectWithValueExchange((ValueExchange)null);
				return;
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
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
			case E3valuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				return outConnectWithValueExchange != null;
			case E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE:
				return getInValueInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePortOutImpl
