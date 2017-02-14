/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.ArrayValue#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.values.ArrayElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.geppetto.model.values.ValuesPackage#getArrayValue_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArrayElement> getElements();

} // ArrayValue
