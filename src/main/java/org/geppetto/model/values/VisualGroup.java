/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.VisualGroup#getLowSpectrumColor <em>Low Spectrum Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualGroup#getHighSpectrumColor <em>High Spectrum Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.geppetto.model.values.VisualGroup#getVisualGroupElements <em>Visual Group Elements</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getVisualGroup()
 * @model
 * @generated
 */
public interface VisualGroup extends Node
{
	/**
	 * Returns the value of the '<em><b>Low Spectrum Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Spectrum Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Spectrum Color</em>' attribute.
	 * @see #setLowSpectrumColor(String)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroup_LowSpectrumColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLowSpectrumColor();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualGroup#getLowSpectrumColor <em>Low Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Spectrum Color</em>' attribute.
	 * @see #getLowSpectrumColor()
	 * @generated
	 */
	void setLowSpectrumColor(String value);

	/**
	 * Returns the value of the '<em><b>High Spectrum Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Spectrum Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Spectrum Color</em>' attribute.
	 * @see #setHighSpectrumColor(String)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroup_HighSpectrumColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getHighSpectrumColor();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualGroup#getHighSpectrumColor <em>High Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Spectrum Color</em>' attribute.
	 * @see #getHighSpectrumColor()
	 * @generated
	 */
	void setHighSpectrumColor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroup_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.VisualGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Visual Group Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.VisualGroupElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Group Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Group Elements</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getVisualGroup_VisualGroupElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VisualGroupElement> getVisualGroupElements();

} // VisualGroup
