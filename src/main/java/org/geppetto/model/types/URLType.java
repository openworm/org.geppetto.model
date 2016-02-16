/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.URL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.URLType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getURLType()
 * @model
 * @generated
 */
public interface URLType extends Type
{
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(URL)
	 * @see org.geppetto.model.types.TypesPackage#getURLType_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	URL getDefaultValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.URLType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(URL value);

} // URLType
