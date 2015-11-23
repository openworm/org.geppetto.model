/**
 */
package org.geppetto.model.variables;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.Node;
import org.geppetto.model.types.Type;
import org.geppetto.model.values.Point;
import org.geppetto.model.values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.variables.Variable#getTypes <em>Types</em>}</li>
 *   <li>{@link org.geppetto.model.variables.Variable#getInitialValues <em>Initial Values</em>}</li>
 *   <li>{@link org.geppetto.model.variables.Variable#isStatic <em>Static</em>}</li>
 *   <li>{@link org.geppetto.model.variables.Variable#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.variables.VariablesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Node
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Initial Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Values</em>' reference.
	 * @see #setInitialValues(Value)
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_InitialValues()
	 * @model
	 * @generated
	 */
	Value getInitialValues();

	/**
	 * Sets the value of the '{@link org.geppetto.model.variables.Variable#getInitialValues <em>Initial Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Values</em>' reference.
	 * @see #getInitialValues()
	 * @generated
	 */
	void setInitialValues(Value value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_Static()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.geppetto.model.variables.Variable#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Point)
	 * @see org.geppetto.model.variables.VariablesPackage#getVariable_Position()
	 * @model
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.geppetto.model.variables.Variable#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

} // Variable
