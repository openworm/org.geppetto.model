/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.JSON#getJson <em>Json</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getJSON()
 * @model
 * @generated
 */
public interface JSON extends MetadataValue {
	/**
	 * Returns the value of the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json</em>' attribute.
	 * @see #setJson(String)
	 * @see org.geppetto.model.values.ValuesPackage#getJSON_Json()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getJson();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.JSON#getJson <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json</em>' attribute.
	 * @see #getJson()
	 * @generated
	 */
	void setJson(String value);

} // JSON
