/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Argument#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends Value
{
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see #setArgument(String)
	 * @see org.geppetto.model.values.ValuesPackage#getArgument_Argument()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getArgument();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Argument#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(String value);

} // Argument
