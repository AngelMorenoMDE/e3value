/**
 */
package e3value.impl;

import e3value.BusinessActor;
import e3value.DependencyElement;
import e3value.E3valuePackage;

import e3value.ValueActivity;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.DependencyElementImpl#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.impl.DependencyElementImpl#getInValueActivity <em>In Value Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DependencyElementImpl extends MinimalEObjectImpl.Container implements DependencyElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.DEPENDENCY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActor getInBusinessActor() {
		if (eContainerFeatureID() != E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR) return null;
		return (BusinessActor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInBusinessActor(BusinessActor newInBusinessActor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInBusinessActor, E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBusinessActor(BusinessActor newInBusinessActor) {
		if (newInBusinessActor != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR && newInBusinessActor != null)) {
			if (EcoreUtil.isAncestor(this, newInBusinessActor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInBusinessActor != null)
				msgs = ((InternalEObject)newInBusinessActor).eInverseAdd(this, E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS, BusinessActor.class, msgs);
			msgs = basicSetInBusinessActor(newInBusinessActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR, newInBusinessActor, newInBusinessActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueActivity getInValueActivity() {
		if (eContainerFeatureID() != E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY) return null;
		return (ValueActivity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInValueActivity(ValueActivity newInValueActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInValueActivity, E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValueActivity(ValueActivity newInValueActivity) {
		if (newInValueActivity != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY && newInValueActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInValueActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInValueActivity != null)
				msgs = ((InternalEObject)newInValueActivity).eInverseAdd(this, E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS, ValueActivity.class, msgs);
			msgs = basicSetInValueActivity(newInValueActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY, newInValueActivity, newInValueActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInBusinessActor((BusinessActor)otherEnd, msgs);
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInValueActivity((ValueActivity)otherEnd, msgs);
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				return basicSetInBusinessActor(null, msgs);
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				return basicSetInValueActivity(null, msgs);
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS, BusinessActor.class, msgs);
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS, ValueActivity.class, msgs);
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				return getInBusinessActor();
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				return getInValueActivity();
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)newValue);
				return;
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				setInValueActivity((ValueActivity)newValue);
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)null);
				return;
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				setInValueActivity((ValueActivity)null);
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
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR:
				return getInBusinessActor() != null;
			case E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY:
				return getInValueActivity() != null;
		}
		return super.eIsSet(featureID);
	}

} //DependencyElementImpl
