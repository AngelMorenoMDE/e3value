/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.ValueActivity#getName <em>Name</em>}</li>
 *   <li>{@link e3value.ValueActivity#getInBusinessActor <em>In Business Actor</em>}</li>
 *   <li>{@link e3value.ValueActivity#getHasValueInterfaces <em>Has Value Interfaces</em>}</li>
 *   <li>{@link e3value.ValueActivity#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3value.ValueActivity#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getValueActivity()
 * @model
 * @generated
 */
public interface ValueActivity extends EObject {
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
	 * @see e3value.E3valuePackage#getValueActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3value.ValueActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Business Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.BusinessActor#getHasValueActivities <em>Has Value Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Business Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Business Actor</em>' container reference.
	 * @see #setInBusinessActor(BusinessActor)
	 * @see e3value.E3valuePackage#getValueActivity_InBusinessActor()
	 * @see e3value.BusinessActor#getHasValueActivities
	 * @model opposite="hasValueActivities" transient="false"
	 * @generated
	 */
	BusinessActor getInBusinessActor();

	/**
	 * Sets the value of the '{@link e3value.ValueActivity#getInBusinessActor <em>In Business Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Business Actor</em>' container reference.
	 * @see #getInBusinessActor()
	 * @generated
	 */
	void setInBusinessActor(BusinessActor value);

	/**
	 * Returns the value of the '<em><b>Has Value Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ValueInterface}.
	 * It is bidirectional and its opposite is '{@link e3value.ValueInterface#getInValueActivity <em>In Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Interfaces</em>' containment reference list.
	 * @see e3value.E3valuePackage#getValueActivity_HasValueInterfaces()
	 * @see e3value.ValueInterface#getInValueActivity
	 * @model opposite="inValueActivity" containment="true"
	 * @generated
	 */
	EList<ValueInterface> getHasValueInterfaces();

	/**
	 * Returns the value of the '<em><b>Has Stimulus Element</b></em>' reference list.
	 * The list contents are of type {@link e3value.StimulusElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Stimulus Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stimulus Element</em>' reference list.
	 * @see e3value.E3valuePackage#getValueActivity_HasStimulusElement()
	 * @model derived="true"
	 * @generated
	 */
	EList<StimulusElement> getHasStimulusElement();

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.DependencyElement}.
	 * It is bidirectional and its opposite is '{@link e3value.DependencyElement#getInValueActivity <em>In Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependence Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3value.E3valuePackage#getValueActivity_HasDependenceElements()
	 * @see e3value.DependencyElement#getInValueActivity
	 * @model opposite="inValueActivity" containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

} // ValueActivity
