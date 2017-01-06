/**
 */
package org.geppetto.model.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.types.ImportType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.geppetto.model.types.ImportType#getReferenceURL <em>Reference URL</em>}</li>
 *   <li>{@link org.geppetto.model.types.ImportType#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.types.TypesPackage#getImportType()
 * @model
 * @generated
 */
public interface ImportType extends Type
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
	 * @see org.geppetto.model.types.TypesPackage#getImportType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ImportType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Reference URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference URL</em>' attribute.
	 * @see #setReferenceURL(String)
	 * @see org.geppetto.model.types.TypesPackage#getImportType_ReferenceURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReferenceURL();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ImportType#getReferenceURL <em>Reference URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference URL</em>' attribute.
	 * @see #getReferenceURL()
	 * @generated
	 */
	void setReferenceURL(String value);

	/**
	 * Returns the value of the '<em><b>Model Interpreter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Interpreter Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Interpreter Id</em>' attribute.
	 * @see #setModelInterpreterId(String)
	 * @see org.geppetto.model.types.TypesPackage#getImportType_ModelInterpreterId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getModelInterpreterId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ImportType#getModelInterpreterId <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Interpreter Id</em>' attribute.
	 * @see #getModelInterpreterId()
	 * @generated
	 */
	void setModelInterpreterId(String value);

} // ImportType
