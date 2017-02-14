/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.PhysicalQuantity#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getPhysicalQuantity()
 * @model
 * @generated
 */
public interface PhysicalQuantity extends Quantity
{
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit)
	 * @see org.geppetto.model.values.ValuesPackage#getPhysicalQuantity_Unit()
	 * @model containment="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.PhysicalQuantity#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // PhysicalQuantity
