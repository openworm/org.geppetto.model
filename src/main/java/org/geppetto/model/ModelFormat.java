/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.ModelFormat#getModelFormat <em>Model Format</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.GeppettoPackage#getModelFormat()
 * @model
 * @generated
 */
public interface ModelFormat extends EObject
{
	/**
	 * Returns the value of the '<em><b>Model Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Format</em>' attribute.
	 * @see #setModelFormat(String)
	 * @see org.geppetto.model.GeppettoPackage#getModelFormat_ModelFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getModelFormat();

	/**
	 * Sets the value of the '{@link org.geppetto.model.ModelFormat#getModelFormat <em>Model Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Format</em>' attribute.
	 * @see #getModelFormat()
	 * @generated
	 */
	void setModelFormat(String value);

} // ModelFormat
