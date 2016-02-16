/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.CompoundQuery#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getCompoundQuery()
 * @model
 * @generated
 */
public interface CompoundQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Query Chain</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Chain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Chain</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getCompoundQuery_QueryChain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Query> getQueryChain();

} // CompoundQuery
