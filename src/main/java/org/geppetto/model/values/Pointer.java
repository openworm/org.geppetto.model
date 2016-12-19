/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Pointer#getElements <em>Elements</em>}</li>
 *   <li>{@link org.geppetto.model.values.Pointer#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getPointer()
 * @model
 * @generated
 */
public interface Pointer extends Value
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.PointerElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getPointer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointerElement> getElements();

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see org.geppetto.model.values.ValuesPackage#getPointer_Point()
	 * @model containment="true"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Pointer#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getInstancePath();

} // Pointer
