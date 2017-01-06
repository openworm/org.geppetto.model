/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.GeppettoLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Library Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.datasources.DatasourcesPackage#getDataSourceLibraryConfiguration()
 * @model
 * @generated
 */
public interface DataSourceLibraryConfiguration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' reference.
	 * @see #setLibrary(GeppettoLibrary)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getDataSourceLibraryConfiguration_Library()
	 * @model required="true"
	 * @generated
	 */
	GeppettoLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getLibrary <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(GeppettoLibrary value);

	/**
	 * Returns the value of the '<em><b>Model Interpreter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Interpreter Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Interpreter Id</em>' attribute.
	 * @see #setModelInterpreterId(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getDataSourceLibraryConfiguration_ModelInterpreterId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getModelInterpreterId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getModelInterpreterId <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Interpreter Id</em>' attribute.
	 * @see #getModelInterpreterId()
	 * @generated
	 */
	void setModelInterpreterId(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.geppetto.model.datasources.DatasourcesPackage#getDataSourceLibraryConfiguration_Format()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DataSourceLibraryConfiguration
