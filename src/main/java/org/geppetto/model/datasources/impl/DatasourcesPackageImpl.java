/**
 */
package org.geppetto.model.datasources.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.geppetto.model.GeppettoPackage;

import org.geppetto.model.datasources.AQueryResult;
import org.geppetto.model.datasources.CompoundQuery;
import org.geppetto.model.datasources.CompoundRefQuery;
import org.geppetto.model.datasources.DataSource;
import org.geppetto.model.datasources.DataSourceLibraryConfiguration;
import org.geppetto.model.datasources.DatasourcesFactory;
import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.ProcessQuery;
import org.geppetto.model.datasources.Query;
import org.geppetto.model.datasources.QueryMatchingCriteria;
import org.geppetto.model.datasources.QueryResult;
import org.geppetto.model.datasources.QueryResults;
import org.geppetto.model.datasources.RunnableQuery;
import org.geppetto.model.datasources.SerializableQueryResult;
import org.geppetto.model.datasources.SimpleQuery;

import org.geppetto.model.impl.GeppettoPackageImpl;

import org.geppetto.model.types.TypesPackage;

import org.geppetto.model.types.impl.TypesPackageImpl;

import org.geppetto.model.values.ValuesPackage;

import org.geppetto.model.values.impl.ValuesPackageImpl;

import org.geppetto.model.variables.VariablesPackage;

