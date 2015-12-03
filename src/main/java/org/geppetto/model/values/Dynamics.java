/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Dynamics#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link org.geppetto.model.values.Dynamics#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getDynamics()
 * @model
 * @generated
 */
public interface Dynamics extends Value
{
	/**
	 * Returns the value of the '<em><b>Initial Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Condition</em>' containment reference.
	 * @see #setInitialCondition(PhysicalQuantity)
	 * @see org.geppetto.model.values.ValuesPackage#getDynamics_InitialCondition()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalQuantity getInitialCondition();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Dynamics#getInitialCondition <em>Initial Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Condition</em>' containment reference.
	 * @see #getInitialCondition()
	 * @generated
	 */
	void setInitialCondition(PhysicalQuantity value);

	/**
	 * Returns the value of the '<em><b>Dynamics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamics</em>' reference.
	 * @see #setDynamics(Function)
	 * @see org.geppetto.model.values.ValuesPackage#getDynamics_Dynamics()
	 * @model
	 * @generated
	 */
	Function getDynamics();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Dynamics#getDynamics <em>Dynamics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamics</em>' reference.
	 * @see #getDynamics()
	 * @generated
	 */
	void setDynamics(Function value);

} // Dynamics
