/**
 */
package org.geppetto.model.datasources.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.SimpleQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.SimpleQueryImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.SimpleQueryImpl#getCountQuery <em>Count Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleQueryImpl extends QueryImpl implements SimpleQuery
{
	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountQuery() <em>Count Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountQuery() <em>Count Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountQuery()
	 * @generated
	 * @ordered
	 */
	protected String countQuery = COUNT_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQueryImpl()
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
		return DatasourcesPackage.Literals.SIMPLE_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery()
	{
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery)
	{
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.SIMPLE_QUERY__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountQuery()
	{
		return countQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountQuery(String newCountQuery)
	{
		String oldCountQuery = countQuery;
		countQuery = newCountQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.SIMPLE_QUERY__COUNT_QUERY, oldCountQuery, countQuery));
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
			case DatasourcesPackage.SIMPLE_QUERY__QUERY:
				return getQuery();
			case DatasourcesPackage.SIMPLE_QUERY__COUNT_QUERY:
				return getCountQuery();
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
			case DatasourcesPackage.SIMPLE_QUERY__QUERY:
				setQuery((String)newValue);
				return;
			case DatasourcesPackage.SIMPLE_QUERY__COUNT_QUERY:
				setCountQuery((String)newValue);
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
			case DatasourcesPackage.SIMPLE_QUERY__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case DatasourcesPackage.SIMPLE_QUERY__COUNT_QUERY:
				setCountQuery(COUNT_QUERY_EDEFAULT);
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
			case DatasourcesPackage.SIMPLE_QUERY__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case DatasourcesPackage.SIMPLE_QUERY__COUNT_QUERY:
				return COUNT_QUERY_EDEFAULT == null ? countQuery != null : !COUNT_QUERY_EDEFAULT.equals(countQuery);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (query: ");
		result.append(query);
		result.append(", countQuery: ");
		result.append(countQuery);
		result.append(')');
		return result.toString();
	}

} //SimpleQueryImpl
