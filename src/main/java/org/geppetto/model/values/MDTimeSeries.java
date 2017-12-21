/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.MDTimeSeries#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getMDTimeSeries()
 * @model
 * @generated
 */
public interface MDTimeSeries extends Value
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getMDTimeSeries_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // MDTimeSeries
