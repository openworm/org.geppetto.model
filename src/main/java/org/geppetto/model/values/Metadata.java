/**
 */
package org.geppetto.model.values;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.Metadata#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.values.ValuesPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends MetadataValue {
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
	 * @see org.geppetto.model.values.ValuesPackage#getMetadata_Value()
	 * @model mapType="org.geppetto.model.values.StringToValueMap&lt;org.eclipse.emf.ecore.xml.type.String, org.geppetto.model.values.Value&gt;"
	 * @generated
	 */
	EMap<String, Value> getValue();

} // Metadata
