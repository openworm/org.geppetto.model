/**
 */
package org.geppetto.model.types;

import org.geppetto.model.values.ArrayValue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.types.ArrayType#getSize <em>Size</em>}</li>
 *   <li>{@link org.geppetto.model.types.ArrayType#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.ArrayType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.types.TypesPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type
{
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.geppetto.model.types.TypesPackage#getArrayType_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ArrayType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type</em>' reference.
	 * @see #setArrayType(Type)
	 * @see org.geppetto.model.types.TypesPackage#getArrayType_ArrayType()
	 * @model required="true"
	 * @generated
	 */
	Type getArrayType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ArrayType#getArrayType <em>Array Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' reference.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(Type value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ArrayValue)
	 * @see org.geppetto.model.types.TypesPackage#getArrayType_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	ArrayValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.ArrayType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ArrayValue value);

} // ArrayType
