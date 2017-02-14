/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.geppetto.model.values.SkeletonAnimation;
import org.geppetto.model.values.SkeletonTransformation;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skeleton Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.SkeletonAnimationImpl#getSkeletonTransformationSeries <em>Skeleton Transformation Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkeletonAnimationImpl extends VisualValueImpl implements SkeletonAnimation
{
	/**
	 * The cached value of the '{@link #getSkeletonTransformationSeries() <em>Skeleton Transformation Series</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeletonTransformationSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<SkeletonTransformation> skeletonTransformationSeries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkeletonAnimationImpl()
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
		return ValuesPackage.Literals.SKELETON_ANIMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SkeletonTransformation> getSkeletonTransformationSeries()
	{
		if (skeletonTransformationSeries == null)
		{
			skeletonTransformationSeries = new EObjectResolvingEList<SkeletonTransformation>(SkeletonTransformation.class, this, ValuesPackage.SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES);
		}
		return skeletonTransformationSeries;
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
			case ValuesPackage.SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES:
				return getSkeletonTransformationSeries();
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
			case ValuesPackage.SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES:
				getSkeletonTransformationSeries().clear();
				getSkeletonTransformationSeries().addAll((Collection<? extends SkeletonTransformation>)newValue);
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
			case ValuesPackage.SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES:
				getSkeletonTransformationSeries().clear();
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
			case ValuesPackage.SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES:
				return skeletonTransformationSeries != null && !skeletonTransformationSeries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkeletonAnimationImpl
