/**
 */
package e3value.impl;

import e3value.E3valuePackage;
import e3value.ForkElement;
import e3value.InputPort;

import e3value.JoinElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3value.impl.InputPortImpl#getInForkElement <em>In Fork Element</em>}</li>
 *   <li>{@link e3value.impl.InputPortImpl#getInJoinElement <em>In Join Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortElementImpl implements InputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3valuePackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkElement getInForkElement() {
		if (eContainerFeatureID() != E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT) return null;
		return (ForkElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInForkElement(ForkElement newInForkElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInForkElement, E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInForkElement(ForkElement newInForkElement) {
		if (newInForkElement != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT && newInForkElement != null)) {
			if (EcoreUtil.isAncestor(this, newInForkElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInForkElement != null)
				msgs = ((InternalEObject)newInForkElement).eInverseAdd(this, E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT, ForkElement.class, msgs);
			msgs = basicSetInForkElement(newInForkElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT, newInForkElement, newInForkElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinElement getInJoinElement() {
		if (eContainerFeatureID() != E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT) return null;
		return (JoinElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInJoinElement(JoinElement newInJoinElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInJoinElement, E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInJoinElement(JoinElement newInJoinElement) {
		if (newInJoinElement != eInternalContainer() || (eContainerFeatureID() != E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT && newInJoinElement != null)) {
			if (EcoreUtil.isAncestor(this, newInJoinElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInJoinElement != null)
				msgs = ((InternalEObject)newInJoinElement).eInverseAdd(this, E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS, JoinElement.class, msgs);
			msgs = basicSetInJoinElement(newInJoinElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT, newInJoinElement, newInJoinElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInForkElement((ForkElement)otherEnd, msgs);
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInJoinElement((JoinElement)otherEnd, msgs);
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				return basicSetInForkElement(null, msgs);
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				return basicSetInJoinElement(null, msgs);
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.FORK_ELEMENT__HAS_INPUT_PORT, ForkElement.class, msgs);
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				return eInternalContainer().eInverseRemove(this, E3valuePackage.JOIN_ELEMENT__HAS_INPUT_PORTS, JoinElement.class, msgs);
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				return getInForkElement();
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				return getInJoinElement();
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				setInForkElement((ForkElement)newValue);
				return;
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				setInJoinElement((JoinElement)newValue);
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				setInForkElement((ForkElement)null);
				return;
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				setInJoinElement((JoinElement)null);
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
			case E3valuePackage.INPUT_PORT__IN_FORK_ELEMENT:
				return getInForkElement() != null;
			case E3valuePackage.INPUT_PORT__IN_JOIN_ELEMENT:
				return getInJoinElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPortImpl
