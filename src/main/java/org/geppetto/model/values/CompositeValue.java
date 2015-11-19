/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.values.CompositeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.values.ValuesPackage#getCompositeValue()
 * @model
 * @generated
 */
public interface CompositeValue extends Value
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.geppetto.model.values.Value},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' map.
	 * @see org.geppetto.model.values.ValuesPackage#getCompositeValue_Value()
	 * @model mapType="org.geppetto.model.values.StringToValueMap<org.eclipse.emf.ecore.xml.type.String, org.geppetto.model.values.Value>"
	 * @generated
	 */
	EMap<String, Value> getValue();

} // CompositeValue
