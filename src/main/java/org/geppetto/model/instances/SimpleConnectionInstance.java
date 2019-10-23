/**
 */
package org.geppetto.model.instances;

import org.geppetto.model.values.Connectivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.instances.SimpleConnectionInstance#getA <em>A</em>}</li>
 *   <li>{@link org.geppetto.model.instances.SimpleConnectionInstance#getB <em>B</em>}</li>
 *   <li>{@link org.geppetto.model.instances.SimpleConnectionInstance#getConnectivity <em>Connectivity</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.instances.InstancesPackage#getSimpleConnectionInstance()
 * @model
 * @generated
 */
public interface SimpleConnectionInstance extends Instance
{
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(SimpleInstance)
	 * @see org.geppetto.model.instances.InstancesPackage#getSimpleConnectionInstance_A()
	 * @model required="true"
	 * @generated
	 */
	SimpleInstance getA();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.SimpleConnectionInstance#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(SimpleInstance value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(SimpleInstance)
	 * @see org.geppetto.model.instances.InstancesPackage#getSimpleConnectionInstance_B()
	 * @model required="true"
	 * @generated
	 */
	SimpleInstance getB();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.SimpleConnectionInstance#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(SimpleInstance value);

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
	 * @see org.geppetto.model.instances.InstancesPackage#getSimpleConnectionInstance_Connectivity()
	 * @model
	 * @generated
	 */
	Connectivity getConnectivity();

	/**
	 * Sets the value of the '{@link org.geppetto.model.instances.SimpleConnectionInstance#getConnectivity <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity</em>' attribute.
	 * @see org.geppetto.model.values.Connectivity
	 * @see #getConnectivity()
	 * @generated
	 */
	void setConnectivity(Connectivity value);

} // SimpleConnectionInstance
