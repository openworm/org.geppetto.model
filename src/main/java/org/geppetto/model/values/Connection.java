/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

import org.geppetto.model.types.ConnectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.Connection#getA <em>A</em>}</li>
 *   <li>{@link org.geppetto.model.values.Connection#getB <em>B</em>}</li>
 *   <li>{@link org.geppetto.model.values.Connection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Value
{
	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Pointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getConnection_A()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pointer> getA();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Pointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getConnection_B()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pointer> getB();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConnectionType)
	 * @see org.geppetto.model.values.ValuesPackage#getConnection_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionType getType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Connection#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionType value);

} // Connection
