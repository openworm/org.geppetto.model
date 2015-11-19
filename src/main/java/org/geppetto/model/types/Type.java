/**
 */
package org.geppetto.model.types;

import org.eclipse.emf.common.util.EList;

import org.geppetto.model.Node;

import org.geppetto.model.aspect.Aspect;

import org.geppetto.model.values.Value;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.Type#getAspect <em>Aspect</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#getReferencedVariables <em>Referenced Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Node
{
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.geppetto.model.aspect.Aspect#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' container reference.
	 * @see #setAspect(Aspect)
	 * @see org.geppetto.model.types.TypesPackage#getType_Aspect()
	 * @see org.geppetto.model.aspect.Aspect#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.Type#getAspect <em>Aspect</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' container reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

	/**
	 * Returns the value of the '<em><b>Referenced Variables</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.variables.Variable}.
	 * It is bidirectional and its opposite is '{@link org.geppetto.model.variables.Variable#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Variables</em>' reference list.
	 * @see org.geppetto.model.types.TypesPackage#getType_ReferencedVariables()
	 * @see org.geppetto.model.variables.Variable#getTypes
	 * @model opposite="types"
	 * @generated
	 */
	EList<Variable> getReferencedVariables();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Type)
	 * @see org.geppetto.model.types.TypesPackage#getType_SuperType()
	 * @model
	 * @generated
	 */
	Type getSuperType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.Type#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getDefaultValue();

} // Type
