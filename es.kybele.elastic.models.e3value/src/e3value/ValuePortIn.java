/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Port In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}</li>
 *   <li>{@link e3value.ValuePortIn#getInValueInterface <em>In Value Interface</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getValuePortIn()
 * @model
 * @generated
 */
public interface ValuePortIn extends ValuePort {

	/**
	 * Returns the value of the '<em><b>In Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Connect With Value Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connect With Value Exchange</em>' reference.
	 * @see #setInConnectWithValueExchange(ValueExchange)
	 * @see e3value.E3valuePackage#getValuePortIn_InConnectWithValueExchange()
	 * @model
	 * @generated
	 */
	ValueExchange getInConnectWithValueExchange();

	/**
	 * Sets the value of the '{@link e3value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Connect With Value Exchange</em>' reference.
	 * @see #getInConnectWithValueExchange()
	 * @generated
	 */
	void setInConnectWithValueExchange(ValueExchange value);

	/**
	 * Returns the value of the '<em><b>In Value Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Interface</em>' container reference.
	 * @see #setInValueInterface(ValueInterface)
	 * @see e3value.E3valuePackage#getValuePortIn_InValueInterface()
	 * @see e3value.ValueInterface#getHasValuePortIn
	 * @model opposite="hasValuePortIn" transient="false"
	 * @generated
	 */
	ValueInterface getInValueInterface();

	/**
	 * Sets the value of the '{@link e3value.ValuePortIn#getInValueInterface <em>In Value Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Interface</em>' container reference.
	 * @see #getInValueInterface()
	 * @generated
	 */
	void setInValueInterface(ValueInterface value);
} // ValuePortIn
