/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ValueExchange;
import e3value.ValueObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValueObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link e3value.impl.ValueObjectImpl#getInValueExchange <em>In Value Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueObjectImpl extends MinimalEObjectImpl.Container implements ValueObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInValueExchange() <em>In Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange inValueExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange getInValueExchange() {
		if (inValueExchange != null && inValueExchange.eIsProxy()) {
			InternalEObject oldInValueExchange = (InternalEObject)inValueExchange;
			inValueExchange = (ValueExchange)eResolveProxy(oldInValueExchange);
			if (inValueExchange != oldInValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, oldInValueExchange, inValueExchange));
			}
		}
		return inValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetInValueExchange() {
		return inValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInValueExchange(ValueExchange newInValueExchange, NotificationChain msgs) {
		ValueExchange oldInValueExchange = inValueExchange;
		inValueExchange = newInValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, oldInValueExchange, newInValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValueExchange(ValueExchange newInValueExchange) {
		if (newInValueExchange != inValueExchange) {
			NotificationChain msgs = null;
			if (inValueExchange != null)
				msgs = ((InternalEObject)inValueExchange).eInverseRemove(this, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, ValueExchange.class, msgs);
			if (newInValueExchange != null)
				msgs = ((InternalEObject)newInValueExchange).eInverseAdd(this, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, ValueExchange.class, msgs);
			msgs = basicSetInValueExchange(newInValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, newInValueExchange, newInValueExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				if (inValueExchange != null)
					msgs = ((InternalEObject)inValueExchange).eInverseRemove(this, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, ValueExchange.class, msgs);
				return basicSetInValueExchange((ValueExchange)otherEnd, msgs);
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
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				return basicSetInValueExchange(null, msgs);
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
			case E3valuePackage.VALUE_OBJECT__NAME:
				return getName();
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				if (resolve) return getInValueExchange();
				return basicGetInValueExchange();
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
			case E3valuePackage.VALUE_OBJECT__NAME:
				setName((String)newValue);
				return;
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				setInValueExchange((ValueExchange)newValue);
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
			case E3valuePackage.VALUE_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				setInValueExchange((ValueExchange)null);
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
			case E3valuePackage.VALUE_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE:
				return inValueExchange != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValueObjectImpl
