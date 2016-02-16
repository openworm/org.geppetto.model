/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.URL#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getURL()
 * @model
 * @generated
 */
public interface URL extends MetadataValue
{
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.geppetto.model.values.ValuesPackage#getURL_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.URL#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // URL
