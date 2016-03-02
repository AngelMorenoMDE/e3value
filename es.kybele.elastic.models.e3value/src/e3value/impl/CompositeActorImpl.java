/**
 */
package e3value.impl;

import e3value.CompositeActor;
import e3value.E3valuePackage;

import e3value.ElementaryActor;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.CompositeActorImpl#getHasElementaryActors <em>Has Elementary Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeActorImpl extends ActorImpl implements CompositeActor {
	/**
	 * The cached value of the '{@link #getHasElementaryActors() <em>Has Elementary Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElementaryActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryActor> hasElementaryActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.COMPOSITE_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryActor> getHasElementaryActors() {
		if (hasElementaryActors == null) {
			hasElementaryActors = new EObjectContainmentEList<ElementaryActor>(ElementaryActor.class, this, E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS);
		}
		return hasElementaryActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS:
				return ((InternalEList<?>)getHasElementaryActors()).basicRemove(otherEnd, msgs);
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
			case E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS:
				return getHasElementaryActors();
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
			case E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS:
				getHasElementaryActors().clear();
				getHasElementaryActors().addAll((Collection<? extends ElementaryActor>)newValue);
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
			case E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS:
				getHasElementaryActors().clear();
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
			case E3valuePackage.COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS:
				return hasElementaryActors != null && !hasElementaryActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeActorImpl
