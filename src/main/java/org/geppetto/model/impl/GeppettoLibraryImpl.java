/**
 */
package org.geppetto.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.impl.GeppettoLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoLibraryImpl#getSharedTypes <em>Shared Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeppettoLibraryImpl extends NodeImpl implements GeppettoLibrary
{
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getSharedTypes() <em>Shared Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> sharedTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeppettoLibraryImpl()
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
		return GeppettoPackage.Literals.GEPPETTO_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes()
	{
		if (types == null)
		{
			types = new EObjectContainmentEList<Type>(Type.class, this, GeppettoPackage.GEPPETTO_LIBRARY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSharedTypes()
	{
		if (sharedTypes == null)
		{
			sharedTypes = new EObjectResolvingEList<Type>(Type.class, this, GeppettoPackage.GEPPETTO_LIBRARY__SHARED_TYPES);
		}
		return sharedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeById()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Type getTypeById(String id)
	{
		for(Type type:types){
			if(type.getId().equals(id)){
				return type;
			}
		}
		return null;
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
			case GeppettoPackage.GEPPETTO_LIBRARY__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case GeppettoPackage.GEPPETTO_LIBRARY__TYPES:
				return getTypes();
			case GeppettoPackage.GEPPETTO_LIBRARY__SHARED_TYPES:
				return getSharedTypes();
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
			case GeppettoPackage.GEPPETTO_LIBRARY__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_LIBRARY__SHARED_TYPES:
				getSharedTypes().clear();
				getSharedTypes().addAll((Collection<? extends Type>)newValue);
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
			case GeppettoPackage.GEPPETTO_LIBRARY__TYPES:
				getTypes().clear();
				return;
			case GeppettoPackage.GEPPETTO_LIBRARY__SHARED_TYPES:
				getSharedTypes().clear();
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
			case GeppettoPackage.GEPPETTO_LIBRARY__TYPES:
				return types != null && !types.isEmpty();
			case GeppettoPackage.GEPPETTO_LIBRARY__SHARED_TYPES:
				return sharedTypes != null && !sharedTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case GeppettoPackage.GEPPETTO_LIBRARY___GET_TYPE_BY_ID:
				return getTypeById();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeppettoLibraryImpl
