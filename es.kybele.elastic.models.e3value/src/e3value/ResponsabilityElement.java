/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsability Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ResponsabilityElement#getBoundsToValueInterface <em>Bounds To Value Interface</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getResponsabilityElement()
 * @model
 * @generated
 */
public interface ResponsabilityElement extends PortElement {

	/**
	 * Returns the value of the '<em><b>Bounds To Value Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds To Value Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds To Value Interface</em>' container reference.
	 * @see #setBoundsToValueInterface(ValueInterface)
	 * @see e3value.E3valuePackage#getResponsabilityElement_BoundsToValueInterface()
	 * @see e3value.ValueInterface#getBindsResponsabilityElement
	 * @model opposite="bindsResponsabilityElement" required="true" transient="false"
	 * @generated
	 */
	ValueInterface getBoundsToValueInterface();

	/**
	 * Sets the value of the '{@link e3value.ResponsabilityElement#getBoundsToValueInterface <em>Bounds To Value Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds To Value Interface</em>' container reference.
	 * @see #getBoundsToValueInterface()
	 * @generated
	 */
	void setBoundsToValueInterface(ValueInterface value);
} // ResponsabilityElement
