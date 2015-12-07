/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.values.ValuesPackage
 * @generated
 */
public interface ValuesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesFactory eINSTANCE = org.geppetto.model.values.impl.ValuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Physical Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Quantity</em>'.
	 * @generated
	 */
	PhysicalQuantity createPhysicalQuantity();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Series</em>'.
	 * @generated
	 */
	TimeSeries createTimeSeries();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>URL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL</em>'.
	 * @generated
	 */
	URL createURL();

	/**
	 * Returns a new object of class '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML</em>'.
	 * @generated
	 */
	HTML createHTML();

	/**
	 * Returns a new object of class '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer</em>'.
	 * @generated
	 */
	Pointer createPointer();

	/**
	 * Returns a new object of class '<em>Pointer Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Element</em>'.
	 * @generated
	 */
	PointerElement createPointerElement();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Dynamics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamics</em>'.
	 * @generated
	 */
	Dynamics createDynamics();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Collada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collada</em>'.
	 * @generated
	 */
	Collada createCollada();

	/**
	 * Returns a new object of class '<em>OBJ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OBJ</em>'.
	 * @generated
	 */
	OBJ createOBJ();

	/**
	 * Returns a new object of class '<em>Sphere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere</em>'.
	 * @generated
	 */
	Sphere createSphere();

	/**
	 * Returns a new object of class '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylinder</em>'.
	 * @generated
	 */
	Cylinder createCylinder();

	/**
	 * Returns a new object of class '<em>Particle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Particle</em>'.
	 * @generated
	 */
	Particle createParticle();

	/**
	 * Returns a new object of class '<em>Skeleton Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skeleton Animation</em>'.
	 * @generated
	 */
	SkeletonAnimation createSkeletonAnimation();

	/**
	 * Returns a new object of class '<em>Skeleton Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skeleton Transformation</em>'.
	 * @generated
	 */
	SkeletonTransformation createSkeletonTransformation();

	/**
	 * Returns a new object of class '<em>Visual Group Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Group Element</em>'.
	 * @generated
	 */
	VisualGroupElement createVisualGroupElement();

	/**
	 * Returns a new object of class '<em>Visual Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Group</em>'.
	 * @generated
	 */
	VisualGroup createVisualGroup();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Element</em>'.
	 * @generated
	 */
	ArrayElement createArrayElement();

	/**
	 * Returns a new object of class '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Value</em>'.
	 * @generated
	 */
	ArrayValue createArrayValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValuesPackage getValuesPackage();

} //ValuesFactory
