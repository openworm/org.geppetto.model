/**
 */
package org.geppetto.model.datasources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.geppetto.model.GeppettoPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.geppetto.model.datasources.DatasourcesFactory
 * @model kind="package"
 * @generated
 */
public interface DatasourcesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/query/src/main/resources/geppettoModel.ecore#//datasources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gep";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasourcesPackage eINSTANCE = org.geppetto.model.datasources.impl.DatasourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.DataSourceImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Data Source Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE_SERVICE = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LIBRARY_CONFIGURATIONS = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__URL = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__QUERIES = GeppettoPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependencies Library</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DEPENDENCIES_LIBRARY = GeppettoPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TARGET_LIBRARY = GeppettoPackage.NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fetch Variable Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FETCH_VARIABLE_QUERY = GeppettoPackage.NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.DataSourceLibraryConfigurationImpl <em>Data Source Library Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.DataSourceLibraryConfigurationImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getDataSourceLibraryConfiguration()
	 * @generated
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Model Interpreter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID = 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Data Source Library Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Source Library Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.QueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 2;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MATCHING_CRITERIA = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Run For Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RUN_FOR_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RETURN_TYPE = GeppettoPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.ProcessQueryImpl <em>Process Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.ProcessQueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getProcessQuery()
	 * @generated
	 */
	int PROCESS_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__ID = QUERY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__NAME = QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__TAGS = QUERY__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__DESCRIPTION = QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__MATCHING_CRITERIA = QUERY__MATCHING_CRITERIA;

	/**
	 * The feature id for the '<em><b>Run For Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__RUN_FOR_COUNT = QUERY__RUN_FOR_COUNT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__RETURN_TYPE = QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__PARAMETERS = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Processor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__QUERY_PROCESSOR_ID = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY___GET_PATH = QUERY___GET_PATH;

	/**
	 * The number of operations of the '<em>Process Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.SimpleQueryImpl <em>Simple Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.SimpleQueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getSimpleQuery()
	 * @generated
	 */
	int SIMPLE_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__ID = QUERY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__NAME = QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__TAGS = QUERY__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__DESCRIPTION = QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__MATCHING_CRITERIA = QUERY__MATCHING_CRITERIA;

	/**
	 * The feature id for the '<em><b>Run For Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__RUN_FOR_COUNT = QUERY__RUN_FOR_COUNT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__RETURN_TYPE = QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__QUERY = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__COUNT_QUERY = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY___GET_PATH = QUERY___GET_PATH;

	/**
	 * The number of operations of the '<em>Simple Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.CompoundQueryImpl <em>Compound Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.CompoundQueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getCompoundQuery()
	 * @generated
	 */
	int COMPOUND_QUERY = 5;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__ID = QUERY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__NAME = QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__TAGS = QUERY__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__DESCRIPTION = QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__MATCHING_CRITERIA = QUERY__MATCHING_CRITERIA;

	/**
	 * The feature id for the '<em><b>Run For Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__RUN_FOR_COUNT = QUERY__RUN_FOR_COUNT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__RETURN_TYPE = QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Query Chain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__QUERY_CHAIN = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY___GET_PATH = QUERY___GET_PATH;

	/**
	 * The number of operations of the '<em>Compound Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.CompoundRefQueryImpl <em>Compound Ref Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.CompoundRefQueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getCompoundRefQuery()
	 * @generated
	 */
	int COMPOUND_REF_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__ID = QUERY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__NAME = QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__TAGS = QUERY__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__DESCRIPTION = QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__MATCHING_CRITERIA = QUERY__MATCHING_CRITERIA;

	/**
	 * The feature id for the '<em><b>Run For Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__RUN_FOR_COUNT = QUERY__RUN_FOR_COUNT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__RETURN_TYPE = QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Query Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY__QUERY_CHAIN = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Ref Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY___GET_PATH = QUERY___GET_PATH;

	/**
	 * The number of operations of the '<em>Compound Ref Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_REF_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.QueryResultsImpl <em>Query Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.QueryResultsImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryResults()
	 * @generated
	 */
	int QUERY_RESULTS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS__ID = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS__HEADER = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Query Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS___GET_VALUE__STRING_INT = 0;

	/**
	 * The number of operations of the '<em>Query Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.RunnableQueryImpl <em>Runnable Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.RunnableQueryImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getRunnableQuery()
	 * @generated
	 */
	int RUNNABLE_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Target Variable Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY__TARGET_VARIABLE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Query Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY__QUERY_PATH = 1;

	/**
	 * The feature id for the '<em><b>Boolean Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY__BOOLEAN_OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Runnable Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Runnable Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.AQueryResultImpl <em>AQuery Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.AQueryResultImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getAQueryResult()
	 * @generated
	 */
	int AQUERY_RESULT = 9;

	/**
	 * The number of structural features of the '<em>AQuery Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>AQuery Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.QueryResultImpl <em>Query Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.QueryResultImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryResult()
	 * @generated
	 */
	int QUERY_RESULT = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT__VALUES = AQUERY_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_FEATURE_COUNT = AQUERY_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_OPERATION_COUNT = AQUERY_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.SerializableQueryResultImpl <em>Serializable Query Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.SerializableQueryResultImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getSerializableQueryResult()
	 * @generated
	 */
	int SERIALIZABLE_QUERY_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_QUERY_RESULT__VALUES = AQUERY_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serializable Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_QUERY_RESULT_FEATURE_COUNT = AQUERY_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Serializable Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_QUERY_RESULT_OPERATION_COUNT = AQUERY_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.impl.QueryMatchingCriteriaImpl <em>Query Matching Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.impl.QueryMatchingCriteriaImpl
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryMatchingCriteria()
	 * @generated
	 */
	int QUERY_MATCHING_CRITERIA = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_MATCHING_CRITERIA__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Query Matching Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_MATCHING_CRITERIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query Matching Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_MATCHING_CRITERIA_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.datasources.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.datasources.BooleanOperator
	 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 13;


	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.geppetto.model.datasources.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.DataSource#getDataSourceService <em>Data Source Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Service</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getDataSourceService()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_DataSourceService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.datasources.DataSource#getLibraryConfigurations <em>Library Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library Configurations</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getLibraryConfigurations()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_LibraryConfigurations();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.DataSource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getUrl()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.datasources.DataSource#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getQueries()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Queries();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.datasources.DataSource#getDependenciesLibrary <em>Dependencies Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies Library</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getDependenciesLibrary()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_DependenciesLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.datasources.DataSource#getTargetLibrary <em>Target Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Library</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getTargetLibrary()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_TargetLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.datasources.DataSource#getFetchVariableQuery <em>Fetch Variable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fetch Variable Query</em>'.
	 * @see org.geppetto.model.datasources.DataSource#getFetchVariableQuery()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_FetchVariableQuery();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration <em>Data Source Library Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Library Configuration</em>'.
	 * @see org.geppetto.model.datasources.DataSourceLibraryConfiguration
	 * @generated
	 */
	EClass getDataSourceLibraryConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see org.geppetto.model.datasources.DataSourceLibraryConfiguration#getLibrary()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EReference getDataSourceLibraryConfiguration_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getModelInterpreterId <em>Model Interpreter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Interpreter Id</em>'.
	 * @see org.geppetto.model.datasources.DataSourceLibraryConfiguration#getModelInterpreterId()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EAttribute getDataSourceLibraryConfiguration_ModelInterpreterId();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.DataSourceLibraryConfiguration#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.geppetto.model.datasources.DataSourceLibraryConfiguration#getFormat()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EAttribute getDataSourceLibraryConfiguration_Format();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.geppetto.model.datasources.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.Query#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.geppetto.model.datasources.Query#getDescription()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.datasources.Query#getMatchingCriteria <em>Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matching Criteria</em>'.
	 * @see org.geppetto.model.datasources.Query#getMatchingCriteria()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_MatchingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.Query#isRunForCount <em>Run For Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run For Count</em>'.
	 * @see org.geppetto.model.datasources.Query#isRunForCount()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_RunForCount();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.datasources.Query#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.geppetto.model.datasources.Query#getReturnType()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.ProcessQuery <em>Process Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Query</em>'.
	 * @see org.geppetto.model.datasources.ProcessQuery
	 * @generated
	 */
	EClass getProcessQuery();

	/**
	 * Returns the meta object for the map '{@link org.geppetto.model.datasources.ProcessQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.geppetto.model.datasources.ProcessQuery#getParameters()
	 * @see #getProcessQuery()
	 * @generated
	 */
	EReference getProcessQuery_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.ProcessQuery#getQueryProcessorId <em>Query Processor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Processor Id</em>'.
	 * @see org.geppetto.model.datasources.ProcessQuery#getQueryProcessorId()
	 * @see #getProcessQuery()
	 * @generated
	 */
	EAttribute getProcessQuery_QueryProcessorId();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.SimpleQuery <em>Simple Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Query</em>'.
	 * @see org.geppetto.model.datasources.SimpleQuery
	 * @generated
	 */
	EClass getSimpleQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.SimpleQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.geppetto.model.datasources.SimpleQuery#getQuery()
	 * @see #getSimpleQuery()
	 * @generated
	 */
	EAttribute getSimpleQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.SimpleQuery#getCountQuery <em>Count Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Query</em>'.
	 * @see org.geppetto.model.datasources.SimpleQuery#getCountQuery()
	 * @see #getSimpleQuery()
	 * @generated
	 */
	EAttribute getSimpleQuery_CountQuery();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.CompoundQuery <em>Compound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Query</em>'.
	 * @see org.geppetto.model.datasources.CompoundQuery
	 * @generated
	 */
	EClass getCompoundQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.datasources.CompoundQuery#getQueryChain <em>Query Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Chain</em>'.
	 * @see org.geppetto.model.datasources.CompoundQuery#getQueryChain()
	 * @see #getCompoundQuery()
	 * @generated
	 */
	EReference getCompoundQuery_QueryChain();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.CompoundRefQuery <em>Compound Ref Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Ref Query</em>'.
	 * @see org.geppetto.model.datasources.CompoundRefQuery
	 * @generated
	 */
	EClass getCompoundRefQuery();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.datasources.CompoundRefQuery#getQueryChain <em>Query Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Query Chain</em>'.
	 * @see org.geppetto.model.datasources.CompoundRefQuery#getQueryChain()
	 * @see #getCompoundRefQuery()
	 * @generated
	 */
	EReference getCompoundRefQuery_QueryChain();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.QueryResults <em>Query Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Results</em>'.
	 * @see org.geppetto.model.datasources.QueryResults
	 * @generated
	 */
	EClass getQueryResults();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.QueryResults#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geppetto.model.datasources.QueryResults#getId()
	 * @see #getQueryResults()
	 * @generated
	 */
	EAttribute getQueryResults_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.datasources.QueryResults#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Header</em>'.
	 * @see org.geppetto.model.datasources.QueryResults#getHeader()
	 * @see #getQueryResults()
	 * @generated
	 */
	EAttribute getQueryResults_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.datasources.QueryResults#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.geppetto.model.datasources.QueryResults#getResults()
	 * @see #getQueryResults()
	 * @generated
	 */
	EReference getQueryResults_Results();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.datasources.QueryResults#getValue(java.lang.String, int) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.geppetto.model.datasources.QueryResults#getValue(java.lang.String, int)
	 * @generated
	 */
	EOperation getQueryResults__GetValue__String_int();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.RunnableQuery <em>Runnable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Query</em>'.
	 * @see org.geppetto.model.datasources.RunnableQuery
	 * @generated
	 */
	EClass getRunnableQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.RunnableQuery#getTargetVariablePath <em>Target Variable Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable Path</em>'.
	 * @see org.geppetto.model.datasources.RunnableQuery#getTargetVariablePath()
	 * @see #getRunnableQuery()
	 * @generated
	 */
	EAttribute getRunnableQuery_TargetVariablePath();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.RunnableQuery#getQueryPath <em>Query Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Path</em>'.
	 * @see org.geppetto.model.datasources.RunnableQuery#getQueryPath()
	 * @see #getRunnableQuery()
	 * @generated
	 */
	EAttribute getRunnableQuery_QueryPath();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.datasources.RunnableQuery#getBooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Operator</em>'.
	 * @see org.geppetto.model.datasources.RunnableQuery#getBooleanOperator()
	 * @see #getRunnableQuery()
	 * @generated
	 */
	EAttribute getRunnableQuery_BooleanOperator();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.AQueryResult <em>AQuery Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AQuery Result</em>'.
	 * @see org.geppetto.model.datasources.AQueryResult
	 * @generated
	 */
	EClass getAQueryResult();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.QueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Result</em>'.
	 * @see org.geppetto.model.datasources.QueryResult
	 * @generated
	 */
	EClass getQueryResult();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.datasources.QueryResult#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.geppetto.model.datasources.QueryResult#getValues()
	 * @see #getQueryResult()
	 * @generated
	 */
	EAttribute getQueryResult_Values();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.SerializableQueryResult <em>Serializable Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable Query Result</em>'.
	 * @see org.geppetto.model.datasources.SerializableQueryResult
	 * @generated
	 */
	EClass getSerializableQueryResult();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.datasources.SerializableQueryResult#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.geppetto.model.datasources.SerializableQueryResult#getValues()
	 * @see #getSerializableQueryResult()
	 * @generated
	 */
	EAttribute getSerializableQueryResult_Values();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.datasources.QueryMatchingCriteria <em>Query Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Matching Criteria</em>'.
	 * @see org.geppetto.model.datasources.QueryMatchingCriteria
	 * @generated
	 */
	EClass getQueryMatchingCriteria();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.datasources.QueryMatchingCriteria#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.geppetto.model.datasources.QueryMatchingCriteria#getType()
	 * @see #getQueryMatchingCriteria()
	 * @generated
	 */
	EReference getQueryMatchingCriteria_Type();

	/**
	 * Returns the meta object for enum '{@link org.geppetto.model.datasources.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see org.geppetto.model.datasources.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasourcesFactory getDatasourcesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.DataSourceImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Data Source Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__DATA_SOURCE_SERVICE = eINSTANCE.getDataSource_DataSourceService();

		/**
		 * The meta object literal for the '<em><b>Library Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__LIBRARY_CONFIGURATIONS = eINSTANCE.getDataSource_LibraryConfigurations();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__URL = eINSTANCE.getDataSource_Url();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__QUERIES = eINSTANCE.getDataSource_Queries();

		/**
		 * The meta object literal for the '<em><b>Dependencies Library</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DEPENDENCIES_LIBRARY = eINSTANCE.getDataSource_DependenciesLibrary();

		/**
		 * The meta object literal for the '<em><b>Target Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__TARGET_LIBRARY = eINSTANCE.getDataSource_TargetLibrary();

		/**
		 * The meta object literal for the '<em><b>Fetch Variable Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__FETCH_VARIABLE_QUERY = eINSTANCE.getDataSource_FetchVariableQuery();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.DataSourceLibraryConfigurationImpl <em>Data Source Library Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.DataSourceLibraryConfigurationImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getDataSourceLibraryConfiguration()
		 * @generated
		 */
		EClass DATA_SOURCE_LIBRARY_CONFIGURATION = eINSTANCE.getDataSourceLibraryConfiguration();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY = eINSTANCE.getDataSourceLibraryConfiguration_Library();

		/**
		 * The meta object literal for the '<em><b>Model Interpreter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID = eINSTANCE.getDataSourceLibraryConfiguration_ModelInterpreterId();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT = eINSTANCE.getDataSourceLibraryConfiguration_Format();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.QueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__DESCRIPTION = eINSTANCE.getQuery_Description();

		/**
		 * The meta object literal for the '<em><b>Matching Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__MATCHING_CRITERIA = eINSTANCE.getQuery_MatchingCriteria();

		/**
		 * The meta object literal for the '<em><b>Run For Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__RUN_FOR_COUNT = eINSTANCE.getQuery_RunForCount();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__RETURN_TYPE = eINSTANCE.getQuery_ReturnType();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.ProcessQueryImpl <em>Process Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.ProcessQueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getProcessQuery()
		 * @generated
		 */
		EClass PROCESS_QUERY = eINSTANCE.getProcessQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_QUERY__PARAMETERS = eINSTANCE.getProcessQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Query Processor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_QUERY__QUERY_PROCESSOR_ID = eINSTANCE.getProcessQuery_QueryProcessorId();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.SimpleQueryImpl <em>Simple Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.SimpleQueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getSimpleQuery()
		 * @generated
		 */
		EClass SIMPLE_QUERY = eINSTANCE.getSimpleQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_QUERY__QUERY = eINSTANCE.getSimpleQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Count Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_QUERY__COUNT_QUERY = eINSTANCE.getSimpleQuery_CountQuery();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.CompoundQueryImpl <em>Compound Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.CompoundQueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getCompoundQuery()
		 * @generated
		 */
		EClass COMPOUND_QUERY = eINSTANCE.getCompoundQuery();

		/**
		 * The meta object literal for the '<em><b>Query Chain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_QUERY__QUERY_CHAIN = eINSTANCE.getCompoundQuery_QueryChain();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.CompoundRefQueryImpl <em>Compound Ref Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.CompoundRefQueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getCompoundRefQuery()
		 * @generated
		 */
		EClass COMPOUND_REF_QUERY = eINSTANCE.getCompoundRefQuery();

		/**
		 * The meta object literal for the '<em><b>Query Chain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_REF_QUERY__QUERY_CHAIN = eINSTANCE.getCompoundRefQuery_QueryChain();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.QueryResultsImpl <em>Query Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.QueryResultsImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryResults()
		 * @generated
		 */
		EClass QUERY_RESULTS = eINSTANCE.getQueryResults();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESULTS__ID = eINSTANCE.getQueryResults_Id();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESULTS__HEADER = eINSTANCE.getQueryResults_Header();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_RESULTS__RESULTS = eINSTANCE.getQueryResults_Results();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUERY_RESULTS___GET_VALUE__STRING_INT = eINSTANCE.getQueryResults__GetValue__String_int();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.RunnableQueryImpl <em>Runnable Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.RunnableQueryImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getRunnableQuery()
		 * @generated
		 */
		EClass RUNNABLE_QUERY = eINSTANCE.getRunnableQuery();

		/**
		 * The meta object literal for the '<em><b>Target Variable Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE_QUERY__TARGET_VARIABLE_PATH = eINSTANCE.getRunnableQuery_TargetVariablePath();

		/**
		 * The meta object literal for the '<em><b>Query Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE_QUERY__QUERY_PATH = eINSTANCE.getRunnableQuery_QueryPath();

		/**
		 * The meta object literal for the '<em><b>Boolean Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE_QUERY__BOOLEAN_OPERATOR = eINSTANCE.getRunnableQuery_BooleanOperator();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.AQueryResultImpl <em>AQuery Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.AQueryResultImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getAQueryResult()
		 * @generated
		 */
		EClass AQUERY_RESULT = eINSTANCE.getAQueryResult();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.QueryResultImpl <em>Query Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.QueryResultImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryResult()
		 * @generated
		 */
		EClass QUERY_RESULT = eINSTANCE.getQueryResult();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_RESULT__VALUES = eINSTANCE.getQueryResult_Values();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.SerializableQueryResultImpl <em>Serializable Query Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.SerializableQueryResultImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getSerializableQueryResult()
		 * @generated
		 */
		EClass SERIALIZABLE_QUERY_RESULT = eINSTANCE.getSerializableQueryResult();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIALIZABLE_QUERY_RESULT__VALUES = eINSTANCE.getSerializableQueryResult_Values();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.impl.QueryMatchingCriteriaImpl <em>Query Matching Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.impl.QueryMatchingCriteriaImpl
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getQueryMatchingCriteria()
		 * @generated
		 */
		EClass QUERY_MATCHING_CRITERIA = eINSTANCE.getQueryMatchingCriteria();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_MATCHING_CRITERIA__TYPE = eINSTANCE.getQueryMatchingCriteria_Type();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.datasources.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.datasources.BooleanOperator
		 * @see org.geppetto.model.datasources.impl.DatasourcesPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //DatasourcesPackage
