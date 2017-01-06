/**
 */
package org.geppetto.model.datasources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.GeppettoPackage;

import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.ProcessQuery;

import org.geppetto.model.impl.StringToStringMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.ProcessQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.ProcessQueryImpl#getQueryProcessorId <em>Query Processor Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessQueryImpl extends QueryImpl implements ProcessQuery
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameters;

	/**
	 * The default value of the '{@link #getQueryProcessorId() <em>Query Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryProcessorId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_PROCESSOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryProcessorId() <em>Query Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryProcessorId()
	 * @generated
	 * @ordered
	 */
	protected String queryProcessorId = QUERY_PROCESSOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessQueryImpl()
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
		return DatasourcesPackage.Literals.PROCESS_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EcoreEMap<String,String>(GeppettoPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, DatasourcesPackage.PROCESS_QUERY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryProcessorId()
	{
		return queryProcessorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryProcessorId(String newQueryProcessorId)
	{
		String oldQueryProcessorId = queryProcessorId;
		queryProcessorId = newQueryProcessorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.PROCESS_QUERY__QUERY_PROCESSOR_ID, oldQueryProcessorId, queryProcessorId));
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
			case DatasourcesPackage.PROCESS_QUERY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case DatasourcesPackage.PROCESS_QUERY__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case DatasourcesPackage.PROCESS_QUERY__QUERY_PROCESSOR_ID:
				return getQueryProcessorId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DatasourcesPackage.PROCESS_QUERY__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case DatasourcesPackage.PROCESS_QUERY__QUERY_PROCESSOR_ID:
				setQueryProcessorId((String)newValue);
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
			case DatasourcesPackage.PROCESS_QUERY__PARAMETERS:
				getParameters().clear();
				return;
			case DatasourcesPackage.PROCESS_QUERY__QUERY_PROCESSOR_ID:
				setQueryProcessorId(QUERY_PROCESSOR_ID_EDEFAULT);
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
			case DatasourcesPackage.PROCESS_QUERY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DatasourcesPackage.PROCESS_QUERY__QUERY_PROCESSOR_ID:
				return QUERY_PROCESSOR_ID_EDEFAULT == null ? queryProcessorId != null : !QUERY_PROCESSOR_ID_EDEFAULT.equals(queryProcessorId);
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
		result.append(" (queryProcessorId: ");
		result.append(queryProcessorId);
		result.append(')');
		return result.toString();
	}

} //ProcessQueryImpl
