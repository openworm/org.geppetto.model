/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Quantity#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.geppetto.model.values.Quantity#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends Value
{
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
	 * @see org.geppetto.model.values.ValuesPackage#getQuantity_ScalingFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getScalingFactor();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Quantity#getScalingFactor <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Factor</em>' attribute.
	 * @see #getScalingFactor()
	 * @generated
	 */
	void setScalingFactor(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.geppetto.model.values.ValuesPackage#getQuantity_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Quantity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Quantity
