
package org.geppetto.model.values.util;

import org.geppetto.model.values.PhysicalQuantity;
import org.geppetto.model.values.TimeSeries;
import org.geppetto.model.values.Unit;
import org.geppetto.model.values.Value;

/**
 * @author matteocantarelli
 *
 */
public class ValuesUtility
{

	/**
	 * @param value
	 * @return
	 */
	public static Unit getUnit(Value value)
	{
		if(value instanceof PhysicalQuantity)
		{
			return ((PhysicalQuantity) value).getUnit();
		}
		else if(value instanceof TimeSeries)
		{
			return ((TimeSeries) value).getUnit();
		}
		return null;
	}

}
