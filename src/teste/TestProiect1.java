package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Angajat;
import clase.Proiecte;

public class TestProiect1 {

	Proiecte proiect = null;
	ArrayList<Double> listaOreLucrateA1;
	ArrayList<Double> listaOreLucrateA2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		

		proiect = new Proiecte();
		Angajat angajat = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");;
		listaOreLucrateA1 = new ArrayList<Double>();
		listaOreLucrateA1.add(4.0);
		listaOreLucrateA1.add(9.0);
		listaOreLucrateA1.add(4.0);
		listaOreLucrateA1.add(8.0);
		listaOreLucrateA1.add(6.0);
		 angajat = new Angajat(listaOreLucrateA1);

		 Angajat angajata = new Angajat("Virlan", "George", "1890131394428", "georgevirlan@yahoo.com", 1200.0, "AseSoft");;

		 listaOreLucrateA2 = new ArrayList<Double>();
		 listaOreLucrateA2.add(4.0);
		 listaOreLucrateA2.add(6.0);
		 listaOreLucrateA2.add(6.0);
		 listaOreLucrateA2.add(6.0);
		 listaOreLucrateA2.add(9.0);
		 angajata = new Angajat(listaOreLucrateA2);

		 proiect.setAngajat(angajat);
		 proiect.setAngajata(angajata);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testNoteMembriiEchipeProiect() {
		assertTrue(proiect.verificareOreLucru());
	}

	

}
