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
import es.tnm.util.OperMatematicas;
import es.tnm.util.StrUtil;
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
	public void testStrUtil() {
		StrUtil strUtil = new StrUtil();
		Assert.assertFalse(strUtil.esVersionCorrecta("5.5555.1", "5.5555"));
		Assert.assertTrue(strUtil.esVersionCorrecta("1.1.2.2.3.1", "1.12.2"));
		Assert.assertTrue(strUtil.esVersionCorrecta("1.1.1", "2.2"));
		Assert.assertFalse(strUtil.esVersionCorrecta("3.2.1", "3.2"));
		Assert.assertTrue(strUtil.esVersionCorrecta("1", "1.2"));
		Assert.assertFalse(strUtil.esVersionCorrecta("1.2", "1"));
		Assert.assertTrue(strUtil.esVersionCorrecta("1", "1"));
		Assert.assertFalse(strUtil.esVersionCorrecta("2", "1"));
		Assert.assertTrue(strUtil.esVersionCorrecta("1.1.1", "1.1.1"));
		Assert.assertTrue(strUtil.esVersionCorrecta("2.2.2", "3.2.2"));
		Assert.assertTrue(strUtil.esVersionCorrecta("2.2.2", "2.2.3"));
		Assert.assertFalse(strUtil.esVersionCorrecta("2.2.3", "2.2.2"));
	}	
	
	@Ignore
	@Test
	public void testThreads() {
		Threads.testThreads();
		Threads.ContarThread contar = new Threads.ContarThread(10);
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
	
	@Ignore
	@Test
	public void testOper() {
		OperMatematicas oper = new OperMatematicas();
		float result = oper.miFormula(3, 7);
		Assert.assertTrue(result == new Float(4.714286));
	}
	
}
