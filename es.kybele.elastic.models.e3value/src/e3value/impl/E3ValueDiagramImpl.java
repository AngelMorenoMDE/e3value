/**
 */
package e3value.impl;

import e3value.E3ValueDiagram;
import e3value.E3ValueModel;
import e3value.E3valuePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>E3 Value Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.E3ValueDiagramImpl#getHasE3ValueModels <em>Has E3 Value Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E3ValueDiagramImpl extends MinimalEObjectImpl.Container implements E3ValueDiagram {
	/**
	 * The cached value of the '{@link #getHasE3ValueModels() <em>Has E3 Value Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasE3ValueModels()
	 * @generated
	 * @ordered
	 */
	protected EList<E3ValueModel> hasE3ValueModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.E3_VALUE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<E3ValueModel> getHasE3ValueModels() {
		if (hasE3ValueModels == null) {
			hasE3ValueModels = new EObjectContainmentWithInverseEList<E3ValueModel>(E3ValueModel.class, this, E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS, E3valuePackage.E3_VALUE_MODEL__IN_E3_VALUE_DIAGRAM);
		}
		return hasE3ValueModels;
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasE3ValueModels()).basicAdd(otherEnd, msgs);
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				return ((InternalEList<?>)getHasE3ValueModels()).basicRemove(otherEnd, msgs);
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				return getHasE3ValueModels();
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				getHasE3ValueModels().clear();
				getHasE3ValueModels().addAll((Collection<? extends E3ValueModel>)newValue);
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				getHasE3ValueModels().clear();
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
			case E3valuePackage.E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS:
				return hasE3ValueModels != null && !hasE3ValueModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //E3ValueDiagramImpl
