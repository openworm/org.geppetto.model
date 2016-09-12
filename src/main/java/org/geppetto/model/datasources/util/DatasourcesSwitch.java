/**
 */
package org.geppetto.model.datasources.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.geppetto.model.ISynchable;
import org.geppetto.model.Node;

import org.geppetto.model.datasources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.datasources.DatasourcesPackage
 * @generated
 */
public class DatasourcesSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatasourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasourcesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DatasourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case DatasourcesPackage.DATA_SOURCE:
			{
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseNode(dataSource);
				if (result == null) result = caseISynchable(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.DATA_SOURCE_LIBRARY_CONFIGURATION:
			{
				DataSourceLibraryConfiguration dataSourceLibraryConfiguration = (DataSourceLibraryConfiguration)theEObject;
				T result = caseDataSourceLibraryConfiguration(dataSourceLibraryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.QUERY:
			{
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseNode(query);
				if (result == null) result = caseISynchable(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.PROCESS_QUERY:
			{
				ProcessQuery processQuery = (ProcessQuery)theEObject;
				T result = caseProcessQuery(processQuery);
				if (result == null) result = caseQuery(processQuery);
				if (result == null) result = caseNode(processQuery);
				if (result == null) result = caseISynchable(processQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.SIMPLE_QUERY:
			{
				SimpleQuery simpleQuery = (SimpleQuery)theEObject;
				T result = caseSimpleQuery(simpleQuery);
				if (result == null) result = caseQuery(simpleQuery);
				if (result == null) result = caseNode(simpleQuery);
				if (result == null) result = caseISynchable(simpleQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.COMPOUND_QUERY:
			{
				CompoundQuery compoundQuery = (CompoundQuery)theEObject;
				T result = caseCompoundQuery(compoundQuery);
				if (result == null) result = caseQuery(compoundQuery);
				if (result == null) result = caseNode(compoundQuery);
				if (result == null) result = caseISynchable(compoundQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.COMPOUND_REF_QUERY:
			{
				CompoundRefQuery compoundRefQuery = (CompoundRefQuery)theEObject;
				T result = caseCompoundRefQuery(compoundRefQuery);
				if (result == null) result = caseQuery(compoundRefQuery);
				if (result == null) result = caseNode(compoundRefQuery);
				if (result == null) result = caseISynchable(compoundRefQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.QUERY_RESULTS:
			{
				QueryResults queryResults = (QueryResults)theEObject;
				T result = caseQueryResults(queryResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.RUNNABLE_QUERY:
			{
				RunnableQuery runnableQuery = (RunnableQuery)theEObject;
				T result = caseRunnableQuery(runnableQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.AQUERY_RESULT:
			{
				AQueryResult aQueryResult = (AQueryResult)theEObject;
				T result = caseAQueryResult(aQueryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.QUERY_RESULT:
			{
				QueryResult queryResult = (QueryResult)theEObject;
				T result = caseQueryResult(queryResult);
				if (result == null) result = caseAQueryResult(queryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.SERIALIZABLE_QUERY_RESULT:
			{
				SerializableQueryResult serializableQueryResult = (SerializableQueryResult)theEObject;
				T result = caseSerializableQueryResult(serializableQueryResult);
				if (result == null) result = caseAQueryResult(serializableQueryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatasourcesPackage.QUERY_MATCHING_CRITERIA:
			{
				QueryMatchingCriteria queryMatchingCriteria = (QueryMatchingCriteria)theEObject;
				T result = caseQueryMatchingCriteria(queryMatchingCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Library Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Library Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceLibraryConfiguration(DataSourceLibraryConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessQuery(ProcessQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQuery(SimpleQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundQuery(CompoundQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Ref Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Ref Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundRefQuery(CompoundRefQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryResults(QueryResults object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableQuery(RunnableQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AQuery Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AQuery Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAQueryResult(AQueryResult object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryResult(QueryResult object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serializable Query Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serializable Query Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializableQueryResult(SerializableQueryResult object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Matching Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Matching Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryMatchingCriteria(QueryMatchingCriteria object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISynchable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISynchable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISynchable(ISynchable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //DatasourcesSwitch
