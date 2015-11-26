/**
 */
package org.geppetto.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.geppetto.model.impl.GeppettoModelImpl#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeppettoModelImpl extends MinimalEObjectImpl.Container implements GeppettoModel
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
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<GeppettoLibrary> libraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeppettoModelImpl()
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
		return GeppettoPackage.Literals.GEPPETTO_MODEL;
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
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, GeppettoPackage.GEPPETTO_MODEL__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeppettoLibrary> getLibraries()
	{
		if (libraries == null)
		{
			libraries = new EObjectContainmentEList<GeppettoLibrary>(GeppettoLibrary.class, this, GeppettoPackage.GEPPETTO_MODEL__LIBRARIES);
		}
		return libraries;
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return getVariables();
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return getLibraries();
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends GeppettoLibrary>)newValue);
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				getVariables().clear();
				return;
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				getLibraries().clear();
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
			case GeppettoPackage.GEPPETTO_MODEL__VARIABLES:
				return variables != null && !variables.isEmpty();
			case GeppettoPackage.GEPPETTO_MODEL__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeppettoModelImpl
