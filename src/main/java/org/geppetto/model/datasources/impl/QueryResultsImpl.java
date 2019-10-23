/**
 */
package org.geppetto.model.datasources.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.datasources.AQueryResult;
import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.QueryResult;
import org.geppetto.model.datasources.QueryResults;
import org.geppetto.model.datasources.SerializableQueryResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryResultsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryResultsImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.QueryResultsImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryResultsImpl extends MinimalEObjectImpl.Container implements QueryResults
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<String> header;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AQueryResult> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryResultsImpl()
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
		return DatasourcesPackage.Literals.QUERY_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.QUERY_RESULTS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHeader()
	{
		if (header == null)
		{
			header = new EDataTypeUniqueEList<String>(String.class, this, DatasourcesPackage.QUERY_RESULTS__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AQueryResult> getResults()
	{
		if (results == null)
		{
			results = new EObjectContainmentEList<AQueryResult>(AQueryResult.class, this, DatasourcesPackage.QUERY_RESULTS__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Object getValue(String field, int row)
	{
		if(getResults().size()>row)
		{
			for(String header:getHeader()){
				if(header.equals(field)){
					int column=getHeader().indexOf(header);
					if(getResults().get(row) instanceof QueryResult){
						QueryResult resultRow=(QueryResult) getResults().get(row);
						return resultRow.getValues().get(column);
					}
					else if(getResults().get(row) instanceof QueryResult){
						SerializableQueryResult resultRow=(SerializableQueryResult) getResults().get(row);
						return resultRow.getValues().get(column);
					}
				}
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
			case DatasourcesPackage.QUERY_RESULTS__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case DatasourcesPackage.QUERY_RESULTS__ID:
				return getId();
			case DatasourcesPackage.QUERY_RESULTS__HEADER:
				return getHeader();
			case DatasourcesPackage.QUERY_RESULTS__RESULTS:
				return getResults();
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
			case DatasourcesPackage.QUERY_RESULTS__ID:
				setId((String)newValue);
				return;
			case DatasourcesPackage.QUERY_RESULTS__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends String>)newValue);
				return;
			case DatasourcesPackage.QUERY_RESULTS__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends AQueryResult>)newValue);
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
			case DatasourcesPackage.QUERY_RESULTS__ID:
				setId(ID_EDEFAULT);
				return;
			case DatasourcesPackage.QUERY_RESULTS__HEADER:
				getHeader().clear();
				return;
			case DatasourcesPackage.QUERY_RESULTS__RESULTS:
				getResults().clear();
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
			case DatasourcesPackage.QUERY_RESULTS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatasourcesPackage.QUERY_RESULTS__HEADER:
				return header != null && !header.isEmpty();
			case DatasourcesPackage.QUERY_RESULTS__RESULTS:
				return results != null && !results.isEmpty();
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
			case DatasourcesPackage.QUERY_RESULTS___GET_VALUE__STRING_INT:
				return getValue((String)arguments.get(0), (Integer)arguments.get(1));
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", header: ");
		result.append(header);
		result.append(')');
		return result.toString();
	}

} //QueryResultsImpl
