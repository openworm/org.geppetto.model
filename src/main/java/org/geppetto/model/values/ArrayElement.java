/**
 */
package org.geppetto.model.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.ArrayElement#getIndex <em>Index</em>}</li>
 *   <li>{@link org.geppetto.model.values.ArrayElement#getPosition <em>Position</em>}</li>
 *   <li>{@link org.geppetto.model.values.ArrayElement#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getArrayElement()
 * @model
 * @generated
 */
public interface ArrayElement extends Value
{
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.geppetto.model.values.ValuesPackage#getArrayElement_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.ArrayElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.geppetto.model.values.ValuesPackage#getArrayElement_Position()
	 * @model containment="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.ArrayElement#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Value)
	 * @see org.geppetto.model.values.ValuesPackage#getArrayElement_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getInitialValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.ArrayElement#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Value value);

} // ArrayElement