import org.geppetto.model.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasourcesPackageImpl extends EPackageImpl implements DatasourcesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceLibraryConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundRefQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aQueryResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableQueryResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryMatchingCriteriaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.geppetto.model.datasources.DatasourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasourcesPackageImpl()
	{
		super(eNS_URI, DatasourcesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatasourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasourcesPackage init()
	{
		if (isInited) return (DatasourcesPackage)EPackage.Registry.INSTANCE.getEPackage(DatasourcesPackage.eNS_URI);

		// Obtain or create and register package
		DatasourcesPackageImpl theDatasourcesPackage = (DatasourcesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasourcesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasourcesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeppettoPackageImpl theGeppettoPackage = (GeppettoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI) instanceof GeppettoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI) : GeppettoPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);

		// Create package meta-data objects
		theDatasourcesPackage.createPackageContents();
		theGeppettoPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theDatasourcesPackage.initializePackageContents();
		theGeppettoPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasourcesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasourcesPackage.eNS_URI, theDatasourcesPackage);
		return theDatasourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource()
	{
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_DataSourceService()
	{
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_LibraryConfigurations()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Url()
	{
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_Queries()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_DependenciesLibrary()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_TargetLibrary()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_FetchVariableQuery()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceLibraryConfiguration()
	{
		return dataSourceLibraryConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceLibraryConfiguration_Library()
	{
		return (EReference)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceLibraryConfiguration_ModelInterpreterId()
	{
		return (EAttribute)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceLibraryConfiguration_Format()
	{
		return (EAttribute)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery()
	{
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Description()
	{
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_MatchingCriteria()
	{
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_RunForCount()
	{
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ReturnType()
	{
		return (EReference)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessQuery()
	{
		return processQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessQuery_Parameters()
	{
		return (EReference)processQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessQuery_QueryProcessorId()
	{
		return (EAttribute)processQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleQuery()
	{
		return simpleQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleQuery_Query()
	{
		return (EAttribute)simpleQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleQuery_CountQuery()
	{
		return (EAttribute)simpleQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundQuery()
	{
		return compoundQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundQuery_QueryChain()
	{
		return (EReference)compoundQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundRefQuery()
	{
		return compoundRefQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundRefQuery_QueryChain()
	{
		return (EReference)compoundRefQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResults()
	{
		return queryResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResults_Id()
	{
		return (EAttribute)queryResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResults_Header()
	{
		return (EAttribute)queryResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryResults_Results()
	{
		return (EReference)queryResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQueryResults__GetValue__String_int()
	{
		return queryResultsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableQuery()
	{
		return runnableQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableQuery_TargetVariablePath()
	{
		return (EAttribute)runnableQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableQuery_QueryPath()
	{
		return (EAttribute)runnableQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAQueryResult()
	{
		return aQueryResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResult()
	{
		return queryResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResult_Values()
	{
		return (EAttribute)queryResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializableQueryResult()
	{
		return serializableQueryResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializableQueryResult_Values()
	{
		return (EAttribute)serializableQueryResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryMatchingCriteria()
	{
		return queryMatchingCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMatchingCriteria_Type()
	{
		return (EReference)queryMatchingCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasourcesFactory getDatasourcesFactory()
	{
		return (DatasourcesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__DATA_SOURCE_SERVICE);
		createEReference(dataSourceEClass, DATA_SOURCE__LIBRARY_CONFIGURATIONS);
		createEAttribute(dataSourceEClass, DATA_SOURCE__URL);
		createEReference(dataSourceEClass, DATA_SOURCE__QUERIES);
		createEReference(dataSourceEClass, DATA_SOURCE__DEPENDENCIES_LIBRARY);
		createEReference(dataSourceEClass, DATA_SOURCE__TARGET_LIBRARY);
		createEReference(dataSourceEClass, DATA_SOURCE__FETCH_VARIABLE_QUERY);

		dataSourceLibraryConfigurationEClass = createEClass(DATA_SOURCE_LIBRARY_CONFIGURATION);
		createEReference(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY);
		createEAttribute(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID);
		createEAttribute(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__DESCRIPTION);
		createEReference(queryEClass, QUERY__MATCHING_CRITERIA);
		createEAttribute(queryEClass, QUERY__RUN_FOR_COUNT);
		createEReference(queryEClass, QUERY__RETURN_TYPE);

		processQueryEClass = createEClass(PROCESS_QUERY);
		createEReference(processQueryEClass, PROCESS_QUERY__PARAMETERS);
		createEAttribute(processQueryEClass, PROCESS_QUERY__QUERY_PROCESSOR_ID);

		simpleQueryEClass = createEClass(SIMPLE_QUERY);
		createEAttribute(simpleQueryEClass, SIMPLE_QUERY__QUERY);
		createEAttribute(simpleQueryEClass, SIMPLE_QUERY__COUNT_QUERY);

		compoundQueryEClass = createEClass(COMPOUND_QUERY);
		createEReference(compoundQueryEClass, COMPOUND_QUERY__QUERY_CHAIN);

		compoundRefQueryEClass = createEClass(COMPOUND_REF_QUERY);
		createEReference(compoundRefQueryEClass, COMPOUND_REF_QUERY__QUERY_CHAIN);

		queryResultsEClass = createEClass(QUERY_RESULTS);
		createEAttribute(queryResultsEClass, QUERY_RESULTS__ID);
		createEAttribute(queryResultsEClass, QUERY_RESULTS__HEADER);
		createEReference(queryResultsEClass, QUERY_RESULTS__RESULTS);
		createEOperation(queryResultsEClass, QUERY_RESULTS___GET_VALUE__STRING_INT);

		runnableQueryEClass = createEClass(RUNNABLE_QUERY);
		createEAttribute(runnableQueryEClass, RUNNABLE_QUERY__TARGET_VARIABLE_PATH);
		createEAttribute(runnableQueryEClass, RUNNABLE_QUERY__QUERY_PATH);

		aQueryResultEClass = createEClass(AQUERY_RESULT);

		queryResultEClass = createEClass(QUERY_RESULT);
		createEAttribute(queryResultEClass, QUERY_RESULT__VALUES);

		serializableQueryResultEClass = createEClass(SERIALIZABLE_QUERY_RESULT);
		createEAttribute(serializableQueryResultEClass, SERIALIZABLE_QUERY_RESULT__VALUES);

		queryMatchingCriteriaEClass = createEClass(QUERY_MATCHING_CRITERIA);
		createEReference(queryMatchingCriteriaEClass, QUERY_MATCHING_CRITERIA__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeppettoPackage theGeppettoPackage = (GeppettoPackage)EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSourceEClass.getESuperTypes().add(theGeppettoPackage.getNode());
		queryEClass.getESuperTypes().add(theGeppettoPackage.getNode());
		processQueryEClass.getESuperTypes().add(this.getQuery());
		simpleQueryEClass.getESuperTypes().add(this.getQuery());
		compoundQueryEClass.getESuperTypes().add(this.getQuery());
		compoundRefQueryEClass.getESuperTypes().add(this.getQuery());
		queryResultEClass.getESuperTypes().add(this.getAQueryResult());
		serializableQueryResultEClass.getESuperTypes().add(this.getAQueryResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_DataSourceService(), theXMLTypePackage.getString(), "dataSourceService", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_LibraryConfigurations(), this.getDataSourceLibraryConfiguration(), null, "libraryConfigurations", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Queries(), this.getQuery(), null, "queries", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_DependenciesLibrary(), theGeppettoPackage.getGeppettoLibrary(), null, "dependenciesLibrary", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_TargetLibrary(), theGeppettoPackage.getGeppettoLibrary(), null, "targetLibrary", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_FetchVariableQuery(), this.getQuery(), null, "fetchVariableQuery", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceLibraryConfigurationEClass, DataSourceLibraryConfiguration.class, "DataSourceLibraryConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSourceLibraryConfiguration_Library(), theGeppettoPackage.getGeppettoLibrary(), null, "library", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceLibraryConfiguration_ModelInterpreterId(), theXMLTypePackage.getString(), "modelInterpreterId", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceLibraryConfiguration_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_MatchingCriteria(), this.getQueryMatchingCriteria(), null, "matchingCriteria", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_RunForCount(), theXMLTypePackage.getBoolean(), "runForCount", "true", 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ReturnType(), theTypesPackage.getType(), null, "returnType", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processQueryEClass, ProcessQuery.class, "ProcessQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessQuery_Parameters(), theGeppettoPackage.getStringToStringMap(), null, "parameters", null, 0, -1, ProcessQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessQuery_QueryProcessorId(), theXMLTypePackage.getString(), "queryProcessorId", null, 1, 1, ProcessQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleQueryEClass, SimpleQuery.class, "SimpleQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleQuery_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, SimpleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleQuery_CountQuery(), theXMLTypePackage.getString(), "countQuery", null, 1, 1, SimpleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundQueryEClass, CompoundQuery.class, "CompoundQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundQuery_QueryChain(), this.getQuery(), null, "queryChain", null, 1, -1, CompoundQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundRefQueryEClass, CompoundRefQuery.class, "CompoundRefQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundRefQuery_QueryChain(), this.getQuery(), null, "queryChain", null, 1, -1, CompoundRefQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryResultsEClass, QueryResults.class, "QueryResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResults_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryResults_Header(), theXMLTypePackage.getString(), "header", null, 0, -1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryResults_Results(), this.getAQueryResult(), null, "results", null, 0, -1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getQueryResults__GetValue__String_int(), ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(runnableQueryEClass, RunnableQuery.class, "RunnableQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnableQuery_TargetVariablePath(), theXMLTypePackage.getString(), "targetVariablePath", null, 1, 1, RunnableQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnableQuery_QueryPath(), theXMLTypePackage.getString(), "queryPath", null, 1, 1, RunnableQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aQueryResultEClass, AQueryResult.class, "AQueryResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryResultEClass, QueryResult.class, "QueryResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResult_Values(), ecorePackage.getEJavaObject(), "values", null, 1, -1, QueryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializableQueryResultEClass, SerializableQueryResult.class, "SerializableQueryResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerializableQueryResult_Values(), theXMLTypePackage.getString(), "values", null, 1, -1, SerializableQueryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryMatchingCriteriaEClass, QueryMatchingCriteria.class, "QueryMatchingCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryMatchingCriteria_Type(), theTypesPackage.getType(), null, "type", null, 0, -1, QueryMatchingCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DatasourcesPackageImpl
