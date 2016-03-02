/**
 */
package e3value.impl;

import e3value.BusinessActor;
import e3value.E3valuePackage;
import e3value.ResponsabilityElement;
import e3value.ValueActivity;
import e3value.ValueInterface;
import e3value.ValuePortIn;
import e3value.ValuePortOut;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValueInterfaceImpl#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.impl.ValueInterfaceImpl#getInValueActivity <em>In Value Activity</em>}</li>
 *   <li>{@link e3value.impl.ValueInterfaceImpl#getHasValuePortIn <em>Has Value Port In</em>}</li>
 *   <li>{@link e3value.impl.ValueInterfaceImpl#getHasValuePortOut <em>Has Value Port Out</em>}</li>
 *   <li>{@link e3value.impl.ValueInterfaceImpl#getBindsResponsabilityElement <em>Binds Responsability Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueInterfaceImpl extends MinimalEObjectImpl.Container implements ValueInterface {
	/**
	 * The cached value of the '{@link #getHasValuePortIn() <em>Has Value Port In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortIn()
	 * @generated
	 * @ordered
	 */
	protected ValuePortIn hasValuePortIn;

	/**
	 * The cached value of the '{@link #getHasValuePortOut() <em>Has Value Port Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortOut()
	 * @generated
	 * @ordered
	 */
	protected ValuePortOut hasValuePortOut;

	/**
	 * The cached value of the '{@link #getBindsResponsabilityElement() <em>Binds Responsability Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsResponsabilityElement()
	 * @generated
	 * @ordered
	 */
	protected ResponsabilityElement bindsResponsabilityElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActor getInBusinessActor() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR) return null;
		return (BusinessActor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInBusinessActor(BusinessActor newInBusinessActor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInBusinessActor, E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBusinessActor(BusinessActor newInBusinessActor) {
		if (newInBusinessActor != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR && newInBusinessActor != null)) {
			if (EcoreUtil.isAncestor(this, newInBusinessActor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInBusinessActor != null)
				msgs = ((InternalEObject)newInBusinessActor).eInverseAdd(this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES, BusinessActor.class, msgs);
			msgs = basicSetInBusinessActor(newInBusinessActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR, newInBusinessActor, newInBusinessActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueActivity getInValueActivity() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY) return null;
		return (ValueActivity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInValueActivity(ValueActivity newInValueActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInValueActivity, E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValueActivity(ValueActivity newInValueActivity) {
		if (newInValueActivity != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY && newInValueActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInValueActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInValueActivity != null)
				msgs = ((InternalEObject)newInValueActivity).eInverseAdd(this, E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES, ValueActivity.class, msgs);
			msgs = basicSetInValueActivity(newInValueActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY, newInValueActivity, newInValueActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortIn getHasValuePortIn() {
		return hasValuePortIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValuePortIn(ValuePortIn newHasValuePortIn, NotificationChain msgs) {
		ValuePortIn oldHasValuePortIn = hasValuePortIn;
		hasValuePortIn = newHasValuePortIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, oldHasValuePortIn, newHasValuePortIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValuePortIn(ValuePortIn newHasValuePortIn) {
		if (newHasValuePortIn != hasValuePortIn) {
			NotificationChain msgs = null;
			if (hasValuePortIn != null)
				msgs = ((InternalEObject)hasValuePortIn).eInverseRemove(this, E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE, ValuePortIn.class, msgs);
			if (newHasValuePortIn != null)
				msgs = ((InternalEObject)newHasValuePortIn).eInverseAdd(this, E3valuePackage.VALUE_PORT_IN__IN_VALUE_INTERFACE, ValuePortIn.class, msgs);
			msgs = basicSetHasValuePortIn(newHasValuePortIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, newHasValuePortIn, newHasValuePortIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortOut getHasValuePortOut() {
		return hasValuePortOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValuePortOut(ValuePortOut newHasValuePortOut, NotificationChain msgs) {
		ValuePortOut oldHasValuePortOut = hasValuePortOut;
		hasValuePortOut = newHasValuePortOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, oldHasValuePortOut, newHasValuePortOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValuePortOut(ValuePortOut newHasValuePortOut) {
		if (newHasValuePortOut != hasValuePortOut) {
			NotificationChain msgs = null;
			if (hasValuePortOut != null)
				msgs = ((InternalEObject)hasValuePortOut).eInverseRemove(this, E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE, ValuePortOut.class, msgs);
			if (newHasValuePortOut != null)
				msgs = ((InternalEObject)newHasValuePortOut).eInverseAdd(this, E3valuePackage.VALUE_PORT_OUT__IN_VALUE_INTERFACE, ValuePortOut.class, msgs);
			msgs = basicSetHasValuePortOut(newHasValuePortOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, newHasValuePortOut, newHasValuePortOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsabilityElement getBindsResponsabilityElement() {
		return bindsResponsabilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement, NotificationChain msgs) {
		ResponsabilityElement oldBindsResponsabilityElement = bindsResponsabilityElement;
		bindsResponsabilityElement = newBindsResponsabilityElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, oldBindsResponsabilityElement, newBindsResponsabilityElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement) {
		if (newBindsResponsabilityElement != bindsResponsabilityElement) {
			NotificationChain msgs = null;
			if (bindsResponsabilityElement != null)
				msgs = ((InternalEObject)bindsResponsabilityElement).eInverseRemove(this, E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE, ResponsabilityElement.class, msgs);
			if (newBindsResponsabilityElement != null)
				msgs = ((InternalEObject)newBindsResponsabilityElement).eInverseAdd(this, E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE, ResponsabilityElement.class, msgs);
			msgs = basicSetBindsResponsabilityElement(newBindsResponsabilityElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, newBindsResponsabilityElement, newBindsResponsabilityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInBusinessActor((BusinessActor)otherEnd, msgs);
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInValueActivity((ValueActivity)otherEnd, msgs);
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				if (hasValuePortIn != null)
					msgs = ((InternalEObject)hasValuePortIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, null, msgs);
				return basicSetHasValuePortIn((ValuePortIn)otherEnd, msgs);
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				if (hasValuePortOut != null)
					msgs = ((InternalEObject)hasValuePortOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, null, msgs);
				return basicSetHasValuePortOut((ValuePortOut)otherEnd, msgs);
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				if (bindsResponsabilityElement != null)
					msgs = ((InternalEObject)bindsResponsabilityElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, null, msgs);
				return basicSetBindsResponsabilityElement((ResponsabilityElement)otherEnd, msgs);
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				return basicSetInBusinessActor(null, msgs);
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				return basicSetInValueActivity(null, msgs);
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return basicSetHasValuePortIn(null, msgs);
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return basicSetHasValuePortOut(null, msgs);
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return basicSetBindsResponsabilityElement(null, msgs);
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES, BusinessActor.class, msgs);
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES, ValueActivity.class, msgs);
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				return getInBusinessActor();
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				return getInValueActivity();
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return getHasValuePortIn();
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return getHasValuePortOut();
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return getBindsResponsabilityElement();
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)newValue);
				return;
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				setInValueActivity((ValueActivity)newValue);
				return;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				setHasValuePortIn((ValuePortIn)newValue);
				return;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				setHasValuePortOut((ValuePortOut)newValue);
				return;
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				setBindsResponsabilityElement((ResponsabilityElement)newValue);
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)null);
				return;
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				setInValueActivity((ValueActivity)null);
				return;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				setHasValuePortIn((ValuePortIn)null);
				return;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				setHasValuePortOut((ValuePortOut)null);
				return;
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				setBindsResponsabilityElement((ResponsabilityElement)null);
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
			case E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR:
				return getInBusinessActor() != null;
			case E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY:
				return getInValueActivity() != null;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return hasValuePortIn != null;
			case E3valuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return hasValuePortOut != null;
			case E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return bindsResponsabilityElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueInterfaceImpl
