/*******************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2011 - 2015 OpenWorm.
 * http://openworm.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MIT License
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/MIT
 *
 * Contributors:
 *     	OpenWorm - http://openworm.org/people.html
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
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
