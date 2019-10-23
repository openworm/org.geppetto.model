/**
 */
package org.geppetto.model.instances.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.instances.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesFactoryImpl extends EFactoryImpl implements InstancesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstancesFactory init()
	{
		try
		{
			InstancesFactory theInstancesFactory = (InstancesFactory)EPackage.Registry.INSTANCE.getEFactory(InstancesPackage.eNS_URI);
			if (theInstancesFactory != null)
			{
				return theInstancesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactoryImpl()
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
			case InstancesPackage.SIMPLE_INSTANCE: return createSimpleInstance();
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE: return createSimpleConnectionInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInstance createSimpleInstance()
	{
		SimpleInstanceImpl simpleInstance = new SimpleInstanceImpl();
		return simpleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConnectionInstance createSimpleConnectionInstance()
	{
		SimpleConnectionInstanceImpl simpleConnectionInstance = new SimpleConnectionInstanceImpl();
		return simpleConnectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesPackage getInstancesPackage()
	{
		return (InstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancesPackage getPackage()
	{
		return InstancesPackage.eINSTANCE;
	}

} //InstancesFactoryImpl
