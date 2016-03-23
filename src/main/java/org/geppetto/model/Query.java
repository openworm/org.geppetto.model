/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.Query#getLabel <em>Label</em>}</li>
 *   <li>{@link org.geppetto.model.Query#getDescription <em>Description</em>}</li>
 *   <li>{@link org.geppetto.model.Query#getMatchingCriteria <em>Matching Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getQuery()
 * @model abstract="true"
 * @generated
 */
public interface Query extends ISynchable
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.geppetto.model.GeppettoPackage#getQuery_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.geppetto.model.Query#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.geppetto.model.GeppettoPackage#getQuery_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.geppetto.model.Query#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Matching Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.QueryMatchingCriteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Criteria</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getQuery_MatchingCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryMatchingCriteria> getMatchingCriteria();

} // Query
