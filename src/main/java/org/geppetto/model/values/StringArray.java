/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.StringArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getStringArray()
 * @model
 * @generated
 */
public interface StringArray extends AArrayValue {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see org.geppetto.model.values.ValuesPackage#getStringArray_Elements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getElements();

} // StringArray
