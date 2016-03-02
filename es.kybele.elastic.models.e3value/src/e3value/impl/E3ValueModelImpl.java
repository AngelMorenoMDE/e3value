/**
 */
package e3value.impl;

import e3value.BusinessActor;
import e3value.DependencyElement;
import e3value.E3ValueDiagram;
import e3value.E3ValueModel;
import e3value.E3valuePackage;
import e3value.ValueExchange;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E3 Value Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.E3ValueModelImpl#getHasValueExchanges <em>Has Value Exchanges</em>}</li>
 *   <li>{@link e3value.impl.E3ValueModelImpl#getInE3ValueDiagram <em>In E3 Value Diagram</em>}</li>
 *   <li>{@link e3value.impl.E3ValueModelImpl#getHasBusinessActors <em>Has Business Actors</em>}</li>
 *   <li>{@link e3value.impl.E3ValueModelImpl#getHasValueObjects <em>Has Value Objects</em>}</li>
 *   <li>{@link e3value.impl.E3ValueModelImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E3ValueModelImpl extends MinimalEObjectImpl.Container implements E3ValueModel {
	/**
	 * The cached value of the '{@link #getHasValueExchanges() <em>Has Value Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueExchange> hasValueExchanges;

	/**
	 * The cached value of the '{@link #getHasBusinessActors() <em>Has Business Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBusinessActors()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessActor> hasBusinessActors;

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
	protected E3ValueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.E3_VALUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessActor> getHasBusinessActors() {
		if (hasBusinessActors == null) {
			hasBusinessActors = new EObjectContainmentEList<BusinessActor>(BusinessActor.class, this, E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS);
		}
		return hasBusinessActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentEList<DependencyElement>(DependencyElement.class, this, E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS);
		}
		return hasDependenceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueExchange> getHasValueExchanges() {
		if (hasValueExchanges == null) {
			hasValueExchanges = new EObjectContainmentWithInverseEList<ValueExchange>(ValueExchange.class, this, E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES, E3valuePackage.VALUE_EXCHANGE__IN_E3_VALUE_MODEL);
		}
		return hasValueExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObject> getHasValueObjects() {
		if (hasValueObjects == null) {
			hasValueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this, E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS);
		}
		return hasValueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueDiagram getInE3ValueDiagram() {
		if (eContainerFeatureID() != E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM) return null;
		return (E3ValueDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInE3ValueDiagram(E3ValueDiagram newInE3ValueDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInE3ValueDiagram, E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInE3ValueDiagram(E3ValueDiagram newInE3ValueDiagram) {
		if (newInE3ValueDiagram != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM && newInE3ValueDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newInE3ValueDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInE3ValueDiagram != null)
				msgs = ((InternalEObject)newInE3ValueDiagram).eInverseAdd(this, E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS, E3ValueDiagram.class, msgs);
			msgs = basicSetInE3ValueDiagram(newInE3ValueDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM, newInE3ValueDiagram, newInE3ValueDiagram));
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasValueExchanges()).basicAdd(otherEnd, msgs);
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInE3ValueDiagram((E3ValueDiagram)otherEnd, msgs);
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				return ((InternalEList<?>)getHasValueExchanges()).basicRemove(otherEnd, msgs);
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				return basicSetInE3ValueDiagram(null, msgs);
			case E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
				return ((InternalEList<?>)getHasBusinessActors()).basicRemove(otherEnd, msgs);
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
				return ((InternalEList<?>)getHasValueObjects()).basicRemove(otherEnd, msgs);
			case E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
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
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS, E3ValueDiagram.class, msgs);
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				return getHasValueExchanges();
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				return getInE3ValueDiagram();
			case E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
				return getHasBusinessActors();
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
				return getHasValueObjects();
			case E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				getHasValueExchanges().clear();
				getHasValueExchanges().addAll((Collection<? extends ValueExchange>)newValue);
				return;
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				setInE3ValueDiagram((E3ValueDiagram)newValue);
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
				getHasBusinessActors().clear();
				getHasBusinessActors().addAll((Collection<? extends BusinessActor>)newValue);
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
				getHasValueObjects().clear();
				getHasValueObjects().addAll((Collection<? extends ValueObject>)newValue);
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				getHasValueExchanges().clear();
				return;
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				setInE3ValueDiagram((E3ValueDiagram)null);
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
				getHasBusinessActors().clear();
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
				getHasValueObjects().clear();
				return;
			case E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
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
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
				return hasValueExchanges != null && !hasValueExchanges.isEmpty();
			case E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM:
				return getInE3ValueDiagram() != null;
			case E3valuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
				return hasBusinessActors != null && !hasBusinessActors.isEmpty();
			case E3valuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
				return hasValueObjects != null && !hasValueObjects.isEmpty();
			case E3valuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
				return hasDependenceElements != null && !hasDependenceElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //E3ValueModelImpl
