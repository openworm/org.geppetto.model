package org.geppetto.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EMap;
import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.types.ArrayType;
import org.geppetto.model.types.CompositeType;
import org.geppetto.model.types.Type;
import org.geppetto.model.values.ImportValue;
import org.geppetto.model.values.Pointer;
import org.geppetto.model.values.PointerElement;
import org.geppetto.model.values.Value;
import org.geppetto.model.values.ValuesFactory;
import org.geppetto.model.values.VisualReference;
import org.geppetto.model.variables.Variable;

public class PointerUtility
{

	/**
	 * @param variable
	 * @param type
	 * @param index
	 * @return
	 */
	public static Pointer getPointer(Variable variable, Type type, Integer index)
	{
		Pointer pointer = ValuesFactory.eINSTANCE.createPointer();

		PointerElement pointerElement = ValuesFactory.eINSTANCE.createPointerElement();
		pointerElement.setIndex(index);
		pointerElement.setVariable(variable);
		pointerElement.setType(type);

		pointer.getElements().add(pointerElement);
		return pointer;
	}

	/**
	 * @param model
	 * @param instancePath
	 * @return
	 */
	/**
	 * @param model
	 * @param instancePath
	 * @return
	 * @throws GeppettoModelException
	 */
	public static Pointer getPointer(GeppettoModel model, String instancePath) throws GeppettoModelException
	{
		Pointer pointer = ValuesFactory.eINSTANCE.createPointer();
		StringTokenizer st = new StringTokenizer(instancePath, ".");
		Type lastType = null;
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			PointerElement element = ValuesFactory.eINSTANCE.createPointerElement();
			Variable v = null;
			if(lastType == null)
			{
				v = findVariable(getVariable(token), model); // why ? fo
			}
			else
			{
				if(lastType instanceof CompositeType)
				{
					v = findVariable(getVariable(token), (CompositeType) lastType);
				}
				else
				{
					if(lastType instanceof ArrayType && ((ArrayType) lastType).getArrayType() instanceof CompositeType)
					{
						v = findVariable(getVariable(token), (CompositeType) ((ArrayType) lastType).getArrayType());
					}
					else
					{
						throw new GeppettoModelException(lastType.getId() + " is not of type CompositeType there can't be nested variables");
					}
				}
			}

			lastType = findType(getType(token), v);
			element.setVariable(v);
			element.setType(lastType);
			if(element.getType() instanceof ArrayType)
			{
				Integer index = getIndex(token);
				if(index != null)
				{
					element.setIndex(getIndex(token));
				}
			}
			pointer.getElements().add(element);
		}
		return pointer;
	}

	/**
	 * @param model
	 * @param instancePath
	 * @return
	 */
	/**
	 * @param model
	 * @param instancePath
	 * @return
	 * @throws GeppettoModelException
	 */
	public static Type getType(GeppettoModel model, String path) throws GeppettoModelException
	{
		StringTokenizer st = new StringTokenizer(path, ".");
		Type lastType = null;
		Variable lastVar = null;
		GeppettoLibrary library = null;
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			// token can be a library, a type or a variable

			if(lastType != null)
			{
				if(lastType instanceof CompositeType)
				{
					lastVar = findVariable(getVariable(token), (CompositeType) lastType);
				}
				else
				{
					if(lastType instanceof ArrayType && ((ArrayType) lastType).getArrayType() instanceof CompositeType)
					{
						lastVar = findVariable(getVariable(token), (CompositeType) ((ArrayType) lastType).getArrayType());
					}
					else
					{
						throw new GeppettoModelException(lastType.getId() + " is not of type CompositeType there can't be nested variables");
					}
				}
			}
			else if(lastVar != null)
			{
				lastType = findType(getType(token), lastVar);
			}
			else if(library != null)
			{
				lastType = findType(token, library);
			}
			else
			{
				// they are all null
				library = findLibrary(model, token);
				if(library == null)
				{
					throw new GeppettoModelException("Can't find a type for the path " + path);
				}
			}

		}
		if(lastType != null && lastType.getPath().equals(path))
		{
			return lastType;
		}
		else
		{
			throw new GeppettoModelException("Couldn't find a type for the path " + path);
		}
	}

	public static Value getValue(GeppettoModel model, String path, Type stateVariablType) throws GeppettoModelException
	{
		StringTokenizer st = new StringTokenizer(path, ".");
		Type lastType = null;
		Variable lastVar = null;
		GeppettoLibrary library = null;
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			// token can be a library, a type or a variable

			if(lastType != null)
			{
				if(lastType instanceof CompositeType)
				{
					lastVar = findVariable(getVariable(token), (CompositeType) lastType);
					lastType = null;
				}
				else
				{
					if(lastType instanceof ArrayType && ((ArrayType) lastType).getArrayType() instanceof CompositeType)
					{
						lastVar = findVariable(getVariable(token), (CompositeType) ((ArrayType) lastType).getArrayType());
					}
					else
					{
						throw new GeppettoModelException(lastType.getId() + " is not of type CompositeType there can't be nested variables");
					}
				}
			}
			else if(lastVar != null)
			{
				lastType = findType(getType(token), lastVar);
			}
			else if(library != null)
			{
				lastType = findType(token, library);
			}
			else
			{
				// they are all null
				library = findLibrary(model, token);
				if(library == null)
				{
					throw new GeppettoModelException("Can't find a value for the path " + path);
				}
			}

		}

		if(lastType != null && lastType.getPath().equals(path) )
		{
			return lastType.getDefaultValue();
		}else if(lastVar != null){
			return (Value) lastVar.getInitialValues().get(stateVariablType);
		}
		else
		{
			throw new GeppettoModelException("Couldn't find a value for the path " + path);
		}		
	}
	/**
	 * @param typeId
	 * @param library
	 * @return
	 */
	private static Type findType(String typeId, GeppettoLibrary library)
	{
		for(Type type : library.getTypes())
		{
			if(type.getId().equals(typeId))
			{
				return type;
			}
		}
		return null;
	}

	/**
	 * @param model
	 * @param libraryId
	 * @return
	 * @throws GeppettoModelException
	 */
	private static GeppettoLibrary findLibrary(GeppettoModel model, String libraryId)
	{
		for(GeppettoLibrary library : model.getLibraries())
		{
			if(library.getId().equals(libraryId))
			{
				return library;
			}
		}
		return null;
	}

	/**
	 * @param pointer
	 * @param pointer2
	 * @return true if the two pointers point to the same variables and types
	 */
	public static boolean equals(Pointer pointer, Pointer pointer2)
	{
		if(!pointer.equals(pointer2))
		{
			if(pointer.getElements().size() != pointer2.getElements().size())
			{
				return false;
			}
			for(PointerElement pe : pointer.getElements())
			{
				PointerElement pe2 = pointer2.getElements().get(pointer.getElements().indexOf(pe));
				if(pe2 == null || !equals(pe, pe2))
				{
					return false;
				}
			}
		}
		return true;
	}

	
	/**
	 * @param geppettoModel
	 * @param path
	 * @return
	 */
	public static ImportValue getValue(GeppettoModel geppettoModel, String path)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @param pointer
	 * @param pointer2
	 * @return
	 */
	public static boolean equals(PointerElement pointer, PointerElement pointer2)
	{
		return pointer.getType().equals(pointer2.getType()) && pointer.getVariable().equals(pointer2.getVariable()) && (pointer.getIndex() == pointer2.getIndex());
	}

	/**
	 * @param pointer
	 * @return
	 */
	public static Variable getVariable(Pointer pointer)
	{
		return pointer.getElements().get(pointer.getElements().size() - 1).getVariable();
	}

	/**
	 * @param pointer
	 * @return
	 */
	public static Type getType(Pointer pointer)
	{
		return pointer.getElements().get(pointer.getElements().size() - 1).getType();
	}

	/**
	 * @param pointer
	 * @return the library to which the type pointed by a given pointer belongs to
	 */
	public static GeppettoLibrary getGeppettoLibrary(Pointer pointer)
	{
		Type type = getType(pointer);
		// In case it's an anonymous type it won't be contained inside a library
		while(!(type.eContainer() instanceof GeppettoLibrary))
		{
			type = (Type) type.eContainer().eContainer();
		}
		// if it's the common library we move up until we find the type that contains it
		if(((GeppettoLibrary) type.eContainer()).getId().equals("common"))
		{
			Variable var = getVariable(pointer);
			type = (Type) var.eContainer();
			while(!(type.eContainer() instanceof GeppettoLibrary))
			{
				type = (Type) type.eContainer().eContainer();
			}
		}
		return (GeppettoLibrary) type.eContainer();
	}

	/**
	 * @param variable
	 * @param type
	 * @return
	 */
	public static String getInstancePath(Variable variable, Type type)
	{
		return variable.getId() + "(" + type.getId() + ")";
	}

	/**
	 * @param type
	 * @return
	 */
	private static Type findType(String type, Variable variable) throws GeppettoModelException
	{
		if(type == null)
		{
			List<Type> types = new ArrayList<Type>();
			types.addAll(variable.getAnonymousTypes());
			types.addAll(variable.getTypes());
			if(types.size() == 1)
			{
				return types.get(0);
			}
			else if(types.size() == 0)
			{
				throw new GeppettoModelException("The variable " + variable.getId() + " has not types");
			}
			else
			{
				throw new GeppettoModelException("The instance path does not specify a type but more than one type are present for the variable " + variable.getId());
			}
		}
		else
		{
			for(Type t : variable.getTypes())
			{
				if(t.getId().equals(type))
				{
					return t;
				}
			}
			for(Type t : variable.getAnonymousTypes())
			{
				if(t.getId().equals(type))
				{
					return t;
				}
			}

			throw new GeppettoModelException("The type " + type + " was not found in the variable " + variable.getId());
		}
	}

	/**
	 * @param variable
	 * @return
	 */
	private static Variable findVariable(String variable, GeppettoModel model) throws GeppettoModelException
	{
		for(Variable v : model.getVariables())
		{
			if(v.getId().equals(variable))
			{
				return v;
			}
		}
		throw new GeppettoModelException("The variable " + variable + " was not found in the Geppetto model");
	}

	/**
	 * @param variable
	 * @return
	 */
	private static Variable findVariable(String variable, CompositeType type) throws GeppettoModelException
	{
		for(Variable v : type.getVariables())
		{
			if(v.getId().equals(variable))
			{
				return v;
			}
		}
		throw new GeppettoModelException("The variable " + variable + " was not found in the type " + type.getId());
	}

	/**
	 * @param token
	 * @return
	 */
	public static String getType(String token)
	{
		if(token.contains("("))
		{
			return token.substring(token.indexOf("(") + 1, token.indexOf(")"));
		}
		else
		{
			return null;
		}
	}

	/**
	 * @param token
	 * @return
	 */
	public static String getVariable(String token)
	{
		if(token.contains("("))
		{
			return token.substring(0, token.indexOf("("));
		}
		else if(token.contains("["))
		{
			return token.substring(0, token.indexOf("["));
		}
		else
		{
			return token;
		}
	}

	/**
	 * @param token
	 * @return
	 */
	public static Integer getIndex(String token)
	{
		if(token.contains("["))
		{
			return Integer.parseInt(token.substring(token.indexOf("[") + 1, token.indexOf("]")));
		}
		else
		{
			return null;
		}
	}

	/**
	 * @param path
	 * @return
	 */
	public static String getPathWithoutTypes(String path)
	{
		return path.replaceAll("\\([^)]*\\)", "");
	}



}
