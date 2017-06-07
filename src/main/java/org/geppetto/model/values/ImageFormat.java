/**
 */
package org.geppetto.model.values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.geppetto.model.values.ValuesPackage#getImageFormat()
 * @model
 * @generated
 */
public enum ImageFormat implements Enumerator
{
	/**
	 * The '<em><b>PNG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNG_VALUE
	 * @generated
	 * @ordered
	 */
	PNG(0, "PNG", "PNG"),

	/**
	 * The '<em><b>JPEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	JPEG(1, "JPEG", "JPEG"), /**
	 * The '<em><b>IIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IIP_VALUE
	 * @generated
	 * @ordered
	 */
	IIP(2, "IIP", "IIP"), /**
	 * The '<em><b>DCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCM_VALUE
	 * @generated
	 * @ordered
	 */
	DCM(3, "DCM", "DCM"), /**
	 * The '<em><b>NIFTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIFTI_VALUE
	 * @generated
	 * @ordered
	 */
	NIFTI(4, "NIFTI", "NIFTI"), /**
	 * The '<em><b>TIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIFF_VALUE
	 * @generated
	 * @ordered
	 */
	TIFF(5, "TIFF", "TIFF"), /**
	 * The '<em><b>DZI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DZI_VALUE
	 * @generated
	 * @ordered
	 */
	DZI(6, "DZI", "DZI"),
	/**
	 * The '<em><b>GOOGLE MAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_MAP(7, "GOOGLE_MAP", "GOOGLE_MAP");

	/**
	 * The '<em><b>PNG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PNG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PNG_VALUE = 0;

	/**
	 * The '<em><b>JPEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPEG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPEG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPEG_VALUE = 1;

	/**
	 * The '<em><b>IIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IIP_VALUE = 2;

	/**
	 * The '<em><b>DCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DCM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DCM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DCM_VALUE = 3;

	/**
	 * The '<em><b>NIFTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NIFTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NIFTI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIFTI_VALUE = 4;

	/**
	 * The '<em><b>TIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIFF_VALUE = 5;

	/**
	 * The '<em><b>DZI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DZI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DZI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DZI_VALUE = 6;

	/**
	 * The '<em><b>GOOGLE MAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOOGLE MAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_MAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_MAP_VALUE = 7;

	/**
	 * An array of all the '<em><b>Image Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageFormat[] VALUES_ARRAY =
		new ImageFormat[]
		{
			PNG,
			JPEG,
			IIP,
			DCM,
			NIFTI,
			TIFF,
			DZI,
			GOOGLE_MAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Image Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ImageFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			ImageFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageFormat get(int value)
	{
		switch (value)
		{
			case PNG_VALUE: return PNG;
			case JPEG_VALUE: return JPEG;
			case IIP_VALUE: return IIP;
			case DCM_VALUE: return DCM;
			case NIFTI_VALUE: return NIFTI;
			case TIFF_VALUE: return TIFF;
			case DZI_VALUE: return DZI;
			case GOOGLE_MAP_VALUE: return GOOGLE_MAP;
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
	private ImageFormat(int value, String name, String literal)
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
	
} //ImageFormat
