/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.GeppettoLibrary#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getGeppettoLibrary()
 * @model
 * @generated
 */
public interface GeppettoLibrary extends Node
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // GeppettoLibrary
