/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.values.FunctionPlot;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getFinalValue <em>Final Value</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionPlotImpl#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionPlotImpl extends MinimalEObjectImpl.Container implements FunctionPlot
{
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String xAxisLabel = XAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String yAxisLabel = YAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected double initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalValue() <em>Final Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FINAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFinalValue() <em>Final Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalValue()
	 * @generated
	 * @ordered
	 */
	protected double finalValue = FINAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected double stepValue = STEP_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPlotImpl()
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
		return ValuesPackage.Literals.FUNCTION_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle)
	{
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxisLabel()
	{
		return xAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisLabel(String newXAxisLabel)
	{
		String oldXAxisLabel = xAxisLabel;
		xAxisLabel = newXAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__XAXIS_LABEL, oldXAxisLabel, xAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxisLabel()
	{
		return yAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxisLabel(String newYAxisLabel)
	{
		String oldYAxisLabel = yAxisLabel;
		yAxisLabel = newYAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__YAXIS_LABEL, oldYAxisLabel, yAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialValue()
	{
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(double newInitialValue)
	{
		double oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFinalValue()
	{
		return finalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalValue(double newFinalValue)
	{
		double oldFinalValue = finalValue;
		finalValue = newFinalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__FINAL_VALUE, oldFinalValue, finalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStepValue()
	{
		return stepValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepValue(double newStepValue)
	{
		double oldStepValue = stepValue;
		stepValue = newStepValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION_PLOT__STEP_VALUE, oldStepValue, stepValue));
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
			case ValuesPackage.FUNCTION_PLOT__TITLE:
				return getTitle();
			case ValuesPackage.FUNCTION_PLOT__XAXIS_LABEL:
				return getXAxisLabel();
			case ValuesPackage.FUNCTION_PLOT__YAXIS_LABEL:
				return getYAxisLabel();
			case ValuesPackage.FUNCTION_PLOT__INITIAL_VALUE:
				return getInitialValue();
			case ValuesPackage.FUNCTION_PLOT__FINAL_VALUE:
				return getFinalValue();
			case ValuesPackage.FUNCTION_PLOT__STEP_VALUE:
				return getStepValue();
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
			case ValuesPackage.FUNCTION_PLOT__TITLE:
				setTitle((String)newValue);
				return;
			case ValuesPackage.FUNCTION_PLOT__XAXIS_LABEL:
				setXAxisLabel((String)newValue);
				return;
			case ValuesPackage.FUNCTION_PLOT__YAXIS_LABEL:
				setYAxisLabel((String)newValue);
				return;
			case ValuesPackage.FUNCTION_PLOT__INITIAL_VALUE:
				setInitialValue((Double)newValue);
				return;
			case ValuesPackage.FUNCTION_PLOT__FINAL_VALUE:
				setFinalValue((Double)newValue);
				return;
			case ValuesPackage.FUNCTION_PLOT__STEP_VALUE:
				setStepValue((Double)newValue);
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
			case ValuesPackage.FUNCTION_PLOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ValuesPackage.FUNCTION_PLOT__XAXIS_LABEL:
				setXAxisLabel(XAXIS_LABEL_EDEFAULT);
				return;
			case ValuesPackage.FUNCTION_PLOT__YAXIS_LABEL:
				setYAxisLabel(YAXIS_LABEL_EDEFAULT);
				return;
			case ValuesPackage.FUNCTION_PLOT__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ValuesPackage.FUNCTION_PLOT__FINAL_VALUE:
				setFinalValue(FINAL_VALUE_EDEFAULT);
				return;
			case ValuesPackage.FUNCTION_PLOT__STEP_VALUE:
				setStepValue(STEP_VALUE_EDEFAULT);
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
			case ValuesPackage.FUNCTION_PLOT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ValuesPackage.FUNCTION_PLOT__XAXIS_LABEL:
				return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
			case ValuesPackage.FUNCTION_PLOT__YAXIS_LABEL:
				return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
			case ValuesPackage.FUNCTION_PLOT__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case ValuesPackage.FUNCTION_PLOT__FINAL_VALUE:
				return finalValue != FINAL_VALUE_EDEFAULT;
			case ValuesPackage.FUNCTION_PLOT__STEP_VALUE:
				return stepValue != STEP_VALUE_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", xAxisLabel: ");
		result.append(xAxisLabel);
		result.append(", yAxisLabel: ");
		result.append(yAxisLabel);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(", finalValue: ");
		result.append(finalValue);
		result.append(", stepValue: ");
		result.append(stepValue);
		result.append(')');
		return result.toString();
	}

} //FunctionPlotImpl
