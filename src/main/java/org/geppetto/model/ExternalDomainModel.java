/**
 */
package org.geppetto.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.ExternalDomainModel#getFileFormat <em>File Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getExternalDomainModel()
 * @model
 * @generated
 */
public interface ExternalDomainModel extends DomainModel
{

	/**
	 * Returns the value of the '<em><b>File Format</b></em>' attribute.
	 * The default value is <code>"ZIP"</code>.
	 * The literals are from the enumeration {@link org.geppetto.model.FileFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Format</em>' attribute.
	 * @see org.geppetto.model.FileFormat
	 * @see #setFileFormat(FileFormat)
	 * @see org.geppetto.model.GeppettoPackage#getExternalDomainModel_FileFormat()
	 * @model default="ZIP" required="true"
	 * @generated
	 */
	FileFormat getFileFormat();

	/**
	 * Sets the value of the '{@link org.geppetto.model.ExternalDomainModel#getFileFormat <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Format</em>' attribute.
	 * @see org.geppetto.model.FileFormat
	 * @see #getFileFormat()
	 * @generated
	 */
	void setFileFormat(FileFormat value);
} // ExternalDomainModel
