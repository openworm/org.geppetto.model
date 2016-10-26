/**
 */
package org.geppetto.model.datasources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.Query;
import org.geppetto.model.datasources.QueryMatchingCriteria;

import org.geppetto.model.impl.NodeImpl;
import org.geppetto.model.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryImpl#getMatchingCriteria <em>Matching Criteria</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryImpl#isRunForCount <em>Run For Count</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QueryImpl extends NodeImpl implements Query
{
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatchingCriteria() <em>Matching Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryMatchingCriteria> matchingCriteria;

	/**
	 * The default value of the '{@link #isRunForCount() <em>Run For Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunForCount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_FOR_COUNT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRunForCount() <em>Run For Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunForCount()
	 * @generated
	 * @ordered
	 */
	protected boolean runForCount = RUN_FOR_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl()
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
		return DatasourcesPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.QUERY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryMatchingCriteria> getMatchingCriteria()
	{
		if (matchingCriteria == null)
		{
			matchingCriteria = new EObjectContainmentEList<QueryMatchingCriteria>(QueryMatchingCriteria.class, this, DatasourcesPackage.QUERY__MATCHING_CRITERIA);
		}
		return matchingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunForCount()
	{
		return runForCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunForCount(boolean newRunForCount)
	{
		boolean oldRunForCount = runForCount;
		runForCount = newRunForCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.QUERY__RUN_FOR_COUNT, oldRunForCount, runForCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType()
	{
		if (returnType != null && returnType.eIsProxy())
		{
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasourcesPackage.QUERY__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType()
	{
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType)
	{
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.QUERY__RETURN_TYPE, oldReturnType, returnType));
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
			case DatasourcesPackage.QUERY__MATCHING_CRITERIA:
				return ((InternalEList<?>)getMatchingCriteria()).basicRemove(otherEnd, msgs);
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
			case DatasourcesPackage.QUERY__DESCRIPTION:
				return getDescription();
			case DatasourcesPackage.QUERY__MATCHING_CRITERIA:
				return getMatchingCriteria();
			case DatasourcesPackage.QUERY__RUN_FOR_COUNT:
				return isRunForCount();
			case DatasourcesPackage.QUERY__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case DatasourcesPackage.QUERY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatasourcesPackage.QUERY__MATCHING_CRITERIA:
				getMatchingCriteria().clear();
				getMatchingCriteria().addAll((Collection<? extends QueryMatchingCriteria>)newValue);
				return;
			case DatasourcesPackage.QUERY__RUN_FOR_COUNT:
				setRunForCount((Boolean)newValue);
				return;
			case DatasourcesPackage.QUERY__RETURN_TYPE:
				setReturnType((Type)newValue);
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
			case DatasourcesPackage.QUERY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatasourcesPackage.QUERY__MATCHING_CRITERIA:
				getMatchingCriteria().clear();
				return;
			case DatasourcesPackage.QUERY__RUN_FOR_COUNT:
				setRunForCount(RUN_FOR_COUNT_EDEFAULT);
				return;
			case DatasourcesPackage.QUERY__RETURN_TYPE:
				setReturnType((Type)null);
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
			case DatasourcesPackage.QUERY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatasourcesPackage.QUERY__MATCHING_CRITERIA:
				return matchingCriteria != null && !matchingCriteria.isEmpty();
			case DatasourcesPackage.QUERY__RUN_FOR_COUNT:
				return runForCount != RUN_FOR_COUNT_EDEFAULT;
			case DatasourcesPackage.QUERY__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", runForCount: ");
		result.append(runForCount);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
