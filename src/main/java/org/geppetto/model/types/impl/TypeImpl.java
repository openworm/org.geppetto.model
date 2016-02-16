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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.DomainModel;
import org.geppetto.model.impl.NodeImpl;
import org.geppetto.model.types.Type;
import org.geppetto.model.types.TypesPackage;
import org.geppetto.model.types.VisualType;
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
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getVisualType <em>Visual Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getReferencedVariables <em>Referenced Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.TypeImpl#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends NodeImpl implements Type
{
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualType() <em>Visual Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualType()
	 * @generated
	 * @ordered
	 */
	protected VisualType visualType;

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
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

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
	public DomainModel getDomainModel()
	{
		if (domainModel != null && domainModel.eIsProxy())
		{
			InternalEObject oldDomainModel = (InternalEObject)domainModel;
			domainModel = (DomainModel)eResolveProxy(oldDomainModel);
			if (domainModel != oldDomainModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE__DOMAIN_MODEL, oldDomainModel, domainModel));
			}
		}
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel basicGetDomainModel()
	{
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(DomainModel newDomainModel)
	{
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__DOMAIN_MODEL, oldDomainModel, domainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract)
	{
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualType getVisualType()
	{
		if (visualType != null && visualType.eIsProxy())
		{
			InternalEObject oldVisualType = (InternalEObject)visualType;
			visualType = (VisualType)eResolveProxy(oldVisualType);
			if (visualType != oldVisualType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE__VISUAL_TYPE, oldVisualType, visualType));
			}
		}
		return visualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualType basicGetVisualType()
	{
		return visualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualType(VisualType newVisualType)
	{
		VisualType oldVisualType = visualType;
		visualType = newVisualType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE__VISUAL_TYPE, oldVisualType, visualType));
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
			referencedVariables = new EObjectWithInverseEList.ManyInverse<Variable>(Variable.class, this, TypesPackage.TYPE__REFERENCED_VARIABLES, VariablesPackage.VARIABLE__TYPES);
		}
		return referencedVariables;
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
			case TypesPackage.TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case TypesPackage.TYPE__ABSTRACT:
				return isAbstract();
			case TypesPackage.TYPE__VISUAL_TYPE:
				if (resolve) return getVisualType();
				return basicGetVisualType();
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return getReferencedVariables();
			case TypesPackage.TYPE__DOMAIN_MODEL:
				if (resolve) return getDomainModel();
				return basicGetDomainModel();
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
			case TypesPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)newValue);
				return;
			case TypesPackage.TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case TypesPackage.TYPE__VISUAL_TYPE:
				setVisualType((VisualType)newValue);
				return;
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
				getReferencedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TypesPackage.TYPE__DOMAIN_MODEL:
				setDomainModel((DomainModel)newValue);
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
			case TypesPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)null);
				return;
			case TypesPackage.TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case TypesPackage.TYPE__VISUAL_TYPE:
				setVisualType((VisualType)null);
				return;
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
				return;
			case TypesPackage.TYPE__DOMAIN_MODEL:
				setDomainModel((DomainModel)null);
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
			case TypesPackage.TYPE__SUPER_TYPE:
				return superType != null;
			case TypesPackage.TYPE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case TypesPackage.TYPE__VISUAL_TYPE:
				return visualType != null;
			case TypesPackage.TYPE__REFERENCED_VARIABLES:
				return referencedVariables != null && !referencedVariables.isEmpty();
			case TypesPackage.TYPE__DOMAIN_MODEL:
				return domainModel != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
