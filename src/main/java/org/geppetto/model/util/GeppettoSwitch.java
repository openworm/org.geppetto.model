/**
 */
package org.geppetto.model.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.geppetto.model.*;

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
 * @see org.geppetto.model.GeppettoPackage
 * @generated
 */
public class GeppettoSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeppettoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = GeppettoPackage.eINSTANCE;
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
			case GeppettoPackage.GEPPETTO_MODEL:
			{
				GeppettoModel geppettoModel = (GeppettoModel)theEObject;
				T result = caseGeppettoModel(geppettoModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseISynchable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.GEPPETTO_LIBRARY:
			{
				GeppettoLibrary geppettoLibrary = (GeppettoLibrary)theEObject;
				T result = caseGeppettoLibrary(geppettoLibrary);
				if (result == null) result = caseNode(geppettoLibrary);
				if (result == null) result = caseISynchable(geppettoLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.LIBRARY_MANAGER:
			{
				LibraryManager libraryManager = (LibraryManager)theEObject;
				T result = caseLibraryManager(libraryManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.EXPERIMENT_STATE:
			{
				ExperimentState experimentState = (ExperimentState)theEObject;
				T result = caseExperimentState(experimentState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.VARIABLE_VALUE:
			{
				VariableValue variableValue = (VariableValue)theEObject;
				T result = caseVariableValue(variableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.TAG:
			{
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseISynchable(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.DOMAIN_MODEL:
			{
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.MODEL_FORMAT:
			{
				ModelFormat modelFormat = (ModelFormat)theEObject;
				T result = caseModelFormat(modelFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.EXTERNAL_DOMAIN_MODEL:
			{
				ExternalDomainModel externalDomainModel = (ExternalDomainModel)theEObject;
				T result = caseExternalDomainModel(externalDomainModel);
				if (result == null) result = caseDomainModel(externalDomainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.DATA_SOURCE:
			{
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseNode(dataSource);
				if (result == null) result = caseISynchable(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION:
			{
				DataSourceLibraryConfiguration dataSourceLibraryConfiguration = (DataSourceLibraryConfiguration)theEObject;
				T result = caseDataSourceLibraryConfiguration(dataSourceLibraryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.QUERY:
			{
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseNode(query);
				if (result == null) result = caseISynchable(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.PROCESS_QUERY:
			{
				ProcessQuery processQuery = (ProcessQuery)theEObject;
				T result = caseProcessQuery(processQuery);
				if (result == null) result = caseQuery(processQuery);
				if (result == null) result = caseNode(processQuery);
				if (result == null) result = caseISynchable(processQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.SIMPLE_QUERY:
			{
				SimpleQuery simpleQuery = (SimpleQuery)theEObject;
				T result = caseSimpleQuery(simpleQuery);
				if (result == null) result = caseQuery(simpleQuery);
				if (result == null) result = caseNode(simpleQuery);
				if (result == null) result = caseISynchable(simpleQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.COMPOUND_QUERY:
			{
				CompoundQuery compoundQuery = (CompoundQuery)theEObject;
				T result = caseCompoundQuery(compoundQuery);
				if (result == null) result = caseQuery(compoundQuery);
				if (result == null) result = caseNode(compoundQuery);
				if (result == null) result = caseISynchable(compoundQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.COMPOUND_REF_QUERY:
			{
				CompoundRefQuery compoundRefQuery = (CompoundRefQuery)theEObject;
				T result = caseCompoundRefQuery(compoundRefQuery);
				if (result == null) result = caseQuery(compoundRefQuery);
				if (result == null) result = caseNode(compoundRefQuery);
				if (result == null) result = caseISynchable(compoundRefQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.QUERY_RESULTS:
			{
				QueryResults queryResults = (QueryResults)theEObject;
				T result = caseQueryResults(queryResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.RUNNABLE_QUERY:
			{
				RunnableQuery runnableQuery = (RunnableQuery)theEObject;
				T result = caseRunnableQuery(runnableQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.AQUERY_RESULT:
			{
				AQueryResult aQueryResult = (AQueryResult)theEObject;
				T result = caseAQueryResult(aQueryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.QUERY_RESULT:
			{
				QueryResult queryResult = (QueryResult)theEObject;
				T result = caseQueryResult(queryResult);
				if (result == null) result = caseAQueryResult(queryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.SERIALIZABLE_QUERY_RESULT:
			{
				SerializableQueryResult serializableQueryResult = (SerializableQueryResult)theEObject;
				T result = caseSerializableQueryResult(serializableQueryResult);
				if (result == null) result = caseAQueryResult(serializableQueryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.QUERY_MATCHING_CRITERIA:
			{
				QueryMatchingCriteria queryMatchingCriteria = (QueryMatchingCriteria)theEObject;
				T result = caseQueryMatchingCriteria(queryMatchingCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.STRING_TO_STRING_MAP:
			{
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeppettoPackage.ISYNCHABLE:
			{
				ISynchable iSynchable = (ISynchable)theEObject;
				T result = caseISynchable(iSynchable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeppettoModel(GeppettoModel object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeppettoLibrary(GeppettoLibrary object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryManager(LibraryManager object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentState(ExperimentState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableValue(VariableValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFormat(ModelFormat object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDomainModel(ExternalDomainModel object)
	{
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMap(Map.Entry<String, String> object)
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

} //GeppettoSwitch
