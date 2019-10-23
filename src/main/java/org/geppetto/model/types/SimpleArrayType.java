/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.AArrayValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.types.SimpleArrayType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.types.TypesPackage#getSimpleArrayType()
 * @model
 * @generated
 */
public interface SimpleArrayType extends Type {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AArrayValue)
	 * @see org.geppetto.model.types.TypesPackage#getSimpleArrayType_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	AArrayValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.SimpleArrayType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AArrayValue value);

} // SimpleArrayType
