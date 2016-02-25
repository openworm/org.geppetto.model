/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.DataSource#getDataSourceService <em>Data Source Service</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getLibraryConfigurations <em>Library Configurations</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getUrl <em>Url</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getDependenciesLibrary <em>Dependencies Library</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getTargetLibrary <em>Target Library</em>}</li>
 *   <li>{@link org.geppetto.model.DataSource#getFetchVariableQuery <em>Fetch Variable Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends Node
{
	/**
	 * Returns the value of the '<em><b>Data Source Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Service</em>' attribute.
	 * @see #setDataSourceService(String)
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_DataSourceService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDataSourceService();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DataSource#getDataSourceService <em>Data Source Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Service</em>' attribute.
	 * @see #getDataSourceService()
	 * @generated
	 */
	void setDataSourceService(String value);

	/**
	 * Returns the value of the '<em><b>Library Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.DataSourceLibraryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Configurations</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_LibraryConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSourceLibraryConfiguration> getLibraryConfigurations();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DataSource#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Dependencies Library</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.GeppettoLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies Library</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Library</em>' reference list.
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_DependenciesLibrary()
	 * @model
	 * @generated
	 */
	EList<GeppettoLibrary> getDependenciesLibrary();

	/**
	 * Returns the value of the '<em><b>Target Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Library</em>' reference.
	 * @see #setTargetLibrary(GeppettoLibrary)
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_TargetLibrary()
	 * @model required="true"
	 * @generated
	 */
	GeppettoLibrary getTargetLibrary();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DataSource#getTargetLibrary <em>Target Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Library</em>' reference.
	 * @see #getTargetLibrary()
	 * @generated
	 */
	void setTargetLibrary(GeppettoLibrary value);

	/**
	 * Returns the value of the '<em><b>Fetch Variable Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch Variable Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch Variable Query</em>' containment reference.
	 * @see #setFetchVariableQuery(Query)
	 * @see org.geppetto.model.GeppettoPackage#getDataSource_FetchVariableQuery()
	 * @model containment="true"
	 * @generated
	 */
	Query getFetchVariableQuery();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DataSource#getFetchVariableQuery <em>Fetch Variable Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch Variable Query</em>' containment reference.
	 * @see #getFetchVariableQuery()
	 * @generated
	 */
	void setFetchVariableQuery(Query value);

} // DataSource
