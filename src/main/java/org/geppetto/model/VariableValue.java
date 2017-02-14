/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EObject;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.VariableValue#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.geppetto.model.VariableValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.GeppettoPackage#getVariableValue()
 * @model
 * @generated
 */
public interface VariableValue extends EObject
{
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference.
	 * @see #setPointer(Pointer)
	 * @see org.geppetto.model.GeppettoPackage#getVariableValue_Pointer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pointer getPointer();

	/**
	 * Sets the value of the '{@link org.geppetto.model.VariableValue#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(Pointer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.geppetto.model.GeppettoPackage#getVariableValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.VariableValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // VariableValue
