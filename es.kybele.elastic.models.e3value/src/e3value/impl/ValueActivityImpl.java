/**
 */
package e3value.impl;

import e3value.BusinessActor;
import e3value.DependencyElement;
import e3value.E3valuePackage;
import e3value.StimulusElement;
import e3value.ValueActivity;
import e3value.ValueInterface;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ValueActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link e3value.impl.ValueActivityImpl#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.impl.ValueActivityImpl#getHasValueInterfaces <em>Has Value Interfaces</em>}</li>
 *   <li>{@link e3value.impl.ValueActivityImpl#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3value.impl.ValueActivityImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueActivityImpl extends MinimalEObjectImpl.Container implements ValueActivity {
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
	 * The cached value of the '{@link #getHasStimulusElement() <em>Has Stimulus Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStimulusElement()
	 * @generated
	 * @ordered
	 */
	protected EList<StimulusElement> hasStimulusElement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.VALUE_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActor getInBusinessActor() {
		if (eContainerFeatureID() != E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR) return null;
		return (BusinessActor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInBusinessActor(BusinessActor newInBusinessActor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInBusinessActor, E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBusinessActor(BusinessActor newInBusinessActor) {
		if (newInBusinessActor != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR && newInBusinessActor != null)) {
			if (EcoreUtil.isAncestor(this, newInBusinessActor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInBusinessActor != null)
				msgs = ((InternalEObject)newInBusinessActor).eInverseAdd(this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES, BusinessActor.class, msgs);
			msgs = basicSetInBusinessActor(newInBusinessActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR, newInBusinessActor, newInBusinessActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueInterface> getHasValueInterfaces() {
		if (hasValueInterfaces == null) {
			hasValueInterfaces = new EObjectContainmentWithInverseEList<ValueInterface>(ValueInterface.class, this, E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES, E3valuePackage.VALUE_INTERFACE__IN_VALUE_ACTIVITY);
		}
		return hasValueInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StimulusElement> getHasStimulusElement() {
		if (hasStimulusElement == null) {
			hasStimulusElement = new EObjectResolvingEList<StimulusElement>(StimulusElement.class, this, E3valuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT);
		}
		return hasStimulusElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentWithInverseEList<DependencyElement>(DependencyElement.class, this, E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS, E3valuePackage.DEPENDENCY_ELEMENT__IN_VALUE_ACTIVITY);
		}
		return hasDependenceElements;
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
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInBusinessActor((BusinessActor)otherEnd, msgs);
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasValueInterfaces()).basicAdd(otherEnd, msgs);
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
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
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				return basicSetInBusinessActor(null, msgs);
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				return ((InternalEList<?>)getHasValueInterfaces()).basicRemove(otherEnd, msgs);
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return ((InternalEList<?>)getHasDependenceElements()).basicRemove(otherEnd, msgs);
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
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES, BusinessActor.class, msgs);
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
			case E3valuePackage.VALUE_ACTIVITY__NAME:
				return getName();
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				return getInBusinessActor();
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				return getHasValueInterfaces();
			case E3valuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				return getHasStimulusElement();
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return getHasDependenceElements();
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
			case E3valuePackage.VALUE_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)newValue);
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				getHasValueInterfaces().clear();
				getHasValueInterfaces().addAll((Collection<? extends ValueInterface>)newValue);
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				getHasStimulusElement().addAll((Collection<? extends StimulusElement>)newValue);
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				getHasDependenceElements().addAll((Collection<? extends DependencyElement>)newValue);
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
			case E3valuePackage.VALUE_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				setInBusinessActor((BusinessActor)null);
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				getHasValueInterfaces().clear();
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				return;
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
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
			case E3valuePackage.VALUE_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E3valuePackage.VALUE_ACTIVITY__IN_BUSINESS_ACTOR:
				return getInBusinessActor() != null;
			case E3valuePackage.VALUE_ACTIVITY__HAS_VALUE_INTERFACES:
				return hasValueInterfaces != null && !hasValueInterfaces.isEmpty();
			case E3valuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				return hasStimulusElement != null && !hasStimulusElement.isEmpty();
			case E3valuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return hasDependenceElements != null && !hasDependenceElements.isEmpty();
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

} //ValueActivityImpl
