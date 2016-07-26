/**
 */
package org.geppetto.model.values.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.geppetto.model.values.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesFactoryImpl extends EFactoryImpl implements ValuesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValuesFactory init()
	{
		try
		{
			ValuesFactory theValuesFactory = (ValuesFactory)EPackage.Registry.INSTANCE.getEFactory(ValuesPackage.eNS_URI);
			if (theValuesFactory != null)
			{
				return theValuesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactoryImpl()
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
			case ValuesPackage.COMPOSITE: return createComposite();
			case ValuesPackage.STRING_TO_VALUE_MAP: return (EObject)createStringToValueMap();
			case ValuesPackage.QUANTITY: return createQuantity();
			case ValuesPackage.PHYSICAL_QUANTITY: return createPhysicalQuantity();
			case ValuesPackage.UNIT: return createUnit();
			case ValuesPackage.TIME_SERIES: return createTimeSeries();
			case ValuesPackage.TEXT: return createText();
			case ValuesPackage.URL: return createURL();
			case ValuesPackage.HTML: return createHTML();
			case ValuesPackage.POINTER: return createPointer();
			case ValuesPackage.POINTER_ELEMENT: return createPointerElement();
			case ValuesPackage.VISUAL_REFERENCE: return createVisualReference();
			case ValuesPackage.POINT: return createPoint();
			case ValuesPackage.DYNAMICS: return createDynamics();
			case ValuesPackage.FUNCTION_PLOT: return createFunctionPlot();
			case ValuesPackage.FUNCTION: return createFunction();
			case ValuesPackage.ARGUMENT: return createArgument();
			case ValuesPackage.EXPRESSION: return createExpression();
			case ValuesPackage.COLLADA: return createCollada();
			case ValuesPackage.OBJ: return createOBJ();
			case ValuesPackage.SPHERE: return createSphere();
			case ValuesPackage.CYLINDER: return createCylinder();
			case ValuesPackage.PARTICLE: return createParticle();
			case ValuesPackage.SKELETON_ANIMATION: return createSkeletonAnimation();
			case ValuesPackage.SKELETON_TRANSFORMATION: return createSkeletonTransformation();
			case ValuesPackage.VISUAL_GROUP_ELEMENT: return createVisualGroupElement();
			case ValuesPackage.VISUAL_GROUP: return createVisualGroup();
			case ValuesPackage.CONNECTION: return createConnection();
			case ValuesPackage.ARRAY_ELEMENT: return createArrayElement();
			case ValuesPackage.ARRAY_VALUE: return createArrayValue();
			case ValuesPackage.IMAGE: return createImage();
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
			case ValuesPackage.CONNECTIVITY:
				return createConnectivityFromString(eDataType, initialValue);
			case ValuesPackage.IMAGE_FORMAT:
				return createImageFormatFromString(eDataType, initialValue);
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
			case ValuesPackage.CONNECTIVITY:
				return convertConnectivityToString(eDataType, instanceValue);
			case ValuesPackage.IMAGE_FORMAT:
				return convertImageFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite()
	{
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Value> createStringToValueMap()
	{
		StringToValueMapImpl stringToValueMap = new StringToValueMapImpl();
		return stringToValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity()
	{
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalQuantity createPhysicalQuantity()
	{
		PhysicalQuantityImpl physicalQuantity = new PhysicalQuantityImpl();
		return physicalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit()
	{
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries createTimeSeries()
	{
		TimeSeriesImpl timeSeries = new TimeSeriesImpl();
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText()
	{
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURL()
	{
		URLImpl url = new URLImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML createHTML()
	{
		HTMLImpl html = new HTMLImpl();
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointer createPointer()
	{
		PointerImpl pointer = new PointerImpl();
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerElement createPointerElement()
	{
		PointerElementImpl pointerElement = new PointerElementImpl();
		return pointerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualReference createVisualReference()
	{
		VisualReferenceImpl visualReference = new VisualReferenceImpl();
		return visualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint()
	{
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics createDynamics()
	{
		DynamicsImpl dynamics = new DynamicsImpl();
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPlot createFunctionPlot()
	{
		FunctionPlotImpl functionPlot = new FunctionPlotImpl();
		return functionPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction()
	{
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument()
	{
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collada createCollada()
	{
		ColladaImpl collada = new ColladaImpl();
		return collada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBJ createOBJ()
	{
		OBJImpl obj = new OBJImpl();
		return obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere()
	{
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder()
	{
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Particle createParticle()
	{
		ParticleImpl particle = new ParticleImpl();
		return particle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeletonAnimation createSkeletonAnimation()
	{
		SkeletonAnimationImpl skeletonAnimation = new SkeletonAnimationImpl();
		return skeletonAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeletonTransformation createSkeletonTransformation()
	{
		SkeletonTransformationImpl skeletonTransformation = new SkeletonTransformationImpl();
		return skeletonTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualGroupElement createVisualGroupElement()
	{
		VisualGroupElementImpl visualGroupElement = new VisualGroupElementImpl();
		return visualGroupElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualGroup createVisualGroup()
	{
		VisualGroupImpl visualGroup = new VisualGroupImpl();
		return visualGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection()
	{
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayElement createArrayElement()
	{
		ArrayElementImpl arrayElement = new ArrayElementImpl();
		return arrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue()
	{
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage()
	{
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectivity createConnectivityFromString(EDataType eDataType, String initialValue)
	{
		Connectivity result = Connectivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectivityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFormat createImageFormatFromString(EDataType eDataType, String initialValue)
	{
		ImageFormat result = ImageFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageFormatToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesPackage getValuesPackage()
	{
		return (ValuesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuesPackage getPackage()
	{
		return ValuesPackage.eINSTANCE;
	}

} //ValuesFactoryImpl
