/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skeleton Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.SkeletonTransformation#getSkeletonTransformation <em>Skeleton Transformation</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getSkeletonTransformation()
 * @model
 * @generated
 */
public interface SkeletonTransformation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Skeleton Transformation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeleton Transformation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeleton Transformation</em>' attribute list.
	 * @see org.geppetto.model.values.ValuesPackage#getSkeletonTransformation_SkeletonTransformation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	EList<Double> getSkeletonTransformation();

} // SkeletonTransformation
