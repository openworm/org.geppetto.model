/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.aspect.Aspect;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.PointerElement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.geppetto.model.values.PointerElement#getAspect <em>Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getPointerElement()
 * @model
 * @generated
 */
public interface PointerElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.geppetto.model.values.ValuesPackage#getPointerElement_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.PointerElement#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' reference.
	 * @see #setAspect(Aspect)
	 * @see org.geppetto.model.values.ValuesPackage#getPointerElement_Aspect()
	 * @model
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.PointerElement#getAspect <em>Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

} // PointerElement
