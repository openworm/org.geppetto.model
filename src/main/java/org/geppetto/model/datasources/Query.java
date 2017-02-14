/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

import org.geppetto.model.Node;
import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.Query#getDescription <em>Description</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.Query#getMatchingCriteria <em>Matching Criteria</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.Query#isRunForCount <em>Run For Count</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.Query#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getQuery()
 * @model abstract="true"
 * @generated
 */
public interface Query extends Node
{
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQuery_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.Query#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.datasources.QueryMatchingCriteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Criteria</em>' containment reference list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQuery_MatchingCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryMatchingCriteria> getMatchingCriteria();

	/**
	 * Returns the value of the '<em><b>Run For Count</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run For Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run For Count</em>' attribute.
	 * @see #setRunForCount(boolean)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQuery_RunForCount()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isRunForCount();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.Query#isRunForCount <em>Run For Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run For Count</em>' attribute.
	 * @see #isRunForCount()
	 * @generated
	 */
	void setRunForCount(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQuery_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.Query#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // Query
