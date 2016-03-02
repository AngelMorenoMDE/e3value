/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.BusinessActor#getName <em>Name</em>}</li>
 *   <li>{@link e3value.BusinessActor#getHasValueInterfaces <em>Has Value Interfaces</em>}</li>
 *   <li>{@link e3value.BusinessActor#getHasValueActivities <em>Has Value Activities</em>}</li>
 *   <li>{@link e3value.BusinessActor#getHasStimulusElements <em>Has Stimulus Elements</em>}</li>
 *   <li>{@link e3value.BusinessActor#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3value.BusinessActor#getHasValueObjects <em>Has Value Objects</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getBusinessActor()
 * @model abstract="true"
 * @generated
 */
public interface BusinessActor extends EObject {
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
	 * @see e3value.E3valuePackage#getBusinessActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3value.BusinessActor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ValueInterface}.
	 * It is bidirectional and its opposite is '{@link e3value.ValueInterface#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Interfaces</em>' containment reference list.
	 * @see e3value.E3valuePackage#getBusinessActor_HasValueInterfaces()
	 * @see e3value.ValueInterface#getInBusinessActor
	 * @model opposite="inBusinessActor" containment="true"
	 * @generated
	 */
	EList<ValueInterface> getHasValueInterfaces();

	/**
	 * Returns the value of the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ValueActivity}.
	 * It is bidirectional and its opposite is '{@link e3value.ValueActivity#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Activities</em>' containment reference list.
	 * @see e3value.E3valuePackage#getBusinessActor_HasValueActivities()
	 * @see e3value.ValueActivity#getInBusinessActor
	 * @model opposite="inBusinessActor" containment="true"
	 * @generated
	 */
	EList<ValueActivity> getHasValueActivities();

	/**
	 * Returns the value of the '<em><b>Has Stimulus Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.StimulusElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Stimulus Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stimulus Elements</em>' containment reference list.
	 * @see e3value.E3valuePackage#getBusinessActor_HasStimulusElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StimulusElement> getHasStimulusElements();

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.DependencyElement}.
	 * It is bidirectional and its opposite is '{@link e3value.DependencyElement#getInBusinessActor <em>In Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependence Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3value.E3valuePackage#getBusinessActor_HasDependenceElements()
	 * @see e3value.DependencyElement#getInBusinessActor
	 * @model opposite="inBusinessActor" containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

	/**
	 * Returns the value of the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Objects</em>' containment reference list.
	 * @see e3value.E3valuePackage#getBusinessActor_HasValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getHasValueObjects();

} // BusinessActor
