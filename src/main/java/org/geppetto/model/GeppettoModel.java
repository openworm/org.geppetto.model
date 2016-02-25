/**
 */
package org.geppetto.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root of every Geppetto model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.model.GeppettoModel#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getTags <em>Tags</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getId <em>Id</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getName <em>Name</em>}</li>
 *   <li>{@link org.geppetto.model.GeppettoModel#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel()
 * @model
 * @generated
 */
public interface GeppettoModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.variables.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The top level variables instantiated inside the Geppetto Model.  The type of the variables will be coming from inside Libraries available inside this GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.GeppettoLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The libraries are container of types. A library can be associated to a modelInterpreter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeppettoLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tags available in the GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Id()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.geppetto.model.GeppettoModel#getId <em>Id</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * The name of the GeppettoModel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_Name()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.geppetto.model.GeppettoModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.geppetto.model.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data sources available for this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference list.
	 * @see org.geppetto.model.GeppettoPackage#getGeppettoModel_DataSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSource> getDataSources();

} // GeppettoModel
