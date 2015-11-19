/**
 */
package org.geppetto.model.variables;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.Node;
import org.geppetto.model.types.Type;
import org.geppetto.model.values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.variables.Variable#getTypes <em>Types</em>}</li>
 *   <li>{@link org.geppetto.model.variables.Variable#getInitialValues <em>Initial Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.variables.VariablesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Node
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * It is bidirectional and its opposite is '{@link org.geppetto.model.types.Type#getReferencedVariables <em>Referenced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_Types()
	 * @see org.geppetto.model.types.Type#getReferencedVariables
	 * @model opposite="referencedVariables"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Initial Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Values</em>' reference.
	 * @see #setInitialValues(Value)
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_InitialValues()
	 * @model
	 * @generated
	 */
	Value getInitialValues();

	/**
	 * Sets the value of the '{@link org.geppetto.model.variables.Variable#getInitialValues <em>Initial Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Values</em>' reference.
	 * @see #getInitialValues()
	 * @generated
	 */
	void setInitialValues(Value value);

} // Variable
