/**
 */
package org.geppetto.model.values.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.geppetto.model.ISynchable;
import org.geppetto.model.Node;
import org.geppetto.model.values.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.values.ValuesPackage
 * @generated
 */
public class ValuesAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesSwitch<Adapter> modelSwitch =
		new ValuesSwitch<Adapter>()
		{
			@Override
			public Adapter caseValue(Value object)
			{
				return createValueAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object)
			{
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseStringToValueMap(Map.Entry<String, Value> object)
			{
				return createStringToValueMapAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object)
			{
				return createQuantityAdapter();
			}
			@Override
			public Adapter casePhysicalQuantity(PhysicalQuantity object)
			{
				return createPhysicalQuantityAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object)
			{
				return createUnitAdapter();
			}
			@Override
			public Adapter caseTimeSeries(TimeSeries object)
			{
				return createTimeSeriesAdapter();
			}
			@Override
			public Adapter caseMetadataValue(MetadataValue object)
			{
				return createMetadataValueAdapter();
			}
			@Override
			public Adapter caseText(Text object)
			{
				return createTextAdapter();
			}
			@Override
			public Adapter caseURL(URL object)
			{
				return createURLAdapter();
			}
			@Override
			public Adapter caseHTML(HTML object)
			{
				return createHTMLAdapter();
			}
			@Override
			public Adapter casePointer(Pointer object)
			{
				return createPointerAdapter();
			}
			@Override
			public Adapter casePointerElement(PointerElement object)
			{
				return createPointerElementAdapter();
			}
			@Override
			public Adapter casePoint(Point object)
			{
				return createPointAdapter();
			}
			@Override
			public Adapter caseDynamics(Dynamics object)
			{
				return createDynamicsAdapter();
			}
			@Override
			public Adapter caseFunctionPlot(FunctionPlot object)
			{
				return createFunctionPlotAdapter();
			}
			@Override
			public Adapter caseFunction(Function object)
			{
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object)
			{
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseVisualValue(VisualValue object)
			{
				return createVisualValueAdapter();
			}
			@Override
			public Adapter caseCollada(Collada object)
			{
				return createColladaAdapter();
			}
			@Override
			public Adapter caseOBJ(OBJ object)
			{
				return createOBJAdapter();
			}
			@Override
			public Adapter caseSphere(Sphere object)
			{
				return createSphereAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object)
			{
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseParticle(Particle object)
			{
				return createParticleAdapter();
			}
			@Override
			public Adapter caseSkeletonAnimation(SkeletonAnimation object)
			{
				return createSkeletonAnimationAdapter();
			}
			@Override
			public Adapter caseSkeletonTransformation(SkeletonTransformation object)
			{
				return createSkeletonTransformationAdapter();
			}
			@Override
			public Adapter caseVisualGroupElement(VisualGroupElement object)
			{
				return createVisualGroupElementAdapter();
			}
			@Override
			public Adapter caseVisualGroup(VisualGroup object)
			{
				return createVisualGroupAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object)
			{
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseArrayElement(ArrayElement object)
			{
				return createArrayElementAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object)
			{
				return createArrayValueAdapter();
			}
			@Override
			public Adapter caseISynchable(ISynchable object)
			{
				return createISynchableAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Value
	 * @generated
	 */
	public Adapter createValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToValueMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.PhysicalQuantity <em>Physical Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.PhysicalQuantity
	 * @generated
	 */
	public Adapter createPhysicalQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.TimeSeries
	 * @generated
	 */
	public Adapter createTimeSeriesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.MetadataValue <em>Metadata Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.MetadataValue
	 * @generated
	 */
	public Adapter createMetadataValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Text
	 * @generated
	 */
	public Adapter createTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.URL
	 * @generated
	 */
	public Adapter createURLAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.HTML
	 * @generated
	 */
	public Adapter createHTMLAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Pointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Pointer
	 * @generated
	 */
	public Adapter createPointerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.PointerElement <em>Pointer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.PointerElement
	 * @generated
	 */
	public Adapter createPointerElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Point
	 * @generated
	 */
	public Adapter createPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Dynamics
	 * @generated
	 */
	public Adapter createDynamicsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.FunctionPlot <em>Function Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.FunctionPlot
	 * @generated
	 */
	public Adapter createFunctionPlotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.VisualValue <em>Visual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.VisualValue
	 * @generated
	 */
	public Adapter createVisualValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Collada <em>Collada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Collada
	 * @generated
	 */
	public Adapter createColladaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.OBJ <em>OBJ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.OBJ
	 * @generated
	 */
	public Adapter createOBJAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Sphere
	 * @generated
	 */
	public Adapter createSphereAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Particle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Particle
	 * @generated
	 */
	public Adapter createParticleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.SkeletonAnimation <em>Skeleton Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.SkeletonAnimation
	 * @generated
	 */
	public Adapter createSkeletonAnimationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.SkeletonTransformation <em>Skeleton Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.SkeletonTransformation
	 * @generated
	 */
	public Adapter createSkeletonTransformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.VisualGroupElement <em>Visual Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.VisualGroupElement
	 * @generated
	 */
	public Adapter createVisualGroupElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.VisualGroup <em>Visual Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.VisualGroup
	 * @generated
	 */
	public Adapter createVisualGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.ArrayElement <em>Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.ArrayElement
	 * @generated
	 */
	public Adapter createArrayElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.values.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.values.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.ISynchable <em>ISynchable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.ISynchable
	 * @generated
	 */
	public Adapter createISynchableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ValuesAdapterFactory
