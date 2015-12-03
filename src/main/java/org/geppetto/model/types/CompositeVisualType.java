/**
 */
package org.geppetto.model.types;

import org.eclipse.emf.common.util.EList;

import org.geppetto.model.values.VisualGroup;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Visual Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.CompositeVisualType#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.CompositeVisualType#getVisualGroups <em>Visual Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getCompositeVisualType()
 * @model
 * @generated
 */
public interface CompositeVisualType extends VisualType
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
	 * @see org.geppetto.model.types.TypesPackage#getCompositeVisualType_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Visual Groups</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.values.VisualGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Groups</em>' reference list.
	 * @see org.geppetto.model.types.TypesPackage#getCompositeVisualType_VisualGroups()
	 * @model
	 * @generated
	 */
	EList<VisualGroup> getVisualGroups();

} // CompositeVisualType
