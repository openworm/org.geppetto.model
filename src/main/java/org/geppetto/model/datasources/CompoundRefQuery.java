/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Ref Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compound ref queries make it possible to reference queries from any datasource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.CompoundRefQuery#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getCompoundRefQuery()
 * @model
 * @generated
 */
public interface CompoundRefQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Query Chain</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.datasources.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chain of queries for this Compound query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Chain</em>' reference list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getCompoundRefQuery_QueryChain()
	 * @model required="true"
	 * @generated
	 */
	EList<Query> getQueryChain();

} // CompoundRefQuery
