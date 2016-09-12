/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Matching Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.QueryMatchingCriteria#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getQueryMatchingCriteria()
 * @model
 * @generated
 */
public interface QueryMatchingCriteria extends EObject
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQueryMatchingCriteria_Type()
	 * @model
	 * @generated
	 */
	EList<Type> getType();

} // QueryMatchingCriteria
