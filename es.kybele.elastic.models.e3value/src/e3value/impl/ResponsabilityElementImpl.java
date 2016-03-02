/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ResponsabilityElement;

import e3value.ValueInterface;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsability Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.ResponsabilityElementImpl#getBoundsToValueInterface <em>Bounds To Value Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsabilityElementImpl extends PortElementImpl implements ResponsabilityElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsabilityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.RESPONSABILITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterface getBoundsToValueInterface() {
		if (eContainerFeatureID() != E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE) return null;
		return (ValueInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundsToValueInterface(ValueInterface newBoundsToValueInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoundsToValueInterface, E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsToValueInterface(ValueInterface newBoundsToValueInterface) {
		if (newBoundsToValueInterface != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE && newBoundsToValueInterface != null)) {
			if (EcoreUtil.isAncestor(this, newBoundsToValueInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoundsToValueInterface != null)
				msgs = ((InternalEObject)newBoundsToValueInterface).eInverseAdd(this, E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, ValueInterface.class, msgs);
			msgs = basicSetBoundsToValueInterface(newBoundsToValueInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE, newBoundsToValueInterface, newBoundsToValueInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoundsToValueInterface((ValueInterface)otherEnd, msgs);
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				return basicSetBoundsToValueInterface(null, msgs);
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, ValueInterface.class, msgs);
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				return getBoundsToValueInterface();
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				setBoundsToValueInterface((ValueInterface)newValue);
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				setBoundsToValueInterface((ValueInterface)null);
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
			case E3valuePackage.RESPONSABILITY_ELEMENT__BOUNDS_TO_VALUE_INTERFACE:
				return getBoundsToValueInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponsabilityElementImpl
