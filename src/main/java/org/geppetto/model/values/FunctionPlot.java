/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getFinalValue <em>Final Value</em>}</li>
 *   <li>{@link org.geppetto.model.values.FunctionPlot#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot()
 * @model
 * @generated
 */
public interface FunctionPlot extends EObject
{
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_XAxisLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getXAxisLabel <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Label</em>' attribute.
	 * @see #getXAxisLabel()
	 * @generated
	 */
	void setXAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAxis Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Label</em>' attribute.
	 * @see #setYAxisLabel(String)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_YAxisLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Returns the value of the '<em><b>Final Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Value</em>' attribute.
	 * @see #setFinalValue(double)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_FinalValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getFinalValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getFinalValue <em>Final Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Value</em>' attribute.
	 * @see #getFinalValue()
	 * @generated
	 */
	void setFinalValue(double value);

	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(double)
	 * @see org.geppetto.model.values.ValuesPackage#getFunctionPlot_StepValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getStepValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.values.FunctionPlot#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(double value);

} // FunctionPlot
