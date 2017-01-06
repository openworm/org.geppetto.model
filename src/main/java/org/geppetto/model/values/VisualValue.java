/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.VisualValue#getGroupElements <em>Group Elements</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualValue#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getVisualValue()
 * @model abstract="true"
 * @generated
 */
public interface VisualValue extends Value
{

	/**
	 * Returns the value of the '<em><b>Group Elements</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.values.VisualGroupElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Elements</em>' reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getVisualValue_GroupElements()
	 * @model
	 * @generated
	 */
	EList<VisualGroupElement> getGroupElements();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualValue_Position()
	 * @model containment="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualValue#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);
} // VisualValue
