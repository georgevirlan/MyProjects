package clase;

public class CompaniePartenera extends IDepartament {

	@Override
	public void angajatiTransfer(IDepartament depart, int nrAngajati) {

		System.out.println("Companie partenera: transfer  " + nrAngajati
				+ " in departamentul " + depart.getNumeDepartament());

	}

	public CompaniePartenera(String numeDepartament) {

		this.numeDepartament = numeDepartament;
	}

}
