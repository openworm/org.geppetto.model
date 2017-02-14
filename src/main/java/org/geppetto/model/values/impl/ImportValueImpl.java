/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.geppetto.model.values.ImportValue;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.ImportValueImpl#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportValueImpl extends ValueImpl implements ImportValue
{
	/**
	 * The default value of the '{@link #getModelInterpreterId() <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInterpreterId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_INTERPRETER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelInterpreterId() <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInterpreterId()
	 * @generated
	 * @ordered
	 */
	protected String modelInterpreterId = MODEL_INTERPRETER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportValueImpl()
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
		return ValuesPackage.Literals.IMPORT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelInterpreterId()
	{
		return modelInterpreterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelInterpreterId(String newModelInterpreterId)
	{
		String oldModelInterpreterId = modelInterpreterId;
		modelInterpreterId = newModelInterpreterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.IMPORT_VALUE__MODEL_INTERPRETER_ID, oldModelInterpreterId, modelInterpreterId));
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
			case ValuesPackage.IMPORT_VALUE__MODEL_INTERPRETER_ID:
				return getModelInterpreterId();
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
			case ValuesPackage.IMPORT_VALUE__MODEL_INTERPRETER_ID:
				setModelInterpreterId((String)newValue);
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
			case ValuesPackage.IMPORT_VALUE__MODEL_INTERPRETER_ID:
				setModelInterpreterId(MODEL_INTERPRETER_ID_EDEFAULT);
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
			case ValuesPackage.IMPORT_VALUE__MODEL_INTERPRETER_ID:
				return MODEL_INTERPRETER_ID_EDEFAULT == null ? modelInterpreterId != null : !MODEL_INTERPRETER_ID_EDEFAULT.equals(modelInterpreterId);
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
		result.append(" (modelInterpreterId: ");
		result.append(modelInterpreterId);
		result.append(')');
		return result.toString();
	}

} //developmentImpl
