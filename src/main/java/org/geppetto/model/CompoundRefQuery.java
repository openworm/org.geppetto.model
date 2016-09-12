/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Ref Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compound queries allow creating composite queries which chain together multiple queries. The results of a query in the chain will be fed to the subsequent query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.CompoundRefQuery#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getCompoundRefQuery()
 * @model
 * @generated
 */
public interface CompoundRefQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Query Chain</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chain of queries for this Compound query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Chain</em>' reference list.
	 * @see org.geppetto.model.GeppettoPackage#getCompoundRefQuery_QueryChain()
	 * @model required="true"
	 * @generated
	 */
	EList<Query> getQueryChain();

} // CompoundRefQuery
