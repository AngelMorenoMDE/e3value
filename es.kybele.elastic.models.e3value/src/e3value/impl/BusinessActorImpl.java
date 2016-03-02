/**
 */
package e3value.impl;

import e3value.BusinessActor;
import e3value.DependencyElement;
import e3value.E3valuePackage;
import e3value.StimulusElement;
import e3value.ValueActivity;
import e3value.ValueInterface;

import e3value.ValueObject;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.BusinessActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link e3value.impl.BusinessActorImpl#getHasValueInterfaces <em>Has Value Interfaces</em>}</li>
 *   <li>{@link e3value.impl.BusinessActorImpl#getHasValueActivities <em>Has Value Activities</em>}</li>
 *   <li>{@link e3value.impl.BusinessActorImpl#getHasStimulusElements <em>Has Stimulus Elements</em>}</li>
 *   <li>{@link e3value.impl.BusinessActorImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3value.impl.BusinessActorImpl#getHasValueObjects <em>Has Value Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BusinessActorImpl extends MinimalEObjectImpl.Container implements BusinessActor {
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
	 * The cached value of the '{@link #getHasValueInterfaces() <em>Has Value Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueInterface> hasValueInterfaces;

	/**
	 * The cached value of the '{@link #getHasValueActivities() <em>Has Value Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueActivity> hasValueActivities;

	/**
	 * The cached value of the '{@link #getHasStimulusElements() <em>Has Stimulus Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStimulusElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StimulusElement> hasStimulusElements;

	/**
	 * The cached value of the '{@link #getHasDependenceElements() <em>Has Dependence Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDependenceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyElement> hasDependenceElements;

	/**
	 * The cached value of the '{@link #getHasValueObjects() <em>Has Value Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueObject> hasValueObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.BUSINESS_ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.BUSINESS_ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueInterface> getHasValueInterfaces() {
		if (hasValueInterfaces == null) {
			hasValueInterfaces = new EObjectContainmentWithInverseEList<ValueInterface>(ValueInterface.class, this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES, E3valuePackage.VALUE_INTERFACE__IN_BUSINESS_ACTOR);
		}
		return hasValueInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueActivity> getHasValueActivities() {
		if (hasValueActivities == null) {
			hasValueActivities = new EObjectContainmentWithInverseEList<ValueActivity>(ValueActivity.class, this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES, E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR);
		}
		return hasValueActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StimulusElement> getHasStimulusElements() {
		if (hasStimulusElements == null) {
			hasStimulusElements = new EObjectContainmentEList<StimulusElement>(StimulusElement.class, this, E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS);
		}
		return hasStimulusElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentWithInverseEList<DependencyElement>(DependencyElement.class, this, E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS, E3valuePackage.DEPENDENCY_ELEMENT__IN_BUSINESS_ACTOR);
		}
		return hasDependenceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObject> getHasValueObjects() {
		if (hasValueObjects == null) {
			hasValueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS);
		}
		return hasValueObjects;
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
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasValueInterfaces()).basicAdd(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasValueActivities()).basicAdd(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependenceElements()).basicAdd(otherEnd, msgs);
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
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				return ((InternalEList<?>)getHasValueInterfaces()).basicRemove(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return ((InternalEList<?>)getHasValueActivities()).basicRemove(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
				return ((InternalEList<?>)getHasStimulusElements()).basicRemove(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return ((InternalEList<?>)getHasDependenceElements()).basicRemove(otherEnd, msgs);
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				return ((InternalEList<?>)getHasValueObjects()).basicRemove(otherEnd, msgs);
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
			case E3valuePackage.BUSINESS_ACTOR__NAME:
				return getName();
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				return getHasValueInterfaces();
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return getHasValueActivities();
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
				return getHasStimulusElements();
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return getHasDependenceElements();
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				return getHasValueObjects();
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
			case E3valuePackage.BUSINESS_ACTOR__NAME:
				setName((String)newValue);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				getHasValueInterfaces().clear();
				getHasValueInterfaces().addAll((Collection<? extends ValueInterface>)newValue);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				getHasValueActivities().clear();
				getHasValueActivities().addAll((Collection<? extends ValueActivity>)newValue);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
				getHasStimulusElements().clear();
				getHasStimulusElements().addAll((Collection<? extends StimulusElement>)newValue);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				getHasDependenceElements().addAll((Collection<? extends DependencyElement>)newValue);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				getHasValueObjects().clear();
				getHasValueObjects().addAll((Collection<? extends ValueObject>)newValue);
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
			case E3valuePackage.BUSINESS_ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				getHasValueInterfaces().clear();
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				getHasValueActivities().clear();
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
				getHasStimulusElements().clear();
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				getHasValueObjects().clear();
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
			case E3valuePackage.BUSINESS_ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
				return hasValueInterfaces != null && !hasValueInterfaces.isEmpty();
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return hasValueActivities != null && !hasValueActivities.isEmpty();
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
				return hasStimulusElements != null && !hasStimulusElements.isEmpty();
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return hasDependenceElements != null && !hasDependenceElements.isEmpty();
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				return hasValueObjects != null && !hasValueObjects.isEmpty();
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

} //BusinessActorImpl
