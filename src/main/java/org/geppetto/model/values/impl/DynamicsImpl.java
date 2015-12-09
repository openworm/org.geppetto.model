/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.values.Dynamics;
import org.geppetto.model.values.Function;
import org.geppetto.model.values.PhysicalQuantity;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.DynamicsImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.DynamicsImpl#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicsImpl extends ValueImpl implements Dynamics
{
	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected PhysicalQuantity initialCondition;

	/**
	 * The cached value of the '{@link #getDynamics() <em>Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected Function dynamics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsImpl()
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
		return ValuesPackage.Literals.DYNAMICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalQuantity getInitialCondition()
	{
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialCondition(PhysicalQuantity newInitialCondition, NotificationChain msgs)
	{
		PhysicalQuantity oldInitialCondition = initialCondition;
		initialCondition = newInitialCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.DYNAMICS__INITIAL_CONDITION, oldInitialCondition, newInitialCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCondition(PhysicalQuantity newInitialCondition)
	{
		if (newInitialCondition != initialCondition)
		{
			NotificationChain msgs = null;
			if (initialCondition != null)
				msgs = ((InternalEObject)initialCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYNAMICS__INITIAL_CONDITION, null, msgs);
			if (newInitialCondition != null)
				msgs = ((InternalEObject)newInitialCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYNAMICS__INITIAL_CONDITION, null, msgs);
			msgs = basicSetInitialCondition(newInitialCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.DYNAMICS__INITIAL_CONDITION, newInitialCondition, newInitialCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getDynamics()
	{
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamics(Function newDynamics, NotificationChain msgs)
	{
		Function oldDynamics = dynamics;
		dynamics = newDynamics;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.DYNAMICS__DYNAMICS, oldDynamics, newDynamics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamics(Function newDynamics)
	{
		if (newDynamics != dynamics)
		{
			NotificationChain msgs = null;
			if (dynamics != null)
				msgs = ((InternalEObject)dynamics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYNAMICS__DYNAMICS, null, msgs);
			if (newDynamics != null)
				msgs = ((InternalEObject)newDynamics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.DYNAMICS__DYNAMICS, null, msgs);
			msgs = basicSetDynamics(newDynamics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.DYNAMICS__DYNAMICS, newDynamics, newDynamics));
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
			case ValuesPackage.DYNAMICS__INITIAL_CONDITION:
				return basicSetInitialCondition(null, msgs);
			case ValuesPackage.DYNAMICS__DYNAMICS:
				return basicSetDynamics(null, msgs);
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
			case ValuesPackage.DYNAMICS__INITIAL_CONDITION:
				return getInitialCondition();
			case ValuesPackage.DYNAMICS__DYNAMICS:
				return getDynamics();
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
			case ValuesPackage.DYNAMICS__INITIAL_CONDITION:
				setInitialCondition((PhysicalQuantity)newValue);
				return;
			case ValuesPackage.DYNAMICS__DYNAMICS:
				setDynamics((Function)newValue);
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
			case ValuesPackage.DYNAMICS__INITIAL_CONDITION:
				setInitialCondition((PhysicalQuantity)null);
				return;
			case ValuesPackage.DYNAMICS__DYNAMICS:
				setDynamics((Function)null);
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
			case ValuesPackage.DYNAMICS__INITIAL_CONDITION:
				return initialCondition != null;
			case ValuesPackage.DYNAMICS__DYNAMICS:
				return dynamics != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicsImpl
