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
package org.geppetto.model.test;

import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.util.GeppettoModelException;
import org.geppetto.model.util.PointerUtility;
import org.geppetto.model.values.Pointer;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author matteocantarelli
 *
 */
public class PointerUtilityTest
{
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private static GeppettoModel geppettoModel;

	@BeforeClass
	public static void setUp() throws Exception
	{
		// Initialize the factory and the resource set
		GeppettoPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl()); // sets the factory for the XMI type
		ResourceSet resSet = new ResourceSetImpl();

		// How to read
		Resource resource = resSet.createResource(URI.createURI("/GeppettoModelTest2.xmi"));
		resource.load(PointerUtilityTest.class.getResourceAsStream("/GeppettoModelTest2.xmi"),null);
		geppettoModel = (GeppettoModel) resource.getContents().get(0);
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointer() throws GeppettoModelException
	{
		// None of these should throw an exception
		PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		PointerUtility.getPointer(geppettoModel, "addressBook");
		PointerUtility.getPointer(geppettoModel, "addressBook[6]");
		PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[30].address(address).zone(zone)[4].area(genericParameter)");
		PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[4].area");
		PointerUtility.getPointer(geppettoModel, "sample.person.name");
				
	}
	
	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testEquals() throws GeppettoModelException
	{
		Pointer p1=PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		Pointer p2=PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		Assert.assertNotSame(p1, p2);
		Assert.assertEquals("addressBook(addressBook)[3].name(genericParameter)", p1.getInstancePath());
		Assert.assertEquals(p1.getInstancePath(), p2.getInstancePath());
		Assert.assertTrue(PointerUtility.equals(p1, p2));
		Pointer p3=PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3]");
		Assert.assertNotSame(p1, p3);
		Assert.assertFalse(PointerUtility.equals(p1, p3));
		Pointer p4=PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].address(address)");
		Assert.assertNotSame(p1, p3);
		Assert.assertFalse(PointerUtility.equals(p1, p4));
		Assert.assertFalse(PointerUtility.equals(p3, p4));
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative1() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook(addressBok)[3].name(genericParameter)");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative2() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addresBook");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative3() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook6]");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative4() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[30]address(address).zone(zone)[4].area(genericParameter)");

	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative5() throws GeppettoModelException
	{
		exception.expect(NumberFormatException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[].area");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative6() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[2].arrea");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getPointer(org.geppetto.model.GeppettoModel, java.lang.String)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetPointerNegative7() throws GeppettoModelException
	{
		exception.expect(GeppettoModelException.class);
		PointerUtility.getPointer(geppettoModel, "addressBook(addressBok)[3].");
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getVariable(org.geppetto.model.values.Pointer)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetVariable() throws GeppettoModelException
	{
		Pointer p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		Assert.assertEquals("name", PointerUtility.getVariable(p).getId());
		Assert.assertEquals("name", PointerUtility.getVariable(p).getName());
		Assert.assertEquals("genericParameter", PointerUtility.getVariable(p).getTypes().get(0).getId());
		p = PointerUtility.getPointer(geppettoModel, "addressBook");
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getId());
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getName());
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getTypes().get(0).getId());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[6]");
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getId());
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getName());
		Assert.assertEquals("addressBook", PointerUtility.getVariable(p).getTypes().get(0).getId());
		Assert.assertEquals((Integer)6, p.getElements().get(0).getIndex());
		p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[30].address(address).zone(zone)[4].area(genericParameter)");
		Assert.assertEquals("area", PointerUtility.getVariable(p).getId());
		Assert.assertEquals("area", PointerUtility.getVariable(p).getName());
		Assert.assertEquals("genericParameter", PointerUtility.getVariable(p).getTypes().get(0).getId());
		Assert.assertEquals((Integer)30, p.getElements().get(0).getIndex());
		Assert.assertEquals(new Integer(-1), p.getElements().get(1).getIndex());
		Assert.assertEquals((Integer)4, p.getElements().get(2).getIndex());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[4].area");
		Assert.assertEquals("area", PointerUtility.getVariable(p).getId());
		Assert.assertEquals("area", PointerUtility.getVariable(p).getName());
		Assert.assertEquals("genericParameter", PointerUtility.getVariable(p).getTypes().get(0).getId());
		Assert.assertEquals((Integer)30, p.getElements().get(0).getIndex());
		Assert.assertEquals(new Integer(-1), p.getElements().get(1).getIndex());
		Assert.assertEquals((Integer)4, p.getElements().get(2).getIndex());
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getType(org.geppetto.model.values.Pointer)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetType() throws GeppettoModelException
	{
		Pointer p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getId());
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getName());
		p = PointerUtility.getPointer(geppettoModel, "addressBook");
		Assert.assertEquals("addressBook", PointerUtility.getType(p).getId());
		Assert.assertEquals("addressBook", PointerUtility.getType(p).getName());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[6]");
		Assert.assertEquals("addressBook", PointerUtility.getType(p).getId());
		Assert.assertEquals("addressBook", PointerUtility.getType(p).getName());
		Assert.assertEquals((Integer)6, p.getElements().get(0).getIndex());
		p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[30].address(address).zone(zone)[4].area(genericParameter)");
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getId());
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getName());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[4].area");
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getId());
		Assert.assertEquals("genericParameter", PointerUtility.getType(p).getName());
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getGeppettoLibrary(org.geppetto.model.values.Pointer)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetGeppettoLibrary() throws GeppettoModelException
	{
		Pointer p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[3].name(genericParameter)");
		Assert.assertEquals("sample", PointerUtility.getGeppettoLibrary(p).getId());
		Assert.assertEquals("sample", PointerUtility.getGeppettoLibrary(p).getId());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[6]");
		Assert.assertEquals("sample", PointerUtility.getGeppettoLibrary(p).getId());
		p = PointerUtility.getPointer(geppettoModel, "addressBook(addressBook)[30].address(address).zone(zone)[4].area(genericParameter)");
		Assert.assertEquals("sample", PointerUtility.getGeppettoLibrary(p).getId());
		p = PointerUtility.getPointer(geppettoModel, "addressBook[30].address.zone[4].area");
		Assert.assertEquals("sample", PointerUtility.getGeppettoLibrary(p).getId());
	}

	/**
	 * Test method for {@link org.geppetto.model.util.PointerUtility#getInstancePath(org.geppetto.model.variables.Variable, org.geppetto.model.types.Type)}.
	 * 
	 * @throws GeppettoModelException
	 */
	@Test
	public void testGetInstancePath() throws GeppettoModelException
	{
		Pointer p = PointerUtility.getPointer(geppettoModel, "addressBook");
		Assert.assertEquals("addressBook(addressBook)", PointerUtility.getInstancePath(PointerUtility.getVariable(p), PointerUtility.getType(p)));
	}

}
