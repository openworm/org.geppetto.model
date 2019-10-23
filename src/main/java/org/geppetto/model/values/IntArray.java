/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.IntArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getIntArray()
 * @model
 * @generated
 */
public interface IntArray extends AArrayValue {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see org.geppetto.model.values.ValuesPackage#getIntArray_Elements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	EList<Integer> getElements();

} // IntArray
