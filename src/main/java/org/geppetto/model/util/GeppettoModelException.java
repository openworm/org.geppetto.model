
package org.geppetto.model.util;

/**
 * @author matteocantarelli
 *
 */
public class GeppettoModelException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GeppettoModelException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public GeppettoModelException(String message)
	{
		super(message);
	}

	public GeppettoModelException(Throwable cause)
	{
		super(cause);
	}

}
