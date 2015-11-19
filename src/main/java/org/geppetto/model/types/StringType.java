/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.StringValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.StringType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends PrimitiveType
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
	 * @see org.geppetto.model.types.TypesPackage#getStringType_DefaultValue()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	StringValue getDefaultValue();

} // StringType
