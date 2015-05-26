package clase;

public abstract class IDepartament {

	protected String numeDepartament;
	public abstract void angajatiTransfer(IDepartament depart, int nrAngajati);
	
	
	public String getNumeDepartament(){
		
		
		return this.numeDepartament;
	}
	
	public void setNumeDepartament(String numeDepartament){
		
		
		this.numeDepartament = numeDepartament;
		
	}
}