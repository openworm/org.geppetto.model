/**
 */
package org.geppetto.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.DomainModel#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.geppetto.model.DomainModel#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.geppetto.model.GeppettoPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' attribute.
	 * @see #setDomainModel(Object)
	 * @see org.geppetto.model.GeppettoPackage#getDomainModel_DomainModel()
	 * @model transient="true"
	 * @generated
	 */
	Object getDomainModel();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DomainModel#getDomainModel <em>Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' attribute.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(Object value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(ModelFormat)
	 * @see org.geppetto.model.GeppettoPackage#getDomainModel_Format()
	 * @model containment="true"
	 * @generated
	 */
	ModelFormat getFormat();

	/**
	 * Sets the value of the '{@link org.geppetto.model.DomainModel#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(ModelFormat value);

} // DomainModel
