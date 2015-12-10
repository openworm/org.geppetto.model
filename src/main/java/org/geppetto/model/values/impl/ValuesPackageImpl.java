/**
 */
package org.geppetto.model.values.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.impl.GeppettoPackageImpl;
import org.geppetto.model.types.TypesPackage;
import org.geppetto.model.types.impl.TypesPackageImpl;
import org.geppetto.model.values.Argument;
import org.geppetto.model.values.ArrayElement;
import org.geppetto.model.values.ArrayValue;
import org.geppetto.model.values.Collada;
import org.geppetto.model.values.Composite;
import org.geppetto.model.values.Connection;
import org.geppetto.model.values.ConnectionType;
import org.geppetto.model.values.Cylinder;
import org.geppetto.model.values.Dynamics;
import org.geppetto.model.values.Expression;
import org.geppetto.model.values.Function;
import org.geppetto.model.values.FunctionPlot;
import org.geppetto.model.values.MetadataValue;
import org.geppetto.model.values.Particle;
import org.geppetto.model.values.PhysicalQuantity;
import org.geppetto.model.values.Point;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.PointerElement;
import org.geppetto.model.values.Quantity;
import org.geppetto.model.values.SkeletonAnimation;
import org.geppetto.model.values.SkeletonTransformation;
import org.geppetto.model.values.Sphere;
import org.geppetto.model.values.Text;
import org.geppetto.model.values.TimeSeries;
import org.geppetto.model.values.Unit;
import org.geppetto.model.values.Value;
import org.geppetto.model.values.ValuesFactory;
import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualGroup;
import org.geppetto.model.values.VisualGroupElement;
import org.geppetto.model.values.VisualValue;
import org.geppetto.model.variables.VariablesPackage;
import org.geppetto.model.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToValueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colladaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass particleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeletonAnimationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeletonTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualGroupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

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
	 * @see org.geppetto.model.values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl()
	{
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init()
	{
		if (isInited) return (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeppettoPackageImpl theGeppettoPackage = (GeppettoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI) instanceof GeppettoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI) : GeppettoPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);

		// Create package meta-data objects
		theValuesPackage.createPackageContents();
		theGeppettoPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theValuesPackage.initializePackageContents();
		theGeppettoPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue()
	{
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite()
	{
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Value()
	{
		return (EReference)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToValueMap()
	{
		return stringToValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToValueMap_Key()
	{
		return (EAttribute)stringToValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToValueMap_Value()
	{
		return (EReference)stringToValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity()
	{
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_ScalingFactor()
	{
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Value()
	{
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalQuantity()
	{
		return physicalQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalQuantity_Unit()
	{
		return (EReference)physicalQuantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit()
	{
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Unit()
	{
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSeries()
	{
		return timeSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeries_Quantities()
	{
		return (EReference)timeSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeries_Unit()
	{
		return (EReference)timeSeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataValue()
	{
		return metadataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText()
	{
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text()
	{
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURL()
	{
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURL_Url()
	{
		return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTML()
	{
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTML_Html()
	{
		return (EAttribute)htmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointer()
	{
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointer_Elements()
	{
		return (EReference)pointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointer__GetInstancePath()
	{
		return pointerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerElement()
	{
		return pointerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointerElement_Variable()
	{
		return (EReference)pointerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointerElement_Type()
	{
		return (EReference)pointerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerElement_Index()
	{
		return (EAttribute)pointerElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint()
	{
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Z()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamics()
	{
		return dynamicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamics_InitialCondition()
	{
		return (EReference)dynamicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamics_Dynamics()
	{
		return (EReference)dynamicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPlot()
	{
		return functionPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_Title()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_XAxisLabel()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_YAxisLabel()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_InitialValue()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_FinalValue()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPlot_StepValue()
	{
		return (EAttribute)functionPlotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction()
	{
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Arguments()
	{
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Expression()
	{
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FunctionPlot()
	{
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument()
	{
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Argument()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression()
	{
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Expression()
	{
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualValue()
	{
		return visualValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualValue_GroupElements()
	{
		return (EReference)visualValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualValue_Position()
	{
		return (EReference)visualValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollada()
	{
		return colladaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollada_Collada()
	{
		return (EAttribute)colladaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOBJ()
	{
		return objEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJ_Obj()
	{
		return (EAttribute)objEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphere()
	{
		return sphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphere_Radius()
	{
		return (EAttribute)sphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder()
	{
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_BottomRadius()
	{
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_TopRadius()
	{
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_Height()
	{
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_Distal()
	{
		return (EReference)cylinderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticle()
	{
		return particleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkeletonAnimation()
	{
		return skeletonAnimationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeletonAnimation_SkeletonTransformationSeries()
	{
		return (EReference)skeletonAnimationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkeletonTransformation()
	{
		return skeletonTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkeletonTransformation_SkeletonTransformation()
	{
		return (EAttribute)skeletonTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualGroupElement()
	{
		return visualGroupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualGroupElement_DefaultColor()
	{
		return (EAttribute)visualGroupElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualGroupElement_Parameter()
	{
		return (EReference)visualGroupElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualGroup()
	{
		return visualGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualGroup_LowSpectrumColor()
	{
		return (EAttribute)visualGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualGroup_HighSpectrumColor()
	{
		return (EAttribute)visualGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualGroup_Type()
	{
		return (EAttribute)visualGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualGroup_VisualGroupElements()
	{
		return (EReference)visualGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection()
	{
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_A()
	{
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_B()
	{
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Type()
	{
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayElement()
	{
		return arrayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayElement_Index()
	{
		return (EAttribute)arrayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayElement_Position()
	{
		return (EReference)arrayElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayElement_InitialValue()
	{
		return (EReference)arrayElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue()
	{
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Elements()
	{
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionType()
	{
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactory getValuesFactory()
	{
		return (ValuesFactory)getEFactoryInstance();
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
		valueEClass = createEClass(VALUE);

		compositeEClass = createEClass(COMPOSITE);
		createEReference(compositeEClass, COMPOSITE__VALUE);

		stringToValueMapEClass = createEClass(STRING_TO_VALUE_MAP);
		createEAttribute(stringToValueMapEClass, STRING_TO_VALUE_MAP__KEY);
		createEReference(stringToValueMapEClass, STRING_TO_VALUE_MAP__VALUE);

		quantityEClass = createEClass(QUANTITY);
		createEAttribute(quantityEClass, QUANTITY__SCALING_FACTOR);
		createEAttribute(quantityEClass, QUANTITY__VALUE);

		physicalQuantityEClass = createEClass(PHYSICAL_QUANTITY);
		createEReference(physicalQuantityEClass, PHYSICAL_QUANTITY__UNIT);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__UNIT);

		timeSeriesEClass = createEClass(TIME_SERIES);
		createEReference(timeSeriesEClass, TIME_SERIES__QUANTITIES);
		createEReference(timeSeriesEClass, TIME_SERIES__UNIT);

		metadataValueEClass = createEClass(METADATA_VALUE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		urlEClass = createEClass(URL);
		createEAttribute(urlEClass, URL__URL);

		htmlEClass = createEClass(HTML);
		createEAttribute(htmlEClass, HTML__HTML);

		pointerEClass = createEClass(POINTER);
		createEReference(pointerEClass, POINTER__ELEMENTS);
		createEOperation(pointerEClass, POINTER___GET_INSTANCE_PATH);

		pointerElementEClass = createEClass(POINTER_ELEMENT);
		createEReference(pointerElementEClass, POINTER_ELEMENT__VARIABLE);
		createEReference(pointerElementEClass, POINTER_ELEMENT__TYPE);
		createEAttribute(pointerElementEClass, POINTER_ELEMENT__INDEX);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);
		createEAttribute(pointEClass, POINT__Z);

		dynamicsEClass = createEClass(DYNAMICS);
		createEReference(dynamicsEClass, DYNAMICS__INITIAL_CONDITION);
		createEReference(dynamicsEClass, DYNAMICS__DYNAMICS);

		functionPlotEClass = createEClass(FUNCTION_PLOT);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__TITLE);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__XAXIS_LABEL);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__YAXIS_LABEL);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__INITIAL_VALUE);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__FINAL_VALUE);
		createEAttribute(functionPlotEClass, FUNCTION_PLOT__STEP_VALUE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__ARGUMENTS);
		createEReference(functionEClass, FUNCTION__EXPRESSION);
		createEReference(functionEClass, FUNCTION__FUNCTION_PLOT);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__ARGUMENT);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__EXPRESSION);

		visualValueEClass = createEClass(VISUAL_VALUE);
		createEReference(visualValueEClass, VISUAL_VALUE__GROUP_ELEMENTS);
		createEReference(visualValueEClass, VISUAL_VALUE__POSITION);

		colladaEClass = createEClass(COLLADA);
		createEAttribute(colladaEClass, COLLADA__COLLADA);

		objEClass = createEClass(OBJ);
		createEAttribute(objEClass, OBJ__OBJ);

		sphereEClass = createEClass(SPHERE);
		createEAttribute(sphereEClass, SPHERE__RADIUS);

		cylinderEClass = createEClass(CYLINDER);
		createEAttribute(cylinderEClass, CYLINDER__BOTTOM_RADIUS);
		createEAttribute(cylinderEClass, CYLINDER__TOP_RADIUS);
		createEAttribute(cylinderEClass, CYLINDER__HEIGHT);
		createEReference(cylinderEClass, CYLINDER__DISTAL);

		particleEClass = createEClass(PARTICLE);

		skeletonAnimationEClass = createEClass(SKELETON_ANIMATION);
		createEReference(skeletonAnimationEClass, SKELETON_ANIMATION__SKELETON_TRANSFORMATION_SERIES);

		skeletonTransformationEClass = createEClass(SKELETON_TRANSFORMATION);
		createEAttribute(skeletonTransformationEClass, SKELETON_TRANSFORMATION__SKELETON_TRANSFORMATION);

		visualGroupElementEClass = createEClass(VISUAL_GROUP_ELEMENT);
		createEAttribute(visualGroupElementEClass, VISUAL_GROUP_ELEMENT__DEFAULT_COLOR);
		createEReference(visualGroupElementEClass, VISUAL_GROUP_ELEMENT__PARAMETER);

		visualGroupEClass = createEClass(VISUAL_GROUP);
		createEAttribute(visualGroupEClass, VISUAL_GROUP__LOW_SPECTRUM_COLOR);
		createEAttribute(visualGroupEClass, VISUAL_GROUP__HIGH_SPECTRUM_COLOR);
		createEAttribute(visualGroupEClass, VISUAL_GROUP__TYPE);
		createEReference(visualGroupEClass, VISUAL_GROUP__VISUAL_GROUP_ELEMENTS);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__A);
		createEReference(connectionEClass, CONNECTION__B);
		createEReference(connectionEClass, CONNECTION__TYPE);

		arrayElementEClass = createEClass(ARRAY_ELEMENT);
		createEAttribute(arrayElementEClass, ARRAY_ELEMENT__INDEX);
		createEReference(arrayElementEClass, ARRAY_ELEMENT__POSITION);
		createEReference(arrayElementEClass, ARRAY_ELEMENT__INITIAL_VALUE);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__ELEMENTS);

		// Create enums
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		GeppettoPackage theGeppettoPackage = (GeppettoPackage)EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeEClass.getESuperTypes().add(this.getValue());
		quantityEClass.getESuperTypes().add(this.getValue());
		physicalQuantityEClass.getESuperTypes().add(this.getQuantity());
		unitEClass.getESuperTypes().add(this.getValue());
		timeSeriesEClass.getESuperTypes().add(this.getValue());
		metadataValueEClass.getESuperTypes().add(this.getValue());
		textEClass.getESuperTypes().add(this.getMetadataValue());
		urlEClass.getESuperTypes().add(this.getMetadataValue());
		htmlEClass.getESuperTypes().add(this.getMetadataValue());
		pointerEClass.getESuperTypes().add(this.getValue());
		pointEClass.getESuperTypes().add(this.getValue());
		dynamicsEClass.getESuperTypes().add(this.getValue());
		functionEClass.getESuperTypes().add(this.getValue());
		argumentEClass.getESuperTypes().add(this.getValue());
		expressionEClass.getESuperTypes().add(this.getValue());
		visualValueEClass.getESuperTypes().add(this.getValue());
		colladaEClass.getESuperTypes().add(this.getVisualValue());
		objEClass.getESuperTypes().add(this.getVisualValue());
		sphereEClass.getESuperTypes().add(this.getVisualValue());
		cylinderEClass.getESuperTypes().add(this.getVisualValue());
		particleEClass.getESuperTypes().add(this.getVisualValue());
		particleEClass.getESuperTypes().add(this.getPoint());
		skeletonAnimationEClass.getESuperTypes().add(this.getVisualValue());
		visualGroupElementEClass.getESuperTypes().add(theGeppettoPackage.getNode());
		visualGroupEClass.getESuperTypes().add(theGeppettoPackage.getNode());
		connectionEClass.getESuperTypes().add(this.getValue());
		arrayElementEClass.getESuperTypes().add(this.getValue());
		arrayValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposite_Value(), this.getStringToValueMap(), null, "value", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToValueMapEClass, Map.Entry.class, "StringToValueMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToValueMap_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToValueMap_Value(), this.getValue(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantity_ScalingFactor(), theXMLTypePackage.getInt(), "scalingFactor", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalQuantityEClass, PhysicalQuantity.class, "PhysicalQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalQuantity_Unit(), this.getUnit(), null, "unit", null, 0, 1, PhysicalQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSeriesEClass, TimeSeries.class, "TimeSeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSeries_Quantities(), this.getQuantity(), null, "quantities", null, 0, -1, TimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSeries_Unit(), this.getUnit(), null, "unit", null, 0, 1, TimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataValueEClass, MetadataValue.class, "MetadataValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), theXMLTypePackage.getString(), "text", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlEClass, org.geppetto.model.values.URL.class, "URL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURL_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, org.geppetto.model.values.URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlEClass, org.geppetto.model.values.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTML_Html(), theXMLTypePackage.getString(), "html", null, 1, 1, org.geppetto.model.values.HTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerEClass, Pointer.class, "Pointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointer_Elements(), this.getPointerElement(), null, "elements", null, 0, -1, Pointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPointer__GetInstancePath(), theXMLTypePackage.getString(), "getInstancePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointerElementEClass, PointerElement.class, "PointerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointerElement_Variable(), theVariablesPackage.getVariable(), null, "variable", null, 0, 1, PointerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointerElement_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, PointerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointerElement_Index(), theXMLTypePackage.getInt(), "index", null, 0, 1, PointerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Z(), theXMLTypePackage.getDouble(), "z", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicsEClass, Dynamics.class, "Dynamics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamics_InitialCondition(), this.getPhysicalQuantity(), null, "initialCondition", null, 0, 1, Dynamics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamics_Dynamics(), this.getFunction(), null, "dynamics", null, 0, 1, Dynamics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPlotEClass, FunctionPlot.class, "FunctionPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionPlot_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionPlot_XAxisLabel(), theXMLTypePackage.getString(), "xAxisLabel", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionPlot_YAxisLabel(), theXMLTypePackage.getString(), "yAxisLabel", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionPlot_InitialValue(), theXMLTypePackage.getDouble(), "initialValue", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionPlot_FinalValue(), theXMLTypePackage.getDouble(), "finalValue", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionPlot_StepValue(), theXMLTypePackage.getDouble(), "stepValue", null, 0, 1, FunctionPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Expression(), this.getExpression(), null, "expression", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_FunctionPlot(), this.getFunctionPlot(), null, "functionPlot", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Argument(), theXMLTypePackage.getString(), "argument", "", 1, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualValueEClass, VisualValue.class, "VisualValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisualValue_GroupElements(), this.getVisualGroupElement(), null, "groupElements", null, 0, -1, VisualValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualValue_Position(), this.getPoint(), null, "position", null, 0, 1, VisualValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colladaEClass, Collada.class, "Collada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollada_Collada(), theXMLTypePackage.getString(), "collada", null, 1, 1, Collada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objEClass, org.geppetto.model.values.OBJ.class, "OBJ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOBJ_Obj(), theXMLTypePackage.getString(), "obj", null, 1, 1, org.geppetto.model.values.OBJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereEClass, Sphere.class, "Sphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphere_Radius(), theXMLTypePackage.getDouble(), "radius", null, 1, 1, Sphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCylinder_BottomRadius(), theXMLTypePackage.getDouble(), "bottomRadius", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCylinder_TopRadius(), theXMLTypePackage.getDouble(), "topRadius", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCylinder_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylinder_Distal(), this.getPoint(), null, "distal", null, 0, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(particleEClass, Particle.class, "Particle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skeletonAnimationEClass, SkeletonAnimation.class, "SkeletonAnimation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkeletonAnimation_SkeletonTransformationSeries(), this.getSkeletonTransformation(), null, "skeletonTransformationSeries", null, 0, -1, SkeletonAnimation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skeletonTransformationEClass, SkeletonTransformation.class, "SkeletonTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkeletonTransformation_SkeletonTransformation(), theXMLTypePackage.getDouble(), "skeletonTransformation", null, 0, -1, SkeletonTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualGroupElementEClass, VisualGroupElement.class, "VisualGroupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualGroupElement_DefaultColor(), theXMLTypePackage.getString(), "defaultColor", null, 0, 1, VisualGroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualGroupElement_Parameter(), this.getQuantity(), null, "parameter", null, 0, 1, VisualGroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualGroupEClass, VisualGroup.class, "VisualGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualGroup_LowSpectrumColor(), theXMLTypePackage.getString(), "lowSpectrumColor", null, 0, 1, VisualGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualGroup_HighSpectrumColor(), theXMLTypePackage.getString(), "highSpectrumColor", null, 0, 1, VisualGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualGroup_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, VisualGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualGroup_VisualGroupElements(), this.getVisualGroupElement(), null, "visualGroupElements", null, 1, -1, VisualGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_A(), this.getPointer(), null, "a", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_B(), this.getPointer(), null, "b", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Type(), theTypesPackage.getConnectionType(), null, "type", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayElementEClass, ArrayElement.class, "ArrayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayElement_Index(), theXMLTypePackage.getInt(), "index", null, 1, 1, ArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayElement_Position(), this.getPoint(), null, "position", null, 0, 1, ArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayElement_InitialValue(), this.getValue(), null, "initialValue", null, 0, 1, ArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Elements(), this.getArrayElement(), null, "elements", null, 1, -1, ArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.DIRECTIONAL);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.BIDIRECTIONAL);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.NON_DIRECTIONAL);
	}

} //ValuesPackageImpl
