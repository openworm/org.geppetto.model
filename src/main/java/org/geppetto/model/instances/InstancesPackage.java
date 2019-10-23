/**
 */
package org.geppetto.model.instances;

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
 * @see org.geppetto.model.instances.InstancesFactory
 * @model kind="package"
 * @generated
 */
public interface InstancesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://raw.githubusercontent.com/openworm/org.geppetto.model/master/src/main/resources/geppettoModel.ecore#//instances";

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
	InstancesPackage eINSTANCE = org.geppetto.model.instances.impl.InstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.model.instances.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.instances.impl.InstanceImpl
	 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SYNCHED = GeppettoPackage.NODE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = GeppettoPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = GeppettoPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TAGS = GeppettoPackage.NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TYPE = GeppettoPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__VALUE = GeppettoPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = GeppettoPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___GET_PATH = GeppettoPackage.NODE___GET_PATH;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = GeppettoPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.instances.impl.SimpleInstanceImpl <em>Simple Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.instances.impl.SimpleInstanceImpl
	 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getSimpleInstance()
	 * @generated
	 */
	int SIMPLE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__SYNCHED = INSTANCE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__ID = INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__TAGS = INSTANCE__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__TYPE = INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__VALUE = INSTANCE__VALUE;

	/**
	 * The feature id for the '<em><b>Visual Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__VISUAL_VALUE = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE__POSITION = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE___GET_PATH = INSTANCE___GET_PATH;

	/**
	 * The number of operations of the '<em>Simple Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl <em>Simple Connection Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl
	 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getSimpleConnectionInstance()
	 * @generated
	 */
	int SIMPLE_CONNECTION_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Synched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__SYNCHED = INSTANCE__SYNCHED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__ID = INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__TAGS = INSTANCE__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__TYPE = INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__VALUE = INSTANCE__VALUE;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__A = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__B = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE___GET_PATH = INSTANCE___GET_PATH;

	/**
	 * The number of operations of the '<em>Simple Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONNECTION_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.geppetto.model.instances.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.geppetto.model.instances.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.instances.Instance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.geppetto.model.instances.Instance#getType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.instances.Instance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.geppetto.model.instances.Instance#getValue()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.instances.SimpleInstance <em>Simple Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Instance</em>'.
	 * @see org.geppetto.model.instances.SimpleInstance
	 * @generated
	 */
	EClass getSimpleInstance();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.instances.SimpleInstance#getVisualValue <em>Visual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Value</em>'.
	 * @see org.geppetto.model.instances.SimpleInstance#getVisualValue()
	 * @see #getSimpleInstance()
	 * @generated
	 */
	EReference getSimpleInstance_VisualValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.geppetto.model.instances.SimpleInstance#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.geppetto.model.instances.SimpleInstance#getPosition()
	 * @see #getSimpleInstance()
	 * @generated
	 */
	EReference getSimpleInstance_Position();

	/**
	 * Returns the meta object for class '{@link org.geppetto.model.instances.SimpleConnectionInstance <em>Simple Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Connection Instance</em>'.
	 * @see org.geppetto.model.instances.SimpleConnectionInstance
	 * @generated
	 */
	EClass getSimpleConnectionInstance();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.instances.SimpleConnectionInstance#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see org.geppetto.model.instances.SimpleConnectionInstance#getA()
	 * @see #getSimpleConnectionInstance()
	 * @generated
	 */
	EReference getSimpleConnectionInstance_A();

	/**
	 * Returns the meta object for the reference '{@link org.geppetto.model.instances.SimpleConnectionInstance#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see org.geppetto.model.instances.SimpleConnectionInstance#getB()
	 * @see #getSimpleConnectionInstance()
	 * @generated
	 */
	EReference getSimpleConnectionInstance_B();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.model.instances.SimpleConnectionInstance#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectivity</em>'.
	 * @see org.geppetto.model.instances.SimpleConnectionInstance#getConnectivity()
	 * @see #getSimpleConnectionInstance()
	 * @generated
	 */
	EAttribute getSimpleConnectionInstance_Connectivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstancesFactory getInstancesFactory();

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
		 * The meta object literal for the '{@link org.geppetto.model.instances.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.instances.impl.InstanceImpl
		 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__VALUE = eINSTANCE.getInstance_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.instances.impl.SimpleInstanceImpl <em>Simple Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.instances.impl.SimpleInstanceImpl
		 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getSimpleInstance()
		 * @generated
		 */
		EClass SIMPLE_INSTANCE = eINSTANCE.getSimpleInstance();

		/**
		 * The meta object literal for the '<em><b>Visual Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_INSTANCE__VISUAL_VALUE = eINSTANCE.getSimpleInstance_VisualValue();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_INSTANCE__POSITION = eINSTANCE.getSimpleInstance_Position();

		/**
		 * The meta object literal for the '{@link org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl <em>Simple Connection Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.model.instances.impl.SimpleConnectionInstanceImpl
		 * @see org.geppetto.model.instances.impl.InstancesPackageImpl#getSimpleConnectionInstance()
		 * @generated
		 */
		EClass SIMPLE_CONNECTION_INSTANCE = eINSTANCE.getSimpleConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONNECTION_INSTANCE__A = eINSTANCE.getSimpleConnectionInstance_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONNECTION_INSTANCE__B = eINSTANCE.getSimpleConnectionInstance_B();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY = eINSTANCE.getSimpleConnectionInstance_Connectivity();

	}

} //InstancesPackage
