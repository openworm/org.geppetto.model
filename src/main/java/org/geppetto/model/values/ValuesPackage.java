/**
 */
package org.geppetto.model.values;

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
 * @see org.geppetto.model.values.ValuesFactory
 * @model kind="package"
 * @generated
 */
public interface ValuesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/importValue/src/main/resources/geppettoModel.ecore#//values";

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
	ValuesPackage eINSTANCE = org.geppetto.model.values.impl.ValuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ValueImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 0;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SYNCHED = GeppettoPackage.ISYNCHABLE__SYNCHED;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = GeppettoPackage.ISYNCHABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = GeppettoPackage.ISYNCHABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.CompositeImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.StringToValueMapImpl <em>String To Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.StringToValueMapImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getStringToValueMap()
	 * @generated
	 */
	int STRING_TO_VALUE_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_VALUE_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.QuantityImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SCALING_FACTOR = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.PhysicalQuantityImpl <em>Physical Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.PhysicalQuantityImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPhysicalQuantity()
	 * @generated
	 */
	int PHYSICAL_QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY__SYNCHED = QUANTITY__SYNCHED;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY__SCALING_FACTOR = QUANTITY__SCALING_FACTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY__UNIT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.UnitImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 5;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.TimeSeriesImpl <em>Time Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.TimeSeriesImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getTimeSeries()
	 * @generated
	 */
	int TIME_SERIES = 6;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__UNIT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__SCALING_FACTOR = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.MetadataValueImpl <em>Metadata Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.MetadataValueImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getMetadataValue()
	 * @generated
	 */
	int METADATA_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_VALUE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The number of structural features of the '<em>Metadata Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metadata Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.TextImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 8;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SYNCHED = METADATA_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = METADATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = METADATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = METADATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.URLImpl <em>URL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.URLImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getURL()
	 * @generated
	 */
	int URL = 9;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__SYNCHED = METADATA_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__URL = METADATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = METADATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = METADATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.HTMLImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getHTML()
	 * @generated
	 */
	int HTML = 10;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__SYNCHED = METADATA_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__HTML = METADATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FEATURE_COUNT = METADATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_OPERATION_COUNT = METADATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.PointerImpl <em>Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.PointerImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPointer()
	 * @generated
	 */
	int POINTER = 11;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__ELEMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visual Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__VISUAL_REFERENCE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Instance Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER___GET_INSTANCE_PATH = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.PointerElementImpl <em>Pointer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.PointerElementImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPointerElement()
	 * @generated
	 */
	int POINTER_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Pointer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pointer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.VisualReferenceImpl <em>Visual Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.VisualReferenceImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualReference()
	 * @generated
	 */
	int VISUAL_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_REFERENCE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Visual Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_REFERENCE__VISUAL_VARIABLE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_REFERENCE__FRACTION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visual Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Visual Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_REFERENCE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.PointImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 14;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.DynamicsImpl <em>Dynamics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.DynamicsImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getDynamics()
	 * @generated
	 */
	int DYNAMICS = 15;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__INITIAL_CONDITION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__DYNAMICS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.FunctionPlotImpl <em>Function Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.FunctionPlotImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getFunctionPlot()
	 * @generated
	 */
	int FUNCTION_PLOT = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__XAXIS_LABEL = 1;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__YAXIS_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Final Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__FINAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT__STEP_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Function Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Function Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.FunctionImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 17;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ARGUMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXPRESSION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Plot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION_PLOT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ArgumentImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 18;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ExpressionImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.VisualValueImpl <em>Visual Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.VisualValueImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualValue()
	 * @generated
	 */
	int VISUAL_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE__GROUP_ELEMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE__POSITION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Visual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ColladaImpl <em>Collada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ColladaImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getCollada()
	 * @generated
	 */
	int COLLADA = 21;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Collada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA__COLLADA = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.OBJImpl <em>OBJ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.OBJImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getOBJ()
	 * @generated
	 */
	int OBJ = 22;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ__OBJ = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OBJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OBJ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.SphereImpl <em>Sphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.SphereImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSphere()
	 * @generated
	 */
	int SPHERE = 23;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__RADIUS = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.CylinderImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 24;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Bottom Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__BOTTOM_RADIUS = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__TOP_RADIUS = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__HEIGHT = VISUAL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__DISTAL = VISUAL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ParticleImpl <em>Particle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ParticleImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getParticle()
	 * @generated
	 */
	int PARTICLE = 25;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__X = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__Y = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__Z = VISUAL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Particle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Particle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.SkeletonAnimationImpl <em>Skeleton Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.SkeletonAnimationImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSkeletonAnimation()
	 * @generated
	 */
	int SKELETON_ANIMATION = 26;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION__SYNCHED = VISUAL_VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Group Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION__GROUP_ELEMENTS = VISUAL_VALUE__GROUP_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION__POSITION = VISUAL_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Skeleton Transformation Series</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skeleton Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skeleton Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_ANIMATION_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.SkeletonTransformationImpl <em>Skeleton Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.SkeletonTransformationImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSkeletonTransformation()
	 * @generated
	 */
	int SKELETON_TRANSFORMATION = 27;

	/**
	 * The feature id for the '<em><b>Skeleton Transformation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Skeleton Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Skeleton Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_TRANSFORMATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.VisualGroupElementImpl <em>Visual Group Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.VisualGroupElementImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualGroupElement()
	 * @generated
	 */
	int VISUAL_GROUP_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Default Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__DEFAULT_COLOR = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT__PARAMETER = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visual Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Visual Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_ELEMENT_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.VisualGroupImpl <em>Visual Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.VisualGroupImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualGroup()
	 * @generated
	 */
	int VISUAL_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Low Spectrum Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__LOW_SPECTRUM_COLOR = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Spectrum Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__HIGH_SPECTRUM_COLOR = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__TYPE = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visual Group Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP__VISUAL_GROUP_ELEMENTS = GeppettoPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Visual Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Visual Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_GROUP_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ConnectionImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 30;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__A = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__B = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTIVITY = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ArrayElementImpl <em>Array Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ArrayElementImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArrayElement()
	 * @generated
	 */
	int ARRAY_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT__INDEX = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT__POSITION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT__INITIAL_VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ArrayValueImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__ELEMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ImageImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 33;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DATA = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REFERENCE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FORMAT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.ImportValueImpl <em>Import Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.ImportValueImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImportValue()
	 * @generated
	 */
	int IMPORT_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_VALUE__SYNCHED = VALUE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Model Interpreter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_VALUE__MODEL_INTERPRETER_ID = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.Connectivity <em>Connectivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.Connectivity
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getConnectivity()
	 * @generated
	 */
	int CONNECTIVITY = 35;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.ImageFormat <em>Image Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.ImageFormat
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImageFormat()
	 * @generated
	 */
	int IMAGE_FORMAT = 36;

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.geppetto.model.values.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.geppetto.model.values.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the map '{@link org.geppetto.model.values.Composite#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see org.geppetto.model.values.Composite#getValue()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Value Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueType="org.geppetto.model.values.Value"
	 * @generated
	 */
	EClass getStringToValueMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToValueMap()
	 * @generated
	 */
	EAttribute getStringToValueMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToValueMap()
	 * @generated
	 */
	EReference getStringToValueMap_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.geppetto.model.values.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Quantity#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see org.geppetto.model.values.Quantity#getScalingFactor()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_ScalingFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.geppetto.model.values.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.PhysicalQuantity <em>Physical Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Quantity</em>'.
	 * @see org.geppetto.model.values.PhysicalQuantity
	 * @generated
	 */
	EClass getPhysicalQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.PhysicalQuantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.geppetto.model.values.PhysicalQuantity#getUnit()
	 * @see #getPhysicalQuantity()
	 * @generated
	 */
	EReference getPhysicalQuantity_Unit();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.geppetto.model.values.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Unit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.geppetto.model.values.Unit#getUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Unit();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series</em>'.
	 * @see org.geppetto.model.values.TimeSeries
	 * @generated
	 */
	EClass getTimeSeries();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.TimeSeries#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.geppetto.model.values.TimeSeries#getUnit()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.TimeSeries#getScalingFactor <em>Scaling Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Factor</em>'.
	 * @see org.geppetto.model.values.TimeSeries#getScalingFactor()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_ScalingFactor();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.values.TimeSeries#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.geppetto.model.values.TimeSeries#getValue()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.MetadataValue <em>Metadata Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Value</em>'.
	 * @see org.geppetto.model.values.MetadataValue
	 * @generated
	 */
	EClass getMetadataValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.geppetto.model.values.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.geppetto.model.values.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL</em>'.
	 * @see org.geppetto.model.values.URL
	 * @generated
	 */
	EClass getURL();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.URL#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.geppetto.model.values.URL#getUrl()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_Url();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see org.geppetto.model.values.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.HTML#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.geppetto.model.values.HTML#getHtml()
	 * @see #getHTML()
	 * @generated
	 */
	EAttribute getHTML_Html();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Pointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see org.geppetto.model.values.Pointer
	 * @generated
	 */
	EClass getPointer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.values.Pointer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.geppetto.model.values.Pointer#getElements()
	 * @see #getPointer()
	 * @generated
	 */
	EReference getPointer_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Pointer#getVisualReference <em>Visual Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visual Reference</em>'.
	 * @see org.geppetto.model.values.Pointer#getVisualReference()
	 * @see #getPointer()
	 * @generated
	 */
	EReference getPointer_VisualReference();

	/**
	 * Returns the meta object for the '{@link org.geppetto.model.values.Pointer#getInstancePath() <em>Get Instance Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance Path</em>' operation.
	 * @see org.geppetto.model.values.Pointer#getInstancePath()
	 * @generated
	 */
	EOperation getPointer__GetInstancePath();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.PointerElement <em>Pointer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Element</em>'.
	 * @see org.geppetto.model.values.PointerElement
	 * @generated
	 */
	EClass getPointerElement();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.values.PointerElement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.geppetto.model.values.PointerElement#getVariable()
	 * @see #getPointerElement()
	 * @generated
	 */
	EReference getPointerElement_Variable();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.values.PointerElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.geppetto.model.values.PointerElement#getType()
	 * @see #getPointerElement()
	 * @generated
	 */
	EReference getPointerElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.PointerElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.geppetto.model.values.PointerElement#getIndex()
	 * @see #getPointerElement()
	 * @generated
	 */
	EAttribute getPointerElement_Index();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.VisualReference <em>Visual Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Reference</em>'.
	 * @see org.geppetto.model.values.VisualReference
	 * @generated
	 */
	EClass getVisualReference();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.values.VisualReference#getVisualVariable <em>Visual Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Variable</em>'.
	 * @see org.geppetto.model.values.VisualReference#getVisualVariable()
	 * @see #getVisualReference()
	 * @generated
	 */
	EReference getVisualReference_VisualVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.VisualReference#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see org.geppetto.model.values.VisualReference#getFraction()
	 * @see #getVisualReference()
	 * @generated
	 */
	EAttribute getVisualReference_Fraction();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.geppetto.model.values.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.geppetto.model.values.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.geppetto.model.values.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.geppetto.model.values.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamics</em>'.
	 * @see org.geppetto.model.values.Dynamics
	 * @generated
	 */
	EClass getDynamics();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Dynamics#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Condition</em>'.
	 * @see org.geppetto.model.values.Dynamics#getInitialCondition()
	 * @see #getDynamics()
	 * @generated
	 */
	EReference getDynamics_InitialCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Dynamics#getDynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamics</em>'.
	 * @see org.geppetto.model.values.Dynamics#getDynamics()
	 * @see #getDynamics()
	 * @generated
	 */
	EReference getDynamics_Dynamics();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.FunctionPlot <em>Function Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Plot</em>'.
	 * @see org.geppetto.model.values.FunctionPlot
	 * @generated
	 */
	EClass getFunctionPlot();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getTitle()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getXAxisLabel()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getYAxisLabel()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_YAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getInitialValue()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getFinalValue <em>Final Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Value</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getFinalValue()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_FinalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.FunctionPlot#getStepValue <em>Step Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Value</em>'.
	 * @see org.geppetto.model.values.FunctionPlot#getStepValue()
	 * @see #getFunctionPlot()
	 * @generated
	 */
	EAttribute getFunctionPlot_StepValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.geppetto.model.values.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.values.Function#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.geppetto.model.values.Function#getArguments()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Function#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.geppetto.model.values.Function#getExpression()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Function#getFunctionPlot <em>Function Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Plot</em>'.
	 * @see org.geppetto.model.values.Function#getFunctionPlot()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FunctionPlot();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.geppetto.model.values.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Argument#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument</em>'.
	 * @see org.geppetto.model.values.Argument#getArgument()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Argument();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.geppetto.model.values.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.geppetto.model.values.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.VisualValue <em>Visual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Value</em>'.
	 * @see org.geppetto.model.values.VisualValue
	 * @generated
	 */
	EClass getVisualValue();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.values.VisualValue#getGroupElements <em>Group Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group Elements</em>'.
	 * @see org.geppetto.model.values.VisualValue#getGroupElements()
	 * @see #getVisualValue()
	 * @generated
	 */
	EReference getVisualValue_GroupElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.VisualValue#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.geppetto.model.values.VisualValue#getPosition()
	 * @see #getVisualValue()
	 * @generated
	 */
	EReference getVisualValue_Position();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Collada <em>Collada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collada</em>'.
	 * @see org.geppetto.model.values.Collada
	 * @generated
	 */
	EClass getCollada();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Collada#getCollada <em>Collada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collada</em>'.
	 * @see org.geppetto.model.values.Collada#getCollada()
	 * @see #getCollada()
	 * @generated
	 */
	EAttribute getCollada_Collada();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.OBJ <em>OBJ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBJ</em>'.
	 * @see org.geppetto.model.values.OBJ
	 * @generated
	 */
	EClass getOBJ();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.OBJ#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj</em>'.
	 * @see org.geppetto.model.values.OBJ#getObj()
	 * @see #getOBJ()
	 * @generated
	 */
	EAttribute getOBJ_Obj();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere</em>'.
	 * @see org.geppetto.model.values.Sphere
	 * @generated
	 */
	EClass getSphere();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Sphere#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.geppetto.model.values.Sphere#getRadius()
	 * @see #getSphere()
	 * @generated
	 */
	EAttribute getSphere_Radius();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see org.geppetto.model.values.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Cylinder#getBottomRadius <em>Bottom Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Radius</em>'.
	 * @see org.geppetto.model.values.Cylinder#getBottomRadius()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_BottomRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Cylinder#getTopRadius <em>Top Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Radius</em>'.
	 * @see org.geppetto.model.values.Cylinder#getTopRadius()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_TopRadius();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Cylinder#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.geppetto.model.values.Cylinder#getHeight()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_Height();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Cylinder#getDistal <em>Distal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distal</em>'.
	 * @see org.geppetto.model.values.Cylinder#getDistal()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_Distal();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Particle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Particle</em>'.
	 * @see org.geppetto.model.values.Particle
	 * @generated
	 */
	EClass getParticle();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.SkeletonAnimation <em>Skeleton Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeleton Animation</em>'.
	 * @see org.geppetto.model.values.SkeletonAnimation
	 * @generated
	 */
	EClass getSkeletonAnimation();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.values.SkeletonAnimation#getSkeletonTransformationSeries <em>Skeleton Transformation Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skeleton Transformation Series</em>'.
	 * @see org.geppetto.model.values.SkeletonAnimation#getSkeletonTransformationSeries()
	 * @see #getSkeletonAnimation()
	 * @generated
	 */
	EReference getSkeletonAnimation_SkeletonTransformationSeries();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.SkeletonTransformation <em>Skeleton Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeleton Transformation</em>'.
	 * @see org.geppetto.model.values.SkeletonTransformation
	 * @generated
	 */
	EClass getSkeletonTransformation();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.model.values.SkeletonTransformation#getSkeletonTransformation <em>Skeleton Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skeleton Transformation</em>'.
	 * @see org.geppetto.model.values.SkeletonTransformation#getSkeletonTransformation()
	 * @see #getSkeletonTransformation()
	 * @generated
	 */
	EAttribute getSkeletonTransformation_SkeletonTransformation();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.VisualGroupElement <em>Visual Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Group Element</em>'.
	 * @see org.geppetto.model.values.VisualGroupElement
	 * @generated
	 */
	EClass getVisualGroupElement();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.VisualGroupElement#getDefaultColor <em>Default Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Color</em>'.
	 * @see org.geppetto.model.values.VisualGroupElement#getDefaultColor()
	 * @see #getVisualGroupElement()
	 * @generated
	 */
	EAttribute getVisualGroupElement_DefaultColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.VisualGroupElement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.geppetto.model.values.VisualGroupElement#getParameter()
	 * @see #getVisualGroupElement()
	 * @generated
	 */
	EReference getVisualGroupElement_Parameter();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.VisualGroup <em>Visual Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Group</em>'.
	 * @see org.geppetto.model.values.VisualGroup
	 * @generated
	 */
	EClass getVisualGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.VisualGroup#getLowSpectrumColor <em>Low Spectrum Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Spectrum Color</em>'.
	 * @see org.geppetto.model.values.VisualGroup#getLowSpectrumColor()
	 * @see #getVisualGroup()
	 * @generated
	 */
	EAttribute getVisualGroup_LowSpectrumColor();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.VisualGroup#getHighSpectrumColor <em>High Spectrum Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Spectrum Color</em>'.
	 * @see org.geppetto.model.values.VisualGroup#getHighSpectrumColor()
	 * @see #getVisualGroup()
	 * @generated
	 */
	EAttribute getVisualGroup_HighSpectrumColor();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.VisualGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.geppetto.model.values.VisualGroup#getType()
	 * @see #getVisualGroup()
	 * @generated
	 */
	EAttribute getVisualGroup_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.values.VisualGroup#getVisualGroupElements <em>Visual Group Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visual Group Elements</em>'.
	 * @see org.geppetto.model.values.VisualGroup#getVisualGroupElements()
	 * @see #getVisualGroup()
	 * @generated
	 */
	EReference getVisualGroup_VisualGroupElements();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.geppetto.model.values.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Connection#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.geppetto.model.values.Connection#getA()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_A();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Connection#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see org.geppetto.model.values.Connection#getB()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_B();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Connection#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectivity</em>'.
	 * @see org.geppetto.model.values.Connection#getConnectivity()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Connectivity();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.ArrayElement <em>Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Element</em>'.
	 * @see org.geppetto.model.values.ArrayElement
	 * @generated
	 */
	EClass getArrayElement();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.ArrayElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.geppetto.model.values.ArrayElement#getIndex()
	 * @see #getArrayElement()
	 * @generated
	 */
	EAttribute getArrayElement_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.ArrayElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.geppetto.model.values.ArrayElement#getPosition()
	 * @see #getArrayElement()
	 * @generated
	 */
	EReference getArrayElement_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.ArrayElement#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.geppetto.model.values.ArrayElement#getInitialValue()
	 * @see #getArrayElement()
	 * @generated
	 */
	EReference getArrayElement_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see org.geppetto.model.values.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.values.ArrayValue#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.geppetto.model.values.ArrayValue#getElements()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Elements();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.geppetto.model.values.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Image#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.geppetto.model.values.Image#getData()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.geppetto.model.values.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Image#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.geppetto.model.values.Image#getReference()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.Image#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.geppetto.model.values.Image#getFormat()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Format();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.values.ImportValue <em>Import Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Value</em>'.
	 * @see org.geppetto.model.values.ImportValue
	 * @generated
	 */
	EClass getImportValue();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.values.ImportValue#getModelInterpreterId <em>Model Interpreter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Interpreter Id</em>'.
	 * @see org.geppetto.model.values.ImportValue#getModelInterpreterId()
	 * @see #getImportValue()
	 * @generated
	 */
	EAttribute getImportValue_ModelInterpreterId();

	/**
	 * Returns the meta object for enum '{@link org.geppetto.model.values.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connectivity</em>'.
	 * @see org.geppetto.model.values.Connectivity
	 * @generated
	 */
	EEnum getConnectivity();

	/**
	 * Returns the meta object for enum '{@link org.geppetto.model.values.ImageFormat <em>Image Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Format</em>'.
	 * @see org.geppetto.model.values.ImageFormat
	 * @generated
	 */
	EEnum getImageFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValuesFactory getValuesFactory();

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
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ValueImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.CompositeImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__VALUE = eINSTANCE.getComposite_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.StringToValueMapImpl <em>String To Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.StringToValueMapImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getStringToValueMap()
		 * @generated
		 */
		EClass STRING_TO_VALUE_MAP = eINSTANCE.getStringToValueMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_VALUE_MAP__KEY = eINSTANCE.getStringToValueMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_VALUE_MAP__VALUE = eINSTANCE.getStringToValueMap_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.QuantityImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Scaling Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__SCALING_FACTOR = eINSTANCE.getQuantity_ScalingFactor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.PhysicalQuantityImpl <em>Physical Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.PhysicalQuantityImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPhysicalQuantity()
		 * @generated
		 */
		EClass PHYSICAL_QUANTITY = eINSTANCE.getPhysicalQuantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_QUANTITY__UNIT = eINSTANCE.getPhysicalQuantity_Unit();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.UnitImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__UNIT = eINSTANCE.getUnit_Unit();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.TimeSeriesImpl <em>Time Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.TimeSeriesImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getTimeSeries()
		 * @generated
		 */
		EClass TIME_SERIES = eINSTANCE.getTimeSeries();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__UNIT = eINSTANCE.getTimeSeries_Unit();

		/**
		 * The meta object literal for the '<em><b>Scaling Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__SCALING_FACTOR = eINSTANCE.getTimeSeries_ScalingFactor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__VALUE = eINSTANCE.getTimeSeries_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.MetadataValueImpl <em>Metadata Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.MetadataValueImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getMetadataValue()
		 * @generated
		 */
		EClass METADATA_VALUE = eINSTANCE.getMetadataValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.TextImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.URLImpl <em>URL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.URLImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getURL()
		 * @generated
		 */
		EClass URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__URL = eINSTANCE.getURL_Url();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.HTMLImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getHTML()
		 * @generated
		 */
		EClass HTML = eINSTANCE.getHTML();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML__HTML = eINSTANCE.getHTML_Html();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.PointerImpl <em>Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.PointerImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPointer()
		 * @generated
		 */
		EClass POINTER = eINSTANCE.getPointer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER__ELEMENTS = eINSTANCE.getPointer_Elements();

		/**
		 * The meta object literal for the '<em><b>Visual Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER__VISUAL_REFERENCE = eINSTANCE.getPointer_VisualReference();

		/**
		 * The meta object literal for the '<em><b>Get Instance Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINTER___GET_INSTANCE_PATH = eINSTANCE.getPointer__GetInstancePath();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.PointerElementImpl <em>Pointer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.PointerElementImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPointerElement()
		 * @generated
		 */
		EClass POINTER_ELEMENT = eINSTANCE.getPointerElement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_ELEMENT__VARIABLE = eINSTANCE.getPointerElement_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_ELEMENT__TYPE = eINSTANCE.getPointerElement_Type();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_ELEMENT__INDEX = eINSTANCE.getPointerElement_Index();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.VisualReferenceImpl <em>Visual Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.VisualReferenceImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualReference()
		 * @generated
		 */
		EClass VISUAL_REFERENCE = eINSTANCE.getVisualReference();

		/**
		 * The meta object literal for the '<em><b>Visual Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_REFERENCE__VISUAL_VARIABLE = eINSTANCE.getVisualReference_VisualVariable();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_REFERENCE__FRACTION = eINSTANCE.getVisualReference_Fraction();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.PointImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.DynamicsImpl <em>Dynamics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.DynamicsImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getDynamics()
		 * @generated
		 */
		EClass DYNAMICS = eINSTANCE.getDynamics();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMICS__INITIAL_CONDITION = eINSTANCE.getDynamics_InitialCondition();

		/**
		 * The meta object literal for the '<em><b>Dynamics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMICS__DYNAMICS = eINSTANCE.getDynamics_Dynamics();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.FunctionPlotImpl <em>Function Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.FunctionPlotImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getFunctionPlot()
		 * @generated
		 */
		EClass FUNCTION_PLOT = eINSTANCE.getFunctionPlot();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__TITLE = eINSTANCE.getFunctionPlot_Title();

		/**
		 * The meta object literal for the '<em><b>XAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__XAXIS_LABEL = eINSTANCE.getFunctionPlot_XAxisLabel();

		/**
		 * The meta object literal for the '<em><b>YAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__YAXIS_LABEL = eINSTANCE.getFunctionPlot_YAxisLabel();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__INITIAL_VALUE = eINSTANCE.getFunctionPlot_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Final Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__FINAL_VALUE = eINSTANCE.getFunctionPlot_FinalValue();

		/**
		 * The meta object literal for the '<em><b>Step Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PLOT__STEP_VALUE = eINSTANCE.getFunctionPlot_StepValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.FunctionImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ARGUMENTS = eINSTANCE.getFunction_Arguments();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__EXPRESSION = eINSTANCE.getFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Function Plot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNCTION_PLOT = eINSTANCE.getFunction_FunctionPlot();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ArgumentImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ARGUMENT = eINSTANCE.getArgument_Argument();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ExpressionImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.VisualValueImpl <em>Visual Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.VisualValueImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualValue()
		 * @generated
		 */
		EClass VISUAL_VALUE = eINSTANCE.getVisualValue();

		/**
		 * The meta object literal for the '<em><b>Group Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_VALUE__GROUP_ELEMENTS = eINSTANCE.getVisualValue_GroupElements();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_VALUE__POSITION = eINSTANCE.getVisualValue_Position();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ColladaImpl <em>Collada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ColladaImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getCollada()
		 * @generated
		 */
		EClass COLLADA = eINSTANCE.getCollada();

		/**
		 * The meta object literal for the '<em><b>Collada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLADA__COLLADA = eINSTANCE.getCollada_Collada();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.OBJImpl <em>OBJ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.OBJImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getOBJ()
		 * @generated
		 */
		EClass OBJ = eINSTANCE.getOBJ();

		/**
		 * The meta object literal for the '<em><b>Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ__OBJ = eINSTANCE.getOBJ_Obj();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.SphereImpl <em>Sphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.SphereImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSphere()
		 * @generated
		 */
		EClass SPHERE = eINSTANCE.getSphere();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE__RADIUS = eINSTANCE.getSphere_Radius();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.CylinderImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Bottom Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__BOTTOM_RADIUS = eINSTANCE.getCylinder_BottomRadius();

		/**
		 * The meta object literal for the '<em><b>Top Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__TOP_RADIUS = eINSTANCE.getCylinder_TopRadius();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__HEIGHT = eINSTANCE.getCylinder_Height();

		/**
		 * The meta object literal for the '<em><b>Distal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__DISTAL = eINSTANCE.getCylinder_Distal();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ParticleImpl <em>Particle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ParticleImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getParticle()
		 * @generated
		 */
		EClass PARTICLE = eINSTANCE.getParticle();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.SkeletonAnimationImpl <em>Skeleton Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.SkeletonAnimationImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSkeletonAnimation()
		 * @generated
		 */
		EClass SKELETON_ANIMATION = eINSTANCE.getSkeletonAnimation();

		/**
		 * The meta object literal for the '<em><b>Skeleton Transformation Series</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES = eINSTANCE.getSkeletonAnimation_SkeletonTransformationSeries();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.SkeletonTransformationImpl <em>Skeleton Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.SkeletonTransformationImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getSkeletonTransformation()
		 * @generated
		 */
		EClass SKELETON_TRANSFORMATION = eINSTANCE.getSkeletonTransformation();

		/**
		 * The meta object literal for the '<em><b>Skeleton Transformation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION = eINSTANCE.getSkeletonTransformation_SkeletonTransformation();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.VisualGroupElementImpl <em>Visual Group Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.VisualGroupElementImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualGroupElement()
		 * @generated
		 */
		EClass VISUAL_GROUP_ELEMENT = eINSTANCE.getVisualGroupElement();

		/**
		 * The meta object literal for the '<em><b>Default Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_GROUP_ELEMENT__DEFAULT_COLOR = eINSTANCE.getVisualGroupElement_DefaultColor();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_GROUP_ELEMENT__PARAMETER = eINSTANCE.getVisualGroupElement_Parameter();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.VisualGroupImpl <em>Visual Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.VisualGroupImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualGroup()
		 * @generated
		 */
		EClass VISUAL_GROUP = eINSTANCE.getVisualGroup();

		/**
		 * The meta object literal for the '<em><b>Low Spectrum Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_GROUP__LOW_SPECTRUM_COLOR = eINSTANCE.getVisualGroup_LowSpectrumColor();

		/**
		 * The meta object literal for the '<em><b>High Spectrum Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_GROUP__HIGH_SPECTRUM_COLOR = eINSTANCE.getVisualGroup_HighSpectrumColor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_GROUP__TYPE = eINSTANCE.getVisualGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Visual Group Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_GROUP__VISUAL_GROUP_ELEMENTS = eINSTANCE.getVisualGroup_VisualGroupElements();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ConnectionImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__A = eINSTANCE.getConnection_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__B = eINSTANCE.getConnection_B();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTIVITY = eINSTANCE.getConnection_Connectivity();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ArrayElementImpl <em>Array Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ArrayElementImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArrayElement()
		 * @generated
		 */
		EClass ARRAY_ELEMENT = eINSTANCE.getArrayElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_ELEMENT__INDEX = eINSTANCE.getArrayElement_Index();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ELEMENT__POSITION = eINSTANCE.getArrayElement_Position();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ELEMENT__INITIAL_VALUE = eINSTANCE.getArrayElement_InitialValue();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ArrayValueImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__ELEMENTS = eINSTANCE.getArrayValue_Elements();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ImageImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DATA = eINSTANCE.getImage_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__REFERENCE = eINSTANCE.getImage_Reference();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__FORMAT = eINSTANCE.getImage_Format();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.ImportValueImpl <em>Import Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.ImportValueImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImportValue()
		 * @generated
		 */
		EClass IMPORT_VALUE = eINSTANCE.getImportValue();

		/**
		 * The meta object literal for the '<em><b>Model Interpreter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_VALUE__MODEL_INTERPRETER_ID = eINSTANCE.getImportValue_ModelInterpreterId();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.Connectivity <em>Connectivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.Connectivity
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getConnectivity()
		 * @generated
		 */
		EEnum CONNECTIVITY = eINSTANCE.getConnectivity();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.values.ImageFormat <em>Image Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.ImageFormat
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getImageFormat()
		 * @generated
		 */
		EEnum IMAGE_FORMAT = eINSTANCE.getImageFormat();

	}

} //ValuesPackage
