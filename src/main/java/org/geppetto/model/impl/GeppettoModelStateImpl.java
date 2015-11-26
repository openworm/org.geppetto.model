/**
 */
package org.geppetto.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.geppetto.model.GeppettoModelState;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelStateImpl#getRecordedVariables <em>Recorded Variables</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelStateImpl#getSetParameters <em>Set Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeppettoModelStateImpl extends MinimalEObjectImpl.Container implements GeppettoModelState
{
	/**
	 * The cached value of the '{@link #getRecordedVariables() <em>Recorded Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableValue> recordedVariables;

	/**
	 * The cached value of the '{@link #getSetParameters() <em>Set Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableValue> setParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeppettoModelStateImpl()
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
		return GeppettoPackage.Literals.GEPPETTO_MODEL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableValue> getRecordedVariables()
	{
		if (recordedVariables == null)
		{
			recordedVariables = new EObjectResolvingEList<VariableValue>(VariableValue.class, this, GeppettoPackage.GEPPETTO_MODEL_STATE__RECORDED_VARIABLES);
		}
		return recordedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableValue> getSetParameters()
	{
		if (setParameters == null)
		{
			setParameters = new EObjectResolvingEList<VariableValue>(VariableValue.class, this, GeppettoPackage.GEPPETTO_MODEL_STATE__SET_PARAMETERS);
		}
		return setParameters;
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
			case GeppettoPackage.GEPPETTO_MODEL_STATE__RECORDED_VARIABLES:
				return getRecordedVariables();
			case GeppettoPackage.GEPPETTO_MODEL_STATE__SET_PARAMETERS:
				return getSetParameters();
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
			case GeppettoPackage.GEPPETTO_MODEL_STATE__RECORDED_VARIABLES:
				getRecordedVariables().clear();
				getRecordedVariables().addAll((Collection<? extends VariableValue>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL_STATE__SET_PARAMETERS:
				getSetParameters().clear();
				getSetParameters().addAll((Collection<? extends VariableValue>)newValue);
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
			case GeppettoPackage.GEPPETTO_MODEL_STATE__RECORDED_VARIABLES:
				getRecordedVariables().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL_STATE__SET_PARAMETERS:
				getSetParameters().clear();
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
			case GeppettoPackage.GEPPETTO_MODEL_STATE__RECORDED_VARIABLES:
				return recordedVariables != null && !recordedVariables.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL_STATE__SET_PARAMETERS:
				return setParameters != null && !setParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeppettoModelStateImpl
