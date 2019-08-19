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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.GeppettoLibrary;

import org.geppetto.model.datasources.DataSource;
import org.geppetto.model.datasources.DataSourceLibraryConfiguration;
import org.geppetto.model.datasources.DatasourcesPackage;
import org.geppetto.model.datasources.Query;

import org.geppetto.model.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getDataSourceService <em>Data Source Service</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getLibraryConfigurations <em>Library Configurations</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getDependenciesLibrary <em>Dependencies Library</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getTargetLibrary <em>Target Library</em>}</li>
 *   <li>{@link org.geppetto.model.datasources.impl.DataSourceImpl#getFetchVariableQuery <em>Fetch Variable Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends NodeImpl implements DataSource
{
	/**
	 * The default value of the '{@link #getDataSourceService() <em>Data Source Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceService()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceService() <em>Data Source Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceService()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceService = DATA_SOURCE_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibraryConfigurations() <em>Library Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceLibraryConfiguration> libraryConfigurations;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * The cached value of the '{@link #getDependenciesLibrary() <em>Dependencies Library</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenciesLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<GeppettoLibrary> dependenciesLibrary;

	/**
	 * The cached value of the '{@link #getTargetLibrary() <em>Target Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLibrary()
	 * @generated
	 * @ordered
	 */
	protected GeppettoLibrary targetLibrary;

	/**
	 * The cached value of the '{@link #getFetchVariableQuery() <em>Fetch Variable Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchVariableQuery()
	 * @generated
	 * @ordered
	 */
	protected Query fetchVariableQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl()
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
		return DatasourcesPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceService()
	{
		return dataSourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceService(String newDataSourceService)
	{
		String oldDataSourceService = dataSourceService;
		dataSourceService = newDataSourceService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.DATA_SOURCE__DATA_SOURCE_SERVICE, oldDataSourceService, dataSourceService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceLibraryConfiguration> getLibraryConfigurations()
	{
		if (libraryConfigurations == null)
		{
			libraryConfigurations = new EObjectContainmentEList<DataSourceLibraryConfiguration>(DataSourceLibraryConfiguration.class, this, DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS);
		}
		return libraryConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl)
	{
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.DATA_SOURCE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries()
	{
		if (queries == null)
		{
			queries = new EObjectContainmentEList<Query>(Query.class, this, DatasourcesPackage.DATA_SOURCE__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeppettoLibrary> getDependenciesLibrary()
	{
		if (dependenciesLibrary == null)
		{
			dependenciesLibrary = new EObjectResolvingEList<GeppettoLibrary>(GeppettoLibrary.class, this, DatasourcesPackage.DATA_SOURCE__DEPENDENCIES_LIBRARY);
		}
		return dependenciesLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary getTargetLibrary()
	{
		if (targetLibrary != null && targetLibrary.eIsProxy())
		{
			InternalEObject oldTargetLibrary = (InternalEObject)targetLibrary;
			targetLibrary = (GeppettoLibrary)eResolveProxy(oldTargetLibrary);
			if (targetLibrary != oldTargetLibrary)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY, oldTargetLibrary, targetLibrary));
			}
		}
		return targetLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary basicGetTargetLibrary()
	{
		return targetLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLibrary(GeppettoLibrary newTargetLibrary)
	{
		GeppettoLibrary oldTargetLibrary = targetLibrary;
		targetLibrary = newTargetLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY, oldTargetLibrary, targetLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getFetchVariableQuery()
	{
		return fetchVariableQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFetchVariableQuery(Query newFetchVariableQuery, NotificationChain msgs)
	{
		Query oldFetchVariableQuery = fetchVariableQuery;
		fetchVariableQuery = newFetchVariableQuery;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY, oldFetchVariableQuery, newFetchVariableQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchVariableQuery(Query newFetchVariableQuery)
	{
		if (newFetchVariableQuery != fetchVariableQuery)
		{
			NotificationChain msgs = null;
			if (fetchVariableQuery != null)
				msgs = ((InternalEObject)fetchVariableQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY, null, msgs);
			if (newFetchVariableQuery != null)
				msgs = ((InternalEObject)newFetchVariableQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY, null, msgs);
			msgs = basicSetFetchVariableQuery(newFetchVariableQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY, newFetchVariableQuery, newFetchVariableQuery));
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
			case DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS:
				return ((InternalEList<?>)getLibraryConfigurations()).basicRemove(otherEnd, msgs);
			case DatasourcesPackage.DATA_SOURCE__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
			case DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY:
				return basicSetFetchVariableQuery(null, msgs);
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
			case DatasourcesPackage.DATA_SOURCE__DATA_SOURCE_SERVICE:
				return getDataSourceService();
			case DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS:
				return getLibraryConfigurations();
			case DatasourcesPackage.DATA_SOURCE__URL:
				return getUrl();
			case DatasourcesPackage.DATA_SOURCE__QUERIES:
				return getQueries();
			case DatasourcesPackage.DATA_SOURCE__DEPENDENCIES_LIBRARY:
				return getDependenciesLibrary();
			case DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY:
				if (resolve) return getTargetLibrary();
				return basicGetTargetLibrary();
			case DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY:
				return getFetchVariableQuery();
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
			case DatasourcesPackage.DATA_SOURCE__DATA_SOURCE_SERVICE:
				setDataSourceService((String)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS:
				getLibraryConfigurations().clear();
				getLibraryConfigurations().addAll((Collection<? extends DataSourceLibraryConfiguration>)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__URL:
				setUrl((String)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends Query>)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__DEPENDENCIES_LIBRARY:
				getDependenciesLibrary().clear();
				getDependenciesLibrary().addAll((Collection<? extends GeppettoLibrary>)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY:
				setTargetLibrary((GeppettoLibrary)newValue);
				return;
			case DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY:
				setFetchVariableQuery((Query)newValue);
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
			case DatasourcesPackage.DATA_SOURCE__DATA_SOURCE_SERVICE:
				setDataSourceService(DATA_SOURCE_SERVICE_EDEFAULT);
				return;
			case DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS:
				getLibraryConfigurations().clear();
				return;
			case DatasourcesPackage.DATA_SOURCE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DatasourcesPackage.DATA_SOURCE__QUERIES:
				getQueries().clear();
				return;
			case DatasourcesPackage.DATA_SOURCE__DEPENDENCIES_LIBRARY:
				getDependenciesLibrary().clear();
				return;
			case DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY:
				setTargetLibrary((GeppettoLibrary)null);
				return;
			case DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY:
				setFetchVariableQuery((Query)null);
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
			case DatasourcesPackage.DATA_SOURCE__DATA_SOURCE_SERVICE:
				return DATA_SOURCE_SERVICE_EDEFAULT == null ? dataSourceService != null : !DATA_SOURCE_SERVICE_EDEFAULT.equals(dataSourceService);
			case DatasourcesPackage.DATA_SOURCE__LIBRARY_CONFIGURATIONS:
				return libraryConfigurations != null && !libraryConfigurations.isEmpty();
			case DatasourcesPackage.DATA_SOURCE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DatasourcesPackage.DATA_SOURCE__QUERIES:
				return queries != null && !queries.isEmpty();
			case DatasourcesPackage.DATA_SOURCE__DEPENDENCIES_LIBRARY:
				return dependenciesLibrary != null && !dependenciesLibrary.isEmpty();
			case DatasourcesPackage.DATA_SOURCE__TARGET_LIBRARY:
				return targetLibrary != null;
			case DatasourcesPackage.DATA_SOURCE__FETCH_VARIABLE_QUERY:
				return fetchVariableQuery != null;
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
		result.append(" (dataSourceService: ");
		result.append(dataSourceService);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
