/**
 */
package org.geppetto.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeppettoFactoryImpl extends EFactoryImpl implements GeppettoFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeppettoFactory init()
	{
		try
		{
			GeppettoFactory theGeppettoFactory = (GeppettoFactory)EPackage.Registry.INSTANCE.getEFactory(GeppettoPackage.eNS_URI);
			if (theGeppettoFactory != null)
			{
				return theGeppettoFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeppettoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoFactoryImpl()
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
			case GeppettoPackage.GEPPETTO_MODEL: return createGeppettoModel();
			case GeppettoPackage.GEPPETTO_LIBRARY: return createGeppettoLibrary();
			case GeppettoPackage.LIBRARY_MANAGER: return createLibraryManager();
			case GeppettoPackage.GEPPETTO_MODEL_STATE: return createGeppettoModelState();
			case GeppettoPackage.VARIABLE_VALUE: return createVariableValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoModel createGeppettoModel()
	{
		GeppettoModelImpl geppettoModel = new GeppettoModelImpl();
		return geppettoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary createGeppettoLibrary()
	{
		GeppettoLibraryImpl geppettoLibrary = new GeppettoLibraryImpl();
		return geppettoLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryManager createLibraryManager()
	{
		LibraryManagerImpl libraryManager = new LibraryManagerImpl();
		return libraryManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoModelState createGeppettoModelState()
	{
		GeppettoModelStateImpl geppettoModelState = new GeppettoModelStateImpl();
		return geppettoModelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue createVariableValue()
	{
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoPackage getGeppettoPackage()
	{
		return (GeppettoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeppettoPackage getPackage()
	{
		return GeppettoPackage.eINSTANCE;
	}

} //GeppettoFactoryImpl
