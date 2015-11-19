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

import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.geppetto.model.Root;
import org.geppetto.model.aspect.Aspect;
import org.geppetto.model.aspect.util.AspectSwitch;
import org.geppetto.model.types.ImportType;
import org.geppetto.model.types.Type;
import org.geppetto.model.types.util.TypesSwitch;
import org.geppetto.model.variables.Variable;
import org.geppetto.model.variables.util.VariablesSwitch;

/**
 * @author matteocantarelli
 *
 */
public class GeppettoPrinterSwitch<T> extends ComposedSwitch<T>
{

	class GTypesSwitch<G> extends TypesSwitch<G>
	{

		@Override
		public G caseType(Type object)
		{
			if(object.getSuperType() == null)
			{
				System.out.println("Type: " + object.getName());
			}

			else
			{
				System.out.println("Type: " + object.getName() + " extends " + object.getSuperType().getName());
			}
			return super.caseType(object);
		}

		@Override
		public G caseImportType(ImportType object)
		{
			System.out.println("Type: " + object.getName());
			System.out.println(object.getModelInterpreterId());
			System.out.println(object.getUrl());
			return super.caseImportType(object);
		}

	}

	class GGeppettoSwitch<G> extends GeppettoSwitch<G>
	{

		@Override
		public G caseRoot(Root object)
		{
			System.out.println("ROOT");
			return super.caseRoot(object);
		}

	}

	class GAspectSwitch<G> extends AspectSwitch<G>
	{

		@Override
		public G caseAspect(Aspect object)
		{
			System.out.println("Aspect: " + object.getName());
			return super.caseAspect(object);
		}

	}

	class GVariablesSwitch<G> extends VariablesSwitch<G>
	{

		@Override
		public G caseVariable(Variable object)
		{
			System.out.println("Variable: " + object.getName() + " Type: " + object.getTypes().get(0).getName());
			return super.caseVariable(object);
		}

	}

	public GeppettoPrinterSwitch()
	{
		super();
		super.addSwitch(new GGeppettoSwitch<T>());
		super.addSwitch(new GAspectSwitch<T>());
		super.addSwitch(new GTypesSwitch<T>());
		super.addSwitch(new GVariablesSwitch<T>());
		// super.addSwitch(new GValuesSwitch<T>());
	}

}
