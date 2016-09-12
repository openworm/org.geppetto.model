/**
 */
package org.geppetto.model.datasources.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.RunnableQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.RunnableQueryImpl#getTargetVariablePath <em>Target Variable Path</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.RunnableQueryImpl#getQueryPath <em>Query Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableQueryImpl extends MinimalEObjectImpl.Container implements RunnableQuery
{
	/**
	 * The default value of the '{@link #getTargetVariablePath() <em>Target Variable Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariablePath()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VARIABLE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetVariablePath() <em>Target Variable Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariablePath()
	 * @generated
	 * @ordered
	 */
	protected String targetVariablePath = TARGET_VARIABLE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryPath() <em>Query Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryPath() <em>Query Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryPath()
	 * @generated
	 * @ordered
	 */
	protected String queryPath = QUERY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableQueryImpl()
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
		return DatasourcesPackage.Literals.RUNNABLE_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetVariablePath()
	{
		return targetVariablePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariablePath(String newTargetVariablePath)
	{
		String oldTargetVariablePath = targetVariablePath;
		targetVariablePath = newTargetVariablePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.RUNNABLE_QUERY__TARGET_VARIABLE_PATH, oldTargetVariablePath, targetVariablePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryPath()
	{
		return queryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryPath(String newQueryPath)
	{
		String oldQueryPath = queryPath;
		queryPath = newQueryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.RUNNABLE_QUERY__QUERY_PATH, oldQueryPath, queryPath));
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
			case DatasourcesPackage.RUNNABLE_QUERY__TARGET_VARIABLE_PATH:
				return getTargetVariablePath();
			case DatasourcesPackage.RUNNABLE_QUERY__QUERY_PATH:
				return getQueryPath();
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
			case DatasourcesPackage.RUNNABLE_QUERY__TARGET_VARIABLE_PATH:
				setTargetVariablePath((String)newValue);
				return;
			case DatasourcesPackage.RUNNABLE_QUERY__QUERY_PATH:
				setQueryPath((String)newValue);
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
			case DatasourcesPackage.RUNNABLE_QUERY__TARGET_VARIABLE_PATH:
				setTargetVariablePath(TARGET_VARIABLE_PATH_EDEFAULT);
				return;
			case DatasourcesPackage.RUNNABLE_QUERY__QUERY_PATH:
				setQueryPath(QUERY_PATH_EDEFAULT);
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
			case DatasourcesPackage.RUNNABLE_QUERY__TARGET_VARIABLE_PATH:
				return TARGET_VARIABLE_PATH_EDEFAULT == null ? targetVariablePath != null : !TARGET_VARIABLE_PATH_EDEFAULT.equals(targetVariablePath);
			case DatasourcesPackage.RUNNABLE_QUERY__QUERY_PATH:
				return QUERY_PATH_EDEFAULT == null ? queryPath != null : !QUERY_PATH_EDEFAULT.equals(queryPath);
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
		result.append(" (targetVariablePath: ");
		result.append(targetVariablePath);
		result.append(", queryPath: ");
		result.append(queryPath);
		result.append(')');
		return result.toString();
	}

} //RunnableQueryImpl
