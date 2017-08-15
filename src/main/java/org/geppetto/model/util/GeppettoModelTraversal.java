
package org.geppetto.model.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;

/**
 * @author matteocantarelli
 *
 */
public class GeppettoModelTraversal extends GeppettoSwitch<EObject>
{
	/**
	 * Visits the passed object plus its direct and indirect children
	 * @param object
	 * @param visitor
	 * @throws GeppettoVisitingException
	 */
	public static void apply(EObject object, Switch<?> visitor) throws GeppettoVisitingException
	{
		checkException(visitor.doSwitch(object));
		TreeIterator<EObject> iterator = object.eAllContents();
		while(iterator.hasNext())
		{
			checkException(visitor.doSwitch(iterator.next()));
		}
	}

	/**
	 * Visits the passed object plus its direct children 
	 * @param object
	 * @param visitor
	 * @throws GeppettoVisitingException
	 */
	public static void applyDirectChildren(EObject object, Switch<?> visitor) throws GeppettoVisitingException
	{
		checkException(visitor.doSwitch(object));
		Iterator<EObject> iterator = object.eContents().iterator();
		while(iterator.hasNext())
		{
			checkException(visitor.doSwitch(iterator.next()));
		}
	}

	private static void checkException(Object e) throws GeppettoVisitingException
	{

		if(e != null)
		{
			if(e instanceof GeppettoVisitingException)
			{
				throw (GeppettoVisitingException) e;
			}
		}
	}

	/**
	 * Visits all the passed objects plus their direct and indirect children
	 * @param objects
	 * @param visitor
	 * @throws GeppettoVisitingException
	 */
	public static void apply(EList<? extends EObject> objects, Switch<?> visitor) throws GeppettoVisitingException
	{
		Iterator<? extends EObject> iterator = objects.iterator();
		while(iterator.hasNext())
		{
			GeppettoModelTraversal.apply(iterator.next(), visitor);
		}
	}

	/**
	 * Visits the direct children of the passed object
	 * @param object
	 * @param visitor
	 * @throws GeppettoVisitingException
	 */
	public static void applyDirectChildrenOnly(EObject object, Switch<?> visitor) throws GeppettoVisitingException
	{
		Iterator<EObject> iterator = object.eContents().iterator();
		while(iterator.hasNext())
		{
			checkException(visitor.doSwitch(iterator.next()));
		}

	}

}
