/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.types.ConnectionType;

import org.geppetto.model.values.Connection;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.ConnectionImpl#getA <em>A</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.ConnectionImpl#getB <em>B</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.ConnectionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends ValueImpl implements Connection
{
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointer> a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointer> b;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl()
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
		return ValuesPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointer> getA()
	{
		if (a == null)
		{
			a = new EObjectContainmentEList<Pointer>(Pointer.class, this, ValuesPackage.CONNECTION__A);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointer> getB()
	{
		if (b == null)
		{
			b = new EObjectContainmentEList<Pointer>(Pointer.class, this, ValuesPackage.CONNECTION__B);
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ConnectionType newType, NotificationChain msgs)
	{
		ConnectionType oldType = type;
		type = newType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CONNECTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectionType newType)
	{
		if (newType != type)
		{
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CONNECTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CONNECTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CONNECTION__TYPE, newType, newType));
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
			case ValuesPackage.CONNECTION__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case ValuesPackage.CONNECTION__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case ValuesPackage.CONNECTION__TYPE:
				return basicSetType(null, msgs);
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
			case ValuesPackage.CONNECTION__A:
				return getA();
			case ValuesPackage.CONNECTION__B:
				return getB();
			case ValuesPackage.CONNECTION__TYPE:
				return getType();
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
			case ValuesPackage.CONNECTION__A:
				getA().clear();
				getA().addAll((Collection<? extends Pointer>)newValue);
				return;
			case ValuesPackage.CONNECTION__B:
				getB().clear();
				getB().addAll((Collection<? extends Pointer>)newValue);
				return;
			case ValuesPackage.CONNECTION__TYPE:
				setType((ConnectionType)newValue);
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
			case ValuesPackage.CONNECTION__A:
				getA().clear();
				return;
			case ValuesPackage.CONNECTION__B:
				getB().clear();
				return;
			case ValuesPackage.CONNECTION__TYPE:
				setType((ConnectionType)null);
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
			case ValuesPackage.CONNECTION__A:
				return a != null && !a.isEmpty();
			case ValuesPackage.CONNECTION__B:
				return b != null && !b.isEmpty();
			case ValuesPackage.CONNECTION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
