package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Angajat;
import clase.Companie;

public class TesteCompanie {

	public FileReader file;
	public BufferedReader reader;
	
	ArrayList<Angajat> lista;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		file = new FileReader("totalProiecte");
		reader = new BufferedReader(file);
	}

	@After
	public void tearDown() throws Exception {
		
		file.close();
		reader.close();
	}
	
	

	@Test
	public void testConstructorValoriEgale(){
		
		
		Companie c= new Companie("AseSoft", "IT", "Str Bicaz");
		assertEquals("AseSoft", c.getDenumire());
		assertEquals("IT", c.getDomeniu());
		assertEquals("Str Bicaz", c.getAdresa());
		
		
	}
	
	@Test
	public void testConstructorValoriNule(){
		Companie c = new Companie(null);
		assertEquals(null, c.getDenumire());
		assertEquals(null, c.getDomeniu());
		assertEquals(null, c.getAdresa());
		
		
	}
	
	@Test
	public void testConstructorEmpty(){
		
		Companie c = new Companie("","","");
		assertEquals("", c.getDenumire());
		assertEquals("", c.getDomeniu());
		assertEquals("", c.getAdresa());
		
		
		
	}
	
	@Test
	public void testTotalProiecteAnualFisier() throws IOException{
		
		Companie c = new Companie("Asesoft", "IT", "Strada Bicaz");
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String linie = null;
		while((linie = reader.readLine())!=null && linie.length()>0){
			
			lista.add(Integer.parseInt(linie.split(" ")[0]));
			
		}
				
		assertEquals(138, c.determinaTotalulProiectelorAnual(lista));
	}
	
	@Test
	public void testMedieAnualaProiecteFisier() throws IOException{
		
		Companie c = new Companie("Asesoft", "IT", "Strada Bicaz");
		ArrayList<Double> lista = new ArrayList<Double>();
		
		String linie = null;
		while((linie = reader.readLine())!=null && linie.length()>0){
			
			lista.add(Double.parseDouble(linie.split(" ")[0]));
			
			
		}
		
		assertEquals(1, Double.compare(11.5, c.determinaMediaAnualaProiectelor(lista)));
		
		
		
		
	}
}
