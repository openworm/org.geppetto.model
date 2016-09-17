/**
 */
package org.geppetto.model.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeppettoFactoryImpl extends EFactoryImpl implements GeppettoFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeppettoFactory init()
	{
		try
		{
			GeppettoFactory theGeppettoFactory = (GeppettoFactory)EPackage.Registry.INSTANCE.getEFactory(GeppettoPackage.eNS_URI);
			if (theGeppettoFactory != null)
			{
				return theGeppettoFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeppettoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoFactoryImpl()
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
			case GeppettoPackage.GEPPETTO_MODEL: return createGeppettoModel();
			case GeppettoPackage.GEPPETTO_LIBRARY: return createGeppettoLibrary();
			case GeppettoPackage.LIBRARY_MANAGER: return createLibraryManager();
			case GeppettoPackage.EXPERIMENT_STATE: return createExperimentState();
			case GeppettoPackage.VARIABLE_VALUE: return createVariableValue();
			case GeppettoPackage.TAG: return createTag();
			case GeppettoPackage.DOMAIN_MODEL: return createDomainModel();
			case GeppettoPackage.MODEL_FORMAT: return createModelFormat();
			case GeppettoPackage.EXTERNAL_DOMAIN_MODEL: return createExternalDomainModel();
			case GeppettoPackage.DATA_SOURCE: return createDataSource();
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION: return createDataSourceLibraryConfiguration();
			case GeppettoPackage.PROCESS_QUERY: return createProcessQuery();
			case GeppettoPackage.SIMPLE_QUERY: return createSimpleQuery();
			case GeppettoPackage.COMPOUND_QUERY: return createCompoundQuery();
			case GeppettoPackage.QUERY_RESULTS: return createQueryResults();
			case GeppettoPackage.QUERY_RESULT: return createQueryResult();
			case GeppettoPackage.SERIALIZABLE_QUERY_RESULT: return createSerializableQueryResult();
			case GeppettoPackage.QUERY_MATCHING_CRITERIA: return createQueryMatchingCriteria();
			case GeppettoPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case GeppettoPackage.RUNNABLE_QUERY: return createRunnableQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case GeppettoPackage.FILE_FORMAT:
				return createFileFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case GeppettoPackage.FILE_FORMAT:
				return convertFileFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoModel createGeppettoModel()
	{
		GeppettoModelImpl geppettoModel = new GeppettoModelImpl();
		return geppettoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary createGeppettoLibrary()
	{
		GeppettoLibraryImpl geppettoLibrary = new GeppettoLibraryImpl();
		return geppettoLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryManager createLibraryManager()
	{
		LibraryManagerImpl libraryManager = new LibraryManagerImpl();
		return libraryManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentState createExperimentState()
	{
		ExperimentStateImpl experimentState = new ExperimentStateImpl();
		return experimentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue createVariableValue()
	{
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag()
	{
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel()
	{
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFormat createModelFormat()
	{
		ModelFormatImpl modelFormat = new ModelFormatImpl();
		return modelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDomainModel createExternalDomainModel()
	{
		ExternalDomainModelImpl externalDomainModel = new ExternalDomainModelImpl();
		return externalDomainModel;
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
	public Map.Entry<String, String> createStringToStringMap()
	{
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
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
	public FileFormat createFileFormatFromString(EDataType eDataType, String initialValue)
	{
		FileFormat result = FileFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileFormatToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoPackage getGeppettoPackage()
	{
		return (GeppettoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeppettoPackage getPackage()
	{
		return GeppettoPackage.eINSTANCE;
	}

} //GeppettoFactoryImpl
