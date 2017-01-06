/**
 */
package org.geppetto.model.datasources;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.SimpleQuery#getQuery <em>Query</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.SimpleQuery#getCountQuery <em>Count Query</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getSimpleQuery()
 * @model
 * @generated
 */
public interface SimpleQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getSimpleQuery_Query()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.SimpleQuery#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Count Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Query</em>' attribute.
	 * @see #setCountQuery(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getSimpleQuery_CountQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getCountQuery();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.SimpleQuery#getCountQuery <em>Count Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Query</em>' attribute.
	 * @see #getCountQuery()
	 * @generated
	 */
	void setCountQuery(String value);

} // SimpleQuery
