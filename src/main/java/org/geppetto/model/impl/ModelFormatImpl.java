/**
 */
package org.geppetto.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.ModelFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.impl.ModelFormatImpl#getModelFormat <em>Model Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFormatImpl extends MinimalEObjectImpl.Container implements ModelFormat
{
	/**
	 * The default value of the '{@link #getModelFormat() <em>Model Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFormat() <em>Model Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFormat()
	 * @generated
	 * @ordered
	 */
	protected String modelFormat = MODEL_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFormatImpl()
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
		return GeppettoPackage.Literals.MODEL_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelFormat()
	{
		return modelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFormat(String newModelFormat)
	{
		String oldModelFormat = modelFormat;
		modelFormat = newModelFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.MODEL_FORMAT__MODEL_FORMAT, oldModelFormat, modelFormat));
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
			case GeppettoPackage.MODEL_FORMAT__MODEL_FORMAT:
				return getModelFormat();
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
			case GeppettoPackage.MODEL_FORMAT__MODEL_FORMAT:
				setModelFormat((String)newValue);
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
			case GeppettoPackage.MODEL_FORMAT__MODEL_FORMAT:
				setModelFormat(MODEL_FORMAT_EDEFAULT);
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
			case GeppettoPackage.MODEL_FORMAT__MODEL_FORMAT:
				return MODEL_FORMAT_EDEFAULT == null ? modelFormat != null : !MODEL_FORMAT_EDEFAULT.equals(modelFormat);
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
		result.append(" (modelFormat: ");
		result.append(modelFormat);
		result.append(')');
		return result.toString();
	}


	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelFormat == null) ? 0 : modelFormat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		ModelFormat other = (ModelFormat) obj;
		if(modelFormat == null)
		{
			if(other.getModelFormat() != null) return false;
		}
		else if(!modelFormat.equals(other.getModelFormat())) return false;
		return true;
	}
	
} //ModelFormatImpl
