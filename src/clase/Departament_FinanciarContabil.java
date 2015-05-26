package clase;

import interfete.*;

public class Departament_FinanciarContabil extends Departament {

	public Departament_FinanciarContabil(String codDepartament) {
		this.codDepartament = codDepartament;
		this.numeDepartament = "Financiar Contabil";
	}

	@Override
	public void transfer(Departament departament, int nrAngajati) {

		System.out.println("S-au transferat " + nrAngajati
				+ " angajati din departamentul " + codDepartament
				+ " catre departamentul " + departament.getCodDepartament());
	}

	@Override
	public void angajare(int nrAngajati) {

		System.out.println("Compania a angajat " + nrAngajati
				+ " persoane in departamentul " + codDepartament);

	}

}
