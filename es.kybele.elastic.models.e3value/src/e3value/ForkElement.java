/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ForkElement#getHasOutputPorts <em>Has Output Ports</em>}</li>
 *   <li>{@link e3value.ForkElement#getHasInputPort <em>Has Input Port</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getForkElement()
 * @model abstract="true"
 * @generated
 */
public interface ForkElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Has Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.OutputPort}.
	 * It is bidirectional and its opposite is '{@link e3value.OutputPort#getInForkElement <em>In Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Ports</em>' containment reference list.
	 * @see e3value.E3valuePackage#getForkElement_HasOutputPorts()
	 * @see e3value.OutputPort#getInForkElement
	 * @model opposite="inForkElement" containment="true"
	 * @generated
	 */
	EList<OutputPort> getHasOutputPorts();

	/**
	 * Returns the value of the '<em><b>Has Input Port</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link e3value.InputPort#getInForkElement <em>In Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Port</em>' containment reference.
	 * @see #setHasInputPort(InputPort)
	 * @see e3value.E3valuePackage#getForkElement_HasInputPort()
	 * @see e3value.InputPort#getInForkElement
	 * @model opposite="inForkElement" containment="true"
	 * @generated
	 */
	InputPort getHasInputPort();

	/**
	 * Sets the value of the '{@link e3value.ForkElement#getHasInputPort <em>Has Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Port</em>' containment reference.
	 * @see #getHasInputPort()
	 * @generated
	 */
	void setHasInputPort(InputPort value);

} // ForkElement
