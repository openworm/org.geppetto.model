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
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/master/src/main/resources/geppettoModel.ecore";

	
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String eNS_URI_TEMPLATE = "https://raw.githubusercontent.com/openworm/org.geppetto.model/$VERSION$/src/main/resources/geppettoModel.ecore";
	
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
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL__QUERIES = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEPPETTO_MODEL_FEATURE_COUNT = 7;

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
	int ISYNCHABLE = 11;

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
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE__PROJECT_ID = 3;

	/**
	 * The number of structural features of the '<em>Experiment State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STATE_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link org.geppetto.model.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.impl.StringToStringMapImpl
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 10;

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
	 * The meta object id for the '{@link org.geppetto.model.FileFormat <em>File Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.FileFormat
	 * @see org.geppetto.model.impl.GeppettoPackageImpl#getFileFormat()
	 * @generated
	 */
	int FILE_FORMAT = 12;

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
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.GeppettoModel#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see org.geppetto.model.GeppettoModel#getQueries()
	 * @see #getGeppettoModel()
	 * @generated
	 */
	EReference getGeppettoModel_Queries();

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
	 * Returns the meta object for the attribute '{@link org.geppetto.model.ExperimentState#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.geppetto.model.ExperimentState#getProjectId()
	 * @see #getExperimentState()
	 * @generated
	 */
	EAttribute getExperimentState_ProjectId();

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
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEPPETTO_MODEL__QUERIES = eINSTANCE.getGeppettoModel_Queries();

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
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_STATE__PROJECT_ID = eINSTANCE.getExperimentState_ProjectId();

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
