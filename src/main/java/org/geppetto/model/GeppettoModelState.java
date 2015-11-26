/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.GeppettoModelState#getRecordedVariables <em>Recorded Variables</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModelState#getSetParameters <em>Set Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getGeppettoModelState()
 * @model
 * @generated
 */
public interface GeppettoModelState extends EObject
{
	/**
	 * Returns the value of the '<em><b>Recorded Variables</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.VariableValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Variables</em>' reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModelState_RecordedVariables()
	 * @model
	 * @generated
	 */
	EList<VariableValue> getRecordedVariables();

	/**
	 * Returns the value of the '<em><b>Set Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.VariableValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Parameters</em>' reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModelState_SetParameters()
	 * @model
	 * @generated
	 */
	EList<VariableValue> getSetParameters();

} // GeppettoModelState
