/**
 */
package org.geppetto.model.values;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * if the pointed type has a visual type the VisualPointer provides the facility to point to a specific visual value inside the visual type.
 * This allows us for instance to have a connection between two specific subparts (e.g. two cylinders).
 * The fraction attribute is optional and can be used to specify (0 to 1) where along a linear geometry (e.g. a cylinder) the connection is located.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.VisualReference#getVisualVariable <em>Visual Variable</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualReference#getFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getVisualReference()
 * @model
 * @generated
 */
public interface VisualReference extends Value
{
	/**
	 * Returns the value of the '<em><b>Visual Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Variable</em>' reference.
	 * @see #setVisualVariable(Variable)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualReference_VisualVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVisualVariable();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualReference#getVisualVariable <em>Visual Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Variable</em>' reference.
	 * @see #getVisualVariable()
	 * @generated
	 */
	void setVisualVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #setFraction(float)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualReference_Fraction()
	 * @model
	 * @generated
	 */
	float getFraction();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualReference#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(float value);

} // VisualReference
