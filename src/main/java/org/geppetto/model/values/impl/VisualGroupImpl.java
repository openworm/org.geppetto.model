/**
 */
package org.geppetto.model.values.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.impl.NodeImpl;
import org.geppetto.model.values.ValuesPackage;
import org.geppetto.model.values.VisualGroup;
import org.geppetto.model.values.VisualGroupElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupImpl#getLowSpectrumColor <em>Low Spectrum Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupImpl#getHighSpectrumColor <em>High Spectrum Color</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.VisualGroupImpl#getVisualGroupElements <em>Visual Group Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualGroupImpl extends NodeImpl implements VisualGroup
{
	/**
	 * The default value of the '{@link #getLowSpectrumColor() <em>Low Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpectrumColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LOW_SPECTRUM_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowSpectrumColor() <em>Low Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpectrumColor()
	 * @generated
	 * @ordered
	 */
	protected String lowSpectrumColor = LOW_SPECTRUM_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighSpectrumColor() <em>High Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighSpectrumColor()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGH_SPECTRUM_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighSpectrumColor() <em>High Spectrum Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighSpectrumColor()
	 * @generated
	 * @ordered
	 */
	protected String highSpectrumColor = HIGH_SPECTRUM_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualGroupElements() <em>Visual Group Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualGroupElements()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualGroupElement> visualGroupElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualGroupImpl()
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
		return ValuesPackage.Literals.VISUAL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowSpectrumColor()
	{
		return lowSpectrumColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowSpectrumColor(String newLowSpectrumColor)
	{
		String oldLowSpectrumColor = lowSpectrumColor;
		lowSpectrumColor = newLowSpectrumColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP__LOW_SPECTRUM_COLOR, oldLowSpectrumColor, lowSpectrumColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHighSpectrumColor()
	{
		return highSpectrumColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighSpectrumColor(String newHighSpectrumColor)
	{
		String oldHighSpectrumColor = highSpectrumColor;
		highSpectrumColor = newHighSpectrumColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP__HIGH_SPECTRUM_COLOR, oldHighSpectrumColor, highSpectrumColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VISUAL_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualGroupElement> getVisualGroupElements()
	{
		if (visualGroupElements == null)
		{
			visualGroupElements = new EObjectContainmentEList<VisualGroupElement>(VisualGroupElement.class, this, ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS);
		}
		return visualGroupElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS:
				return ((InternalEList<?>)getVisualGroupElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ValuesPackage.VISUAL_GROUP__LOW_SPECTRUM_COLOR:
				return getLowSpectrumColor();
			case ValuesPackage.VISUAL_GROUP__HIGH_SPECTRUM_COLOR:
				return getHighSpectrumColor();
			case ValuesPackage.VISUAL_GROUP__TYPE:
				return getType();
			case ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS:
				return getVisualGroupElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ValuesPackage.VISUAL_GROUP__LOW_SPECTRUM_COLOR:
				setLowSpectrumColor((String)newValue);
				return;
			case ValuesPackage.VISUAL_GROUP__HIGH_SPECTRUM_COLOR:
				setHighSpectrumColor((String)newValue);
				return;
			case ValuesPackage.VISUAL_GROUP__TYPE:
				setType((String)newValue);
				return;
			case ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS:
				getVisualGroupElements().clear();
				getVisualGroupElements().addAll((Collection<? extends VisualGroupElement>)newValue);
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
			case ValuesPackage.VISUAL_GROUP__LOW_SPECTRUM_COLOR:
				setLowSpectrumColor(LOW_SPECTRUM_COLOR_EDEFAULT);
				return;
			case ValuesPackage.VISUAL_GROUP__HIGH_SPECTRUM_COLOR:
				setHighSpectrumColor(HIGH_SPECTRUM_COLOR_EDEFAULT);
				return;
			case ValuesPackage.VISUAL_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS:
				getVisualGroupElements().clear();
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
			case ValuesPackage.VISUAL_GROUP__LOW_SPECTRUM_COLOR:
				return LOW_SPECTRUM_COLOR_EDEFAULT == null ? lowSpectrumColor != null : !LOW_SPECTRUM_COLOR_EDEFAULT.equals(lowSpectrumColor);
			case ValuesPackage.VISUAL_GROUP__HIGH_SPECTRUM_COLOR:
				return HIGH_SPECTRUM_COLOR_EDEFAULT == null ? highSpectrumColor != null : !HIGH_SPECTRUM_COLOR_EDEFAULT.equals(highSpectrumColor);
			case ValuesPackage.VISUAL_GROUP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ValuesPackage.VISUAL_GROUP__VISUAL_GROUP_ELEMENTS:
				return visualGroupElements != null && !visualGroupElements.isEmpty();
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
		result.append(" (lowSpectrumColor: ");
		result.append(lowSpectrumColor);
		result.append(", highSpectrumColor: ");
		result.append(highSpectrumColor);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VisualGroupImpl
