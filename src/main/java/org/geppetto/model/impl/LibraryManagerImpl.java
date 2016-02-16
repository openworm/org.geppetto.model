/**
 */
package org.geppetto.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.LibraryManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.impl.LibraryManagerImpl#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryManagerImpl extends MinimalEObjectImpl.Container implements LibraryManager
{
	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<GeppettoLibrary> libraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryManagerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GeppettoPackage.Literals.LIBRARY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeppettoLibrary> getLibraries()
	{
		if (libraries == null)
		{
			libraries = new EObjectContainmentEList<GeppettoLibrary>(GeppettoLibrary.class, this, GeppettoPackage.LIBRARY_MANAGER__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GeppettoPackage.LIBRARY_MANAGER__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GeppettoPackage.LIBRARY_MANAGER__LIBRARIES:
				return getLibraries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GeppettoPackage.LIBRARY_MANAGER__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends GeppettoLibrary>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GeppettoPackage.LIBRARY_MANAGER__LIBRARIES:
				getLibraries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GeppettoPackage.LIBRARY_MANAGER__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryManagerImpl
