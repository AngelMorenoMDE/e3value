/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.InputPort#getInForkElement <em>In Fork Element</em>}</li>
 *   <li>{@link e3value.InputPort#getInJoinElement <em>In Join Element</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends PortElement {

	/**
	 * Returns the value of the '<em><b>In Fork Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ForkElement#getHasInputPort <em>Has Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Fork Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Fork Element</em>' container reference.
	 * @see #setInForkElement(ForkElement)
	 * @see e3value.E3valuePackage#getInputPort_InForkElement()
	 * @see e3value.ForkElement#getHasInputPort
	 * @model opposite="hasInputPort" transient="false"
	 * @generated
	 */
	ForkElement getInForkElement();

	/**
	 * Sets the value of the '{@link e3value.InputPort#getInForkElement <em>In Fork Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Fork Element</em>' container reference.
	 * @see #getInForkElement()
	 * @generated
	 */
	void setInForkElement(ForkElement value);

	/**
	 * Returns the value of the '<em><b>In Join Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.JoinElement#getHasInputPorts <em>Has Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Join Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Join Element</em>' container reference.
	 * @see #setInJoinElement(JoinElement)
	 * @see e3value.E3valuePackage#getInputPort_InJoinElement()
	 * @see e3value.JoinElement#getHasInputPorts
	 * @model opposite="hasInputPorts" transient="false"
	 * @generated
	 */
	JoinElement getInJoinElement();

	/**
	 * Sets the value of the '{@link e3value.InputPort#getInJoinElement <em>In Join Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Join Element</em>' container reference.
	 * @see #getInJoinElement()
	 * @generated
	 */
	void setInJoinElement(JoinElement value);
} // InputPort
