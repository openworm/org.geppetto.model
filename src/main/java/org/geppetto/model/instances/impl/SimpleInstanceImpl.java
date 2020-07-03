/**
 */
package org.geppetto.model.instances.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.instances.InstancesPackage;
import org.geppetto.model.instances.SimpleInstance;

import org.geppetto.model.values.Point;
import org.geppetto.model.values.VisualValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.instances.impl.SimpleInstanceImpl#getVisualValue <em>Visual Value</em>}</li>
 *   <li>{@link org.geppetto.model.instances.impl.SimpleInstanceImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleInstanceImpl extends InstanceImpl implements SimpleInstance
{
	/**
	 * The cached value of the '{@link #getVisualValue() <em>Visual Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualValue()
	 * @generated
	 * @ordered
	 */
	protected VisualValue visualValue;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleInstanceImpl()
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
		return InstancesPackage.Literals.SIMPLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualValue getVisualValue()
	{
		return visualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualValue(VisualValue newVisualValue, NotificationChain msgs)
	{
		VisualValue oldVisualValue = visualValue;
		visualValue = newVisualValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE, oldVisualValue, newVisualValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualValue(VisualValue newVisualValue)
	{
		if (newVisualValue != visualValue)
		{
			NotificationChain msgs = null;
			if (visualValue != null)
				msgs = ((InternalEObject)visualValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE, null, msgs);
			if (newVisualValue != null)
				msgs = ((InternalEObject)newVisualValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE, null, msgs);
			msgs = basicSetVisualValue(newVisualValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE, newVisualValue, newVisualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition()
	{
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Point newPosition, NotificationChain msgs)
	{
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_INSTANCE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition)
	{
		if (newPosition != position)
		{
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancesPackage.SIMPLE_INSTANCE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancesPackage.SIMPLE_INSTANCE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.SIMPLE_INSTANCE__POSITION, newPosition, newPosition));
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
			case InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE:
				return basicSetVisualValue(null, msgs);
			case InstancesPackage.SIMPLE_INSTANCE__POSITION:
				return basicSetPosition(null, msgs);
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
			case InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE:
				return getVisualValue();
			case InstancesPackage.SIMPLE_INSTANCE__POSITION:
				return getPosition();
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
			case InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE:
				setVisualValue((VisualValue)newValue);
				return;
			case InstancesPackage.SIMPLE_INSTANCE__POSITION:
				setPosition((Point)newValue);
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
			case InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE:
				setVisualValue((VisualValue)null);
				return;
			case InstancesPackage.SIMPLE_INSTANCE__POSITION:
				setPosition((Point)null);
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
			case InstancesPackage.SIMPLE_INSTANCE__VISUAL_VALUE:
				return visualValue != null;
			case InstancesPackage.SIMPLE_INSTANCE__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleInstanceImpl
