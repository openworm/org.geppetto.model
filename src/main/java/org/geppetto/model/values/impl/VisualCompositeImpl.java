/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualComposite;
import org.geppetto.model.values.VisualGroup;
import org.geppetto.model.values.VisualValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.VisualCompositeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualCompositeImpl#getVisualGroups <em>Visual Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualCompositeImpl extends VisualValueImpl implements VisualComposite
{
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualValue> value;

	/**
	 * The cached value of the '{@link #getVisualGroups() <em>Visual Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualGroup> visualGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualCompositeImpl()
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
		return ValuesPackage.Literals.VISUAL_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualValue> getValue()
	{
		if (value == null)
		{
			value = new EObjectContainmentEList<VisualValue>(VisualValue.class, this, ValuesPackage.VISUAL_COMPOSITE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualGroup> getVisualGroups()
	{
		if (visualGroups == null)
		{
			visualGroups = new EObjectResolvingEList<VisualGroup>(VisualGroup.class, this, ValuesPackage.VISUAL_COMPOSITE__VISUAL_GROUPS);
		}
		return visualGroups;
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
			case ValuesPackage.VISUAL_COMPOSITE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case ValuesPackage.VISUAL_COMPOSITE__VALUE:
				return getValue();
			case ValuesPackage.VISUAL_COMPOSITE__VISUAL_GROUPS:
				return getVisualGroups();
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
			case ValuesPackage.VISUAL_COMPOSITE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends VisualValue>)newValue);
				return;
			case ValuesPackage.VISUAL_COMPOSITE__VISUAL_GROUPS:
				getVisualGroups().clear();
				getVisualGroups().addAll((Collection<? extends VisualGroup>)newValue);
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
			case ValuesPackage.VISUAL_COMPOSITE__VALUE:
				getValue().clear();
				return;
			case ValuesPackage.VISUAL_COMPOSITE__VISUAL_GROUPS:
				getVisualGroups().clear();
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
			case ValuesPackage.VISUAL_COMPOSITE__VALUE:
				return value != null && !value.isEmpty();
			case ValuesPackage.VISUAL_COMPOSITE__VISUAL_GROUPS:
				return visualGroups != null && !visualGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisualCompositeImpl
