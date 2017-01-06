/**
 */
package org.geppetto.model.types.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.types.CompositeVisualType;
import org.geppetto.model.types.TypesPackage;
import org.geppetto.model.values.VisualGroup;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Visual Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geppetto.model.types.impl.CompositeVisualTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.types.impl.CompositeVisualTypeImpl#getVisualGroups <em>Visual Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeVisualTypeImpl extends VisualTypeImpl implements CompositeVisualType
{
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getVisualGroups() <em>Visual Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualGroup> visualGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeVisualTypeImpl()
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
		return TypesPackage.Literals.COMPOSITE_VISUAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables()
	{
		if (variables == null)
		{
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualGroup> getVisualGroups()
	{
		if (visualGroups == null)
		{
			visualGroups = new EObjectContainmentEList<VisualGroup>(VisualGroup.class, this, TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS);
		}
		return visualGroups;
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
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS:
				return ((InternalEList<?>)getVisualGroups()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES:
				return getVariables();
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS:
				return getVisualGroups();
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
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS:
				getVisualGroups().clear();
				getVisualGroups().addAll((Collection<? extends VisualGroup>)newValue);
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
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES:
				getVariables().clear();
				return;
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS:
				getVisualGroups().clear();
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
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TypesPackage.COMPOSITE_VISUAL_TYPE__VISUAL_GROUPS:
				return visualGroups != null && !visualGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeVisualTypeImpl
