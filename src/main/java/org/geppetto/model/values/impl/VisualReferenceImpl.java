/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualReference;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.VisualReferenceImpl#getVisualVariable <em>Visual Variable</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualReferenceImpl#getFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualReferenceImpl extends ValueImpl implements VisualReference
{
	/**
	 * The cached value of the '{@link #getVisualVariable() <em>Visual Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable visualVariable;

	/**
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final float FRACTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected float fraction = FRACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualReferenceImpl()
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
		return ValuesPackage.Literals.VISUAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVisualVariable()
	{
		if (visualVariable != null && visualVariable.eIsProxy())
		{
			InternalEObject oldVisualVariable = (InternalEObject)visualVariable;
			visualVariable = (Variable)eResolveProxy(oldVisualVariable);
			if (visualVariable != oldVisualVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE, oldVisualVariable, visualVariable));
			}
		}
		return visualVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVisualVariable()
	{
		return visualVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualVariable(Variable newVisualVariable)
	{
		Variable oldVisualVariable = visualVariable;
		visualVariable = newVisualVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE, oldVisualVariable, visualVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFraction()
	{
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(float newFraction)
	{
		float oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_REFERENCE__FRACTION, oldFraction, fraction));
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
			case ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE:
				if (resolve) return getVisualVariable();
				return basicGetVisualVariable();
			case ValuesPackage.VISUAL_REFERENCE__FRACTION:
				return getFraction();
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
			case ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE:
				setVisualVariable((Variable)newValue);
				return;
			case ValuesPackage.VISUAL_REFERENCE__FRACTION:
				setFraction((Float)newValue);
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
			case ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE:
				setVisualVariable((Variable)null);
				return;
			case ValuesPackage.VISUAL_REFERENCE__FRACTION:
				setFraction(FRACTION_EDEFAULT);
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
			case ValuesPackage.VISUAL_REFERENCE__VISUAL_VARIABLE:
				return visualVariable != null;
			case ValuesPackage.VISUAL_REFERENCE__FRACTION:
				return fraction != FRACTION_EDEFAULT;
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
		result.append(" (fraction: ");
		result.append(fraction);
		result.append(')');
		return result.toString();
	}

} //VisualReferenceImpl
