/**
 */
package org.geppetto.model.variables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.geppetto.model.GeppettoPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.geppetto.model.variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.geppetto.org/model/variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gep";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesPackage eINSTANCE = org.geppetto.model.variables.impl.VariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.variables.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.variables.impl.VariableImpl
	 * @see org.geppetto.model.variables.impl.VariablesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPES = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUES = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATIC = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__POSITION = GeppettoPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.geppetto.model.variables.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.variables.impl.ArrayVariableImpl
	 * @see org.geppetto.model.variables.impl.VariablesPackageImpl#getArrayVariable()
	 * @generated
	 */
	int ARRAY_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__TYPES = VARIABLE__TYPES;

	/**
	 * The feature id for the '<em><b>Initial Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__INITIAL_VALUES = VARIABLE__INITIAL_VALUES;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__STATIC = VARIABLE__STATIC;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__POSITION = VARIABLE__POSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__SIZE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE___GET_PATH = VARIABLE___GET_PATH;

	/**
	 * The number of operations of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.geppetto.model.variables.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.geppetto.model.variables.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.geppetto.model.variables.Variable#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.geppetto.model.variables.Variable#getTypes()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Types();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.variables.Variable#getInitialValues <em>Initial Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Values</em>'.
	 * @see org.geppetto.model.variables.Variable#getInitialValues()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValues();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.variables.Variable#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.geppetto.model.variables.Variable#isStatic()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Static();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.variables.Variable#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see org.geppetto.model.variables.Variable#getPosition()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Position();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.variables.ArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Variable</em>'.
	 * @see org.geppetto.model.variables.ArrayVariable
	 * @generated
	 */
	EClass getArrayVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.variables.ArrayVariable#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.geppetto.model.variables.ArrayVariable#getSize()
	 * @see #getArrayVariable()
	 * @generated
	 */
	EAttribute getArrayVariable_Size();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariablesFactory getVariablesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.geppetto.model.variables.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.variables.impl.VariableImpl
		 * @see org.geppetto.model.variables.impl.VariablesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPES = eINSTANCE.getVariable_Types();

		/**
		 * The meta object literal for the '<em><b>Initial Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIAL_VALUES = eINSTANCE.getVariable_InitialValues();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__STATIC = eINSTANCE.getVariable_Static();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__POSITION = eINSTANCE.getVariable_Position();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.variables.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.variables.impl.ArrayVariableImpl
		 * @see org.geppetto.model.variables.impl.VariablesPackageImpl#getArrayVariable()
		 * @generated
		 */
		EClass ARRAY_VARIABLE = eINSTANCE.getArrayVariable();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_VARIABLE__SIZE = eINSTANCE.getArrayVariable_Size();

	}

} //VariablesPackage
