/**
 */
package org.geppetto.model.instances;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.instances.InstancesPackage
 * @generated
 */
public interface InstancesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancesFactory eINSTANCE = org.geppetto.model.instances.impl.InstancesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Instance</em>'.
	 * @generated
	 */
	SimpleInstance createSimpleInstance();

	/**
	 * Returns a new object of class '<em>Simple Connection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Connection Instance</em>'.
	 * @generated
	 */
	SimpleConnectionInstance createSimpleConnectionInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancesPackage getInstancesPackage();

} //InstancesFactory
