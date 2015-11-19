/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.FloatValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.FloatType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getFloatType()
 * @model
 * @generated
 */
public interface FloatType extends PrimitiveType
{
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see org.geppetto.model.types.TypesPackage#getFloatType_DefaultValue()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	FloatValue getDefaultValue();

} // FloatType
