/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.GeppettoPackage
 * @generated
 */
public interface GeppettoFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeppettoFactory eINSTANCE = org.geppetto.model.impl.GeppettoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	GeppettoModel createGeppettoModel();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	GeppettoLibrary createGeppettoLibrary();

	/**
	 * Returns a new object of class '<em>Library Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Manager</em>'.
	 * @generated
	 */
	LibraryManager createLibraryManager();

	/**
	 * Returns a new object of class '<em>Experiment State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment State</em>'.
	 * @generated
	 */
	ExperimentState createExperimentState();

	/**
	 * Returns a new object of class '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Value</em>'.
	 * @generated
	 */
	VariableValue createVariableValue();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Model Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Format</em>'.
	 * @generated
	 */
	ModelFormat createModelFormat();

	/**
	 * Returns a new object of class '<em>External Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Domain Model</em>'.
	 * @generated
	 */
	ExternalDomainModel createExternalDomainModel();

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
	 * Returns a new object of class '<em>Query Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Results</em>'.
	 * @generated
	 */
	QueryResults createQueryResults();

	/**
	 * Returns a new object of class '<em>Query Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Result</em>'.
	 * @generated
	 */
	QueryResult createQueryResult();

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
	GeppettoPackage getGeppettoPackage();

} //GeppettoFactory
