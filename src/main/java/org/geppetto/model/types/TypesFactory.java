/**
 */
package org.geppetto.model.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = org.geppetto.model.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Visual Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Type</em>'.
	 * @generated
	 */
	VisualType createVisualType();

	/**
	 * Returns a new object of class '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Type</em>'.
	 * @generated
	 */
	ImportType createImportType();

	/**
	 * Returns a new object of class '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Type</em>'.
	 * @generated
	 */
	CompositeType createCompositeType();

	/**
	 * Returns a new object of class '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type</em>'.
	 * @generated
	 */
	PointerType createPointerType();

	/**
	 * Returns a new object of class '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Type</em>'.
	 * @generated
	 */
	QuantityType createQuantityType();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>State Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Variable Type</em>'.
	 * @generated
	 */
	StateVariableType createStateVariableType();

	/**
	 * Returns a new object of class '<em>Dynamics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamics Type</em>'.
	 * @generated
	 */
	DynamicsType createDynamicsType();

	/**
	 * Returns a new object of class '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Type</em>'.
	 * @generated
	 */
	ArgumentType createArgumentType();

	/**
	 * Returns a new object of class '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Type</em>'.
	 * @generated
	 */
	ExpressionType createExpressionType();

	/**
	 * Returns a new object of class '<em>HTML Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Type</em>'.
	 * @generated
	 */
	HTMLType createHTMLType();

	/**
	 * Returns a new object of class '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Type</em>'.
	 * @generated
	 */
	TextType createTextType();

	/**
	 * Returns a new object of class '<em>URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Type</em>'.
	 * @generated
	 */
	URLType createURLType();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Composite Visual Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Visual Type</em>'.
	 * @generated
	 */
	CompositeVisualType createCompositeVisualType();

	/**
	 * Returns a new object of class '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type</em>'.
	 * @generated
	 */
	ConnectionType createConnectionType();

	/**
	 * Returns a new object of class '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type</em>'.
	 * @generated
	 */
	SimpleType createSimpleType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
