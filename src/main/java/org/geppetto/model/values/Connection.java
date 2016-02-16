/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.geppetto.model.values.Connection#getConnectivity <em>Connectivity</em>}</li>
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
	 * Returns the value of the '<em><b>Connectivity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.geppetto.model.values.Connectivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity</em>' attribute.
	 * @see org.geppetto.model.values.Connectivity
	 * @see #setConnectivity(Connectivity)
	 * @see org.geppetto.model.values.ValuesPackage#getConnection_Connectivity()
	 * @model
	 * @generated
	 */
	Connectivity getConnectivity();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Connection#getConnectivity <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity</em>' attribute.
	 * @see org.geppetto.model.values.Connectivity
	 * @see #getConnectivity()
	 * @generated
	 */
	void setConnectivity(Connectivity value);

} // Connection
