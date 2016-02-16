/**
 */
package org.geppetto.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.geppetto.model.DataSourceLibraryConfiguration;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Library Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.impl.DataSourceLibraryConfigurationImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.geppetto.model.impl.DataSourceLibraryConfigurationImpl#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 *   <li>{@link org.geppetto.model.impl.DataSourceLibraryConfigurationImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceLibraryConfigurationImpl extends MinimalEObjectImpl.Container implements DataSourceLibraryConfiguration
{
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected GeppettoLibrary library;

	/**
	 * The default value of the '{@link #getModelInterpreterId() <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInterpreterId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_INTERPRETER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelInterpreterId() <em>Model Interpreter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInterpreterId()
	 * @generated
	 * @ordered
	 */
	protected String modelInterpreterId = MODEL_INTERPRETER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceLibraryConfigurationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GeppettoPackage.Literals.DATA_SOURCE_LIBRARY_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary getLibrary()
	{
		if (library != null && library.eIsProxy())
		{
			InternalEObject oldLibrary = (InternalEObject)library;
			library = (GeppettoLibrary)eResolveProxy(oldLibrary);
			if (library != oldLibrary)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY, oldLibrary, library));
			}
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary basicGetLibrary()
	{
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(GeppettoLibrary newLibrary)
	{
		GeppettoLibrary oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelInterpreterId()
	{
		return modelInterpreterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelInterpreterId(String newModelInterpreterId)
	{
		String oldModelInterpreterId = modelInterpreterId;
		modelInterpreterId = newModelInterpreterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID, oldModelInterpreterId, modelInterpreterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat()
	{
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat)
	{
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY:
				if (resolve) return getLibrary();
				return basicGetLibrary();
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID:
				return getModelInterpreterId();
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT:
				return getFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY:
				setLibrary((GeppettoLibrary)newValue);
				return;
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID:
				setModelInterpreterId((String)newValue);
				return;
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT:
				setFormat((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY:
				setLibrary((GeppettoLibrary)null);
				return;
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID:
				setModelInterpreterId(MODEL_INTERPRETER_ID_EDEFAULT);
				return;
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__LIBRARY:
				return library != null;
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__MODEL_INTERPRETER_ID:
				return MODEL_INTERPRETER_ID_EDEFAULT == null ? modelInterpreterId != null : !MODEL_INTERPRETER_ID_EDEFAULT.equals(modelInterpreterId);
			case GeppettoPackage.DATA_SOURCE_LIBRARY_CONFIGURATION__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelInterpreterId: ");
		result.append(modelInterpreterId);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //DataSourceLibraryConfigurationImpl
