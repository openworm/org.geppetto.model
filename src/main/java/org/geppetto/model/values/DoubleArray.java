/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.DoubleArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getDoubleArray()
 * @model
 * @generated
 */
public interface DoubleArray extends AArrayValue {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see org.geppetto.model.values.ValuesPackage#getDoubleArray_Elements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	EList<Double> getElements();

} // DoubleArray
