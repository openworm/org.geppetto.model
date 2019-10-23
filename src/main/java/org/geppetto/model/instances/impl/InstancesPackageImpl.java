/**
 */
package org.geppetto.model.instances.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.geppetto.model.GeppettoPackage;

import org.geppetto.model.datasources.DatasourcesPackage;

import org.geppetto.model.datasources.impl.DatasourcesPackageImpl;

import org.geppetto.model.impl.GeppettoPackageImpl;

import org.geppetto.model.instances.Instance;
import org.geppetto.model.instances.InstancesFactory;
import org.geppetto.model.instances.InstancesPackage;
import org.geppetto.model.instances.SimpleConnectionInstance;
import org.geppetto.model.instances.SimpleInstance;

import org.geppetto.model.types.TypesPackage;

import org.geppetto.model.types.impl.TypesPackageImpl;

import org.geppetto.model.values.ValuesPackage;

import org.geppetto.model.values.impl.ValuesPackageImpl;

import org.geppetto.model.variables.VariablesPackage;

import org.geppetto.model.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesPackageImpl extends EPackageImpl implements InstancesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConnectionInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.geppetto.model.instances.InstancesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancesPackageImpl()
	{
		super(eNS_URI, InstancesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InstancesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancesPackage init()
	{
		if (isInited) return (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInstancesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InstancesPackageImpl theInstancesPackage = registeredInstancesPackage instanceof InstancesPackageImpl ? (InstancesPackageImpl)registeredInstancesPackage : new InstancesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI);
		GeppettoPackageImpl theGeppettoPackage = (GeppettoPackageImpl)(registeredPackage instanceof GeppettoPackageImpl ? registeredPackage : GeppettoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(registeredPackage instanceof ValuesPackageImpl ? registeredPackage : ValuesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(registeredPackage instanceof VariablesPackageImpl ? registeredPackage : VariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatasourcesPackage.eNS_URI);
		DatasourcesPackageImpl theDatasourcesPackage = (DatasourcesPackageImpl)(registeredPackage instanceof DatasourcesPackageImpl ? registeredPackage : DatasourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancesPackage.createPackageContents();
		theGeppettoPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDatasourcesPackage.createPackageContents();

		// Initialize created meta-data
		theInstancesPackage.initializePackageContents();
		theGeppettoPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDatasourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancesPackage.eNS_URI, theInstancesPackage);
		return theInstancesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance()
	{
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Type()
	{
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Value()
	{
		return (EReference)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInstance()
	{
		return simpleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleInstance_VisualValue()
	{
		return (EReference)simpleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleInstance_Position()
	{
		return (EReference)simpleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleConnectionInstance()
	{
		return simpleConnectionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleConnectionInstance_A()
	{
		return (EReference)simpleConnectionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleConnectionInstance_B()
	{
		return (EReference)simpleConnectionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleConnectionInstance_Connectivity()
	{
		return (EAttribute)simpleConnectionInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactory getInstancesFactory()
	{
		return (InstancesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__TYPE);
		createEReference(instanceEClass, INSTANCE__VALUE);

		simpleInstanceEClass = createEClass(SIMPLE_INSTANCE);
		createEReference(simpleInstanceEClass, SIMPLE_INSTANCE__VISUAL_VALUE);
		createEReference(simpleInstanceEClass, SIMPLE_INSTANCE__POSITION);

		simpleConnectionInstanceEClass = createEClass(SIMPLE_CONNECTION_INSTANCE);
		createEReference(simpleConnectionInstanceEClass, SIMPLE_CONNECTION_INSTANCE__A);
		createEReference(simpleConnectionInstanceEClass, SIMPLE_CONNECTION_INSTANCE__B);
		createEAttribute(simpleConnectionInstanceEClass, SIMPLE_CONNECTION_INSTANCE__CONNECTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeppettoPackage theGeppettoPackage = (GeppettoPackage)EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instanceEClass.getESuperTypes().add(theGeppettoPackage.getNode());
		simpleInstanceEClass.getESuperTypes().add(this.getInstance());
		simpleConnectionInstanceEClass.getESuperTypes().add(this.getInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Value(), theValuesPackage.getValue(), null, "value", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleInstanceEClass, SimpleInstance.class, "SimpleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleInstance_VisualValue(), theValuesPackage.getVisualValue(), null, "visualValue", null, 0, 1, SimpleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleInstance_Position(), theValuesPackage.getPoint(), null, "position", null, 0, 1, SimpleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleConnectionInstanceEClass, SimpleConnectionInstance.class, "SimpleConnectionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleConnectionInstance_A(), this.getSimpleInstance(), null, "a", null, 1, 1, SimpleConnectionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleConnectionInstance_B(), this.getSimpleInstance(), null, "b", null, 1, 1, SimpleConnectionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleConnectionInstance_Connectivity(), theValuesPackage.getConnectivity(), "connectivity", null, 0, 1, SimpleConnectionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InstancesPackageImpl
