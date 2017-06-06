/**
 */
package org.geppetto.model.values.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.geppetto.model.ISynchable;
import org.geppetto.model.Node;
import org.geppetto.model.values.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.values.ValuesPackage
 * @generated
 */
public class ValuesSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ValuesPackage.VALUE:
			{
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseISynchable(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.COMPOSITE:
			{
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseValue(composite);
				if (result == null) result = caseISynchable(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.STRING_TO_VALUE_MAP:
			{
				@SuppressWarnings("unchecked") Map.Entry<String, Value> stringToValueMap = (Map.Entry<String, Value>)theEObject;
				T result = caseStringToValueMap(stringToValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.QUANTITY:
			{
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseValue(quantity);
				if (result == null) result = caseISynchable(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.PHYSICAL_QUANTITY:
			{
				PhysicalQuantity physicalQuantity = (PhysicalQuantity)theEObject;
				T result = casePhysicalQuantity(physicalQuantity);
				if (result == null) result = caseQuantity(physicalQuantity);
				if (result == null) result = caseValue(physicalQuantity);
				if (result == null) result = caseISynchable(physicalQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.UNIT:
			{
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseValue(unit);
				if (result == null) result = caseISynchable(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TIME_SERIES:
			{
				TimeSeries timeSeries = (TimeSeries)theEObject;
				T result = caseTimeSeries(timeSeries);
				if (result == null) result = caseValue(timeSeries);
				if (result == null) result = caseISynchable(timeSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.METADATA_VALUE:
			{
				MetadataValue metadataValue = (MetadataValue)theEObject;
				T result = caseMetadataValue(metadataValue);
				if (result == null) result = caseValue(metadataValue);
				if (result == null) result = caseISynchable(metadataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TEXT:
			{
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseMetadataValue(text);
				if (result == null) result = caseValue(text);
				if (result == null) result = caseISynchable(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.URL:
			{
				URL url = (URL)theEObject;
				T result = caseURL(url);
				if (result == null) result = caseMetadataValue(url);
				if (result == null) result = caseValue(url);
				if (result == null) result = caseISynchable(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.HTML:
			{
				HTML html = (HTML)theEObject;
				T result = caseHTML(html);
				if (result == null) result = caseMetadataValue(html);
				if (result == null) result = caseValue(html);
				if (result == null) result = caseISynchable(html);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.POINTER:
			{
				Pointer pointer = (Pointer)theEObject;
				T result = casePointer(pointer);
				if (result == null) result = caseValue(pointer);
				if (result == null) result = caseISynchable(pointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.POINTER_ELEMENT:
			{
				PointerElement pointerElement = (PointerElement)theEObject;
				T result = casePointerElement(pointerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.POINT:
			{
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseValue(point);
				if (result == null) result = caseISynchable(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.DYNAMICS:
			{
				Dynamics dynamics = (Dynamics)theEObject;
				T result = caseDynamics(dynamics);
				if (result == null) result = caseValue(dynamics);
				if (result == null) result = caseISynchable(dynamics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.FUNCTION_PLOT:
			{
				FunctionPlot functionPlot = (FunctionPlot)theEObject;
				T result = caseFunctionPlot(functionPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.FUNCTION:
			{
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseValue(function);
				if (result == null) result = caseISynchable(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.ARGUMENT:
			{
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseValue(argument);
				if (result == null) result = caseISynchable(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseValue(expression);
				if (result == null) result = caseISynchable(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.VISUAL_VALUE:
			{
				VisualValue visualValue = (VisualValue)theEObject;
				T result = caseVisualValue(visualValue);
				if (result == null) result = caseValue(visualValue);
				if (result == null) result = caseISynchable(visualValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.COLLADA:
			{
				Collada collada = (Collada)theEObject;
				T result = caseCollada(collada);
				if (result == null) result = caseVisualValue(collada);
				if (result == null) result = caseValue(collada);
				if (result == null) result = caseISynchable(collada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.OBJ:
			{
				OBJ obj = (OBJ)theEObject;
				T result = caseOBJ(obj);
				if (result == null) result = caseVisualValue(obj);
				if (result == null) result = caseValue(obj);
				if (result == null) result = caseISynchable(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.SPHERE:
			{
				Sphere sphere = (Sphere)theEObject;
				T result = caseSphere(sphere);
				if (result == null) result = caseVisualValue(sphere);
				if (result == null) result = caseValue(sphere);
				if (result == null) result = caseISynchable(sphere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.CYLINDER:
			{
				Cylinder cylinder = (Cylinder)theEObject;
				T result = caseCylinder(cylinder);
				if (result == null) result = caseVisualValue(cylinder);
				if (result == null) result = caseValue(cylinder);
				if (result == null) result = caseISynchable(cylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.PARTICLES:
			{
				Particles particles = (Particles)theEObject;
				T result = caseParticles(particles);
				if (result == null) result = caseValue(particles);
				if (result == null) result = caseISynchable(particles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.SKELETON_ANIMATION:
			{
				SkeletonAnimation skeletonAnimation = (SkeletonAnimation)theEObject;
				T result = caseSkeletonAnimation(skeletonAnimation);
				if (result == null) result = caseVisualValue(skeletonAnimation);
				if (result == null) result = caseValue(skeletonAnimation);
				if (result == null) result = caseISynchable(skeletonAnimation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.SKELETON_TRANSFORMATION:
			{
				SkeletonTransformation skeletonTransformation = (SkeletonTransformation)theEObject;
				T result = caseSkeletonTransformation(skeletonTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.VISUAL_GROUP_ELEMENT:
			{
				VisualGroupElement visualGroupElement = (VisualGroupElement)theEObject;
				T result = caseVisualGroupElement(visualGroupElement);
				if (result == null) result = caseNode(visualGroupElement);
				if (result == null) result = caseISynchable(visualGroupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.VISUAL_GROUP:
			{
				VisualGroup visualGroup = (VisualGroup)theEObject;
				T result = caseVisualGroup(visualGroup);
				if (result == null) result = caseNode(visualGroup);
				if (result == null) result = caseISynchable(visualGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.CONNECTION:
			{
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseValue(connection);
				if (result == null) result = caseISynchable(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.ARRAY_ELEMENT:
			{
				ArrayElement arrayElement = (ArrayElement)theEObject;
				T result = caseArrayElement(arrayElement);
				if (result == null) result = caseValue(arrayElement);
				if (result == null) result = caseISynchable(arrayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.ARRAY_VALUE:
			{
				ArrayValue arrayValue = (ArrayValue)theEObject;
				T result = caseArrayValue(arrayValue);
				if (result == null) result = caseValue(arrayValue);
				if (result == null) result = caseISynchable(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.IMAGE:
			{
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseValue(image);
				if (result == null) result = caseISynchable(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.IMPORT_VALUE:
			{
				ImportValue importValue = (ImportValue)theEObject;
				T result = caseImportValue(importValue);
				if (result == null) result = caseValue(importValue);
				if (result == null) result = caseISynchable(importValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Value Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToValueMap(Map.Entry<String, Value> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalQuantity(PhysicalQuantity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSeries(TimeSeries object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataValue(MetadataValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURL(URL object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTML(HTML object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointer(Pointer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerElement(PointerElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamics(Dynamics object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPlot(FunctionPlot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualValue(VisualValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollada(Collada object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OBJ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OBJ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOBJ(OBJ object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSphere(Sphere object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinder(Cylinder object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Particles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Particles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticles(Particles object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeleton Animation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeleton Animation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeletonAnimation(SkeletonAnimation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeleton Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeleton Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeletonTransformation(SkeletonTransformation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Group Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Group Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualGroupElement(VisualGroupElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualGroup(VisualGroup object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayElement(ArrayElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportValue(ImportValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISynchable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISynchable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISynchable(ISynchable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ValuesSwitch
