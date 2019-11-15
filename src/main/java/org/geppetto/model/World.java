/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.instances.Instance;

import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.World#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.World#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.GeppettoPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends Node
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.variables.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The top level variables instantiated inside the Geppetto Model.  The type of the variables will be coming from inside Libraries available inside this GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getWorld_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.instances.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The top level variables instantiated inside the Geppetto Model.  The type of the variables will be coming from inside Libraries available inside this GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getWorld_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

} // World
