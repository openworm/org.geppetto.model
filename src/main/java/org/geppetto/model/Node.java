/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.Node#getId <em>Id</em>}</li>
 *   <li>{@link org.geppetto.model.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.geppetto.model.Node#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.geppetto.model.GeppettoPackage#getNode_Id()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.geppetto.model.GeppettoPackage#getNode_Name()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.geppetto.model.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.model.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.geppetto.model.GeppettoPackage#getNode_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPath();

} // Node
