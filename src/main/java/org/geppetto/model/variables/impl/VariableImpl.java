/**
 */
package org.geppetto.model.variables.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.impl.NodeImpl;
import org.geppetto.model.types.Type;
import org.geppetto.model.types.TypesPackage;
import org.geppetto.model.values.Point;
import org.geppetto.model.values.Value;
import org.geppetto.model.variables.Variable;
import org.geppetto.model.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.variables.impl.VariableImpl#getAnonymousTypes <em>Anonymous Types</em>}</li>
 *   <li>{@link org.geppetto.model.variables.impl.VariableImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.geppetto.model.variables.impl.VariableImpl#getInitialValues <em>Initial Values</em>}</li>
 *   <li>{@link org.geppetto.model.variables.impl.VariableImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.geppetto.model.variables.impl.VariableImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NodeImpl implements Variable
{
	/**
	 * The cached value of the '{@link #getAnonymousTypes() <em>Anonymous Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> anonymousTypes;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getInitialValues() <em>Initial Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<Type, Value> initialValues;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

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
	protected VariableImpl()
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
		return VariablesPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAnonymousTypes()
	{
		if (anonymousTypes == null)
		{
			anonymousTypes = new EObjectContainmentEList<Type>(Type.class, this, VariablesPackage.VARIABLE__ANONYMOUS_TYPES);
		}
		return anonymousTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes()
	{
		if (types == null)
		{
			types = new EObjectWithInverseEList.ManyInverse<Type>(Type.class, this, VariablesPackage.VARIABLE__TYPES, TypesPackage.TYPE__REFERENCED_VARIABLES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Type, Value> getInitialValues()
	{
		if (initialValues == null)
		{
			initialValues = new EcoreEMap<Type,Value>(VariablesPackage.Literals.TYPE_TO_VALUE_MAP, TypeToValueMapImpl.class, this, VariablesPackage.VARIABLE__INITIAL_VALUES);
		}
		return initialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic()
	{
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic)
	{
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__STATIC, oldStatic, static_));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__POSITION, oldPosition, newPosition);
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
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case VariablesPackage.VARIABLE__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case VariablesPackage.VARIABLE__ANONYMOUS_TYPES:
				return ((InternalEList<?>)getAnonymousTypes()).basicRemove(otherEnd, msgs);
			case VariablesPackage.VARIABLE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case VariablesPackage.VARIABLE__INITIAL_VALUES:
				return ((InternalEList<?>)getInitialValues()).basicRemove(otherEnd, msgs);
			case VariablesPackage.VARIABLE__POSITION:
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
			case VariablesPackage.VARIABLE__ANONYMOUS_TYPES:
				return getAnonymousTypes();
			case VariablesPackage.VARIABLE__TYPES:
				return getTypes();
			case VariablesPackage.VARIABLE__INITIAL_VALUES:
				if (coreType) return getInitialValues();
				else return getInitialValues().map();
			case VariablesPackage.VARIABLE__STATIC:
				return isStatic();
			case VariablesPackage.VARIABLE__POSITION:
				return getPosition();
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
			case VariablesPackage.VARIABLE__ANONYMOUS_TYPES:
				getAnonymousTypes().clear();
				getAnonymousTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case VariablesPackage.VARIABLE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case VariablesPackage.VARIABLE__INITIAL_VALUES:
				((EStructuralFeature.Setting)getInitialValues()).set(newValue);
				return;
			case VariablesPackage.VARIABLE__STATIC:
				setStatic((Boolean)newValue);
				return;
			case VariablesPackage.VARIABLE__POSITION:
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
			case VariablesPackage.VARIABLE__ANONYMOUS_TYPES:
				getAnonymousTypes().clear();
				return;
			case VariablesPackage.VARIABLE__TYPES:
				getTypes().clear();
				return;
			case VariablesPackage.VARIABLE__INITIAL_VALUES:
				getInitialValues().clear();
				return;
			case VariablesPackage.VARIABLE__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case VariablesPackage.VARIABLE__POSITION:
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
			case VariablesPackage.VARIABLE__ANONYMOUS_TYPES:
				return anonymousTypes != null && !anonymousTypes.isEmpty();
			case VariablesPackage.VARIABLE__TYPES:
				return types != null && !types.isEmpty();
			case VariablesPackage.VARIABLE__INITIAL_VALUES:
				return initialValues != null && !initialValues.isEmpty();
			case VariablesPackage.VARIABLE__STATIC:
				return static_ != STATIC_EDEFAULT;
			case VariablesPackage.VARIABLE__POSITION:
				return position != null;
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
		result.append(" (static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
