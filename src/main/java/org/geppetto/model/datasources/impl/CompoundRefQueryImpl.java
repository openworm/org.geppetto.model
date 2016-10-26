/**
 */
package org.geppetto.model.datasources.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.geppetto.model.datasources.CompoundRefQuery;
import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Ref Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.CompoundRefQueryImpl#getQueryChain <em>Query Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundRefQueryImpl extends QueryImpl implements CompoundRefQuery
{
	/**
	 * The cached value of the '{@link #getQueryChain() <em>Query Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryChain()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queryChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundRefQueryImpl()
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
		return DatasourcesPackage.Literals.COMPOUND_REF_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueryChain()
	{
		if (queryChain == null)
		{
			queryChain = new EObjectResolvingEList<Query>(Query.class, this, DatasourcesPackage.COMPOUND_REF_QUERY__QUERY_CHAIN);
		}
		return queryChain;
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
			case DatasourcesPackage.COMPOUND_REF_QUERY__QUERY_CHAIN:
				return getQueryChain();
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
			case DatasourcesPackage.COMPOUND_REF_QUERY__QUERY_CHAIN:
				getQueryChain().clear();
				getQueryChain().addAll((Collection<? extends Query>)newValue);
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
			case DatasourcesPackage.COMPOUND_REF_QUERY__QUERY_CHAIN:
				getQueryChain().clear();
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
			case DatasourcesPackage.COMPOUND_REF_QUERY__QUERY_CHAIN:
				return queryChain != null && !queryChain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundRefQueryImpl
