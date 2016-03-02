/**
 */
package e3value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ValueObject#getName <em>Name</em>}</li>
 *   <li>{@link e3value.ValueObject#getInValueExchange <em>In Value Exchange</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see e3value.E3valuePackage#getValueObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3value.ValueObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Value Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueExchange#getHasValueObject <em>Has Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Exchange</em>' reference.
	 * @see #setInValueExchange(ValueExchange)
	 * @see e3value.E3valuePackage#getValueObject_InValueExchange()
	 * @see e3value.ValueExchange#getHasValueObject
	 * @model opposite="hasValueObject" required="true"
	 * @generated
	 */
	ValueExchange getInValueExchange();

	/**
	 * Sets the value of the '{@link e3value.ValueObject#getInValueExchange <em>In Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Exchange</em>' reference.
	 * @see #getInValueExchange()
	 * @generated
	 */
	void setInValueExchange(ValueExchange value);

} // ValueObject
