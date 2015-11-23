/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skeleton Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.SkeletonAnimation#getSkeletonTransformationSeries <em>Skeleton Transformation Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getSkeletonAnimation()
 * @model
 * @generated
 */
public interface SkeletonAnimation extends VisualValue
{
	/**
	 * Returns the value of the '<em><b>Skeleton Transformation Series</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.values.SkeletonTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeleton Transformation Series</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeleton Transformation Series</em>' reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getSkeletonAnimation_SkeletonTransformationSeries()
	 * @model
	 * @generated
	 */
	EList<SkeletonTransformation> getSkeletonTransformationSeries();

} // SkeletonAnimation
