/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.HTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.HTMLType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getHTMLType()
 * @model
 * @generated
 */
public interface HTMLType extends Type
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
	 * @see #setDefaultValue(HTML)
	 * @see org.geppetto.model.types.TypesPackage#getHTMLType_DefaultValue()
	 * @model
	 * @generated
	 */
	HTML getDefaultValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.HTMLType#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(HTML value);

} // HTMLType
