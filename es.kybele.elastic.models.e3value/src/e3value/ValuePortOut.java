/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Port Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ValuePortOut#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}</li>
 *   <li>{@link e3value.ValuePortOut#getInValueInterface <em>In Value Interface</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getValuePortOut()
 * @model
 * @generated
 */
public interface ValuePortOut extends ValuePort {

	/**
	 * Returns the value of the '<em><b>Out Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Connect With Value Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Connect With Value Exchange</em>' reference.
	 * @see #setOutConnectWithValueExchange(ValueExchange)
	 * @see e3value.E3valuePackage#getValuePortOut_OutConnectWithValueExchange()
	 * @model
	 * @generated
	 */
	ValueExchange getOutConnectWithValueExchange();

	/**
	 * Sets the value of the '{@link e3value.ValuePortOut#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Connect With Value Exchange</em>' reference.
	 * @see #getOutConnectWithValueExchange()
	 * @generated
	 */
	void setOutConnectWithValueExchange(ValueExchange value);

	/**
	 * Returns the value of the '<em><b>In Value Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Interface</em>' container reference.
	 * @see #setInValueInterface(ValueInterface)
	 * @see e3value.E3valuePackage#getValuePortOut_InValueInterface()
	 * @see e3value.ValueInterface#getHasValuePortOut
	 * @model opposite="hasValuePortOut" transient="false"
	 * @generated
	 */
	ValueInterface getInValueInterface();

	/**
	 * Sets the value of the '{@link e3value.ValuePortOut#getInValueInterface <em>In Value Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Interface</em>' container reference.
	 * @see #getInValueInterface()
	 * @generated
	 */
	void setInValueInterface(ValueInterface value);
} // ValuePortOut
