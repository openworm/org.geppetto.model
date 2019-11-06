/**
 */
package org.geppetto.model.instances;

import org.geppetto.model.values.Point;
import org.geppetto.model.values.VisualValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.instances.SimpleInstance#getVisualValue <em>Visual Value</em>}</li>
 *   <li>{@link org.geppetto.model.instances.SimpleInstance#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.instances.InstancesPackage#getSimpleInstance()
 * @model
 * @generated
 */
public interface SimpleInstance extends Instance
{
	/**
	 * Returns the value of the '<em><b>Visual Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Value</em>' containment reference.
	 * @see #setVisualValue(VisualValue)
	 * @see org.geppetto.model.instances.InstancesPackage#getSimpleInstance_VisualValue()
	 * @model containment="true"
	 * @generated
	 */
	VisualValue getVisualValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.SimpleInstance#getVisualValue <em>Visual Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Value</em>' containment reference.
	 * @see #getVisualValue()
	 * @generated
	 */
	void setVisualValue(VisualValue value);

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
	 * @see org.geppetto.model.instances.InstancesPackage#getSimpleInstance_Position()
	 * @model containment="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.SimpleInstance#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

} // SimpleInstance
