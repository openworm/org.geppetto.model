/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.TimeSeries#getQuantities <em>Quantities</em>}</li>
 *   <li>{@link org.geppetto.model.values.TimeSeries#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getTimeSeries()
 * @model
 * @generated
 */
public interface TimeSeries extends Value
{
	/**
	 * Returns the value of the '<em><b>Quantities</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantities</em>' reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getTimeSeries_Quantities()
	 * @model
	 * @generated
	 */
	EList<Quantity> getQuantities();

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
	 * @see org.geppetto.model.values.ValuesPackage#getTimeSeries_Unit()
	 * @model containment="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.TimeSeries#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // TimeSeries
