/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.datasources.DatasourcesPackage
 * @generated
 */
public interface DatasourcesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasourcesFactory eINSTANCE = org.geppetto.model.datasources.impl.DatasourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Data Source Library Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Library Configuration</em>'.
	 * @generated
	 */
	DataSourceLibraryConfiguration createDataSourceLibraryConfiguration();

	/**
	 * Returns a new object of class '<em>Process Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Query</em>'.
	 * @generated
	 */
	ProcessQuery createProcessQuery();

	/**
	 * Returns a new object of class '<em>Simple Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Query</em>'.
	 * @generated
	 */
	SimpleQuery createSimpleQuery();

	/**
	 * Returns a new object of class '<em>Compound Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Query</em>'.
	 * @generated
	 */
	CompoundQuery createCompoundQuery();

	/**
	 * Returns a new object of class '<em>Compound Ref Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Ref Query</em>'.
	 * @generated
	 */
	CompoundRefQuery createCompoundRefQuery();

	/**
	 * Returns a new object of class '<em>Query Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Results</em>'.
	 * @generated
	 */
	QueryResults createQueryResults();

	/**
	 * Returns a new object of class '<em>Runnable Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Query</em>'.
	 * @generated
	 */
	RunnableQuery createRunnableQuery();

	/**
	 * Returns a new object of class '<em>Query Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Result</em>'.
	 * @generated
	 */
	QueryResult createQueryResult();

	/**
	 * Returns a new object of class '<em>Serializable Query Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializable Query Result</em>'.
	 * @generated
	 */
	SerializableQueryResult createSerializableQueryResult();

	/**
	 * Returns a new object of class '<em>Query Matching Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Matching Criteria</em>'.
	 * @generated
	 */
	QueryMatchingCriteria createQueryMatchingCriteria();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasourcesPackage getDatasourcesPackage();

} //DatasourcesFactory
