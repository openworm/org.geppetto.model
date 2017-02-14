/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.values.Argument;
import org.geppetto.model.values.Expression;
import org.geppetto.model.values.Function;
import org.geppetto.model.values.FunctionPlot;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.FunctionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.FunctionImpl#getFunctionPlot <em>Function Plot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ValueImpl implements Function
{
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getFunctionPlot() <em>Function Plot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPlot()
	 * @generated
	 * @ordered
	 */
	protected FunctionPlot functionPlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl()
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
		return ValuesPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments()
	{
		if (arguments == null)
		{
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, ValuesPackage.FUNCTION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
	{
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.FUNCTION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.FUNCTION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPlot getFunctionPlot()
	{
		return functionPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionPlot(FunctionPlot newFunctionPlot, NotificationChain msgs)
	{
		FunctionPlot oldFunctionPlot = functionPlot;
		functionPlot = newFunctionPlot;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION__FUNCTION_PLOT, oldFunctionPlot, newFunctionPlot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPlot(FunctionPlot newFunctionPlot)
	{
		if (newFunctionPlot != functionPlot)
		{
			NotificationChain msgs = null;
			if (functionPlot != null)
				msgs = ((InternalEObject)functionPlot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.FUNCTION__FUNCTION_PLOT, null, msgs);
			if (newFunctionPlot != null)
				msgs = ((InternalEObject)newFunctionPlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.FUNCTION__FUNCTION_PLOT, null, msgs);
			msgs = basicSetFunctionPlot(newFunctionPlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.FUNCTION__FUNCTION_PLOT, newFunctionPlot, newFunctionPlot));
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
			case ValuesPackage.FUNCTION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case ValuesPackage.FUNCTION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ValuesPackage.FUNCTION__FUNCTION_PLOT:
				return basicSetFunctionPlot(null, msgs);
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
			case ValuesPackage.FUNCTION__ARGUMENTS:
				return getArguments();
			case ValuesPackage.FUNCTION__EXPRESSION:
				return getExpression();
			case ValuesPackage.FUNCTION__FUNCTION_PLOT:
				return getFunctionPlot();
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
			case ValuesPackage.FUNCTION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case ValuesPackage.FUNCTION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ValuesPackage.FUNCTION__FUNCTION_PLOT:
				setFunctionPlot((FunctionPlot)newValue);
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
			case ValuesPackage.FUNCTION__ARGUMENTS:
				getArguments().clear();
				return;
			case ValuesPackage.FUNCTION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ValuesPackage.FUNCTION__FUNCTION_PLOT:
				setFunctionPlot((FunctionPlot)null);
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
			case ValuesPackage.FUNCTION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case ValuesPackage.FUNCTION__EXPRESSION:
				return expression != null;
			case ValuesPackage.FUNCTION__FUNCTION_PLOT:
				return functionPlot != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
