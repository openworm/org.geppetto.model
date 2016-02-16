/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.LibraryManager#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getLibraryManager()
 * @model
 * @generated
 */
public interface LibraryManager extends EObject
{
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.GeppettoLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getLibraryManager_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeppettoLibrary> getLibraries();

} // LibraryManager
