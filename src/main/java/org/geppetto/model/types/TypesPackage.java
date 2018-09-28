/**
 */
package org.geppetto.model.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.geppetto.model.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/master/src/main/resources/geppettoModel.ecore#//types";

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
	TypesPackage eINSTANCE = org.geppetto.model.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.TypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPE = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ABSTRACT = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISUAL_TYPE = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCED_VARIABLES = GeppettoPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOMAIN_MODEL = GeppettoPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_DEFAULT_VALUE = GeppettoPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___EXTENDS_TYPE__TYPE = GeppettoPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.VisualTypeImpl <em>Visual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.VisualTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getVisualType()
	 * @generated
	 */
	int VISUAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Visual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ImportTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__URL = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__REFERENCE_URL = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Interpreter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__MODEL_INTERPRETER_ID = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Autoresolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__AUTORESOLVE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.CompositeTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__VARIABLES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.PointerTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.QuantityTypeImpl <em>Quantity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.QuantityTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getQuantityType()
	 * @generated
	 */
	int QUANTITY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Quantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ParameterTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.StateVariableTypeImpl <em>State Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.StateVariableTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getStateVariableType()
	 * @generated
	 */
	int STATE_VARIABLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>State Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.DynamicsTypeImpl <em>Dynamics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.DynamicsTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getDynamicsType()
	 * @generated
	 */
	int DYNAMICS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Dynamics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ArgumentTypeImpl <em>Argument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ArgumentTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getArgumentType()
	 * @generated
	 */
	int ARGUMENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Argument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ExpressionTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.HTMLTypeImpl <em>HTML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.HTMLTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getHTMLType()
	 * @generated
	 */
	int HTML_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>HTML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.TextTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.URLTypeImpl <em>URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.URLTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getURLType()
	 * @generated
	 */
	int URL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.PointTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ArrayTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SIZE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ARRAY_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.CompositeVisualTypeImpl <em>Composite Visual Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.CompositeVisualTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getCompositeVisualType()
	 * @generated
	 */
	int COMPOSITE_VISUAL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__SYNCHED = VISUAL_TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__ID = VISUAL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__NAME = VISUAL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__TAGS = VISUAL_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__SUPER_TYPE = VISUAL_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__ABSTRACT = VISUAL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__VISUAL_TYPE = VISUAL_TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__REFERENCED_VARIABLES = VISUAL_TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__DOMAIN_MODEL = VISUAL_TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__DEFAULT_VALUE = VISUAL_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__VARIABLES = VISUAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visual Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS = VISUAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Visual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE_FEATURE_COUNT = VISUAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE___GET_PATH = VISUAL_TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE___GET_DEFAULT_VALUE = VISUAL_TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE___EXTENDS_TYPE__TYPE = VISUAL_TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Composite Visual Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VISUAL_TYPE_OPERATION_COUNT = VISUAL_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ConnectionTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__VARIABLES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.SimpleTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.types.impl.ImageTypeImpl <em>Image Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.types.impl.ImageTypeImpl
	 * @see org.geppetto.model.types.impl.TypesPackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__SYNCHED = TYPE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__TAGS = TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__SUPER_TYPE = TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__ABSTRACT = TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__VISUAL_TYPE = TYPE__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__REFERENCED_VARIABLES = TYPE__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__DOMAIN_MODEL = TYPE__DOMAIN_MODEL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE___GET_PATH = TYPE___GET_PATH;

	/**
	 * The operation id for the '<em>Get Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE___GET_DEFAULT_VALUE = TYPE___GET_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Extends Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE___EXTENDS_TYPE__TYPE = TYPE___EXTENDS_TYPE__TYPE;

	/**
	 * The number of operations of the '<em>Image Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.geppetto.model.types.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.types.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Type</em>'.
	 * @see org.geppetto.model.types.Type#getSuperType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperType();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.types.Type#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Model</em>'.
	 * @see org.geppetto.model.types.Type#getDomainModel()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_DomainModel();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.Type#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.geppetto.model.types.Type#isAbstract()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Abstract();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.types.Type#getVisualType <em>Visual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Type</em>'.
	 * @see org.geppetto.model.types.Type#getVisualType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_VisualType();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.types.Type#getReferencedVariables <em>Referenced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Variables</em>'.
	 * @see org.geppetto.model.types.Type#getReferencedVariables()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ReferencedVariables();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.types.Type#getDefaultValue() <em>Get Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Value</em>' operation.
	 * @see org.geppetto.model.types.Type#getDefaultValue()
	 * @generated
	 */
	EOperation getType__GetDefaultValue();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.types.Type#extendsType(org.geppetto.model.types.Type) <em>Extends Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extends Type</em>' operation.
	 * @see org.geppetto.model.types.Type#extendsType(org.geppetto.model.types.Type)
	 * @generated
	 */
	EOperation getType__ExtendsType__Type();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.VisualType <em>Visual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Type</em>'.
	 * @see org.geppetto.model.types.VisualType
	 * @generated
	 */
	EClass getVisualType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.VisualType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.VisualType#getDefaultValue()
	 * @see #getVisualType()
	 * @generated
	 */
	EReference getVisualType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see org.geppetto.model.types.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.ImportType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.geppetto.model.types.ImportType#getUrl()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.ImportType#getReferenceURL <em>Reference URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference URL</em>'.
	 * @see org.geppetto.model.types.ImportType#getReferenceURL()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_ReferenceURL();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.ImportType#getModelInterpreterId <em>Model Interpreter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Interpreter Id</em>'.
	 * @see org.geppetto.model.types.ImportType#getModelInterpreterId()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_ModelInterpreterId();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.ImportType#isAutoresolve <em>Autoresolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoresolve</em>'.
	 * @see org.geppetto.model.types.ImportType#isAutoresolve()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Autoresolve();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see org.geppetto.model.types.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.types.CompositeType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.geppetto.model.types.CompositeType#getVariables()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.CompositeType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.CompositeType#getDefaultValue()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see org.geppetto.model.types.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.PointerType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.PointerType#getDefaultValue()
	 * @see #getPointerType()
	 * @generated
	 */
	EReference getPointerType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Type</em>'.
	 * @see org.geppetto.model.types.QuantityType
	 * @generated
	 */
	EClass getQuantityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.QuantityType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.QuantityType#getDefaultValue()
	 * @see #getQuantityType()
	 * @generated
	 */
	EReference getQuantityType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.geppetto.model.types.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.ParameterType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ParameterType#getDefaultValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.StateVariableType <em>State Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable Type</em>'.
	 * @see org.geppetto.model.types.StateVariableType
	 * @generated
	 */
	EClass getStateVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.StateVariableType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.StateVariableType#getDefaultValue()
	 * @see #getStateVariableType()
	 * @generated
	 */
	EReference getStateVariableType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.DynamicsType <em>Dynamics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamics Type</em>'.
	 * @see org.geppetto.model.types.DynamicsType
	 * @generated
	 */
	EClass getDynamicsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.DynamicsType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.DynamicsType#getDefaultValue()
	 * @see #getDynamicsType()
	 * @generated
	 */
	EReference getDynamicsType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type</em>'.
	 * @see org.geppetto.model.types.ArgumentType
	 * @generated
	 */
	EClass getArgumentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.ArgumentType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ArgumentType#getDefaultValue()
	 * @see #getArgumentType()
	 * @generated
	 */
	EReference getArgumentType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Type</em>'.
	 * @see org.geppetto.model.types.ExpressionType
	 * @generated
	 */
	EClass getExpressionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.ExpressionType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ExpressionType#getDefaultValue()
	 * @see #getExpressionType()
	 * @generated
	 */
	EReference getExpressionType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.HTMLType <em>HTML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Type</em>'.
	 * @see org.geppetto.model.types.HTMLType
	 * @generated
	 */
	EClass getHTMLType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.HTMLType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.HTMLType#getDefaultValue()
	 * @see #getHTMLType()
	 * @generated
	 */
	EReference getHTMLType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see org.geppetto.model.types.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.TextType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.TextType#getDefaultValue()
	 * @see #getTextType()
	 * @generated
	 */
	EReference getTextType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.URLType <em>URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Type</em>'.
	 * @see org.geppetto.model.types.URLType
	 * @generated
	 */
	EClass getURLType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.URLType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.URLType#getDefaultValue()
	 * @see #getURLType()
	 * @generated
	 */
	EReference getURLType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see org.geppetto.model.types.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.PointType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.PointType#getDefaultValue()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.geppetto.model.types.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.types.ArrayType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.geppetto.model.types.ArrayType#getSize()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Size();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.types.ArrayType#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Type</em>'.
	 * @see org.geppetto.model.types.ArrayType#getArrayType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_ArrayType();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.ArrayType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ArrayType#getDefaultValue()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.CompositeVisualType <em>Composite Visual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Visual Type</em>'.
	 * @see org.geppetto.model.types.CompositeVisualType
	 * @generated
	 */
	EClass getCompositeVisualType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.types.CompositeVisualType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.geppetto.model.types.CompositeVisualType#getVariables()
	 * @see #getCompositeVisualType()
	 * @generated
	 */
	EReference getCompositeVisualType_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.types.CompositeVisualType#getVisualGroups <em>Visual Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visual Groups</em>'.
	 * @see org.geppetto.model.types.CompositeVisualType#getVisualGroups()
	 * @see #getCompositeVisualType()
	 * @generated
	 */
	EReference getCompositeVisualType_VisualGroups();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see org.geppetto.model.types.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.types.ConnectionType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.geppetto.model.types.ConnectionType#getVariables()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.types.ConnectionType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ConnectionType#getDefaultValue()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.geppetto.model.types.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.types.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Type</em>'.
	 * @see org.geppetto.model.types.ImageType
	 * @generated
	 */
	EClass getImageType();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.types.ImageType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see org.geppetto.model.types.ImageType#getDefaultValue()
	 * @see #getImageType()
	 * @generated
	 */
	EReference getImageType_DefaultValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.TypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DOMAIN_MODEL = eINSTANCE.getType_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__ABSTRACT = eINSTANCE.getType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Visual Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__VISUAL_TYPE = eINSTANCE.getType_VisualType();

		/**
		 * The meta object literal for the '<em><b>Referenced Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__REFERENCED_VARIABLES = eINSTANCE.getType_ReferencedVariables();

		/**
		 * The meta object literal for the '<em><b>Get Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___GET_DEFAULT_VALUE = eINSTANCE.getType__GetDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Extends Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___EXTENDS_TYPE__TYPE = eINSTANCE.getType__ExtendsType__Type();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.VisualTypeImpl <em>Visual Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.VisualTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getVisualType()
		 * @generated
		 */
		EClass VISUAL_TYPE = eINSTANCE.getVisualType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_TYPE__DEFAULT_VALUE = eINSTANCE.getVisualType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ImportTypeImpl <em>Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ImportTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getImportType()
		 * @generated
		 */
		EClass IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__URL = eINSTANCE.getImportType_Url();

		/**
		 * The meta object literal for the '<em><b>Reference URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__REFERENCE_URL = eINSTANCE.getImportType_ReferenceURL();

		/**
		 * The meta object literal for the '<em><b>Model Interpreter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__MODEL_INTERPRETER_ID = eINSTANCE.getImportType_ModelInterpreterId();

		/**
		 * The meta object literal for the '<em><b>Autoresolve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__AUTORESOLVE = eINSTANCE.getImportType_Autoresolve();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.CompositeTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__VARIABLES = eINSTANCE.getCompositeType_Variables();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__DEFAULT_VALUE = eINSTANCE.getCompositeType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.PointerTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getPointerType()
		 * @generated
		 */
		EClass POINTER_TYPE = eINSTANCE.getPointerType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_TYPE__DEFAULT_VALUE = eINSTANCE.getPointerType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.QuantityTypeImpl <em>Quantity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.QuantityTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getQuantityType()
		 * @generated
		 */
		EClass QUANTITY_TYPE = eINSTANCE.getQuantityType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_TYPE__DEFAULT_VALUE = eINSTANCE.getQuantityType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ParameterTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__DEFAULT_VALUE = eINSTANCE.getParameterType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.StateVariableTypeImpl <em>State Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.StateVariableTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getStateVariableType()
		 * @generated
		 */
		EClass STATE_VARIABLE_TYPE = eINSTANCE.getStateVariableType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE_TYPE__DEFAULT_VALUE = eINSTANCE.getStateVariableType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.DynamicsTypeImpl <em>Dynamics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.DynamicsTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getDynamicsType()
		 * @generated
		 */
		EClass DYNAMICS_TYPE = eINSTANCE.getDynamicsType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMICS_TYPE__DEFAULT_VALUE = eINSTANCE.getDynamicsType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ArgumentTypeImpl <em>Argument Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ArgumentTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getArgumentType()
		 * @generated
		 */
		EClass ARGUMENT_TYPE = eINSTANCE.getArgumentType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_TYPE__DEFAULT_VALUE = eINSTANCE.getArgumentType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ExpressionTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getExpressionType()
		 * @generated
		 */
		EClass EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TYPE__DEFAULT_VALUE = eINSTANCE.getExpressionType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.HTMLTypeImpl <em>HTML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.HTMLTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getHTMLType()
		 * @generated
		 */
		EClass HTML_TYPE = eINSTANCE.getHTMLType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_TYPE__DEFAULT_VALUE = eINSTANCE.getHTMLType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.TextTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getTextType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TYPE__DEFAULT_VALUE = eINSTANCE.getTextType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.URLTypeImpl <em>URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.URLTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getURLType()
		 * @generated
		 */
		EClass URL_TYPE = eINSTANCE.getURLType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_TYPE__DEFAULT_VALUE = eINSTANCE.getURLType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.PointTypeImpl <em>Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.PointTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getPointType()
		 * @generated
		 */
		EClass POINT_TYPE = eINSTANCE.getPointType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TYPE__DEFAULT_VALUE = eINSTANCE.getPointType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ArrayTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__SIZE = eINSTANCE.getArrayType_Size();

		/**
		 * The meta object literal for the '<em><b>Array Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__ARRAY_TYPE = eINSTANCE.getArrayType_ArrayType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__DEFAULT_VALUE = eINSTANCE.getArrayType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.CompositeVisualTypeImpl <em>Composite Visual Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.CompositeVisualTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getCompositeVisualType()
		 * @generated
		 */
		EClass COMPOSITE_VISUAL_TYPE = eINSTANCE.getCompositeVisualType();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VISUAL_TYPE__VARIABLES = eINSTANCE.getCompositeVisualType_Variables();

		/**
		 * The meta object literal for the '<em><b>Visual Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS = eINSTANCE.getCompositeVisualType_VisualGroups();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ConnectionTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getConnectionType()
		 * @generated
		 */
		EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__VARIABLES = eINSTANCE.getConnectionType_Variables();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__DEFAULT_VALUE = eINSTANCE.getConnectionType_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.SimpleTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.types.impl.ImageTypeImpl <em>Image Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.types.impl.ImageTypeImpl
		 * @see org.geppetto.model.types.impl.TypesPackageImpl#getImageType()
		 * @generated
		 */
		EClass IMAGE_TYPE = eINSTANCE.getImageType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_TYPE__DEFAULT_VALUE = eINSTANCE.getImageType_DefaultValue();

	}

} //TypesPackage
