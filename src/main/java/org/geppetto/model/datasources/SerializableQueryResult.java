/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serializable Query Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.SerializableQueryResult#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getSerializableQueryResult()
 * @model
 * @generated
 */
public interface SerializableQueryResult extends AQueryResult
{
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getSerializableQueryResult_Values()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	EList<String> getValues();

} // SerializableQueryResult
