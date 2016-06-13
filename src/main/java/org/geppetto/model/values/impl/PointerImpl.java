/**
 */
package org.geppetto.model.values.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.PointerElement;
import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pointer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.PointerImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.PointerImpl#getVisualReference <em>Visual Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerImpl extends ValueImpl implements Pointer
{
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerElement> elements;

	/**
	 * The cached value of the '{@link #getVisualReference() <em>Visual Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualReference()
	 * @generated
	 * @ordered
	 */
	protected VisualReference visualReference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ValuesPackage.Literals.POINTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerElement> getElements()
	{
		if (elements == null)
		{
			elements = new EObjectContainmentEList<PointerElement>(PointerElement.class, this, ValuesPackage.POINTER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualReference getVisualReference()
	{
		if (visualReference != null && visualReference.eIsProxy())
		{
			InternalEObject oldVisualReference = (InternalEObject)visualReference;
			visualReference = (VisualReference)eResolveProxy(oldVisualReference);
			if (visualReference != oldVisualReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.POINTER__VISUAL_REFERENCE, oldVisualReference, visualReference));
			}
		}
		return visualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualReference basicGetVisualReference()
	{
		return visualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualReference(VisualReference newVisualReference)
	{
		VisualReference oldVisualReference = visualReference;
		visualReference = newVisualReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.POINTER__VISUAL_REFERENCE, oldVisualReference, visualReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getInstancePath()
	{
		StringBuilder instancePath = new StringBuilder();
		for(PointerElement element : getElements())
		{
			instancePath.append(element.getVariable().getId());
			instancePath.append("(" + element.getType().getId() + ")");
			if(element.getIndex() != null && element.getIndex() > -1)
			{
				instancePath.append("[" + element.getIndex() + "]");
			}
			if(getElements().indexOf(element) < (getElements().size() - 1))
			{
				instancePath.append(".");
			}
		}
		return instancePath.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER__ELEMENTS:
				return getElements();
			case ValuesPackage.POINTER__VISUAL_REFERENCE:
				if (resolve) return getVisualReference();
				return basicGetVisualReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PointerElement>)newValue);
				return;
			case ValuesPackage.POINTER__VISUAL_REFERENCE:
				setVisualReference((VisualReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER__ELEMENTS:
				getElements().clear();
				return;
			case ValuesPackage.POINTER__VISUAL_REFERENCE:
				setVisualReference((VisualReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ValuesPackage.POINTER__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ValuesPackage.POINTER__VISUAL_REFERENCE:
				return visualReference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case ValuesPackage.POINTER___GET_INSTANCE_PATH:
				return getInstancePath();
		}
		return super.eInvoke(operationID, arguments);
	}

} // PointerImpl
