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
 *   <li>{@link org.geppetto.model.values.TimeSeries#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.geppetto.model.values.TimeSeries#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.geppetto.model.values.TimeSeries#getValue <em>Value</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Scaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Factor</em>' attribute.
	 * @see #setScalingFactor(int)
	 * @see org.geppetto.model.values.ValuesPackage#getTimeSeries_ScalingFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getScalingFactor();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.TimeSeries#getScalingFactor <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Factor</em>' attribute.
	 * @see #getScalingFactor()
	 * @generated
	 */
	void setScalingFactor(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.geppetto.model.values.ValuesPackage#getTimeSeries_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	EList<Double> getValue();

} // TimeSeries
