/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.QueryResult#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getQueryResult()
 * @model
 * @generated
 */
public interface QueryResult extends AQueryResult
{
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getQueryResult_Values()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<Object> getValues();

} // QueryResult
