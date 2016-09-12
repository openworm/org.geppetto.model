/**
 */
package org.geppetto.model.datasources.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.ISynchable;
import org.geppetto.model.Node;

import org.geppetto.model.datasources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.datasources.DatasourcesPackage
 * @generated
 */
public class DatasourcesAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatasourcesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasourcesAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DatasourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasourcesSwitch<Adapter> modelSwitch =
		new DatasourcesSwitch<Adapter>()
		{
			@Override
			public Adapter caseDataSource(DataSource object)
			{
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSourceLibraryConfiguration(DataSourceLibraryConfiguration object)
			{
				return createDataSourceLibraryConfigurationAdapter();
			}
			@Override
			public Adapter caseQuery(Query object)
			{
				return createQueryAdapter();
			}
			@Override
			public Adapter caseProcessQuery(ProcessQuery object)
			{
				return createProcessQueryAdapter();
			}
			@Override
			public Adapter caseSimpleQuery(SimpleQuery object)
			{
				return createSimpleQueryAdapter();
			}
			@Override
			public Adapter caseCompoundQuery(CompoundQuery object)
			{
				return createCompoundQueryAdapter();
			}
			@Override
			public Adapter caseCompoundRefQuery(CompoundRefQuery object)
			{
				return createCompoundRefQueryAdapter();
			}
			@Override
			public Adapter caseQueryResults(QueryResults object)
			{
				return createQueryResultsAdapter();
			}
			@Override
			public Adapter caseRunnableQuery(RunnableQuery object)
			{
				return createRunnableQueryAdapter();
			}
			@Override
			public Adapter caseAQueryResult(AQueryResult object)
			{
				return createAQueryResultAdapter();
			}
			@Override
			public Adapter caseQueryResult(QueryResult object)
			{
				return createQueryResultAdapter();
			}
			@Override
			public Adapter caseSerializableQueryResult(SerializableQueryResult object)
			{
				return createSerializableQueryResultAdapter();
			}
			@Override
			public Adapter caseQueryMatchingCriteria(QueryMatchingCriteria object)
			{
				return createQueryMatchingCriteriaAdapter();
			}
			@Override
			public Adapter caseISynchable(ISynchable object)
			{
				return createISynchableAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration <em>Data Source Library Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.DataSourceLibraryConfiguration
	 * @generated
	 */
	public Adapter createDataSourceLibraryConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.Query
	 * @generated
	 */
	public Adapter createQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.ProcessQuery <em>Process Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.ProcessQuery
	 * @generated
	 */
	public Adapter createProcessQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.SimpleQuery <em>Simple Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.SimpleQuery
	 * @generated
	 */
	public Adapter createSimpleQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.CompoundQuery <em>Compound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.CompoundQuery
	 * @generated
	 */
	public Adapter createCompoundQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.CompoundRefQuery <em>Compound Ref Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.CompoundRefQuery
	 * @generated
	 */
	public Adapter createCompoundRefQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.QueryResults <em>Query Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.QueryResults
	 * @generated
	 */
	public Adapter createQueryResultsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.RunnableQuery <em>Runnable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.RunnableQuery
	 * @generated
	 */
	public Adapter createRunnableQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.AQueryResult <em>AQuery Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.AQueryResult
	 * @generated
	 */
	public Adapter createAQueryResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.QueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.QueryResult
	 * @generated
	 */
	public Adapter createQueryResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.SerializableQueryResult <em>Serializable Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.SerializableQueryResult
	 * @generated
	 */
	public Adapter createSerializableQueryResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.datasources.QueryMatchingCriteria <em>Query Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.datasources.QueryMatchingCriteria
	 * @generated
	 */
	public Adapter createQueryMatchingCriteriaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ISynchable <em>ISynchable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ISynchable
	 * @generated
	 */
	public Adapter createISynchableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //DatasourcesAdapterFactory
