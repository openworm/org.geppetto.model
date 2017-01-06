/**
 */
package org.geppetto.model.values.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.geppetto.model.values.Cylinder;
import org.geppetto.model.values.Point;
import org.geppetto.model.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.values.impl.CylinderImpl#getBottomRadius <em>Bottom Radius</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.CylinderImpl#getTopRadius <em>Top Radius</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.CylinderImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.geppetto.model.values.impl.CylinderImpl#getDistal <em>Distal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CylinderImpl extends VisualValueImpl implements Cylinder
{
	/**
	 * The default value of the '{@link #getBottomRadius() <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomRadius() <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadius()
	 * @generated
	 * @ordered
	 */
	protected double bottomRadius = BOTTOM_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopRadius() <em>Top Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopRadius() <em>Top Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopRadius()
	 * @generated
	 * @ordered
	 */
	protected double topRadius = TOP_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistal() <em>Distal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistal()
	 * @generated
	 * @ordered
	 */
	protected Point distal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylinderImpl()
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
		return ValuesPackage.Literals.CYLINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottomRadius()
	{
		return bottomRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadius(double newBottomRadius)
	{
		double oldBottomRadius = bottomRadius;
		bottomRadius = newBottomRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CYLINDER__BOTTOM_RADIUS, oldBottomRadius, bottomRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopRadius()
	{
		return topRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopRadius(double newTopRadius)
	{
		double oldTopRadius = topRadius;
		topRadius = newTopRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CYLINDER__TOP_RADIUS, oldTopRadius, topRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight)
	{
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CYLINDER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getDistal()
	{
		return distal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistal(Point newDistal, NotificationChain msgs)
	{
		Point oldDistal = distal;
		distal = newDistal;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CYLINDER__DISTAL, oldDistal, newDistal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistal(Point newDistal)
	{
		if (newDistal != distal)
		{
			NotificationChain msgs = null;
			if (distal != null)
				msgs = ((InternalEObject)distal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CYLINDER__DISTAL, null, msgs);
			if (newDistal != null)
				msgs = ((InternalEObject)newDistal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CYLINDER__DISTAL, null, msgs);
			msgs = basicSetDistal(newDistal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CYLINDER__DISTAL, newDistal, newDistal));
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
			case ValuesPackage.CYLINDER__DISTAL:
				return basicSetDistal(null, msgs);
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
			case ValuesPackage.CYLINDER__BOTTOM_RADIUS:
				return getBottomRadius();
			case ValuesPackage.CYLINDER__TOP_RADIUS:
				return getTopRadius();
			case ValuesPackage.CYLINDER__HEIGHT:
				return getHeight();
			case ValuesPackage.CYLINDER__DISTAL:
				return getDistal();
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
			case ValuesPackage.CYLINDER__BOTTOM_RADIUS:
				setBottomRadius((Double)newValue);
				return;
			case ValuesPackage.CYLINDER__TOP_RADIUS:
				setTopRadius((Double)newValue);
				return;
			case ValuesPackage.CYLINDER__HEIGHT:
				setHeight((Double)newValue);
				return;
			case ValuesPackage.CYLINDER__DISTAL:
				setDistal((Point)newValue);
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
			case ValuesPackage.CYLINDER__BOTTOM_RADIUS:
				setBottomRadius(BOTTOM_RADIUS_EDEFAULT);
				return;
			case ValuesPackage.CYLINDER__TOP_RADIUS:
				setTopRadius(TOP_RADIUS_EDEFAULT);
				return;
			case ValuesPackage.CYLINDER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ValuesPackage.CYLINDER__DISTAL:
				setDistal((Point)null);
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
			case ValuesPackage.CYLINDER__BOTTOM_RADIUS:
				return bottomRadius != BOTTOM_RADIUS_EDEFAULT;
			case ValuesPackage.CYLINDER__TOP_RADIUS:
				return topRadius != TOP_RADIUS_EDEFAULT;
			case ValuesPackage.CYLINDER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ValuesPackage.CYLINDER__DISTAL:
				return distal != null;
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
		result.append(" (bottomRadius: ");
		result.append(bottomRadius);
		result.append(", topRadius: ");
		result.append(topRadius);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //CylinderImpl
