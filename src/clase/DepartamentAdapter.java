package clase;

import interfete.Departament;

public class DepartamentAdapter extends Departament{

	public IDepartament depart;
	@Override
	public void transfer(Departament departament, int nrAngajati) {
		
		depart.angajatiTransfer(new CompaniePartenera(departament.getNumeDepartament()), nrAngajati);
		
	}

	@Override
	public void angajare(int nrAngajati) {
		depart.angajatiTransfer(depart, nrAngajati);
		
	}
	
	public DepartamentAdapter(String numeDepartament){
		
		depart = new CompaniePartenera(this.getNumeDepartament());
		depart.setNumeDepartament(numeDepartament);
		
		
	}

	
	
}
