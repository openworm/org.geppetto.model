/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.Function#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.geppetto.model.values.Function#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.geppetto.model.values.Function#getFunctionPlot <em>Function Plot</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Value
{
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getFunction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.geppetto.model.values.ValuesPackage#getFunction_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Function#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Function Plot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Plot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Plot</em>' containment reference.
	 * @see #setFunctionPlot(FunctionPlot)
	 * @see org.geppetto.model.values.ValuesPackage#getFunction_FunctionPlot()
	 * @model containment="true"
	 * @generated
	 */
	FunctionPlot getFunctionPlot();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.Function#getFunctionPlot <em>Function Plot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Plot</em>' containment reference.
	 * @see #getFunctionPlot()
	 * @generated
	 */
	void setFunctionPlot(FunctionPlot value);

} // Function
