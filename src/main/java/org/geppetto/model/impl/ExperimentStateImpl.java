/**
 */
package org.geppetto.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.ExperimentState;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.impl.ExperimentStateImpl#getRecordedVariables <em>Recorded Variables</em>}</li>
 *   <li>{@link org.geppetto.model.impl.ExperimentStateImpl#getSetParameters <em>Set Parameters</em>}</li>
 *   <li>{@link org.geppetto.model.impl.ExperimentStateImpl#getExperimentId <em>Experiment Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentStateImpl extends MinimalEObjectImpl.Container implements ExperimentState
{
	/**
	 * The cached value of the '{@link #getRecordedVariables() <em>Recorded Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableValue> recordedVariables;

	/**
	 * The cached value of the '{@link #getSetParameters() <em>Set Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableValue> setParameters;

	/**
	 * The default value of the '{@link #getExperimentId() <em>Experiment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentId()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPERIMENT_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExperimentId() <em>Experiment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentId()
	 * @generated
	 * @ordered
	 */
	protected long experimentId = EXPERIMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentStateImpl()
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
		return GeppettoPackage.Literals.EXPERIMENT_STATE;
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
			recordedVariables = new EObjectContainmentEList<VariableValue>(VariableValue.class, this, GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES);
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
			setParameters = new EObjectContainmentEList<VariableValue>(VariableValue.class, this, GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS);
		}
		return setParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExperimentId()
	{
		return experimentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimentId(long newExperimentId)
	{
		long oldExperimentId = experimentId;
		experimentId = newExperimentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.EXPERIMENT_STATE__EXPERIMENT_ID, oldExperimentId, experimentId));
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
			case GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES:
				return ((InternalEList<?>)getRecordedVariables()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS:
				return ((InternalEList<?>)getSetParameters()).basicRemove(otherEnd, msgs);
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
			case GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES:
				return getRecordedVariables();
			case GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS:
				return getSetParameters();
			case GeppettoPackage.EXPERIMENT_STATE__EXPERIMENT_ID:
				return getExperimentId();
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
			case GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES:
				getRecordedVariables().clear();
				getRecordedVariables().addAll((Collection<? extends VariableValue>)newValue);
				return;
			case GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS:
				getSetParameters().clear();
				getSetParameters().addAll((Collection<? extends VariableValue>)newValue);
				return;
			case GeppettoPackage.EXPERIMENT_STATE__EXPERIMENT_ID:
				setExperimentId((Long)newValue);
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
			case GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES:
				getRecordedVariables().clear();
				return;
			case GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS:
				getSetParameters().clear();
				return;
			case GeppettoPackage.EXPERIMENT_STATE__EXPERIMENT_ID:
				setExperimentId(EXPERIMENT_ID_EDEFAULT);
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
			case GeppettoPackage.EXPERIMENT_STATE__RECORDED_VARIABLES:
				return recordedVariables != null && !recordedVariables.isEmpty();
			case GeppettoPackage.EXPERIMENT_STATE__SET_PARAMETERS:
				return setParameters != null && !setParameters.isEmpty();
			case GeppettoPackage.EXPERIMENT_STATE__EXPERIMENT_ID:
				return experimentId != EXPERIMENT_ID_EDEFAULT;
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
		result.append(" (experimentId: ");
		result.append(experimentId);
		result.append(')');
		return result.toString();
	}

} //ExperimentStateImpl
