/**
 */
package org.geppetto.model.instances;

import org.geppetto.model.Node;

import org.geppetto.model.types.Type;

import org.geppetto.model.values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.instances.Instance#getType <em>Type</em>}</li>
 *   <li>{@link org.geppetto.model.instances.Instance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.instances.InstancesPackage#getInstance()
 * @model abstract="true"
 * @generated
 */
public interface Instance extends Node
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.geppetto.model.instances.InstancesPackage#getInstance_Type()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.Instance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.geppetto.model.instances.InstancesPackage#getInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.Instance#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Instance
