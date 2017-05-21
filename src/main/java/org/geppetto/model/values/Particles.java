/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Particles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.Particles#getParticles <em>Particles</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getParticles()
 * @model
 * @generated
 */
public interface Particles extends Value
{
	/**
	 * Returns the value of the '<em><b>Particles</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Particles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particles</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getParticles_Particles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getParticles();

} // Particles
