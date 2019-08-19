/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.geppetto.model.values.SkeletonTransformation;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skeleton Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.SkeletonTransformationImpl#getSkeletonTransformation <em>Skeleton Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkeletonTransformationImpl extends MinimalEObjectImpl.Container implements SkeletonTransformation
{
	/**
	 * The cached value of the '{@link #getSkeletonTransformation() <em>Skeleton Transformation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeletonTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> skeletonTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkeletonTransformationImpl()
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
		return ValuesPackage.Literals.SKELETON_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSkeletonTransformation()
	{
		if (skeletonTransformation == null)
		{
			skeletonTransformation = new EDataTypeUniqueEList<Double>(Double.class, this, ValuesPackage.SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION);
		}
		return skeletonTransformation;
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
			case ValuesPackage.SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION:
				return getSkeletonTransformation();
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
			case ValuesPackage.SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION:
				getSkeletonTransformation().clear();
				getSkeletonTransformation().addAll((Collection<? extends Double>)newValue);
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
			case ValuesPackage.SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION:
				getSkeletonTransformation().clear();
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
			case ValuesPackage.SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION:
				return skeletonTransformation != null && !skeletonTransformation.isEmpty();
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
		result.append(" (skeletonTransformation: ");
		result.append(skeletonTransformation);
		result.append(')');
		return result.toString();
	}

} //SkeletonTransformationImpl
