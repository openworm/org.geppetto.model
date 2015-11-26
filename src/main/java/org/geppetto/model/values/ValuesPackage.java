/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	String eNS_URI = "http://www.geppetto.org/model/values";

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
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Quantities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__QUANTITIES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__UNIT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__ELEMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER___GET_VALUE = VALUE_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Pointer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pointer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.PointImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 13;

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
	 * The meta object id for the '{@link org.geppetto.model.values.impl.DyamicsImpl <em>Dyamics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.DyamicsImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getDyamics()
	 * @generated
	 */
	int DYAMICS = 14;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYAMICS__INITIAL_CONDITION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYAMICS__DYNAMICS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dyamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYAMICS_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dyamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYAMICS_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.FunctionImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
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
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

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
	int ARGUMENT = 16;

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
	int EXPRESSION = 17;

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
	int VISUAL_VALUE = 18;

	/**
	 * The number of structural features of the '<em>Visual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

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
	int COLLADA = 19;

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
	 * The meta object id for the '{@link org.geppetto.model.values.impl.VisualCompositeImpl <em>Visual Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.VisualCompositeImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualComposite()
	 * @generated
	 */
	int VISUAL_COMPOSITE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_COMPOSITE__VALUE = VISUAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visual Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_COMPOSITE_FEATURE_COUNT = VISUAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visual Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_COMPOSITE_OPERATION_COUNT = VISUAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.values.impl.OBJImpl <em>OBJ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.values.impl.OBJImpl
	 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getOBJ()
	 * @generated
	 */
	int OBJ = 21;

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
	int SPHERE = 22;

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
	int CYLINDER = 23;

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
	 * The feature id for the '<em><b>Distal</b></em>' reference.
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
	int PARTICLE = 24;

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
	int SKELETON_ANIMATION = 25;

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
	int SKELETON_TRANSFORMATION = 26;

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
	 * Returns the meta object for the reference list '{@link org.geppetto.model.values.TimeSeries#getQuantities <em>Quantities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quantities</em>'.
	 * @see org.geppetto.model.values.TimeSeries#getQuantities()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_Quantities();

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
	 * Returns the meta object for the '{@link org.geppetto.model.values.Pointer#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.geppetto.model.values.Pointer#getValue()
	 * @generated
	 */
	EOperation getPointer__GetValue();

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
	 * Returns the meta object for class '{@link org.geppetto.model.values.Dyamics <em>Dyamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dyamics</em>'.
	 * @see org.geppetto.model.values.Dyamics
	 * @generated
	 */
	EClass getDyamics();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.values.Dyamics#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Condition</em>'.
	 * @see org.geppetto.model.values.Dyamics#getInitialCondition()
	 * @see #getDyamics()
	 * @generated
	 */
	EReference getDyamics_InitialCondition();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.values.Dyamics#getDynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamics</em>'.
	 * @see org.geppetto.model.values.Dyamics#getDynamics()
	 * @see #getDyamics()
	 * @generated
	 */
	EReference getDyamics_Dynamics();

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
	 * Returns the meta object for the reference list '{@link org.geppetto.model.values.Function#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
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
	 * Returns the meta object for class '{@link org.geppetto.model.values.VisualComposite <em>Visual Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Composite</em>'.
	 * @see org.geppetto.model.values.VisualComposite
	 * @generated
	 */
	EClass getVisualComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geppetto.model.values.VisualComposite#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.geppetto.model.values.VisualComposite#getValue()
	 * @see #getVisualComposite()
	 * @generated
	 */
	EReference getVisualComposite_Value();

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
	 * Returns the meta object for the reference '{@link org.geppetto.model.values.Cylinder#getDistal <em>Distal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distal</em>'.
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
		 * The meta object literal for the '<em><b>Quantities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__QUANTITIES = eINSTANCE.getTimeSeries_Quantities();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__UNIT = eINSTANCE.getTimeSeries_Unit();

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
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINTER___GET_VALUE = eINSTANCE.getPointer__GetValue();

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
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.DyamicsImpl <em>Dyamics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.DyamicsImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getDyamics()
		 * @generated
		 */
		EClass DYAMICS = eINSTANCE.getDyamics();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYAMICS__INITIAL_CONDITION = eINSTANCE.getDyamics_InitialCondition();

		/**
		 * The meta object literal for the '<em><b>Dynamics</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYAMICS__DYNAMICS = eINSTANCE.getDyamics_Dynamics();

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
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link org.geppetto.model.values.impl.VisualCompositeImpl <em>Visual Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.values.impl.VisualCompositeImpl
		 * @see org.geppetto.model.values.impl.ValuesPackageImpl#getVisualComposite()
		 * @generated
		 */
		EClass VISUAL_COMPOSITE = eINSTANCE.getVisualComposite();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_COMPOSITE__VALUE = eINSTANCE.getVisualComposite_Value();

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
		 * The meta object literal for the '<em><b>Distal</b></em>' reference feature.
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

	}

} //ValuesPackage
