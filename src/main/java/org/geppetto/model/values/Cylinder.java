/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Cylinder#getBottomRadius <em>Bottom Radius</em>}</li>
 *   <li>{@link org.geppetto.model.values.Cylinder#getTopRadius <em>Top Radius</em>}</li>
 *   <li>{@link org.geppetto.model.values.Cylinder#getHeight <em>Height</em>}</li>
 *   <li>{@link org.geppetto.model.values.Cylinder#getDistal <em>Distal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getCylinder()
 * @model
 * @generated
 */
public interface Cylinder extends VisualValue
{
	/**
	 * Returns the value of the '<em><b>Bottom Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Radius</em>' attribute.
	 * @see #setBottomRadius(float)
	 * @see org.geppetto.model.values.ValuesPackage#getCylinder_BottomRadius()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getBottomRadius();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Cylinder#getBottomRadius <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Radius</em>' attribute.
	 * @see #getBottomRadius()
	 * @generated
	 */
	void setBottomRadius(float value);

	/**
	 * Returns the value of the '<em><b>Top Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Radius</em>' attribute.
	 * @see #setTopRadius(float)
	 * @see org.geppetto.model.values.ValuesPackage#getCylinder_TopRadius()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getTopRadius();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Cylinder#getTopRadius <em>Top Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Radius</em>' attribute.
	 * @see #getTopRadius()
	 * @generated
	 */
	void setTopRadius(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see org.geppetto.model.values.ValuesPackage#getCylinder_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Cylinder#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Distal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distal</em>' reference.
	 * @see #setDistal(Point)
	 * @see org.geppetto.model.values.ValuesPackage#getCylinder_Distal()
	 * @model
	 * @generated
	 */
	Point getDistal();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Cylinder#getDistal <em>Distal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distal</em>' reference.
	 * @see #getDistal()
	 * @generated
	 */
	void setDistal(Point value);

} // Cylinder
