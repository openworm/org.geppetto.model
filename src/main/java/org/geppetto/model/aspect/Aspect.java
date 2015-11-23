/**
 */
package org.geppetto.model.aspect;

import org.eclipse.emf.common.util.EList;

import org.geppetto.model.Node;

import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.aspect.Aspect#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.aspect.AspectPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends Node
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see org.geppetto.model.aspect.AspectPackage#getAspect_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

} // Aspect
