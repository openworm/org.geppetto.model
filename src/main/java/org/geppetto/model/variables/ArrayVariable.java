/**
 */
package org.geppetto.model.variables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.variables.ArrayVariable#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.variables.VariablesPackage#getArrayVariable()
 * @model
 * @generated
 */
public interface ArrayVariable extends Variable
{
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.geppetto.model.variables.VariablesPackage#getArrayVariable_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.geppetto.model.variables.ArrayVariable#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // ArrayVariable
