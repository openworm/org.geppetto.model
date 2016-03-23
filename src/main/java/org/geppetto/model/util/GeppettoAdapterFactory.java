/**
 */
package org.geppetto.model.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.GeppettoPackage
 * @generated
 */
public class GeppettoAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeppettoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = GeppettoPackage.eINSTANCE;
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
	protected GeppettoSwitch<Adapter> modelSwitch =
		new GeppettoSwitch<Adapter>()
		{
			@Override
			public Adapter caseGeppettoModel(GeppettoModel object)
			{
				return createGeppettoModelAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGeppettoLibrary(GeppettoLibrary object)
			{
				return createGeppettoLibraryAdapter();
			}
			@Override
			public Adapter caseLibraryManager(LibraryManager object)
			{
				return createLibraryManagerAdapter();
			}
			@Override
			public Adapter caseExperimentState(ExperimentState object)
			{
				return createExperimentStateAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object)
			{
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseTag(Tag object)
			{
				return createTagAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object)
			{
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseModelFormat(ModelFormat object)
			{
				return createModelFormatAdapter();
			}
			@Override
			public Adapter caseExternalDomainModel(ExternalDomainModel object)
			{
				return createExternalDomainModelAdapter();
			}
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
			public Adapter caseQueryResults(QueryResults object)
			{
				return createQueryResultsAdapter();
			}
			@Override
			public Adapter caseQueryResult(QueryResult object)
			{
				return createQueryResultAdapter();
			}
			@Override
			public Adapter caseQueryMatchingCriteria(QueryMatchingCriteria object)
			{
				return createQueryMatchingCriteriaAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object)
			{
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter caseISynchable(ISynchable object)
			{
				return createISynchableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.GeppettoModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.GeppettoModel
	 * @generated
	 */
	public Adapter createGeppettoModelAdapter()
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
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.GeppettoLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.GeppettoLibrary
	 * @generated
	 */
	public Adapter createGeppettoLibraryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.LibraryManager <em>Library Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.LibraryManager
	 * @generated
	 */
	public Adapter createLibraryManagerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ExperimentState <em>Experiment State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ExperimentState
	 * @generated
	 */
	public Adapter createExperimentStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.Tag
	 * @generated
	 */
	public Adapter createTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ModelFormat <em>Model Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ModelFormat
	 * @generated
	 */
	public Adapter createModelFormatAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ExternalDomainModel <em>External Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ExternalDomainModel
	 * @generated
	 */
	public Adapter createExternalDomainModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.DataSourceLibraryConfiguration <em>Data Source Library Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.DataSourceLibraryConfiguration
	 * @generated
	 */
	public Adapter createDataSourceLibraryConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.Query
	 * @generated
	 */
	public Adapter createQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ProcessQuery <em>Process Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ProcessQuery
	 * @generated
	 */
	public Adapter createProcessQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.SimpleQuery <em>Simple Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.SimpleQuery
	 * @generated
	 */
	public Adapter createSimpleQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.CompoundQuery <em>Compound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.CompoundQuery
	 * @generated
	 */
	public Adapter createCompoundQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.QueryResults <em>Query Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.QueryResults
	 * @generated
	 */
	public Adapter createQueryResultsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.QueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.QueryResult
	 * @generated
	 */
	public Adapter createQueryResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.QueryMatchingCriteria <em>Query Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.QueryMatchingCriteria
	 * @generated
	 */
	public Adapter createQueryMatchingCriteriaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter()
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

} //GeppettoAdapterFactory
