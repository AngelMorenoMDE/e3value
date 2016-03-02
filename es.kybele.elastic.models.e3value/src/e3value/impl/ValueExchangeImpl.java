/**
 */
package e3value.impl;

import e3value.E3ValueModel;
import e3value.E3valuePackage;
import e3value.ValueExchange;
import e3value.ValueObject;
import e3value.ValuePort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValueExchangeImpl#getSourceValuePort <em>Source Value Port</em>}</li>
 *   <li>{@link e3value.impl.ValueExchangeImpl#getTargetValuePort <em>Target Value Port</em>}</li>
 *   <li>{@link e3value.impl.ValueExchangeImpl#getHasValueObject <em>Has Value Object</em>}</li>
 *   <li>{@link e3value.impl.ValueExchangeImpl#getInE3ValueModel <em>In E3 Value Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueExchangeImpl extends MinimalEObjectImpl.Container implements ValueExchange {
	/**
	 * The cached value of the '{@link #getSourceValuePort() <em>Source Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceValuePort()
	 * @generated
	 * @ordered
	 */
	protected ValuePort sourceValuePort;

	/**
	 * The cached value of the '{@link #getTargetValuePort() <em>Target Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValuePort()
	 * @generated
	 * @ordered
	 */
	protected ValuePort targetValuePort;

	/**
	 * The cached value of the '{@link #getHasValueObject() <em>Has Value Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueObject()
	 * @generated
	 * @ordered
	 */
	protected ValueObject hasValueObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort getSourceValuePort() {
		if (sourceValuePort != null && sourceValuePort.eIsProxy()) {
			InternalEObject oldSourceValuePort = (InternalEObject)sourceValuePort;
			sourceValuePort = (ValuePort)eResolveProxy(oldSourceValuePort);
			if (sourceValuePort != oldSourceValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT, oldSourceValuePort, sourceValuePort));
			}
		}
		return sourceValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort basicGetSourceValuePort() {
		return sourceValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceValuePort(ValuePort newSourceValuePort) {
		ValuePort oldSourceValuePort = sourceValuePort;
		sourceValuePort = newSourceValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT, oldSourceValuePort, sourceValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort getTargetValuePort() {
		if (targetValuePort != null && targetValuePort.eIsProxy()) {
			InternalEObject oldTargetValuePort = (InternalEObject)targetValuePort;
			targetValuePort = (ValuePort)eResolveProxy(oldTargetValuePort);
			if (targetValuePort != oldTargetValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT, oldTargetValuePort, targetValuePort));
			}
		}
		return targetValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort basicGetTargetValuePort() {
		return targetValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValuePort(ValuePort newTargetValuePort) {
		ValuePort oldTargetValuePort = targetValuePort;
		targetValuePort = newTargetValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT, oldTargetValuePort, targetValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject getHasValueObject() {
		if (hasValueObject != null && hasValueObject.eIsProxy()) {
			InternalEObject oldHasValueObject = (InternalEObject)hasValueObject;
			hasValueObject = (ValueObject)eResolveProxy(oldHasValueObject);
			if (hasValueObject != oldHasValueObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, oldHasValueObject, hasValueObject));
			}
		}
		return hasValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject basicGetHasValueObject() {
		return hasValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValueObject(ValueObject newHasValueObject, NotificationChain msgs) {
		ValueObject oldHasValueObject = hasValueObject;
		hasValueObject = newHasValueObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, oldHasValueObject, newHasValueObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValueObject(ValueObject newHasValueObject) {
		if (newHasValueObject != hasValueObject) {
			NotificationChain msgs = null;
			if (hasValueObject != null)
				msgs = ((InternalEObject)hasValueObject).eInverseRemove(this, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, ValueObject.class, msgs);
			if (newHasValueObject != null)
				msgs = ((InternalEObject)newHasValueObject).eInverseAdd(this, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, ValueObject.class, msgs);
			msgs = basicSetHasValueObject(newHasValueObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT, newHasValueObject, newHasValueObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueModel getInE3ValueModel() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL) return null;
		return (E3ValueModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInE3ValueModel(E3ValueModel newInE3ValueModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInE3ValueModel, E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInE3ValueModel(E3ValueModel newInE3ValueModel) {
		if (newInE3ValueModel != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL && newInE3ValueModel != null)) {
			if (EcoreUtil.isAncestor(this, newInE3ValueModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInE3ValueModel != null)
				msgs = ((InternalEObject)newInE3ValueModel).eInverseAdd(this, E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES, E3ValueModel.class, msgs);
			msgs = basicSetInE3ValueModel(newInE3ValueModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL, newInE3ValueModel, newInE3ValueModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				if (hasValueObject != null)
					msgs = ((InternalEObject)hasValueObject).eInverseRemove(this, E3valuePackage.VALUE_OBJECT__IN_VALUE_EXCHANGE, ValueObject.class, msgs);
				return basicSetHasValueObject((ValueObject)otherEnd, msgs);
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInE3ValueModel((E3ValueModel)otherEnd, msgs);
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
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				return basicSetHasValueObject(null, msgs);
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				return basicSetInE3ValueModel(null, msgs);
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
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES, E3ValueModel.class, msgs);
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
			case E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				if (resolve) return getSourceValuePort();
				return basicGetSourceValuePort();
			case E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				if (resolve) return getTargetValuePort();
				return basicGetTargetValuePort();
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				if (resolve) return getHasValueObject();
				return basicGetHasValueObject();
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				return getInE3ValueModel();
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
			case E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				setSourceValuePort((ValuePort)newValue);
				return;
			case E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				setTargetValuePort((ValuePort)newValue);
				return;
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				setHasValueObject((ValueObject)newValue);
				return;
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				setInE3ValueModel((E3ValueModel)newValue);
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
			case E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				setSourceValuePort((ValuePort)null);
				return;
			case E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				setTargetValuePort((ValuePort)null);
				return;
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				setHasValueObject((ValueObject)null);
				return;
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				setInE3ValueModel((E3ValueModel)null);
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
			case E3valuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				return sourceValuePort != null;
			case E3valuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				return targetValuePort != null;
			case E3valuePackage.VALUE_EXCHANGE__HAS_VALUE_OBJECT:
				return hasValueObject != null;
			case E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL:
				return getInE3ValueModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueExchangeImpl
