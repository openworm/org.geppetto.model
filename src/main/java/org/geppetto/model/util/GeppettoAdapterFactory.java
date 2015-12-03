/**
 */
package org.geppetto.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.GeppettoPackage
 * @generated
 */
public class GeppettoAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeppettoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = GeppettoPackage.eINSTANCE;
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
	protected GeppettoSwitch<Adapter> modelSwitch =
		new GeppettoSwitch<Adapter>()
		{
			@Override
			public Adapter caseGeppettoModel(GeppettoModel object)
			{
				return createGeppettoModelAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGeppettoLibrary(GeppettoLibrary object)
			{
				return createGeppettoLibraryAdapter();
			}
			@Override
			public Adapter caseLibraryManager(LibraryManager object)
			{
				return createLibraryManagerAdapter();
			}
			@Override
			public Adapter caseGeppettoModelState(GeppettoModelState object)
			{
				return createGeppettoModelStateAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object)
			{
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseTag(Tag object)
			{
				return createTagAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.GeppettoModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.GeppettoModel
	 * @generated
	 */
	public Adapter createGeppettoModelAdapter()
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
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.GeppettoLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.GeppettoLibrary
	 * @generated
	 */
	public Adapter createGeppettoLibraryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.LibraryManager <em>Library Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.LibraryManager
	 * @generated
	 */
	public Adapter createLibraryManagerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.GeppettoModelState <em>Model State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.GeppettoModelState
	 * @generated
	 */
	public Adapter createGeppettoModelStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.geppetto.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.geppetto.model.Tag
	 * @generated
	 */
	public Adapter createTagAdapter()
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

} //GeppettoAdapterFactory
