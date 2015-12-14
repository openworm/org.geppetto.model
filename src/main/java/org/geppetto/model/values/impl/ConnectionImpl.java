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
import org.geppetto.model.values.Connection;
import org.geppetto.model.values.Connectivity;
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
 *   <li>{@link org.geppetto.model.values.impl.ConnectionImpl#getConnectivity <em>Connectivity</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CONNECTION__CONNECTIVITY, oldConnectivity, connectivity));
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
			case ValuesPackage.CONNECTION__CONNECTIVITY:
				return getConnectivity();
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
			case ValuesPackage.CONNECTION__CONNECTIVITY:
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
			case ValuesPackage.CONNECTION__A:
				getA().clear();
				return;
			case ValuesPackage.CONNECTION__B:
				getB().clear();
				return;
			case ValuesPackage.CONNECTION__CONNECTIVITY:
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
			case ValuesPackage.CONNECTION__A:
				return a != null && !a.isEmpty();
			case ValuesPackage.CONNECTION__B:
				return b != null && !b.isEmpty();
			case ValuesPackage.CONNECTION__CONNECTIVITY:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connectivity: ");
		result.append(connectivity);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
