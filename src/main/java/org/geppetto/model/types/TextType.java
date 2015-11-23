/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.Text;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.TextType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getTextType()
 * @model
 * @generated
 */
public interface TextType extends Type
{
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(Text)
	 * @see org.geppetto.model.types.TypesPackage#getTextType_DefaultValue()
	 * @model
	 * @generated
	 */
	Text getDefaultValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.TextType#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Text value);

} // TextType
