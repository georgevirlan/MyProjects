package clase;

public class Proiecte {

	
	private Angajat angajat;
	private Angajat angajata;
	
	
	
	public Angajat getAngajat() {
		return angajat;
	}
	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}
	public Angajat getAngajata() {
		return angajata;
	}
	public void setAngajata(Angajat angajata) {
		this.angajata = angajata;
	}

	
	public boolean verificareOreLucru(){
		if((angajat.maximOreLucrateSaptamana() > 9.0 || angajata.maximOreLucrateSaptamana() > 9.0) && (angajat.minimOreLucrareSaptamana() < 1.0 || angajata.minimOreLucrareSaptamana() < 1.0) )
			return false;
		else
			return true;
	}
}
