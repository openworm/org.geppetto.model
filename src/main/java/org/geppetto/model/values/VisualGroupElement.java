/**
 */
package org.geppetto.model.values;

import org.geppetto.model.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Group Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.VisualGroupElement#getDefaultColor <em>Default Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualGroupElement#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getVisualGroupElement()
 * @model
 * @generated
 */
public interface VisualGroupElement extends Node
{
	/**
	 * Returns the value of the '<em><b>Default Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Color</em>' attribute.
	 * @see #setDefaultColor(String)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroupElement_DefaultColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefaultColor();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualGroupElement#getDefaultColor <em>Default Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Color</em>' attribute.
	 * @see #getDefaultColor()
	 * @generated
	 */
	void setDefaultColor(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Quantity)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroupElement_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getParameter();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualGroupElement#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Quantity value);

} // VisualGroupElement
