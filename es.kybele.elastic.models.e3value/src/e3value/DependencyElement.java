/**
 */
package e3value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.DependencyElement#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.DependencyElement#getInValueActivity <em>In Value Activity</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getDependencyElement()
 * @model abstract="true"
 * @generated
 */
public interface DependencyElement extends EObject {

	/**
	 * Returns the value of the '<em><b>In Business Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.BusinessActor#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Business Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Business Actor</em>' container reference.
	 * @see #setInBusinessActor(BusinessActor)
	 * @see e3value.E3valuePackage#getDependencyElement_InBusinessActor()
	 * @see e3value.BusinessActor#getHasDependenceElements
	 * @model opposite="hasDependenceElements" transient="false"
	 * @generated
	 */
	BusinessActor getInBusinessActor();

	/**
	 * Sets the value of the '{@link e3value.DependencyElement#getInBusinessActor <em>In Business Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Business Actor</em>' container reference.
	 * @see #getInBusinessActor()
	 * @generated
	 */
	void setInBusinessActor(BusinessActor value);

	/**
	 * Returns the value of the '<em><b>In Value Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.ValueActivity#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Activity</em>' container reference.
	 * @see #setInValueActivity(ValueActivity)
	 * @see e3value.E3valuePackage#getDependencyElement_InValueActivity()
	 * @see e3value.ValueActivity#getHasDependenceElements
	 * @model opposite="hasDependenceElements" transient="false"
	 * @generated
	 */
	ValueActivity getInValueActivity();

	/**
	 * Sets the value of the '{@link e3value.DependencyElement#getInValueActivity <em>In Value Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Activity</em>' container reference.
	 * @see #getInValueActivity()
	 * @generated
	 */
	void setInValueActivity(ValueActivity value);
} // DependencyElement
