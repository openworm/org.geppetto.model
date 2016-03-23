/**
 */
package org.geppetto.model.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.geppetto.model.CompoundQuery;
import org.geppetto.model.DataSource;
import org.geppetto.model.DataSourceLibraryConfiguration;
import org.geppetto.model.DomainModel;
import org.geppetto.model.ExperimentState;
import org.geppetto.model.ExternalDomainModel;
import org.geppetto.model.FileFormat;
import org.geppetto.model.GeppettoFactory;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.ISynchable;
import org.geppetto.model.LibraryManager;
import org.geppetto.model.ModelFormat;
import org.geppetto.model.Node;
import org.geppetto.model.ProcessQuery;
import org.geppetto.model.Query;
import org.geppetto.model.QueryMatchingCriteria;
import org.geppetto.model.QueryResult;
import org.geppetto.model.QueryResults;
import org.geppetto.model.SimpleQuery;
import org.geppetto.model.Tag;
import org.geppetto.model.VariableValue;
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
public class GeppettoPackageImpl extends EPackageImpl implements GeppettoPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geppettoModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geppettoLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDomainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceLibraryConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryMatchingCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSynchableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileFormatEEnum = null;

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
	 * @see org.geppetto.model.GeppettoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeppettoPackageImpl()
	{
		super(eNS_URI, GeppettoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeppettoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeppettoPackage init()
	{
		if (isInited) return (GeppettoPackage)EPackage.Registry.INSTANCE.getEPackage(GeppettoPackage.eNS_URI);

		// Obtain or create and register package
		GeppettoPackageImpl theGeppettoPackage = (GeppettoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeppettoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeppettoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);

		// Create package meta-data objects
		theGeppettoPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theGeppettoPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeppettoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeppettoPackage.eNS_URI, theGeppettoPackage);
		return theGeppettoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeppettoModel()
	{
		return geppettoModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoModel_Variables()
	{
		return (EReference)geppettoModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoModel_Libraries()
	{
		return (EReference)geppettoModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoModel_Tags()
	{
		return (EReference)geppettoModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeppettoModel_Id()
	{
		return (EAttribute)geppettoModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeppettoModel_Name()
	{
		return (EAttribute)geppettoModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoModel_DataSources()
	{
		return (EReference)geppettoModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Id()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Tags()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetPath()
	{
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeppettoLibrary()
	{
		return geppettoLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoLibrary_Types()
	{
		return (EReference)geppettoLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeppettoLibrary_SharedTypes()
	{
		return (EReference)geppettoLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryManager()
	{
		return libraryManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryManager_Libraries()
	{
		return (EReference)libraryManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentState()
	{
		return experimentStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentState_RecordedVariables()
	{
		return (EReference)experimentStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentState_SetParameters()
	{
		return (EReference)experimentStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentState_ExperimentId()
	{
		return (EAttribute)experimentStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableValue()
	{
		return variableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValue_Pointer()
	{
		return (EReference)variableValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValue_Value()
	{
		return (EReference)variableValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag()
	{
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Tags()
	{
		return (EReference)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name()
	{
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel()
	{
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModel_DomainModel()
	{
		return (EAttribute)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Format()
	{
		return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFormat()
	{
		return modelFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFormat_ModelFormat()
	{
		return (EAttribute)modelFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDomainModel()
	{
		return externalDomainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDomainModel_FileFormat()
	{
		return (EAttribute)externalDomainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource()
	{
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_DataSourceService()
	{
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_LibraryConfigurations()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Url()
	{
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_Queries()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_DependenciesLibrary()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_TargetLibrary()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_FetchVariableQuery()
	{
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceLibraryConfiguration()
	{
		return dataSourceLibraryConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceLibraryConfiguration_Library()
	{
		return (EReference)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceLibraryConfiguration_ModelInterpreterId()
	{
		return (EAttribute)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceLibraryConfiguration_Format()
	{
		return (EAttribute)dataSourceLibraryConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery()
	{
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Label()
	{
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Description()
	{
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_MatchingCriteria()
	{
		return (EReference)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessQuery()
	{
		return processQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessQuery_Parameters()
	{
		return (EReference)processQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessQuery_QueryProcessorId()
	{
		return (EAttribute)processQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleQuery()
	{
		return simpleQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleQuery_Query()
	{
		return (EAttribute)simpleQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleQuery_CountQuery()
	{
		return (EAttribute)simpleQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundQuery()
	{
		return compoundQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundQuery_QueryChain()
	{
		return (EReference)compoundQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResults()
	{
		return queryResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResults_Id()
	{
		return (EAttribute)queryResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResults_Header()
	{
		return (EAttribute)queryResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryResults_Results()
	{
		return (EReference)queryResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResult()
	{
		return queryResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryResult_Values()
	{
		return (EAttribute)queryResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryMatchingCriteria()
	{
		return queryMatchingCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryMatchingCriteria_Type()
	{
		return (EReference)queryMatchingCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMap()
	{
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Key()
	{
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Value()
	{
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISynchable()
	{
		return iSynchableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISynchable_Synched()
	{
		return (EAttribute)iSynchableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileFormat()
	{
		return fileFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoFactory getGeppettoFactory()
	{
		return (GeppettoFactory)getEFactoryInstance();
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
		geppettoModelEClass = createEClass(GEPPETTO_MODEL);
		createEReference(geppettoModelEClass, GEPPETTO_MODEL__VARIABLES);
		createEReference(geppettoModelEClass, GEPPETTO_MODEL__LIBRARIES);
		createEReference(geppettoModelEClass, GEPPETTO_MODEL__TAGS);
		createEAttribute(geppettoModelEClass, GEPPETTO_MODEL__ID);
		createEAttribute(geppettoModelEClass, GEPPETTO_MODEL__NAME);
		createEReference(geppettoModelEClass, GEPPETTO_MODEL__DATA_SOURCES);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ID);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__TAGS);
		createEOperation(nodeEClass, NODE___GET_PATH);

		geppettoLibraryEClass = createEClass(GEPPETTO_LIBRARY);
		createEReference(geppettoLibraryEClass, GEPPETTO_LIBRARY__TYPES);
		createEReference(geppettoLibraryEClass, GEPPETTO_LIBRARY__SHARED_TYPES);

		libraryManagerEClass = createEClass(LIBRARY_MANAGER);
		createEReference(libraryManagerEClass, LIBRARY_MANAGER__LIBRARIES);

		experimentStateEClass = createEClass(EXPERIMENT_STATE);
		createEReference(experimentStateEClass, EXPERIMENT_STATE__RECORDED_VARIABLES);
		createEReference(experimentStateEClass, EXPERIMENT_STATE__SET_PARAMETERS);
		createEAttribute(experimentStateEClass, EXPERIMENT_STATE__EXPERIMENT_ID);

		variableValueEClass = createEClass(VARIABLE_VALUE);
		createEReference(variableValueEClass, VARIABLE_VALUE__POINTER);
		createEReference(variableValueEClass, VARIABLE_VALUE__VALUE);

		tagEClass = createEClass(TAG);
		createEReference(tagEClass, TAG__TAGS);
		createEAttribute(tagEClass, TAG__NAME);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__FORMAT);

		modelFormatEClass = createEClass(MODEL_FORMAT);
		createEAttribute(modelFormatEClass, MODEL_FORMAT__MODEL_FORMAT);

		externalDomainModelEClass = createEClass(EXTERNAL_DOMAIN_MODEL);
		createEAttribute(externalDomainModelEClass, EXTERNAL_DOMAIN_MODEL__FILE_FORMAT);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__DATA_SOURCE_SERVICE);
		createEReference(dataSourceEClass, DATA_SOURCE__LIBRARY_CONFIGURATIONS);
		createEAttribute(dataSourceEClass, DATA_SOURCE__URL);
		createEReference(dataSourceEClass, DATA_SOURCE__QUERIES);
		createEReference(dataSourceEClass, DATA_SOURCE__DEPENDENCIES_LIBRARY);
		createEReference(dataSourceEClass, DATA_SOURCE__TARGET_LIBRARY);
		createEReference(dataSourceEClass, DATA_SOURCE__FETCH_VARIABLE_QUERY);

		dataSourceLibraryConfigurationEClass = createEClass(DATA_SOURCE_LIBRARY_CONFIGURATION);
		createEReference(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY);
		createEAttribute(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID);
		createEAttribute(dataSourceLibraryConfigurationEClass, DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__LABEL);
		createEAttribute(queryEClass, QUERY__DESCRIPTION);
		createEReference(queryEClass, QUERY__MATCHING_CRITERIA);

		processQueryEClass = createEClass(PROCESS_QUERY);
		createEReference(processQueryEClass, PROCESS_QUERY__PARAMETERS);
		createEAttribute(processQueryEClass, PROCESS_QUERY__QUERY_PROCESSOR_ID);

		simpleQueryEClass = createEClass(SIMPLE_QUERY);
		createEAttribute(simpleQueryEClass, SIMPLE_QUERY__QUERY);
		createEAttribute(simpleQueryEClass, SIMPLE_QUERY__COUNT_QUERY);

		compoundQueryEClass = createEClass(COMPOUND_QUERY);
		createEReference(compoundQueryEClass, COMPOUND_QUERY__QUERY_CHAIN);

		queryResultsEClass = createEClass(QUERY_RESULTS);
		createEAttribute(queryResultsEClass, QUERY_RESULTS__ID);
		createEAttribute(queryResultsEClass, QUERY_RESULTS__HEADER);
		createEReference(queryResultsEClass, QUERY_RESULTS__RESULTS);

		queryResultEClass = createEClass(QUERY_RESULT);
		createEAttribute(queryResultEClass, QUERY_RESULT__VALUES);

		queryMatchingCriteriaEClass = createEClass(QUERY_MATCHING_CRITERIA);
		createEReference(queryMatchingCriteriaEClass, QUERY_MATCHING_CRITERIA__TYPE);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		iSynchableEClass = createEClass(ISYNCHABLE);
		createEAttribute(iSynchableEClass, ISYNCHABLE__SYNCHED);

		// Create enums
		fileFormatEEnum = createEEnum(FILE_FORMAT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypesPackage);
		getESubpackages().add(theValuesPackage);
		getESubpackages().add(theVariablesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getISynchable());
		geppettoLibraryEClass.getESuperTypes().add(this.getNode());
		tagEClass.getESuperTypes().add(this.getISynchable());
		externalDomainModelEClass.getESuperTypes().add(this.getDomainModel());
		dataSourceEClass.getESuperTypes().add(this.getNode());
		queryEClass.getESuperTypes().add(this.getISynchable());
		processQueryEClass.getESuperTypes().add(this.getQuery());
		simpleQueryEClass.getESuperTypes().add(this.getQuery());
		compoundQueryEClass.getESuperTypes().add(this.getQuery());

		// Initialize classes, features, and operations; add parameters
		initEClass(geppettoModelEClass, GeppettoModel.class, "GeppettoModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeppettoModel_Variables(), theVariablesPackage.getVariable(), null, "variables", null, 0, -1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeppettoModel_Libraries(), this.getGeppettoLibrary(), null, "libraries", null, 0, -1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeppettoModel_Tags(), this.getTag(), null, "tags", null, 0, -1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeppettoModel_Id(), theXMLTypePackage.getString(), "id", "", 1, 1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeppettoModel_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeppettoModel_DataSources(), this.getDataSource(), null, "dataSources", null, 0, -1, GeppettoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Id(), theXMLTypePackage.getString(), "id", "", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Tags(), this.getTag(), null, "tags", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__GetPath(), theXMLTypePackage.getString(), "getPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(geppettoLibraryEClass, GeppettoLibrary.class, "GeppettoLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeppettoLibrary_Types(), theTypesPackage.getType(), null, "types", null, 0, -1, GeppettoLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeppettoLibrary_SharedTypes(), theTypesPackage.getType(), null, "sharedTypes", null, 0, -1, GeppettoLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryManagerEClass, LibraryManager.class, "LibraryManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryManager_Libraries(), this.getGeppettoLibrary(), null, "libraries", null, 0, -1, LibraryManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentStateEClass, ExperimentState.class, "ExperimentState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentState_RecordedVariables(), this.getVariableValue(), null, "recordedVariables", null, 0, -1, ExperimentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentState_SetParameters(), this.getVariableValue(), null, "setParameters", null, 0, -1, ExperimentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentState_ExperimentId(), theXMLTypePackage.getLong(), "experimentId", null, 1, 1, ExperimentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableValueEClass, VariableValue.class, "VariableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableValue_Pointer(), theValuesPackage.getPointer(), null, "pointer", null, 1, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableValue_Value(), theValuesPackage.getValue(), null, "value", null, 0, 1, VariableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTag_Tags(), this.getTag(), null, "tags", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainModel_DomainModel(), ecorePackage.getEJavaObject(), "domainModel", null, 0, 1, DomainModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Format(), this.getModelFormat(), null, "format", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFormatEClass, ModelFormat.class, "ModelFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFormat_ModelFormat(), theXMLTypePackage.getString(), "modelFormat", null, 0, 1, ModelFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDomainModelEClass, ExternalDomainModel.class, "ExternalDomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDomainModel_FileFormat(), this.getFileFormat(), "fileFormat", "ZIP", 1, 1, ExternalDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_DataSourceService(), theXMLTypePackage.getString(), "dataSourceService", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_LibraryConfigurations(), this.getDataSourceLibraryConfiguration(), null, "libraryConfigurations", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Queries(), this.getQuery(), null, "queries", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_DependenciesLibrary(), this.getGeppettoLibrary(), null, "dependenciesLibrary", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_TargetLibrary(), this.getGeppettoLibrary(), null, "targetLibrary", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_FetchVariableQuery(), this.getQuery(), null, "fetchVariableQuery", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceLibraryConfigurationEClass, DataSourceLibraryConfiguration.class, "DataSourceLibraryConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSourceLibraryConfiguration_Library(), this.getGeppettoLibrary(), null, "library", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceLibraryConfiguration_ModelInterpreterId(), theXMLTypePackage.getString(), "modelInterpreterId", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceLibraryConfiguration_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, DataSourceLibraryConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_MatchingCriteria(), this.getQueryMatchingCriteria(), null, "matchingCriteria", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processQueryEClass, ProcessQuery.class, "ProcessQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessQuery_Parameters(), this.getStringToStringMap(), null, "parameters", null, 0, -1, ProcessQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessQuery_QueryProcessorId(), theXMLTypePackage.getString(), "queryProcessorId", null, 1, 1, ProcessQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleQueryEClass, SimpleQuery.class, "SimpleQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleQuery_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, SimpleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleQuery_CountQuery(), theXMLTypePackage.getString(), "countQuery", null, 1, 1, SimpleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundQueryEClass, CompoundQuery.class, "CompoundQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundQuery_QueryChain(), this.getQuery(), null, "queryChain", null, 1, -1, CompoundQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryResultsEClass, QueryResults.class, "QueryResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResults_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryResults_Header(), theXMLTypePackage.getString(), "header", null, 0, -1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryResults_Results(), this.getQueryResult(), null, "results", null, 0, -1, QueryResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryResultEClass, QueryResult.class, "QueryResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryResult_Values(), theXMLTypePackage.getString(), "values", null, 1, -1, QueryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryMatchingCriteriaEClass, QueryMatchingCriteria.class, "QueryMatchingCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryMatchingCriteria_Type(), theTypesPackage.getType(), null, "type", null, 0, -1, QueryMatchingCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSynchableEClass, ISynchable.class, "ISynchable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISynchable_Synched(), theXMLTypePackage.getBoolean(), "synched", null, 1, 1, ISynchable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fileFormatEEnum, FileFormat.class, "FileFormat");
		addEEnumLiteral(fileFormatEEnum, FileFormat.ZIP);
		addEEnumLiteral(fileFormatEEnum, FileFormat.HDF5);

		// Create resource
		createResource(eNS_URI);
	}

} //GeppettoPackageImpl
