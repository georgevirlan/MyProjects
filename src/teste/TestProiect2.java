package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import clase.Angajat;
import clase.Proiecte;

public class TestProiect2 {

	Proiecte proiect = null;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		Angajat angajat = mock(Angajat.class);
		Angajat angajata = mock(Angajat.class);
		proiect = new Proiecte();

		when(angajata.maximOreLucrateSaptamana()).thenAnswer(new Answer<Double>() {

			public Double answer(InvocationOnMock invocation) throws Throwable {
				return 9.0;
			}
		});
		when(angajat.maximOreLucrateSaptamana()).thenAnswer(new Answer<Double>() {

			public Double answer(InvocationOnMock invocation) throws Throwable {
				return 4.5;
			}
		});

		proiect.setAngajat(angajat);
		proiect.setAngajata(angajata);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testOreLucruProiect1() {
		assertTrue(proiect.verificareOreLucru());
	}
	
	
	@Test
	public void testOreLucru(){
		assertEquals(1, Double.compare(9.0, proiect.getAngajat().maximOreLucrateSaptamana()));
		
	} 
	
	@Test
	public void testOreLucru1(){
		assertEquals(1, Double.compare(4.0, proiect.getAngajata().minimOreLucrareSaptamana()));
		
	}

	

}
