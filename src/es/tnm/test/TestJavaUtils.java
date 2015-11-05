package es.tnm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import es.tnm.util.Dni;
import es.tnm.util.Ficheros;
import es.tnm.util.Threads;

public class TestJavaUtils {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testThreads() {
		Threads.testThreads();
		Threads.ContarThread contar = new Threads.ContarThread(10);
		contar.run();
	}
	
	@Ignore
	@Test
	public void testFicheros() {
		Ficheros.listarDirectorio("C:\\");
	}
	
	@Ignore
	@Test
	public void testDNI() {
		char letra = Dni.calculaLetra(46649996);
		Assert.assertTrue(letra == 'Q');
	}
}