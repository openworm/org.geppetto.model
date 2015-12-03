package org.geppetto.model.util;

import java.util.StringTokenizer;

import org.geppetto.model.GeppettoModel;
import org.geppetto.model.types.ArrayType;
import org.geppetto.model.types.Type;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.PointerElement;
import org.geppetto.model.values.ValuesFactory;
import org.geppetto.model.variables.ArrayVariable;
import org.geppetto.model.variables.Variable;

public class PointerUtility
{

	/**
	 * @param model
	 * @param instancePath
	 * @return
	 */
	public static Pointer getPointer(GeppettoModel model, String instancePath)
	{
		Pointer pointer = ValuesFactory.eINSTANCE.createPointer();
		StringTokenizer st = new StringTokenizer(instancePath, ".");
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			PointerElement element = ValuesFactory.eINSTANCE.createPointerElement();
			element.setVariable(findVariable(getVariable(token)));
			element.setType(findType(getType(token)));
			if((element.getVariable() instanceof ArrayVariable))
			{
				//element.set
				
			}
			else if( element.getType() instanceof ArrayType)
			{
				
			}
			pointer.getElements().add(element);
		}
		return pointer;
	}

	private static Type findType(Object type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static Variable findVariable(Object variable)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static String getType(String token)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private static String getVariable(String token)
	{
		return token.substring(0, token.indexOf("("));
	}
	
	private static String getIndex(String token)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param variable
	 * @param type
	 * @return
	 */
	public static String getInstancePath(Variable variable, Type type)
	{
		return variable.getId()+"("+type.getId()+")";
	}
}
