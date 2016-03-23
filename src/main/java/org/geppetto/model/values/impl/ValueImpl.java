/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.values.Value;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.ValueImpl#isSynched <em>Synched</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
	/**
	 * The default value of the '{@link #isSynched() <em>Synched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSynched() <em>Synched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynched()
	 * @generated
	 * @ordered
	 */
	protected boolean synched = SYNCHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl()
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
		return ValuesPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynched()
	{
		return synched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynched(boolean newSynched)
	{
		boolean oldSynched = synched;
		synched = newSynched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VALUE__SYNCHED, oldSynched, synched));
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
			case ValuesPackage.VALUE__SYNCHED:
				return isSynched();
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
			case ValuesPackage.VALUE__SYNCHED:
				setSynched((Boolean)newValue);
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
			case ValuesPackage.VALUE__SYNCHED:
				setSynched(SYNCHED_EDEFAULT);
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
			case ValuesPackage.VALUE__SYNCHED:
				return synched != SYNCHED_EDEFAULT;
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
		result.append(" (synched: ");
		result.append(synched);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
