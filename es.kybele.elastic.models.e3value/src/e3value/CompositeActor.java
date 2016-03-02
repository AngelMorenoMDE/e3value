/**
 */
package e3value;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3value.CompositeActor#getHasElementaryActors <em>Has Elementary Actors</em>}</li>
 * </ul>
 *
 * @see e3value.E3valuePackage#getCompositeActor()
 * @model
 * @generated
 */
public interface CompositeActor extends Actor {

	/**
	 * Returns the value of the '<em><b>Has Elementary Actors</b></em>' containment reference list.
	 * The list contents are of type {@link e3value.ElementaryActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Elementary Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elementary Actors</em>' containment reference list.
	 * @see e3value.E3valuePackage#getCompositeActor_HasElementaryActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryActor> getHasElementaryActors();
} // CompositeActor
