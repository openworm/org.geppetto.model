
package org.geppetto.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.geppetto.model.GeppettoLibrary;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.datasources.DataSource;
import org.geppetto.model.datasources.Query;
import org.geppetto.model.types.Type;
import org.geppetto.model.variables.Variable;

/**
 * @author matteocantarelli
 *
 */
public class ModelUtility
{

	public static List<Type> getAllTypesOf(Variable variable)
	{
		List<Type> allTypes = new ArrayList<Type>();
		allTypes.addAll(variable.getTypes());
		allTypes.addAll(variable.getAnonymousTypes());
		return allTypes;
	}

	/**
	 * @param typeId
	 * @param targetLibrary
	 * @return
	 */
	public static Type getTypeFromLibrary(String typeId, GeppettoLibrary targetLibrary)
	{
		for(Type type : targetLibrary.getTypes())
		{
			if(type.getId().equals(typeId))
			{
				return type;
			}
		}
		return null;
	}

	/**
	 * @param queryPath
	 * @param geppettoModel
	 * @return
	 */
	public static Query getQuery(String queryPath, GeppettoModel geppettoModel)
	{
		StringTokenizer st = new StringTokenizer(queryPath, ".");
		DataSource dataSource = null;
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			if(dataSource == null)
			{
				for(Query q : geppettoModel.getQueries())
				{
					if(q.getId().equals(token))
					{
						return q;
					}
				}
				for(DataSource ds : geppettoModel.getDataSources())
				{
					if(ds.getId().equals(token))
					{
						dataSource = ds;
						break;
					}
				}
				if(dataSource == null)
				{
					return null;
				}
			}
			else
			{
				for(Query q : dataSource.getQueries())
				{
					if(q.getId().equals(token))
					{
						return q;
					}
				}
				return null;
			}
		}
		return null;
	}
}
