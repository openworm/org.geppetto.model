/**
 */
package org.geppetto.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.Tag;

import org.geppetto.model.datasources.DataSource;
import org.geppetto.model.datasources.Query;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeppettoModelImpl extends MinimalEObjectImpl.Container implements GeppettoModel
{
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<GeppettoLibrary> libraries;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> dataSources;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeppettoModelImpl()
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
		return GeppettoPackage.Literals.GEPPETTO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables()
	{
		if (variables == null)
		{
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, GeppettoPackage.GEPPETTO_MODEL__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeppettoLibrary> getLibraries()
	{
		if (libraries == null)
		{
			libraries = new EObjectContainmentEList<GeppettoLibrary>(GeppettoLibrary.class, this, GeppettoPackage.GEPPETTO_MODEL__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags()
	{
		if (tags == null)
		{
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, GeppettoPackage.GEPPETTO_MODEL__TAGS);
		}
		return tags;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.GEPPETTO_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.GEPPETTO_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getDataSources()
	{
		if (dataSources == null)
		{
			dataSources = new EObjectContainmentEList<DataSource>(DataSource.class, this, GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES);
		}
		return dataSources;
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
			queries = new EObjectContainmentEList<Query>(Query.class, this, GeppettoPackage.GEPPETTO_MODEL__QUERIES);
		}
		return queries;
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.GEPPETTO_MODEL__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES:
				return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.GEPPETTO_MODEL__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return getVariables();
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return getLibraries();
			case GeppettoPackage.GEPPETTO_MODEL__TAGS:
				return getTags();
			case GeppettoPackage.GEPPETTO_MODEL__ID:
				return getId();
			case GeppettoPackage.GEPPETTO_MODEL__NAME:
				return getName();
			case GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES:
				return getDataSources();
			case GeppettoPackage.GEPPETTO_MODEL__QUERIES:
				return getQueries();
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends GeppettoLibrary>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__ID:
				setId((String)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__NAME:
				setName((String)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES:
				getDataSources().clear();
				getDataSources().addAll((Collection<? extends DataSource>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends Query>)newValue);
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				getVariables().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				getLibraries().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL__TAGS:
				getTags().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES:
				getDataSources().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL__QUERIES:
				getQueries().clear();
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return variables != null && !variables.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL__TAGS:
				return tags != null && !tags.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GeppettoPackage.GEPPETTO_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeppettoPackage.GEPPETTO_MODEL__DATA_SOURCES:
				return dataSources != null && !dataSources.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL__QUERIES:
				return queries != null && !queries.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GeppettoModelImpl
