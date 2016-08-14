/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.geppetto.model.GeppettoFactory
 * @model kind="package"
 * @generated
 */
public interface GeppettoPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/importValue/src/main/resources/geppettoModel.ecore";

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
	GeppettoPackage eINSTANCE = org.geppetto.model.impl.GeppettoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.GeppettoModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.GeppettoModelImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoModel()
	 * @generated
	 */
	int GEPPETTO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__DATA_SOURCES = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.ISynchable <em>ISynchable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.ISynchable
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getISynchable()
	 * @generated
	 */
	int ISYNCHABLE = 20;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYNCHABLE__SYNCHED = 0;

	/**
	 * The number of structural features of the '<em>ISynchable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYNCHABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ISynchable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYNCHABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.NodeImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYNCHED = ISYNCHABLE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = ISYNCHABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ISYNCHABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = ISYNCHABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ISYNCHABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_PATH = ISYNCHABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ISYNCHABLE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.GeppettoLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.GeppettoLibraryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoLibrary()
	 * @generated
	 */
	int GEPPETTO_LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__SYNCHED = NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__TAGS = NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__TYPES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY__SHARED_TYPES = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY___GET_PATH = NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_LIBRARY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.LibraryManagerImpl <em>Library Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.LibraryManagerImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getLibraryManager()
	 * @generated
	 */
	int LIBRARY_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER__LIBRARIES = 0;

	/**
	 * The number of structural features of the '<em>Library Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_MANAGER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.ExperimentStateImpl <em>Experiment State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.ExperimentStateImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getExperimentState()
	 * @generated
	 */
	int EXPERIMENT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Recorded Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE__RECORDED_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Set Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE__SET_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Experiment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE__EXPERIMENT_ID = 2;

	/**
	 * The number of structural features of the '<em>Experiment State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Experiment State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.VariableValueImpl <em>Variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.VariableValueImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getVariableValue()
	 * @generated
	 */
	int VARIABLE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE__POINTER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.TagImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 6;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__SYNCHED = ISYNCHABLE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAGS = ISYNCHABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = ISYNCHABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = ISYNCHABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = ISYNCHABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.DomainModelImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__FORMAT = 1;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.ModelFormatImpl <em>Model Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.ModelFormatImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getModelFormat()
	 * @generated
	 */
	int MODEL_FORMAT = 8;

	/**
	 * The feature id for the '<em><b>Model Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FORMAT__MODEL_FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Model Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FORMAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.ExternalDomainModelImpl <em>External Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.ExternalDomainModelImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getExternalDomainModel()
	 * @generated
	 */
	int EXTERNAL_DOMAIN_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_MODEL__DOMAIN_MODEL = DOMAIN_MODEL__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_MODEL__FORMAT = DOMAIN_MODEL__FORMAT;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_MODEL__FILE_FORMAT = DOMAIN_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_MODEL_FEATURE_COUNT = DOMAIN_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOMAIN_MODEL_OPERATION_COUNT = DOMAIN_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.DataSourceImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SYNCHED = NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TAGS = NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Data Source Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE_SERVICE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LIBRARY_CONFIGURATIONS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__URL = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__QUERIES = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependencies Library</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DEPENDENCIES_LIBRARY = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TARGET_LIBRARY = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fetch Variable Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FETCH_VARIABLE_QUERY = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_PATH = NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.DataSourceLibraryConfigurationImpl <em>Data Source Library Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.DataSourceLibraryConfigurationImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDataSourceLibraryConfiguration()
	 * @generated
	 */
	int DATA_SOURCE_LIBRARY_CONFIGURATION = 11;

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
	 * The meta object id for the '{@link org.geppetto.model.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.QueryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 12;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SYNCHED = ISYNCHABLE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LABEL = ISYNCHABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = ISYNCHABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MATCHING_CRITERIA = ISYNCHABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = ISYNCHABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = ISYNCHABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.ProcessQueryImpl <em>Process Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.ProcessQueryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getProcessQuery()
	 * @generated
	 */
	int PROCESS_QUERY = 13;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY__LABEL = QUERY__LABEL;

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
	 * The number of operations of the '<em>Process Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.SimpleQueryImpl <em>Simple Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.SimpleQueryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getSimpleQuery()
	 * @generated
	 */
	int SIMPLE_QUERY = 14;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY__LABEL = QUERY__LABEL;

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
	 * The number of operations of the '<em>Simple Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.CompoundQueryImpl <em>Compound Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.CompoundQueryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getCompoundQuery()
	 * @generated
	 */
	int COMPOUND_QUERY = 15;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__SYNCHED = QUERY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY__LABEL = QUERY__LABEL;

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
	 * The number of operations of the '<em>Compound Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.QueryResultsImpl <em>Query Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.QueryResultsImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryResults()
	 * @generated
	 */
	int QUERY_RESULTS = 16;

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
	 * The meta object id for the '{@link org.geppetto.model.impl.QueryResultImpl <em>Query Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.QueryResultImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryResult()
	 * @generated
	 */
	int QUERY_RESULT = 17;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.QueryMatchingCriteriaImpl <em>Query Matching Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.QueryMatchingCriteriaImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryMatchingCriteria()
	 * @generated
	 */
	int QUERY_MATCHING_CRITERIA = 18;

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
	 * The meta object id for the '{@link org.geppetto.model.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.StringToStringMapImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.impl.RunnableQueryImpl <em>Runnable Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.RunnableQueryImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getRunnableQuery()
	 * @generated
	 */
	int RUNNABLE_QUERY = 21;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY__ID = 1;

	/**
	 * The number of structural features of the '<em>Runnable Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runnable Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.FileFormat <em>File Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.FileFormat
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getFileFormat()
	 * @generated
	 */
	int FILE_FORMAT = 22;

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.GeppettoModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.geppetto.model.GeppettoModel
	 * @generated
	 */
	EClass getGeppettoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.geppetto.model.GeppettoModel#getVariables()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see org.geppetto.model.GeppettoModel#getLibraries()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.geppetto.model.GeppettoModel#getTags()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.GeppettoModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geppetto.model.GeppettoModel#getId()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EAttribute getGeppettoModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.GeppettoModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.geppetto.model.GeppettoModel#getName()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EAttribute getGeppettoModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sources</em>'.
	 * @see org.geppetto.model.GeppettoModel#getDataSources()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_DataSources();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.geppetto.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geppetto.model.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.geppetto.model.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.Node#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.geppetto.model.Node#getTags()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Tags();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.Node#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see org.geppetto.model.Node#getPath()
	 * @generated
	 */
	EOperation getNode__GetPath();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.GeppettoLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.geppetto.model.GeppettoLibrary
	 * @generated
	 */
	EClass getGeppettoLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoLibrary#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.geppetto.model.GeppettoLibrary#getTypes()
	 * @see #getGeppettoLibrary()
	 * @generated
	 */
	EReference getGeppettoLibrary_Types();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.GeppettoLibrary#getSharedTypes <em>Shared Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Types</em>'.
	 * @see org.geppetto.model.GeppettoLibrary#getSharedTypes()
	 * @see #getGeppettoLibrary()
	 * @generated
	 */
	EReference getGeppettoLibrary_SharedTypes();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.LibraryManager <em>Library Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Manager</em>'.
	 * @see org.geppetto.model.LibraryManager
	 * @generated
	 */
	EClass getLibraryManager();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.LibraryManager#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see org.geppetto.model.LibraryManager#getLibraries()
	 * @see #getLibraryManager()
	 * @generated
	 */
	EReference getLibraryManager_Libraries();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.ExperimentState <em>Experiment State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment State</em>'.
	 * @see org.geppetto.model.ExperimentState
	 * @generated
	 */
	EClass getExperimentState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.ExperimentState#getRecordedVariables <em>Recorded Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recorded Variables</em>'.
	 * @see org.geppetto.model.ExperimentState#getRecordedVariables()
	 * @see #getExperimentState()
	 * @generated
	 */
	EReference getExperimentState_RecordedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.ExperimentState#getSetParameters <em>Set Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameters</em>'.
	 * @see org.geppetto.model.ExperimentState#getSetParameters()
	 * @see #getExperimentState()
	 * @generated
	 */
	EReference getExperimentState_SetParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ExperimentState#getExperimentId <em>Experiment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiment Id</em>'.
	 * @see org.geppetto.model.ExperimentState#getExperimentId()
	 * @see #getExperimentState()
	 * @generated
	 */
	EAttribute getExperimentState_ExperimentId();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Value</em>'.
	 * @see org.geppetto.model.VariableValue
	 * @generated
	 */
	EClass getVariableValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.VariableValue#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer</em>'.
	 * @see org.geppetto.model.VariableValue#getPointer()
	 * @see #getVariableValue()
	 * @generated
	 */
	EReference getVariableValue_Pointer();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.VariableValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.geppetto.model.VariableValue#getValue()
	 * @see #getVariableValue()
	 * @generated
	 */
	EReference getVariableValue_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.geppetto.model.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.Tag#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.geppetto.model.Tag#getTags()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.geppetto.model.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see org.geppetto.model.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.DomainModel#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Model</em>'.
	 * @see org.geppetto.model.DomainModel#getDomainModel()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_DomainModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.DomainModel#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.geppetto.model.DomainModel#getFormat()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Format();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.ModelFormat <em>Model Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Format</em>'.
	 * @see org.geppetto.model.ModelFormat
	 * @generated
	 */
	EClass getModelFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ModelFormat#getModelFormat <em>Model Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Format</em>'.
	 * @see org.geppetto.model.ModelFormat#getModelFormat()
	 * @see #getModelFormat()
	 * @generated
	 */
	EAttribute getModelFormat_ModelFormat();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.ExternalDomainModel <em>External Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Domain Model</em>'.
	 * @see org.geppetto.model.ExternalDomainModel
	 * @generated
	 */
	EClass getExternalDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ExternalDomainModel#getFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Format</em>'.
	 * @see org.geppetto.model.ExternalDomainModel#getFileFormat()
	 * @see #getExternalDomainModel()
	 * @generated
	 */
	EAttribute getExternalDomainModel_FileFormat();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.geppetto.model.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.DataSource#getDataSourceService <em>Data Source Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Service</em>'.
	 * @see org.geppetto.model.DataSource#getDataSourceService()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_DataSourceService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.DataSource#getLibraryConfigurations <em>Library Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library Configurations</em>'.
	 * @see org.geppetto.model.DataSource#getLibraryConfigurations()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_LibraryConfigurations();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.DataSource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.geppetto.model.DataSource#getUrl()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.DataSource#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see org.geppetto.model.DataSource#getQueries()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Queries();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.DataSource#getDependenciesLibrary <em>Dependencies Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies Library</em>'.
	 * @see org.geppetto.model.DataSource#getDependenciesLibrary()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_DependenciesLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.DataSource#getTargetLibrary <em>Target Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Library</em>'.
	 * @see org.geppetto.model.DataSource#getTargetLibrary()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_TargetLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.DataSource#getFetchVariableQuery <em>Fetch Variable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fetch Variable Query</em>'.
	 * @see org.geppetto.model.DataSource#getFetchVariableQuery()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_FetchVariableQuery();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.DataSourceLibraryConfiguration <em>Data Source Library Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Library Configuration</em>'.
	 * @see org.geppetto.model.DataSourceLibraryConfiguration
	 * @generated
	 */
	EClass getDataSourceLibraryConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.DataSourceLibraryConfiguration#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see org.geppetto.model.DataSourceLibraryConfiguration#getLibrary()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EReference getDataSourceLibraryConfiguration_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.DataSourceLibraryConfiguration#getModelInterpreterId <em>Model Interpreter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Interpreter Id</em>'.
	 * @see org.geppetto.model.DataSourceLibraryConfiguration#getModelInterpreterId()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EAttribute getDataSourceLibraryConfiguration_ModelInterpreterId();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.DataSourceLibraryConfiguration#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.geppetto.model.DataSourceLibraryConfiguration#getFormat()
	 * @see #getDataSourceLibraryConfiguration()
	 * @generated
	 */
	EAttribute getDataSourceLibraryConfiguration_Format();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.geppetto.model.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Query#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.geppetto.model.Query#getLabel()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.Query#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.geppetto.model.Query#getDescription()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.Query#getMatchingCriteria <em>Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matching Criteria</em>'.
	 * @see org.geppetto.model.Query#getMatchingCriteria()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_MatchingCriteria();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.ProcessQuery <em>Process Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Query</em>'.
	 * @see org.geppetto.model.ProcessQuery
	 * @generated
	 */
	EClass getProcessQuery();

	/**
	 * Returns the meta object for the map '{@link org.geppetto.model.ProcessQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.geppetto.model.ProcessQuery#getParameters()
	 * @see #getProcessQuery()
	 * @generated
	 */
	EReference getProcessQuery_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ProcessQuery#getQueryProcessorId <em>Query Processor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Processor Id</em>'.
	 * @see org.geppetto.model.ProcessQuery#getQueryProcessorId()
	 * @see #getProcessQuery()
	 * @generated
	 */
	EAttribute getProcessQuery_QueryProcessorId();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.SimpleQuery <em>Simple Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Query</em>'.
	 * @see org.geppetto.model.SimpleQuery
	 * @generated
	 */
	EClass getSimpleQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.SimpleQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.geppetto.model.SimpleQuery#getQuery()
	 * @see #getSimpleQuery()
	 * @generated
	 */
	EAttribute getSimpleQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.SimpleQuery#getCountQuery <em>Count Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Query</em>'.
	 * @see org.geppetto.model.SimpleQuery#getCountQuery()
	 * @see #getSimpleQuery()
	 * @generated
	 */
	EAttribute getSimpleQuery_CountQuery();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.CompoundQuery <em>Compound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Query</em>'.
	 * @see org.geppetto.model.CompoundQuery
	 * @generated
	 */
	EClass getCompoundQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.CompoundQuery#getQueryChain <em>Query Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Chain</em>'.
	 * @see org.geppetto.model.CompoundQuery#getQueryChain()
	 * @see #getCompoundQuery()
	 * @generated
	 */
	EReference getCompoundQuery_QueryChain();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.QueryResults <em>Query Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Results</em>'.
	 * @see org.geppetto.model.QueryResults
	 * @generated
	 */
	EClass getQueryResults();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.QueryResults#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geppetto.model.QueryResults#getId()
	 * @see #getQueryResults()
	 * @generated
	 */
	EAttribute getQueryResults_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.QueryResults#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Header</em>'.
	 * @see org.geppetto.model.QueryResults#getHeader()
	 * @see #getQueryResults()
	 * @generated
	 */
	EAttribute getQueryResults_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.QueryResults#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.geppetto.model.QueryResults#getResults()
	 * @see #getQueryResults()
	 * @generated
	 */
	EReference getQueryResults_Results();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.QueryResults#getValue(java.lang.String, int) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.geppetto.model.QueryResults#getValue(java.lang.String, int)
	 * @generated
	 */
	EOperation getQueryResults__GetValue__String_int();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.QueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Result</em>'.
	 * @see org.geppetto.model.QueryResult
	 * @generated
	 */
	EClass getQueryResult();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.QueryResult#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.geppetto.model.QueryResult#getValues()
	 * @see #getQueryResult()
	 * @generated
	 */
	EAttribute getQueryResult_Values();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.QueryMatchingCriteria <em>Query Matching Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Matching Criteria</em>'.
	 * @see org.geppetto.model.QueryMatchingCriteria
	 * @generated
	 */
	EClass getQueryMatchingCriteria();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.QueryMatchingCriteria#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.geppetto.model.QueryMatchingCriteria#getType()
	 * @see #getQueryMatchingCriteria()
	 * @generated
	 */
	EReference getQueryMatchingCriteria_Type();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.ISynchable <em>ISynchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISynchable</em>'.
	 * @see org.geppetto.model.ISynchable
	 * @generated
	 */
	EClass getISynchable();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ISynchable#isSynched <em>Synched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synched</em>'.
	 * @see org.geppetto.model.ISynchable#isSynched()
	 * @see #getISynchable()
	 * @generated
	 */
	EAttribute getISynchable_Synched();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.RunnableQuery <em>Runnable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Query</em>'.
	 * @see org.geppetto.model.RunnableQuery
	 * @generated
	 */
	EClass getRunnableQuery();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.RunnableQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see org.geppetto.model.RunnableQuery#getQuery()
	 * @see #getRunnableQuery()
	 * @generated
	 */
	EReference getRunnableQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.RunnableQuery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geppetto.model.RunnableQuery#getId()
	 * @see #getRunnableQuery()
	 * @generated
	 */
	EAttribute getRunnableQuery_Id();

	/**
	 * Returns the meta object for enum '{@link org.geppetto.model.FileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Format</em>'.
	 * @see org.geppetto.model.FileFormat
	 * @generated
	 */
	EEnum getFileFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeppettoFactory getGeppettoFactory();

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
		 * The meta object literal for the '{@link org.geppetto.model.impl.GeppettoModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.GeppettoModelImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoModel()
		 * @generated
		 */
		EClass GEPPETTO_MODEL = eINSTANCE.getGeppettoModel();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__VARIABLES = eINSTANCE.getGeppettoModel_Variables();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__LIBRARIES = eINSTANCE.getGeppettoModel_Libraries();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__TAGS = eINSTANCE.getGeppettoModel_Tags();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEPPETTO_MODEL__ID = eINSTANCE.getGeppettoModel_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEPPETTO_MODEL__NAME = eINSTANCE.getGeppettoModel_Name();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__DATA_SOURCES = eINSTANCE.getGeppettoModel_DataSources();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.NodeImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TAGS = eINSTANCE.getNode_Tags();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_PATH = eINSTANCE.getNode__GetPath();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.GeppettoLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.GeppettoLibraryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getGeppettoLibrary()
		 * @generated
		 */
		EClass GEPPETTO_LIBRARY = eINSTANCE.getGeppettoLibrary();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_LIBRARY__TYPES = eINSTANCE.getGeppettoLibrary_Types();

		/**
		 * The meta object literal for the '<em><b>Shared Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_LIBRARY__SHARED_TYPES = eINSTANCE.getGeppettoLibrary_SharedTypes();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.LibraryManagerImpl <em>Library Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.LibraryManagerImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getLibraryManager()
		 * @generated
		 */
		EClass LIBRARY_MANAGER = eINSTANCE.getLibraryManager();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_MANAGER__LIBRARIES = eINSTANCE.getLibraryManager_Libraries();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.ExperimentStateImpl <em>Experiment State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.ExperimentStateImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getExperimentState()
		 * @generated
		 */
		EClass EXPERIMENT_STATE = eINSTANCE.getExperimentState();

		/**
		 * The meta object literal for the '<em><b>Recorded Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_STATE__RECORDED_VARIABLES = eINSTANCE.getExperimentState_RecordedVariables();

		/**
		 * The meta object literal for the '<em><b>Set Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_STATE__SET_PARAMETERS = eINSTANCE.getExperimentState_SetParameters();

		/**
		 * The meta object literal for the '<em><b>Experiment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_STATE__EXPERIMENT_ID = eINSTANCE.getExperimentState_ExperimentId();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.VariableValueImpl <em>Variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.VariableValueImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getVariableValue()
		 * @generated
		 */
		EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE__POINTER = eINSTANCE.getVariableValue_Pointer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE__VALUE = eINSTANCE.getVariableValue_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.TagImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__TAGS = eINSTANCE.getTag_Tags();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.DomainModelImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__DOMAIN_MODEL = eINSTANCE.getDomainModel_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__FORMAT = eINSTANCE.getDomainModel_Format();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.ModelFormatImpl <em>Model Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.ModelFormatImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getModelFormat()
		 * @generated
		 */
		EClass MODEL_FORMAT = eINSTANCE.getModelFormat();

		/**
		 * The meta object literal for the '<em><b>Model Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FORMAT__MODEL_FORMAT = eINSTANCE.getModelFormat_ModelFormat();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.ExternalDomainModelImpl <em>External Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.ExternalDomainModelImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getExternalDomainModel()
		 * @generated
		 */
		EClass EXTERNAL_DOMAIN_MODEL = eINSTANCE.getExternalDomainModel();

		/**
		 * The meta object literal for the '<em><b>File Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOMAIN_MODEL__FILE_FORMAT = eINSTANCE.getExternalDomainModel_FileFormat();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.DataSourceImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDataSource()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.DataSourceLibraryConfigurationImpl <em>Data Source Library Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.DataSourceLibraryConfigurationImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getDataSourceLibraryConfiguration()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.QueryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__LABEL = eINSTANCE.getQuery_Label();

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
		 * The meta object literal for the '{@link org.geppetto.model.impl.ProcessQueryImpl <em>Process Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.ProcessQueryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getProcessQuery()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.SimpleQueryImpl <em>Simple Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.SimpleQueryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getSimpleQuery()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.CompoundQueryImpl <em>Compound Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.CompoundQueryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getCompoundQuery()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.QueryResultsImpl <em>Query Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.QueryResultsImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryResults()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.QueryResultImpl <em>Query Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.QueryResultImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryResult()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.QueryMatchingCriteriaImpl <em>Query Matching Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.QueryMatchingCriteriaImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getQueryMatchingCriteria()
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
		 * The meta object literal for the '{@link org.geppetto.model.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.StringToStringMapImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.ISynchable <em>ISynchable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.ISynchable
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getISynchable()
		 * @generated
		 */
		EClass ISYNCHABLE = eINSTANCE.getISynchable();

		/**
		 * The meta object literal for the '<em><b>Synched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISYNCHABLE__SYNCHED = eINSTANCE.getISynchable_Synched();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.impl.RunnableQueryImpl <em>Runnable Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.impl.RunnableQueryImpl
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getRunnableQuery()
		 * @generated
		 */
		EClass RUNNABLE_QUERY = eINSTANCE.getRunnableQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_QUERY__QUERY = eINSTANCE.getRunnableQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE_QUERY__ID = eINSTANCE.getRunnableQuery_Id();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.FileFormat <em>File Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.FileFormat
		 * @see org.geppetto.model.impl.GeppettoPackageImpl#getFileFormat()
		 * @generated
		 */
		EEnum FILE_FORMAT = eINSTANCE.getFileFormat();

	}

} //GeppettoPackage
