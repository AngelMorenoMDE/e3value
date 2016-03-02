/**
 */
package e3value.impl;

import e3value.ConnectionElement;
import e3value.DependencyElement;
import e3value.E3valuePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ConnectionElementImpl#getSourceDependenceElement <em>Source Dependence Element</em>}</li>
 *   <li>{@link e3value.impl.ConnectionElementImpl#getTargetDependenceElement <em>Target Dependence Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionElementImpl extends DependencyElementImpl implements ConnectionElement {
	/**
	 * The cached value of the '{@link #getSourceDependenceElement() <em>Source Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDependenceElement()
	 * @generated
	 * @ordered
	 */
	protected DependencyElement sourceDependenceElement;

	/**
	 * The cached value of the '{@link #getTargetDependenceElement() <em>Target Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDependenceElement()
	 * @generated
	 * @ordered
	 */
	protected DependencyElement targetDependenceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.CONNECTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyElement getSourceDependenceElement() {
		if (sourceDependenceElement != null && sourceDependenceElement.eIsProxy()) {
			InternalEObject oldSourceDependenceElement = (InternalEObject)sourceDependenceElement;
			sourceDependenceElement = (DependencyElement)eResolveProxy(oldSourceDependenceElement);
			if (sourceDependenceElement != oldSourceDependenceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT, oldSourceDependenceElement, sourceDependenceElement));
			}
		}
		return sourceDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyElement basicGetSourceDependenceElement() {
		return sourceDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDependenceElement(DependencyElement newSourceDependenceElement) {
		DependencyElement oldSourceDependenceElement = sourceDependenceElement;
		sourceDependenceElement = newSourceDependenceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT, oldSourceDependenceElement, sourceDependenceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyElement getTargetDependenceElement() {
		if (targetDependenceElement != null && targetDependenceElement.eIsProxy()) {
			InternalEObject oldTargetDependenceElement = (InternalEObject)targetDependenceElement;
			targetDependenceElement = (DependencyElement)eResolveProxy(oldTargetDependenceElement);
			if (targetDependenceElement != oldTargetDependenceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT, oldTargetDependenceElement, targetDependenceElement));
			}
		}
		return targetDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyElement basicGetTargetDependenceElement() {
		return targetDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDependenceElement(DependencyElement newTargetDependenceElement) {
		DependencyElement oldTargetDependenceElement = targetDependenceElement;
		targetDependenceElement = newTargetDependenceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT, oldTargetDependenceElement, targetDependenceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				if (resolve) return getSourceDependenceElement();
				return basicGetSourceDependenceElement();
			case E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				if (resolve) return getTargetDependenceElement();
				return basicGetTargetDependenceElement();
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
			case E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				setSourceDependenceElement((DependencyElement)newValue);
				return;
			case E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				setTargetDependenceElement((DependencyElement)newValue);
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
			case E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				setSourceDependenceElement((DependencyElement)null);
				return;
			case E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				setTargetDependenceElement((DependencyElement)null);
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
			case E3valuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				return sourceDependenceElement != null;
			case E3valuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				return targetDependenceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionElementImpl
