/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.values.Quantity;
import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualGroupElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Group Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupElementImpl#getDefaultColor <em>Default Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupElementImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualGroupElementImpl extends MinimalEObjectImpl.Container implements VisualGroupElement
{
	/**
	 * The default value of the '{@link #getDefaultColor() <em>Default Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultColor() <em>Default Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultColor()
	 * @generated
	 * @ordered
	 */
	protected String defaultColor = DEFAULT_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Quantity parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualGroupElementImpl()
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
		return ValuesPackage.Literals.VISUAL_GROUP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultColor()
	{
		return defaultColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultColor(String newDefaultColor)
	{
		String oldDefaultColor = defaultColor;
		defaultColor = newDefaultColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP_ELEMENT__DEFAULT_COLOR, oldDefaultColor, defaultColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getParameter()
	{
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Quantity newParameter, NotificationChain msgs)
	{
		Quantity oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Quantity newParameter)
	{
		if (newParameter != parameter)
		{
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER, newParameter, newParameter));
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
			case ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case ValuesPackage.VISUAL_GROUP_ELEMENT__DEFAULT_COLOR:
				return getDefaultColor();
			case ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER:
				return getParameter();
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
			case ValuesPackage.VISUAL_GROUP_ELEMENT__DEFAULT_COLOR:
				setDefaultColor((String)newValue);
				return;
			case ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER:
				setParameter((Quantity)newValue);
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
			case ValuesPackage.VISUAL_GROUP_ELEMENT__DEFAULT_COLOR:
				setDefaultColor(DEFAULT_COLOR_EDEFAULT);
				return;
			case ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER:
				setParameter((Quantity)null);
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
			case ValuesPackage.VISUAL_GROUP_ELEMENT__DEFAULT_COLOR:
				return DEFAULT_COLOR_EDEFAULT == null ? defaultColor != null : !DEFAULT_COLOR_EDEFAULT.equals(defaultColor);
			case ValuesPackage.VISUAL_GROUP_ELEMENT__PARAMETER:
				return parameter != null;
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
		result.append(" (defaultColor: ");
		result.append(defaultColor);
		result.append(')');
		return result.toString();
	}

} //VisualGroupElementImpl
