/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.ImportValue#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getImportValue()
 * @model
 * @generated
 */
public interface ImportValue extends Value
{
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
	 * @see org.geppetto.model.values.ValuesPackage#getImportValue_ModelInterpreterId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getModelInterpreterId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.ImportValue#getModelInterpreterId <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Interpreter Id</em>' attribute.
	 * @see #getModelInterpreterId()
	 * @generated
	 */
	void setModelInterpreterId(String value);

} // ImportValue
