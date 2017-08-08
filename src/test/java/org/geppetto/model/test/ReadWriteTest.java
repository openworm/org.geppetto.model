
package org.geppetto.model.test;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.geppetto.model.GeppettoModel;
import org.geppetto.model.GeppettoPackage;
import org.geppetto.model.util.GeppettoModelTraversal;
import org.geppetto.model.util.GeppettoPrinterSwitch;
import org.junit.Before;
import org.junit.Test;

/**
 * @author matteocantarelli
 *
 */
public class ReadWriteTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testReadWrite() throws Exception
	{
		// Initialize the factory and the resource set
		GeppettoPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl()); // sets the factory for the XMI type
		ResourceSet resSet = new ResourceSetImpl();

		// How to read
		Resource resource = resSet.createResource(URI.createURI("/GeppettoModelTest.xmi"));
		resource.load(ReadWriteTest.class.getResourceAsStream("/GeppettoModelTest.xmi"),null);
		GeppettoModel geppettoModel = (GeppettoModel) resource.getContents().get(0);

		// How to visit
		GeppettoPrinterSwitch visitor = new GeppettoPrinterSwitch();
		//Includes root
		// TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singleton(geppettoModel));
		// while(iterator.hasNext())
		// {
		// visitor.doSwitch(iterator.next());
		// }

		//Excludes root
		GeppettoModelTraversal.apply(geppettoModel, visitor);

		// for (Iterator iter = EcoreUtil.getAllContents(Collections.singleton(geppettoModel)); iter.hasNext(); )
		// {
		// EObject eObject = (EObject)iter.next();
		// visitor.doSwitch(eObject);
		// }


	}

}
