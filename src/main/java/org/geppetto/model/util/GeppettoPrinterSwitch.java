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
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.types.ImportType;
import org.geppetto.model.types.Type;
import org.geppetto.model.types.util.TypesSwitch;
import org.geppetto.model.variables.Variable;
import org.geppetto.model.variables.util.VariablesSwitch;

/**
 * @author matteocantarelli
 *
 */
public class GeppettoPrinterSwitch extends ComposedSwitch<Object>
{

	class GTypesSwitch extends TypesSwitch<Object>
	{

		@Override
		public Object caseType(Type object)
		{
			if(object.getSuperType() == null)
			{
				System.out.println("Type: " + object.getName());
			}

			else
			{
				System.out.println("Type: " + object.getName() + " extends: " + object.getSuperType().getName());
			}
			return super.caseType(object);
		}

		@Override
		public Object caseImportType(ImportType object)
		{
			System.out.println("Type: " + object.getName());
			System.out.println(object.getModelInterpreterId());
			System.out.println(object.getUrl());
			return object;
		}

	}

	class GGeppettoSwitch extends GeppettoSwitch<Object>
	{

		@Override
		public Object caseGeppettoLibrary(GeppettoLibrary object)
		{
			System.out.println("Library: " + object.getName());
			return object;
		}

		@Override
		public Object caseGeppettoModel(GeppettoModel object)
		{
			System.out.println("ROOT");
			return object;
		}

	}

	
	class GVariablesSwitch extends VariablesSwitch<Object>
	{

		@Override
		public Object caseVariable(Variable object)
		{
			System.out.println("Variable: " + object.getName() + " Type: " + object.getTypes().get(0).getName());
			return object;
		}

	}

	public GeppettoPrinterSwitch()
	{
		super();
		super.addSwitch(new GGeppettoSwitch());
		super.addSwitch(new GTypesSwitch());
		super.addSwitch(new GVariablesSwitch());
		// super.addSwitch(new GValuesSwitch());
	}

}
