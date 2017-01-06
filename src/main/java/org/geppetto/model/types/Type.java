/**
 */
package org.geppetto.model.types;

import org.eclipse.emf.common.util.EList;
import org.geppetto.model.DomainModel;
import org.geppetto.model.Node;
import org.geppetto.model.values.Value;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.types.Type#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#getVisualType <em>Visual Type</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#getReferencedVariables <em>Referenced Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.Type#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Node
{
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see org.geppetto.model.types.TypesPackage#getType_SuperType()
	 * @model
	 * @generated
	 */
	EList<Type> getSuperType();

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' reference.
	 * @see #setDomainModel(DomainModel)
	 * @see org.geppetto.model.types.TypesPackage#getType_DomainModel()
	 * @model transient="true"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.Type#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.geppetto.model.types.TypesPackage#getType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.Type#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Visual Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Type</em>' reference.
	 * @see #setVisualType(VisualType)
	 * @see org.geppetto.model.types.TypesPackage#getType_VisualType()
	 * @model
	 * @generated
	 */
	VisualType getVisualType();

	/**
	 * Sets the value of the '{@link org.geppetto.model.types.Type#getVisualType <em>Visual Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Type</em>' reference.
	 * @see #getVisualType()
	 * @generated
	 */
	void setVisualType(VisualType value);

	/**
	 * Returns the value of the '<em><b>Referenced Variables</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.variables.Variable}.
	 * It is bidirectional and its opposite is '{@link org.geppetto.model.variables.Variable#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Variables</em>' reference list.
	 * @see org.geppetto.model.types.TypesPackage#getType_ReferencedVariables()
	 * @see org.geppetto.model.variables.Variable#getTypes
	 * @model opposite="types" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<Variable> getReferencedVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getDefaultValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" typeRequired="true"
	 * @generated
	 */
	boolean extendsType(Type type);

} // Type
