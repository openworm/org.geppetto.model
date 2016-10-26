/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compound queries allow creating composite queries which chain together multiple queries. The results of a query in the chain will be fed to the subsequent query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.CompoundQuery#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getCompoundQuery()
 * @model
 * @generated
 */
public interface CompoundQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Query Chain</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.datasources.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chain of queries for this Compound query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Chain</em>' containment reference list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getCompoundQuery_QueryChain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Query> getQueryChain();

} // CompoundQuery
