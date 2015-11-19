/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.DoubleValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.DoubleType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getDoubleType()
 * @model
 * @generated
 */
public interface DoubleType extends PrimitiveType
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
	 * @see org.geppetto.model.types.TypesPackage#getDoubleType_DefaultValue()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	DoubleValue getDefaultValue();

} // DoubleType
