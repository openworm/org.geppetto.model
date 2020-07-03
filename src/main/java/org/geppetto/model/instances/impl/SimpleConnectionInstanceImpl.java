/**
 */
package org.geppetto.model.instances.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.instances.Instance;
import org.geppetto.model.instances.InstancesPackage;
import org.geppetto.model.instances.SimpleConnectionInstance;
import org.geppetto.model.values.Connectivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl#getA <em>A</em>}</li>
 *   <li>{@link org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl#getB <em>B</em>}</li>
 *   <li>{@link org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl#getConnectivity <em>Connectivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleConnectionInstanceImpl extends InstanceImpl implements SimpleConnectionInstance
{
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Instance a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Instance b;

	/**
	 * The default value of the '{@link #getConnectivity() <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected static final Connectivity CONNECTIVITY_EDEFAULT = Connectivity.DIRECTIONAL;

	/**
	 * The cached value of the '{@link #getConnectivity() <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected Connectivity connectivity = CONNECTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConnectionInstanceImpl()
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
		return InstancesPackage.Literals.SIMPLE_CONNECTION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getA()
	{
		if (a != null && a.eIsProxy())
		{
			InternalEObject oldA = (InternalEObject)a;
			a = (Instance)eResolveProxy(oldA);
			if (a != oldA)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetA()
	{
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Instance newA)
	{
		Instance oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getB()
	{
		if (b != null && b.eIsProxy())
		{
			InternalEObject oldB = (InternalEObject)b;
			b = (Instance)eResolveProxy(oldB);
			if (b != oldB)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetB()
	{
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(Instance newB)
	{
		Instance oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectivity getConnectivity()
	{
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivity(Connectivity newConnectivity)
	{
		Connectivity oldConnectivity = connectivity;
		connectivity = newConnectivity == null ? CONNECTIVITY_EDEFAULT : newConnectivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY, oldConnectivity, connectivity));
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
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A:
				if (resolve) return getA();
				return basicGetA();
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B:
				if (resolve) return getB();
				return basicGetB();
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY:
				return getConnectivity();
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
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A:
				setA((Instance)newValue);
				return;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B:
				setB((Instance)newValue);
				return;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY:
				setConnectivity((Connectivity)newValue);
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
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A:
				setA((Instance)null);
				return;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B:
				setB((Instance)null);
				return;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY:
				setConnectivity(CONNECTIVITY_EDEFAULT);
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
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__A:
				return a != null;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__B:
				return b != null;
			case InstancesPackage.SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY:
				return connectivity != CONNECTIVITY_EDEFAULT;
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
		result.append(" (connectivity: ");
		result.append(connectivity);
		result.append(')');
		return result.toString();
	}

} //SimpleConnectionInstanceImpl
