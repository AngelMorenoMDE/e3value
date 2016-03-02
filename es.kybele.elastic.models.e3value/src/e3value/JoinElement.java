/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.JoinElement#getHasInputPorts <em>Has Input Ports</em>}</li>
 *   <li>{@link e3value.JoinElement#getHasOutputPort <em>Has Output Port</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getJoinElement()
 * @model abstract="true"
 * @generated
 */
public interface JoinElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Has Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.InputPort}.
	 * It is bidirectional and its opposite is '{@link e3value.InputPort#getInJoinElement <em>In Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Ports</em>' containment reference list.
	 * @see e3value.E3valuePackage#getJoinElement_HasInputPorts()
	 * @see e3value.InputPort#getInJoinElement
	 * @model opposite="inJoinElement" containment="true"
	 * @generated
	 */
	EList<InputPort> getHasInputPorts();

	/**
	 * Returns the value of the '<em><b>Has Output Port</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link e3value.OutputPort#getInJoinElement <em>In Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Port</em>' containment reference.
	 * @see #setHasOutputPort(OutputPort)
	 * @see e3value.E3valuePackage#getJoinElement_HasOutputPort()
	 * @see e3value.OutputPort#getInJoinElement
	 * @model opposite="inJoinElement" containment="true"
	 * @generated
	 */
	OutputPort getHasOutputPort();

	/**
	 * Sets the value of the '{@link e3value.JoinElement#getHasOutputPort <em>Has Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output Port</em>' containment reference.
	 * @see #getHasOutputPort()
	 * @generated
	 */
	void setHasOutputPort(OutputPort value);

} // JoinElement
