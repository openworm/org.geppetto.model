/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISynchable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.ISynchable#isSynched <em>Synched</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.GeppettoPackage#getISynchable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISynchable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synched</em>' attribute.
	 * @see #setSynched(boolean)
	 * @see org.geppetto.model.GeppettoPackage#getISynchable_Synched()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" transient="true"
	 * @generated
	 */
	boolean isSynched();

	/**
	 * Sets the value of the '{@link org.geppetto.model.ISynchable#isSynched <em>Synched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synched</em>' attribute.
	 * @see #isSynched()
	 * @generated
	 */
	void setSynched(boolean value);

} // ISynchable
