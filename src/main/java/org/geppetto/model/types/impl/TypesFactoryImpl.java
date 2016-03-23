/**
 */
package org.geppetto.model.types.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.types.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init()
	{
		try
		{
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null)
			{
				return theTypesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl()
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
			case TypesPackage.VISUAL_TYPE: return createVisualType();
			case TypesPackage.IMPORT_TYPE: return createImportType();
			case TypesPackage.COMPOSITE_TYPE: return createCompositeType();
			case TypesPackage.POINTER_TYPE: return createPointerType();
			case TypesPackage.QUANTITY_TYPE: return createQuantityType();
			case TypesPackage.PARAMETER_TYPE: return createParameterType();
			case TypesPackage.STATE_VARIABLE_TYPE: return createStateVariableType();
			case TypesPackage.DYNAMICS_TYPE: return createDynamicsType();
			case TypesPackage.ARGUMENT_TYPE: return createArgumentType();
			case TypesPackage.EXPRESSION_TYPE: return createExpressionType();
			case TypesPackage.HTML_TYPE: return createHTMLType();
			case TypesPackage.TEXT_TYPE: return createTextType();
			case TypesPackage.URL_TYPE: return createURLType();
			case TypesPackage.POINT_TYPE: return createPointType();
			case TypesPackage.ARRAY_TYPE: return createArrayType();
			case TypesPackage.COMPOSITE_VISUAL_TYPE: return createCompositeVisualType();
			case TypesPackage.CONNECTION_TYPE: return createConnectionType();
			case TypesPackage.SIMPLE_TYPE: return createSimpleType();
			case TypesPackage.STRING_TO_TYPE_MAP: return (EObject)createStringToTypeMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualType createVisualType()
	{
		VisualTypeImpl visualType = new VisualTypeImpl();
		return visualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType()
	{
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeType()
	{
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType()
	{
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityType createQuantityType()
	{
		QuantityTypeImpl quantityType = new QuantityTypeImpl();
		return quantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType()
	{
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariableType createStateVariableType()
	{
		StateVariableTypeImpl stateVariableType = new StateVariableTypeImpl();
		return stateVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicsType createDynamicsType()
	{
		DynamicsTypeImpl dynamicsType = new DynamicsTypeImpl();
		return dynamicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentType()
	{
		ArgumentTypeImpl argumentType = new ArgumentTypeImpl();
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType createExpressionType()
	{
		ExpressionTypeImpl expressionType = new ExpressionTypeImpl();
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLType createHTMLType()
	{
		HTMLTypeImpl htmlType = new HTMLTypeImpl();
		return htmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextType()
	{
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLType createURLType()
	{
		URLTypeImpl urlType = new URLTypeImpl();
		return urlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType createPointType()
	{
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType()
	{
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeVisualType createCompositeVisualType()
	{
		CompositeVisualTypeImpl compositeVisualType = new CompositeVisualTypeImpl();
		return compositeVisualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType()
	{
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType()
	{
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Type> createStringToTypeMap()
	{
		StringToTypeMapImpl stringToTypeMap = new StringToTypeMapImpl();
		return stringToTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage()
	{
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage()
	{
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
