/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.GeppettoModel#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel()
 * @model
 * @generated
 */
public interface GeppettoModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.variables.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.GeppettoLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeppettoLibrary> getLibraries();

} // GeppettoModel
