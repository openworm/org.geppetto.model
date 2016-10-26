/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.RunnableQuery#getTargetVariablePath <em>Target Variable Path</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.RunnableQuery#getQueryPath <em>Query Path</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.RunnableQuery#getBooleanOperator <em>Boolean Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getRunnableQuery()
 * @model
 * @generated
 */
public interface RunnableQuery extends EObject
{
	/**
	 * Returns the value of the '<em><b>Target Variable Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable Path</em>' attribute.
	 * @see #setTargetVariablePath(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getRunnableQuery_TargetVariablePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTargetVariablePath();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.RunnableQuery#getTargetVariablePath <em>Target Variable Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable Path</em>' attribute.
	 * @see #getTargetVariablePath()
	 * @generated
	 */
	void setTargetVariablePath(String value);

	/**
	 * Returns the value of the '<em><b>Query Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Path</em>' attribute.
	 * @see #setQueryPath(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getRunnableQuery_QueryPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getQueryPath();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.RunnableQuery#getQueryPath <em>Query Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Path</em>' attribute.
	 * @see #getQueryPath()
	 * @generated
	 */
	void setQueryPath(String value);

	/**
	 * Returns the value of the '<em><b>Boolean Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link org.geppetto.model.datasources.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Operator</em>' attribute.
	 * @see org.geppetto.model.datasources.BooleanOperator
	 * @see #setBooleanOperator(BooleanOperator)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getRunnableQuery_BooleanOperator()
	 * @model default="AND"
	 * @generated
	 */
	BooleanOperator getBooleanOperator();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.RunnableQuery#getBooleanOperator <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Operator</em>' attribute.
	 * @see org.geppetto.model.datasources.BooleanOperator
	 * @see #getBooleanOperator()
	 * @generated
	 */
	void setBooleanOperator(BooleanOperator value);

} // RunnableQuery
