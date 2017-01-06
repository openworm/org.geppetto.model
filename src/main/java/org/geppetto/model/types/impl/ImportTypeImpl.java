/**
 */
package org.geppetto.model.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.types.ImportType;
import org.geppetto.model.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.types.impl.ImportTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.ImportTypeImpl#getReferenceURL <em>Reference URL</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.ImportTypeImpl#getModelInterpreterId <em>Model Interpreter Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportTypeImpl extends TypeImpl implements ImportType
{
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceURL() <em>Reference URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceURL() <em>Reference URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceURL()
	 * @generated
	 * @ordered
	 */
	protected String referenceURL = REFERENCE_URL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportTypeImpl()
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
		return TypesPackage.Literals.IMPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl)
	{
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.IMPORT_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceURL()
	{
		return referenceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceURL(String newReferenceURL)
	{
		String oldReferenceURL = referenceURL;
		referenceURL = newReferenceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.IMPORT_TYPE__REFERENCE_URL, oldReferenceURL, referenceURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.IMPORT_TYPE__MODEL_INTERPRETER_ID, oldModelInterpreterId, modelInterpreterId));
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
			case TypesPackage.IMPORT_TYPE__URL:
				return getUrl();
			case TypesPackage.IMPORT_TYPE__REFERENCE_URL:
				return getReferenceURL();
			case TypesPackage.IMPORT_TYPE__MODEL_INTERPRETER_ID:
				return getModelInterpreterId();
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
			case TypesPackage.IMPORT_TYPE__URL:
				setUrl((String)newValue);
				return;
			case TypesPackage.IMPORT_TYPE__REFERENCE_URL:
				setReferenceURL((String)newValue);
				return;
			case TypesPackage.IMPORT_TYPE__MODEL_INTERPRETER_ID:
				setModelInterpreterId((String)newValue);
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
			case TypesPackage.IMPORT_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TypesPackage.IMPORT_TYPE__REFERENCE_URL:
				setReferenceURL(REFERENCE_URL_EDEFAULT);
				return;
			case TypesPackage.IMPORT_TYPE__MODEL_INTERPRETER_ID:
				setModelInterpreterId(MODEL_INTERPRETER_ID_EDEFAULT);
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
			case TypesPackage.IMPORT_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case TypesPackage.IMPORT_TYPE__REFERENCE_URL:
				return REFERENCE_URL_EDEFAULT == null ? referenceURL != null : !REFERENCE_URL_EDEFAULT.equals(referenceURL);
			case TypesPackage.IMPORT_TYPE__MODEL_INTERPRETER_ID:
				return MODEL_INTERPRETER_ID_EDEFAULT == null ? modelInterpreterId != null : !MODEL_INTERPRETER_ID_EDEFAULT.equals(modelInterpreterId);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", referenceURL: ");
		result.append(referenceURL);
		result.append(", modelInterpreterId: ");
		result.append(modelInterpreterId);
		result.append(')');
		return result.toString();
	}

} //ImportTypeImpl
