package interfete;

public abstract class Departament {

	protected String numeDepartament;
	protected String codDepartament;
	
	public abstract void transfer(Departament departament, int nrAngajati);
	public abstract void angajare(int nrAngajati);
	
	public void setNumeDepartament(String numeDepartament){
		
		
		this.numeDepartament = numeDepartament;
	}
	
	public void setCodDepartament(String codDepartament){
		
		
		this.codDepartament = codDepartament;
	}
	
	public String getNumeDepartament(){
		
		
		return this.numeDepartament;
	}
	
	public String getCodDepartament(){
		
		return this.codDepartament;
	}
	
	
}
