/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualGroupElement;
import org.geppetto.model.values.VisualValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.VisualValueImpl#getGroupElements <em>Group Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VisualValueImpl extends ValueImpl implements VisualValue
{
	/**
	 * The cached value of the '{@link #getGroupElements() <em>Group Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupElements()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualGroupElement> groupElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualValueImpl()
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
		return ValuesPackage.Literals.VISUAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualGroupElement> getGroupElements()
	{
		if (groupElements == null)
		{
			groupElements = new EObjectResolvingEList<VisualGroupElement>(VisualGroupElement.class, this, ValuesPackage.VISUAL_VALUE__GROUP_ELEMENTS);
		}
		return groupElements;
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
			case ValuesPackage.VISUAL_VALUE__GROUP_ELEMENTS:
				return getGroupElements();
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
			case ValuesPackage.VISUAL_VALUE__GROUP_ELEMENTS:
				getGroupElements().clear();
				getGroupElements().addAll((Collection<? extends VisualGroupElement>)newValue);
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
			case ValuesPackage.VISUAL_VALUE__GROUP_ELEMENTS:
				getGroupElements().clear();
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
			case ValuesPackage.VISUAL_VALUE__GROUP_ELEMENTS:
				return groupElements != null && !groupElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisualValueImpl
