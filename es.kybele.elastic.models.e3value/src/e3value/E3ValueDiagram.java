/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E3 Value Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.E3ValueDiagram#getHasE3ValueModels <em>Has E3 Value Models</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getE3ValueDiagram()
 * @model
 * @generated
 */
public interface E3ValueDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has E3 Value Models</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.E3ValueModel}.
	 * It is bidirectional and its opposite is '{@link e3value.E3ValueModel#getInE3ValueDiagram <em>In E3 Value Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has E3 Value Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has E3 Value Models</em>' containment reference list.
	 * @see e3value.E3valuePackage#getE3ValueDiagram_HasE3ValueModels()
	 * @see e3value.E3ValueModel#getInE3ValueDiagram
	 * @model opposite="inE3ValueDiagram" containment="true"
	 * @generated
	 */
	EList<E3ValueModel> getHasE3ValueModels();

} // E3ValueDiagram
