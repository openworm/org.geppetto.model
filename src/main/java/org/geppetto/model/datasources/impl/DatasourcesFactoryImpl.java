/**
 */
package org.geppetto.model.datasources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.datasources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasourcesFactoryImpl extends EFactoryImpl implements DatasourcesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasourcesFactory init()
	{
		try
		{
			DatasourcesFactory theDatasourcesFactory = (DatasourcesFactory)EPackage.Registry.INSTANCE.getEFactory(DatasourcesPackage.eNS_URI);
			if (theDatasourcesFactory != null)
			{
				return theDatasourcesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasourcesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DatasourcesPackage.DATA_SOURCE: return createDataSource();
			case DatasourcesPackage.DATA_SOURCE_LIBRARY_CONFIGURATION: return createDataSourceLibraryConfiguration();
			case DatasourcesPackage.PROCESS_QUERY: return createProcessQuery();
			case DatasourcesPackage.SIMPLE_QUERY: return createSimpleQuery();
			case DatasourcesPackage.COMPOUND_QUERY: return createCompoundQuery();
			case DatasourcesPackage.COMPOUND_REF_QUERY: return createCompoundRefQuery();
			case DatasourcesPackage.QUERY_RESULTS: return createQueryResults();
			case DatasourcesPackage.RUNNABLE_QUERY: return createRunnableQuery();
			case DatasourcesPackage.QUERY_RESULT: return createQueryResult();
			case DatasourcesPackage.SERIALIZABLE_QUERY_RESULT: return createSerializableQueryResult();
			case DatasourcesPackage.QUERY_MATCHING_CRITERIA: return createQueryMatchingCriteria();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource()
	{
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceLibraryConfiguration createDataSourceLibraryConfiguration()
	{
		DataSourceLibraryConfigurationImpl dataSourceLibraryConfiguration = new DataSourceLibraryConfigurationImpl();
		return dataSourceLibraryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessQuery createProcessQuery()
	{
		ProcessQueryImpl processQuery = new ProcessQueryImpl();
		return processQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuery createSimpleQuery()
	{
		SimpleQueryImpl simpleQuery = new SimpleQueryImpl();
		return simpleQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundQuery createCompoundQuery()
	{
		CompoundQueryImpl compoundQuery = new CompoundQueryImpl();
		return compoundQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundRefQuery createCompoundRefQuery()
	{
		CompoundRefQueryImpl compoundRefQuery = new CompoundRefQueryImpl();
		return compoundRefQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResults createQueryResults()
	{
		QueryResultsImpl queryResults = new QueryResultsImpl();
		return queryResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableQuery createRunnableQuery()
	{
		RunnableQueryImpl runnableQuery = new RunnableQueryImpl();
		return runnableQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResult createQueryResult()
	{
		QueryResultImpl queryResult = new QueryResultImpl();
		return queryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializableQueryResult createSerializableQueryResult()
	{
		SerializableQueryResultImpl serializableQueryResult = new SerializableQueryResultImpl();
		return serializableQueryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryMatchingCriteria createQueryMatchingCriteria()
	{
		QueryMatchingCriteriaImpl queryMatchingCriteria = new QueryMatchingCriteriaImpl();
		return queryMatchingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasourcesPackage getDatasourcesPackage()
	{
		return (DatasourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasourcesPackage getPackage()
	{
		return DatasourcesPackage.eINSTANCE;
	}

} //DatasourcesFactoryImpl
