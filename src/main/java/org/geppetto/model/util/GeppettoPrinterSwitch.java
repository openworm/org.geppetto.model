
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
				String types = "";
				for(Type type : object.getSuperType())
				{
					types += type.getName() + ";";
				}
				System.out.println("Type: " + object.getName() + " extends: " + types);
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
