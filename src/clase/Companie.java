package clase;



import java.util.ArrayList;
import java.util.List;

import interfete.Departament;

public class Companie {

	List<Angajat> listaAngajati = new ArrayList<Angajat>();

	private static Companie instance = null;

	private String denumire;
	private String domeniu;
	private String adresa;

	private static int nrDepartamente = 0;

	public static final int AnInfiintare = 1990;

	public Companie(ArrayList<Angajat> lista) {

		try {
			if (lista != null) {

				for (int i = 0; i < lista.size(); i++) {

					listaAngajati.add(lista.get(i));

				}
			}

		} catch (Exception ex) {

			System.out.println(ex.getMessage());

		}

	}

	public List<Angajat> getListaAngajati() {

		return this.listaAngajati;

	}

	public Companie(String denumire, String domeniu, String adresa) {

		if (denumire != null && domeniu != null && adresa != null) {
			this.denumire = denumire;
			this.domeniu = domeniu;
			this.adresa = adresa;
		} else
			throw new IllegalArgumentException();

	}

	public static Companie getInstance(String denumire, String domeniu,
			String adresa) {

		if (instance == null) {

			instance = new Companie(denumire, domeniu, adresa);

		}
		return instance;

	}

	public void setDenumire() {

		this.denumire = denumire;

	}

	public void setDomeniu() {

		this.domeniu = domeniu;

	}

	public void setAdresa() {

		this.adresa = adresa;

	}

	public String getDenumire() {

		return this.denumire;

	}

	public String getDomeniu() {

		return this.domeniu;
	}

	public String getAdresa() {

		return this.adresa;
	}

	public String toString() {

		return "Denumire: " + this.denumire + " Domeniu activitate: "
				+ this.domeniu + " Adresa: " + this.adresa;

	}

	public Departament adaugaDepartament(String codDepartament,
			String numeDepartament) {

		if (numeDepartament == "HR") {

			nrDepartamente++;
			return new Departament_HR(codDepartament);

		} else if (numeDepartament == "IT") {
			nrDepartamente++;
			return new Departament_IT(codDepartament);
		} else if (numeDepartament == "Financiar Contabil") {

			nrDepartamente++;

			return new Departament_FinanciarContabil(codDepartament);
		} else {
			System.out.println("Departamentul nu se poate crea");
			return null;

		}
	}

	public int determinaTotalulProiectelorAnual(ArrayList<Integer> listaProiecte) {

		int totalProiecte = 0;
		for (int i = 0; i < listaProiecte.size(); i++) {

			totalProiecte += listaProiecte.get(i);

		}
		return totalProiecte;
	}
	
	
	public int determinaMediaAnualaProiectelor(ArrayList<Double> listaProj) {

		int totalProiecte = 0;
		for (int i = 0; i < listaProj.size(); i++) {

			totalProiecte += listaProj.get(i);

		}
		return totalProiecte/listaProj.size();
	}

}
