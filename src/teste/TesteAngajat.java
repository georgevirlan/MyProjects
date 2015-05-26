package teste;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Angajat;
import clase.Companie;

public class TesteAngajat {

	ArrayList<Double> oreLucru;

	Angajat angajat;

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
	public void testConstructorEmptyList() {

		oreLucru = new ArrayList<Double>();

		angajat = new Angajat(oreLucru);
		assertEquals(oreLucru, angajat.getOreLucruLuna());

	}

	@Test
	public void testConstructorValoriNule() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(0.0);
		angajat = new Angajat(oreLucru);
		assertEquals(oreLucru, angajat.getOreLucruLuna());

	}

	@Test
	public void testConstructorValoriPozitive() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(4.0);
		oreLucru.add(8.0);
		oreLucru.add(8.0);
		angajat = new Angajat(oreLucru);
		assertEquals(oreLucru, angajat.getOreLucruLuna());

	}

	@Test
	public void testConstructorValoriExtreme() {

		oreLucru = null;

		try {

			angajat = new Angajat(null);

		} catch (Exception ex) {

			System.out.println(ex.getMessage());

		}

	}

	@Test
	public void testConstructorValoriNegative() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(-4.0);
		oreLucru.add(-5.0);
		oreLucru.add(-3.0);
		angajat = new Angajat(oreLucru);
		assertEquals(oreLucru, angajat.getOreLucruLuna());

	}

	@Test
	public void testTotalOreLucrateSaptamana() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(8.0);
		oreLucru.add(9.0);
		oreLucru.add(8.0);
		oreLucru.add(8.0);
		oreLucru.add(9.0);

		angajat = new Angajat(oreLucru);
		assertEquals(0, Double.compare(42.0, angajat.totalOreLucrare()));

	}

	@Test
	public void testTotalOreLucrateSaptamana_ValoriNule() {

		oreLucru = new ArrayList<Double>();
		angajat = new Angajat(oreLucru);
		oreLucru.add(0.0);
		oreLucru.add(0.0);
		oreLucru.add(0.0);
		oreLucru.add(0.0);
		oreLucru.add(0.0);
		assertEquals(0, Double.compare(0.0, angajat.totalOreLucrare()));

	}

	@Test
	public void testMinimOreLucrateSaptamana() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(7.0);
		oreLucru.add(4.0);
		oreLucru.add(5.0);
		oreLucru.add(8.0);
		oreLucru.add(8.0);
		angajat = new Angajat(oreLucru);
		assertEquals(0, Double.compare(4.0, angajat.minimOreLucrareSaptamana()));

	}
	

	@Test
	public void testMaximOreLucrateSaptamana() {

		oreLucru = new ArrayList<Double>();
		oreLucru.add(6.0);
		oreLucru.add(4.0);
		oreLucru.add(5.0);
		oreLucru.add(8.0);
		oreLucru.add(9.0);
		angajat = new Angajat(oreLucru);
		assertEquals(0, Double.compare(9.0, angajat.maximOreLucrateSaptamana()));

	}

	@Test
	public void testAflaSexAngajat() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals("M", angajat.aflaSexulAngajatului());

	}

	@Test
	public void testAflaVarsta() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(26, angajat.aflaVarstaAngajat());

	}

	@Test
	public void testValidareCNP() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals("1890131394428", angajat.getCNP());
	}

	@Test
	public void testValidareLitera1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareLiteraNume(angajat.getNume()));

	}

	@Test
	public void testValidareLitera2() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareLiteraPrenume(angajat.getPrenume()));

	}

	@Test
	public void testValidareCifraCNP() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareCifraCNP(angajat.getCNP()));

	}

	@Test
	public void testValidareCompanie() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareLiteraCifraCompanie(angajat.getCompanie()));

	}

	@Test
	public void testValidareEmail() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareEmail(angajat.getEmail()));

	}

	@Test
	public void testValidareLimiteSalariu() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareSalariu(angajat.getSalariu()));

	}

	@Test
	public void testValidareCNP1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareCNP1(angajat.getCNP()));

	}

	@Test
	public void testValidareNume1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareNume1(angajat.getNume()));

	}

	@Test
	public void testValidarePrenume1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidarePrenume1(angajat.getPrenume()));

	}

	@Test
	public void testValidareCompanie1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareCompanie1(angajat.getCompanie()));

	}
	
	@Test
	public void testValidareEmail1() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		assertEquals(true, angajat.ValidareEmailGol(angajat.getEmail()));

	}
	
	@Test
	public void testValidareComision() {

		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		angajat.setComision(0.4);
		assertEquals(true, angajat.ValidareComision(angajat.getComision()));

	}
	
	
	
	
	@Test
	public void testSumaOrePare() {

		oreLucru = new ArrayList<Double>();
		angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");
		oreLucru.add(4.0);
		oreLucru.add(5.0);
		oreLucru.add(6.0);
		oreLucru.add(4.0);
		oreLucru.add(7.0);
		oreLucru.add(9.0);
		oreLucru.add(2.0);

		double suma = angajat.SumaOrePare();
		assertEquals(1, Double.compare(16.0, suma));

	}

	@Test
	public void testNumeFileReader() throws IOException {

		ArrayList<String> numeAngajati = new ArrayList<String>();
		Angajat angajat = new Angajat("Stancu", "Ionel", "189134531394428");
		numeAngajati.add("Virlan");
		numeAngajati.add("Marin");
		numeAngajati.add("Stancu");
		assertEquals("Stancu", angajat.getNumeAngajat());

	}

}
