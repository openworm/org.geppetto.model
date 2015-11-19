/**
 */
package org.geppetto.model.types.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.aspect.Aspect;
import org.geppetto.model.aspect.AspectPackage;

import org.geppetto.model.impl.NodeImpl;

import org.geppetto.model.types.Type;
import org.geppetto.model.types.TypesPackage;

import org.geppetto.model.values.Value;

import org.geppetto.model.variables.Variable;
import org.geppetto.model.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getReferencedVariables <em>Referenced Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends NodeImpl implements Type
{
	/**
	 * The cached value of the '{@link #getReferencedVariables() <em>Referenced Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> referencedVariables;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected Type superType;

	/**
	 * The default value of the '{@link #getDomainModel() <em>Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected static final Object DOMAIN_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected Object domainModel = DOMAIN_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl()
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
		return TypesPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getAspect()
	{
		if (eContainerFeatureID() != TypesPackage.TYPE__ASPECT) return null;
		return (Aspect)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspect(Aspect newAspect, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newAspect, TypesPackage.TYPE__ASPECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(Aspect newAspect)
	{
		if (newAspect != eInternalContainer() || (eContainerFeatureID() != TypesPackage.TYPE__ASPECT && newAspect != null))
		{
			if (EcoreUtil.isAncestor(this, newAspect))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAspect != null)
				msgs = ((InternalEObject)newAspect).eInverseAdd(this, AspectPackage.ASPECT__TYPES, Aspect.class, msgs);
			msgs = basicSetAspect(newAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__ASPECT, newAspect, newAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDomainModel()
	{
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(Object newDomainModel)
	{
		Object oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__DOMAIN_MODEL, oldDomainModel, domainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReferencedVariables()
	{
		if (referencedVariables == null)
		{
			referencedVariables = new EObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, TypesPackage.TYPE__REFERENCED_VARIABLES, VariablesPackage.VARIABLE__TYPES);
		}
		return referencedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSuperType()
	{
		if (superType != null && superType.eIsProxy())
		{
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (Type)eResolveProxy(oldSuperType);
			if (superType != oldSuperType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSuperType()
	{
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(Type newSuperType)
	{
		Type oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getDefaultValue()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedVariables()).basicAdd(otherEnd, msgs);
			case TypesPackage.TYPE__ASPECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAspect((Aspect)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return ((InternalEList<?>)getReferencedVariables()).basicRemove(otherEnd, msgs);
			case TypesPackage.TYPE__ASPECT:
				return basicSetAspect(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case TypesPackage.TYPE__ASPECT:
				return eInternalContainer().eInverseRemove(this, AspectPackage.ASPECT__TYPES, Aspect.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return getReferencedVariables();
			case TypesPackage.TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case TypesPackage.TYPE__ASPECT:
				return getAspect();
			case TypesPackage.TYPE__DOMAIN_MODEL:
				return getDomainModel();
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
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
				getReferencedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TypesPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)newValue);
				return;
			case TypesPackage.TYPE__ASPECT:
				setAspect((Aspect)newValue);
				return;
			case TypesPackage.TYPE__DOMAIN_MODEL:
				setDomainModel(newValue);
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
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
				return;
			case TypesPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)null);
				return;
			case TypesPackage.TYPE__ASPECT:
				setAspect((Aspect)null);
				return;
			case TypesPackage.TYPE__DOMAIN_MODEL:
				setDomainModel(DOMAIN_MODEL_EDEFAULT);
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
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return referencedVariables != null && !referencedVariables.isEmpty();
			case TypesPackage.TYPE__SUPER_TYPE:
				return superType != null;
			case TypesPackage.TYPE__ASPECT:
				return getAspect() != null;
			case TypesPackage.TYPE__DOMAIN_MODEL:
				return DOMAIN_MODEL_EDEFAULT == null ? domainModel != null : !DOMAIN_MODEL_EDEFAULT.equals(domainModel);
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
			case TypesPackage.TYPE___GET_DEFAULT_VALUE:
				return getDefaultValue();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (domainModel: ");
		result.append(domainModel);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
