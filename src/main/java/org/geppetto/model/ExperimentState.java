/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.ExperimentState#getRecordedVariables <em>Recorded Variables</em>}</li>
 *   <li>{@link org.geppetto.model.ExperimentState#getSetParameters <em>Set Parameters</em>}</li>
 *   <li>{@link org.geppetto.model.ExperimentState#getExperimentId <em>Experiment Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getExperimentState()
 * @model
 * @generated
 */
public interface ExperimentState extends EObject
{
	/**
	 * Returns the value of the '<em><b>Recorded Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.VariableValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Variables</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getExperimentState_RecordedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableValue> getRecordedVariables();

	/**
	 * Returns the value of the '<em><b>Set Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.VariableValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Parameters</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getExperimentState_SetParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableValue> getSetParameters();

	/**
	 * Returns the value of the '<em><b>Experiment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Id</em>' attribute.
	 * @see #setExperimentId(long)
	 * @see org.geppetto.model.GeppettoPackage#getExperimentState_ExperimentId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 * @generated
	 */
	long getExperimentId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.ExperimentState#getExperimentId <em>Experiment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Id</em>' attribute.
	 * @see #getExperimentId()
	 * @generated
	 */
	void setExperimentId(long value);

} // ExperimentState
