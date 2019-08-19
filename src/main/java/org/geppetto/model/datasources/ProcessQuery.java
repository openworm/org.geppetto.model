/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.ProcessQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.ProcessQuery#getQueryProcessorId <em>Query Processor Id</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getProcessQuery()
 * @model
 * @generated
 */
public interface ProcessQuery extends Query
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getProcessQuery_Parameters()
	 * @model mapType="org.geppetto.model.StringToStringMap&lt;org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.ecore.xml.type.String&gt;"
	 * @generated
	 */
	EMap<String, String> getParameters();

	/**
	 * Returns the value of the '<em><b>Query Processor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Processor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Processor Id</em>' attribute.
	 * @see #setQueryProcessorId(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getProcessQuery_QueryProcessorId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getQueryProcessorId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.ProcessQuery#getQueryProcessorId <em>Query Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Processor Id</em>' attribute.
	 * @see #getQueryProcessorId()
	 * @generated
	 */
	void setQueryProcessorId(String value);

} // ProcessQuery
