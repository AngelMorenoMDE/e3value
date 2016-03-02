/**
 */
package e3value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}</li>
 *   <li>{@link e3value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getConnectionElement()
 * @model
 * @generated
 */
public interface ConnectionElement extends DependencyElement {
	/**
	 * Returns the value of the '<em><b>Source Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Dependence Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dependence Element</em>' reference.
	 * @see #setSourceDependenceElement(DependencyElement)
	 * @see e3value.E3valuePackage#getConnectionElement_SourceDependenceElement()
	 * @model required="true"
	 * @generated
	 */
	DependencyElement getSourceDependenceElement();

	/**
	 * Sets the value of the '{@link e3value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dependence Element</em>' reference.
	 * @see #getSourceDependenceElement()
	 * @generated
	 */
	void setSourceDependenceElement(DependencyElement value);

	/**
	 * Returns the value of the '<em><b>Target Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Dependence Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Dependence Element</em>' reference.
	 * @see #setTargetDependenceElement(DependencyElement)
	 * @see e3value.E3valuePackage#getConnectionElement_TargetDependenceElement()
	 * @model required="true"
	 * @generated
	 */
	DependencyElement getTargetDependenceElement();

	/**
	 * Sets the value of the '{@link e3value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Dependence Element</em>' reference.
	 * @see #getTargetDependenceElement()
	 * @generated
	 */
	void setTargetDependenceElement(DependencyElement value);

} // ConnectionElement
