/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E3 Value Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.E3ValueModel#getHasValueExchanges <em>Has Value Exchanges</em>}</li>
 *   <li>{@link e3value.E3ValueModel#getInE3ValueDiagram <em>In E3 Value Diagram</em>}</li>
 *   <li>{@link e3value.E3ValueModel#getHasBusinessActors <em>Has Business Actors</em>}</li>
 *   <li>{@link e3value.E3ValueModel#getHasValueObjects <em>Has Value Objects</em>}</li>
 *   <li>{@link e3value.E3ValueModel#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getE3ValueModel()
 * @model
 * @generated
 */
public interface E3ValueModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Business Actors</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.BusinessActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Business Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Business Actors</em>' containment reference list.
	 * @see e3value.E3valuePackage#getE3ValueModel_HasBusinessActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessActor> getHasBusinessActors();

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.DependencyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependence Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3value.E3valuePackage#getE3ValueModel_HasDependenceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

	/**
	 * Returns the value of the '<em><b>Has Value Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ValueExchange}.
	 * It is bidirectional and its opposite is '{@link e3value.ValueExchange#getInE3ValueModel <em>In E3 Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Exchanges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Exchanges</em>' containment reference list.
	 * @see e3value.E3valuePackage#getE3ValueModel_HasValueExchanges()
	 * @see e3value.ValueExchange#getInE3ValueModel
	 * @model opposite="inE3ValueModel" containment="true"
	 * @generated
	 */
	EList<ValueExchange> getHasValueExchanges();

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
	 * @see e3value.E3valuePackage#getE3ValueModel_HasValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getHasValueObjects();

	/**
	 * Returns the value of the '<em><b>In E3 Value Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e3value.E3ValueDiagram#getHasE3ValueModels <em>Has E3 Value Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In E3 Value Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In E3 Value Diagram</em>' container reference.
	 * @see #setInE3ValueDiagram(E3ValueDiagram)
	 * @see e3value.E3valuePackage#getE3ValueModel_InE3ValueDiagram()
	 * @see e3value.E3ValueDiagram#getHasE3ValueModels
	 * @model opposite="hasE3ValueModels" required="true" transient="false"
	 * @generated
	 */
	E3ValueDiagram getInE3ValueDiagram();

	/**
	 * Sets the value of the '{@link e3value.E3ValueModel#getInE3ValueDiagram <em>In E3 Value Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In E3 Value Diagram</em>' container reference.
	 * @see #getInE3ValueDiagram()
	 * @generated
	 */
	void setInE3ValueDiagram(E3ValueDiagram value);

} // E3ValueModel
