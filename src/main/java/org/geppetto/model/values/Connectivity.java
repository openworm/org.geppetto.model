/**
 */
package org.geppetto.model.values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connectivity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.values.ValuesPackage#getConnectivity()
 * @model
 * @generated
 */
public enum Connectivity implements Enumerator
{
	/**
	 * The '<em><b>DIRECTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTIONAL(0, "DIRECTIONAL", "DIRECTIONAL"),

	/**
	 * The '<em><b>BIDIRECTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIDIRECTIONAL(1, "BIDIRECTIONAL", "BIDIRECTIONAL"),

	/**
	 * The '<em><b>NON DIRECTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DIRECTIONAL(2, "NON_DIRECTIONAL", "NON_DIRECTIONAL");

	/**
	 * The '<em><b>DIRECTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIRECTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTIONAL_VALUE = 0;

	/**
	 * The '<em><b>BIDIRECTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIDIRECTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIDIRECTIONAL_VALUE = 1;

	/**
	 * The '<em><b>NON DIRECTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON DIRECTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_DIRECTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_DIRECTIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Connectivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Connectivity[] VALUES_ARRAY =
		new Connectivity[]
		{
			DIRECTIONAL,
			BIDIRECTIONAL,
			NON_DIRECTIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Connectivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Connectivity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connectivity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Connectivity get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Connectivity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connectivity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Connectivity getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Connectivity result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connectivity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Connectivity get(int value)
	{
		switch (value)
		{
			case DIRECTIONAL_VALUE: return DIRECTIONAL;
			case BIDIRECTIONAL_VALUE: return BIDIRECTIONAL;
			case NON_DIRECTIONAL_VALUE: return NON_DIRECTIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Connectivity(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //Connectivity
