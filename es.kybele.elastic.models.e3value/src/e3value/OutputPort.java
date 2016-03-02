/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.OutputPort#getInForkElement <em>In Fork Element</em>}</li>
 *   <li>{@link e3value.OutputPort#getInJoinElement <em>In Join Element</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends PortElement {

	/**
	 * Returns the value of the '<em><b>In Fork Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ForkElement#getHasOutputPorts <em>Has Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Fork Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Fork Element</em>' container reference.
	 * @see #setInForkElement(ForkElement)
	 * @see e3value.E3valuePackage#getOutputPort_InForkElement()
	 * @see e3value.ForkElement#getHasOutputPorts
	 * @model opposite="hasOutputPorts" transient="false"
	 * @generated
	 */
	ForkElement getInForkElement();

	/**
	 * Sets the value of the '{@link e3value.OutputPort#getInForkElement <em>In Fork Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Fork Element</em>' container reference.
	 * @see #getInForkElement()
	 * @generated
	 */
	void setInForkElement(ForkElement value);

	/**
	 * Returns the value of the '<em><b>In Join Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.JoinElement#getHasOutputPort <em>Has Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Join Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Join Element</em>' container reference.
	 * @see #setInJoinElement(JoinElement)
	 * @see e3value.E3valuePackage#getOutputPort_InJoinElement()
	 * @see e3value.JoinElement#getHasOutputPort
	 * @model opposite="hasOutputPort" transient="false"
	 * @generated
	 */
	JoinElement getInJoinElement();

	/**
	 * Sets the value of the '{@link e3value.OutputPort#getInJoinElement <em>In Join Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Join Element</em>' container reference.
	 * @see #getInJoinElement()
	 * @generated
	 */
	void setInJoinElement(JoinElement value);
} // OutputPort
