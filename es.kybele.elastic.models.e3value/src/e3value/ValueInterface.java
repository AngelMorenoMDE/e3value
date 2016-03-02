/**
 */
package e3value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ValueInterface#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.ValueInterface#getInValueActivity <em>In Value Activity</em>}</li>
 *   <li>{@link e3value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}</li>
 *   <li>{@link e3value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}</li>
 *   <li>{@link e3value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getValueInterface()
 * @model
 * @generated
 */
public interface ValueInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>In Business Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.BusinessActor#getHasValueInterfaces <em>Has Value Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Business Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Business Actor</em>' container reference.
	 * @see #setInBusinessActor(BusinessActor)
	 * @see e3value.E3valuePackage#getValueInterface_InBusinessActor()
	 * @see e3value.BusinessActor#getHasValueInterfaces
	 * @model opposite="hasValueInterfaces" transient="false"
	 * @generated
	 */
	BusinessActor getInBusinessActor();

	/**
	 * Sets the value of the '{@link e3value.ValueInterface#getInBusinessActor <em>In Business Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Business Actor</em>' container reference.
	 * @see #getInBusinessActor()
	 * @generated
	 */
	void setInBusinessActor(BusinessActor value);

	/**
	 * Returns the value of the '<em><b>In Value Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueActivity#getHasValueInterfaces <em>Has Value Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Activity</em>' container reference.
	 * @see #setInValueActivity(ValueActivity)
	 * @see e3value.E3valuePackage#getValueInterface_InValueActivity()
	 * @see e3value.ValueActivity#getHasValueInterfaces
	 * @model opposite="hasValueInterfaces" transient="false"
	 * @generated
	 */
	ValueActivity getInValueActivity();

	/**
	 * Sets the value of the '{@link e3value.ValueInterface#getInValueActivity <em>In Value Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Activity</em>' container reference.
	 * @see #getInValueActivity()
	 * @generated
	 */
	void setInValueActivity(ValueActivity value);

	/**
	 * Returns the value of the '<em><b>Has Value Port In</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValuePortIn#getInValueInterface <em>In Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Port In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Port In</em>' containment reference.
	 * @see #setHasValuePortIn(ValuePortIn)
	 * @see e3value.E3valuePackage#getValueInterface_HasValuePortIn()
	 * @see e3value.ValuePortIn#getInValueInterface
	 * @model opposite="inValueInterface" containment="true" required="true"
	 * @generated
	 */
	ValuePortIn getHasValuePortIn();

	/**
	 * Sets the value of the '{@link e3value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value Port In</em>' containment reference.
	 * @see #getHasValuePortIn()
	 * @generated
	 */
	void setHasValuePortIn(ValuePortIn value);

	/**
	 * Returns the value of the '<em><b>Has Value Port Out</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValuePortOut#getInValueInterface <em>In Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Port Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Port Out</em>' containment reference.
	 * @see #setHasValuePortOut(ValuePortOut)
	 * @see e3value.E3valuePackage#getValueInterface_HasValuePortOut()
	 * @see e3value.ValuePortOut#getInValueInterface
	 * @model opposite="inValueInterface" containment="true" required="true"
	 * @generated
	 */
	ValuePortOut getHasValuePortOut();

	/**
	 * Sets the value of the '{@link e3value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value Port Out</em>' containment reference.
	 * @see #getHasValuePortOut()
	 * @generated
	 */
	void setHasValuePortOut(ValuePortOut value);

	/**
	 * Returns the value of the '<em><b>Binds Responsability Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link e3value.ResponsabilityElement#getBoundsToValueInterface <em>Bounds To Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds Responsability Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds Responsability Element</em>' containment reference.
	 * @see #setBindsResponsabilityElement(ResponsabilityElement)
	 * @see e3value.E3valuePackage#getValueInterface_BindsResponsabilityElement()
	 * @see e3value.ResponsabilityElement#getBoundsToValueInterface
	 * @model opposite="boundsToValueInterface" containment="true" required="true"
	 * @generated
	 */
	ResponsabilityElement getBindsResponsabilityElement();

	/**
	 * Sets the value of the '{@link e3value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binds Responsability Element</em>' containment reference.
	 * @see #getBindsResponsabilityElement()
	 * @generated
	 */
	void setBindsResponsabilityElement(ResponsabilityElement value);

} // ValueInterface
