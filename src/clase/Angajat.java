package clase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Angajat {

	private ArrayList<Double> oreLucruLuna = new ArrayList<Double>();

	private String CNP;

	private String nume;
	private String prenume;
	private String email;
	private double salariu;
	private String companie;
	private double comision;

	public Angajat(ArrayList<Double> oreLucru) {

		try {
			if (oreLucru != null) {

				for (int i = 0; i < oreLucru.size(); i++) {
					if (oreLucru.get(i) < 0.0) {

						System.out.println("Eroare");
					}
					oreLucruLuna.add(oreLucru.get(i));
				}
			}
		} catch (Exception ex) {

			System.out.println(ex.getMessage());

		}

	}

	public Angajat(String nume, String prenume, String CNP) {

		this.nume = nume;
		this.prenume = prenume;
		this.CNP = CNP;

	}

	public Angajat(String nume, String prenume, String CNP, String email,
			double salariu, String companie) {

		this.nume = nume;
		this.prenume = prenume;
		this.CNP = CNP;
		this.email = email;
		this.salariu = salariu;
		this.companie = companie;

	}

	public ArrayList<Double> getOreLucruLuna() {
		return oreLucruLuna;
	}

	public void setOreLucruLuna(ArrayList<Double> oreLucruLuna) {
		this.oreLucruLuna = oreLucruLuna;
	}

	public String getCNP() {

		if (CNP.length() < 13 || CNP.length() > 13) {

			return "CNP-ul trebuie sa fie format din 13 cifre";

		}
		return this.CNP;
	}

	public void setCNP(String CNP) {
		this.CNP = CNP;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalariu() {
		return salariu;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public String getCompanie() {
		return companie;
	}

	public void setCompanie(String companie) {
		this.companie = companie;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double totalOreLucrare() {
		double total = 0;
		if (oreLucruLuna != null) {
			for (int i = 0; i < oreLucruLuna.size(); i++) {
				total += oreLucruLuna.get(i);
			}
		}
		return total;
	}

	public double minimOreLucrareSaptamana() {

		double minim = 0.0;
		for (int i = 1; i < oreLucruLuna.size(); i++) {

			if (oreLucruLuna.get(i) < oreLucruLuna.get((int) minim)) {

				minim = i;
			}

		}
		return oreLucruLuna.get((int) minim);

	}
	

	

	public double maximOreLucrateSaptamana() {

		double maxim = 0.0;
		for (int i = 1; i < oreLucruLuna.size(); i++) {

			if (oreLucruLuna.get(i) > oreLucruLuna.get((int) maxim)) {

				maxim = i;
			}

		}
		return oreLucruLuna.get((int) maxim);

	}

	public String aflaSexulAngajatului() {

		if (CNP.charAt(0) == '1') {

			return "M";

		} else if (CNP.charAt(0) == '2') {

			return "F";
		} else if (CNP.charAt(0) == '3') {

			return "M";
		} else if (CNP.charAt(0) == '4') {

			return "F";
		} else if (CNP.charAt(0) == '5') {

			return "M";
		} else if (CNP.charAt(0) == '6') {

			return "F";
		}
		return "Introduceti o cifra valida";
	}

	public int aflaVarstaAngajat() {

		int anulNasterii = 0;
		if (Integer.parseInt("" + CNP.charAt(0)) == 1) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (1900 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));

		}
		if (Integer.parseInt("" + CNP.charAt(0)) == 2) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (1900 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));

		}

		if (Integer.parseInt("" + CNP.charAt(0)) == 3) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (1800 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));

		}

		if (Integer.parseInt("" + CNP.charAt(0)) == 4) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (1800 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));
		}

		if (Integer.parseInt("" + CNP.charAt(0)) == 5) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (2000 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));

		}
		if (Integer.parseInt("" + CNP.charAt(0)) == 6) {
			return anulNasterii = LocalDateTime.now().getYear()
					- (2000 + Integer.parseInt("" + CNP.charAt(1)
							+ CNP.charAt(2)));

		}
		return anulNasterii;

	}

	public boolean ValidareLiteraNume(String numeAngajat) {

		char[] vector = numeAngajat.toCharArray();
		boolean valid = true;
		for (int i = 0; i < vector.length; i++) {

			if (!Character.isLetter(vector[i])) {

				valid = false;

			}

		}
		return valid;

	}

	public boolean ValidareLiteraPrenume(String prenumeAngajat) {

		char[] vector = prenumeAngajat.toCharArray();
		boolean valid = true;
		for (int i = 0; i < vector.length; i++) {

			if (!Character.isLetter(vector[i])) {

				valid = false;

			}

		}

		return valid;

	}

	public boolean ValidareCifraCNP(String cnpAngajat) {

		char[] vector = cnpAngajat.toCharArray();
		boolean valid = true;
		for (int i = 0; i < vector.length; i++) {

			if (!Character.isDigit(vector[i])) {

				valid = false;

			}

		}

		return valid;

	}

	public boolean ValidareLiteraCifraCompanie(String companie1) {

		boolean valid = false;

		char[] vector = companie1.toCharArray();
		for (int i = 0; i < vector.length; i++) {

			if (Character.isLetterOrDigit(vector[i])) {

				valid = true;

			}

		}

		return valid;

	}

	public boolean ValidEmail(String emailAngajat) {

		boolean valid = false;

		if (emailAngajat.contains("@")
				&& (emailAngajat.contains(".com")
						|| emailAngajat.contains(".ro") || emailAngajat
							.contains(".co.uk"))) {

			valid = true;

		}

		return valid;

	}

	public boolean ValidareNume1(String numeAngajat) {

		boolean valid = true;
		if (numeAngajat.trim().length() == 0) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidarePrenume1(String prenumeAngajat) {

		boolean valid = true;
		if (prenumeAngajat.trim().length() == 0) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareCompanie1(String companie) {

		boolean valid = true;
		if (companie.trim().length() == 0) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareCNP1(String CNPAngajat) {

		boolean valid = true;
		if (CNPAngajat.trim().length() == 0) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareEmailGol(String email) {

		boolean valid = true;
		if (email.trim().length() == 0) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareComision(double comision) {

		boolean valid = true;
		if (comision == 0.0 || comision > 0.9) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareDataAngajare(Date data) {

		boolean valid = true;
		if (data.equals(0)) {

			valid = false;

		}

		return valid;

	}

	public boolean ValidareSalariu(double salariuAngajat) {

		boolean valid = true;
		if (salariuAngajat < 800.0 || salariuAngajat > 4000.0) {

			return false;

		}

		return valid;

	}

	public boolean ValidareEmail(String email) {
		String tipar = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern p = Pattern.compile(tipar);
		Matcher m = p.matcher(email);
		return m.matches();

	}

	public double SumaOrePare() {

		double suma = 0.0;

		for (int i = 0; i < oreLucruLuna.size(); i++) {

			if (oreLucruLuna.get(i) % 2 == 0) {

				suma += oreLucruLuna.get(i);

			}
			return suma;
		}

		return 0;
	}

	public String getNumeAngajat() throws IOException {

		List<String> listaNume = new ArrayList<String>();
		FileReader file = new FileReader("numeAngajati");
		BufferedReader reader = new BufferedReader(file);
		String line = null;
		int iden = 0;
		while ((line = reader.readLine()) != null && line.length() > 0) {

			listaNume.add(line.split(" ")[0]);
		}

		reader.close();

		for (int i = 0; i < listaNume.size(); i++) {
			if (listaNume.get(i).equals(nume)) {

				iden = i;

			}
		}
		return listaNume.get(iden);
	}

}
