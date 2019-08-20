/**
 */
package org.geppetto.model.types.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.geppetto.model.ISynchable;
import org.geppetto.model.Node;
import org.geppetto.model.types.*;

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
 * @see org.geppetto.model.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.TYPE:
			{
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNode(type);
				if (result == null) result = caseISynchable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VISUAL_TYPE:
			{
				VisualType visualType = (VisualType)theEObject;
				T result = caseVisualType(visualType);
				if (result == null) result = caseType(visualType);
				if (result == null) result = caseNode(visualType);
				if (result == null) result = caseISynchable(visualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.IMPORT_TYPE:
			{
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = caseType(importType);
				if (result == null) result = caseNode(importType);
				if (result == null) result = caseISynchable(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.COMPOSITE_TYPE:
			{
				CompositeType compositeType = (CompositeType)theEObject;
				T result = caseCompositeType(compositeType);
				if (result == null) result = caseType(compositeType);
				if (result == null) result = caseNode(compositeType);
				if (result == null) result = caseISynchable(compositeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.POINTER_TYPE:
			{
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = caseType(pointerType);
				if (result == null) result = caseNode(pointerType);
				if (result == null) result = caseISynchable(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.QUANTITY_TYPE:
			{
				QuantityType quantityType = (QuantityType)theEObject;
				T result = caseQuantityType(quantityType);
				if (result == null) result = caseType(quantityType);
				if (result == null) result = caseNode(quantityType);
				if (result == null) result = caseISynchable(quantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PARAMETER_TYPE:
			{
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = caseType(parameterType);
				if (result == null) result = caseNode(parameterType);
				if (result == null) result = caseISynchable(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STATE_VARIABLE_TYPE:
			{
				StateVariableType stateVariableType = (StateVariableType)theEObject;
				T result = caseStateVariableType(stateVariableType);
				if (result == null) result = caseType(stateVariableType);
				if (result == null) result = caseNode(stateVariableType);
				if (result == null) result = caseISynchable(stateVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DYNAMICS_TYPE:
			{
				DynamicsType dynamicsType = (DynamicsType)theEObject;
				T result = caseDynamicsType(dynamicsType);
				if (result == null) result = caseType(dynamicsType);
				if (result == null) result = caseNode(dynamicsType);
				if (result == null) result = caseISynchable(dynamicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARGUMENT_TYPE:
			{
				ArgumentType argumentType = (ArgumentType)theEObject;
				T result = caseArgumentType(argumentType);
				if (result == null) result = caseType(argumentType);
				if (result == null) result = caseNode(argumentType);
				if (result == null) result = caseISynchable(argumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.EXPRESSION_TYPE:
			{
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = caseType(expressionType);
				if (result == null) result = caseNode(expressionType);
				if (result == null) result = caseISynchable(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HTML_TYPE:
			{
				HTMLType htmlType = (HTMLType)theEObject;
				T result = caseHTMLType(htmlType);
				if (result == null) result = caseType(htmlType);
				if (result == null) result = caseNode(htmlType);
				if (result == null) result = caseISynchable(htmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JSON_TYPE:
			{
				JSONType jsonType = (JSONType)theEObject;
				T result = caseJSONType(jsonType);
				if (result == null) result = caseType(jsonType);
				if (result == null) result = caseNode(jsonType);
				if (result == null) result = caseISynchable(jsonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TEXT_TYPE:
			{
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = caseType(textType);
				if (result == null) result = caseNode(textType);
				if (result == null) result = caseISynchable(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.URL_TYPE:
			{
				URLType urlType = (URLType)theEObject;
				T result = caseURLType(urlType);
				if (result == null) result = caseType(urlType);
				if (result == null) result = caseNode(urlType);
				if (result == null) result = caseISynchable(urlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.POINT_TYPE:
			{
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseType(pointType);
				if (result == null) result = caseNode(pointType);
				if (result == null) result = caseISynchable(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_TYPE:
			{
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseType(arrayType);
				if (result == null) result = caseNode(arrayType);
				if (result == null) result = caseISynchable(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.COMPOSITE_VISUAL_TYPE:
			{
				CompositeVisualType compositeVisualType = (CompositeVisualType)theEObject;
				T result = caseCompositeVisualType(compositeVisualType);
				if (result == null) result = caseVisualType(compositeVisualType);
				if (result == null) result = caseType(compositeVisualType);
				if (result == null) result = caseNode(compositeVisualType);
				if (result == null) result = caseISynchable(compositeVisualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CONNECTION_TYPE:
			{
				ConnectionType connectionType = (ConnectionType)theEObject;
				T result = caseConnectionType(connectionType);
				if (result == null) result = caseType(connectionType);
				if (result == null) result = caseNode(connectionType);
				if (result == null) result = caseISynchable(connectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_TYPE:
			{
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseType(simpleType);
				if (result == null) result = caseNode(simpleType);
				if (result == null) result = caseISynchable(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.IMAGE_TYPE:
			{
				ImageType imageType = (ImageType)theEObject;
				T result = caseImageType(imageType);
				if (result == null) result = caseType(imageType);
				if (result == null) result = caseNode(imageType);
				if (result == null) result = caseISynchable(imageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_ARRAY_TYPE:
			{
				SimpleArrayType simpleArrayType = (SimpleArrayType)theEObject;
				T result = caseSimpleArrayType(simpleArrayType);
				if (result == null) result = caseType(simpleArrayType);
				if (result == null) result = caseNode(simpleArrayType);
				if (result == null) result = caseISynchable(simpleArrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.METADATA_TYPE:
			{
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = caseType(metadataType);
				if (result == null) result = caseNode(metadataType);
				if (result == null) result = caseISynchable(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualType(VisualType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityType(QuantityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVariableType(StateVariableType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicsType(DynamicsType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentType(ArgumentType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLType(HTMLType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONType(JSONType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLType(URLType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Visual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Visual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeVisualType(CompositeVisualType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionType(ConnectionType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageType(ImageType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleArrayType(SimpleArrayType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object)
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

} //TypesSwitch
