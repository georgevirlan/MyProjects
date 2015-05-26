package program;

import java.io.IOException;

import interfete.Departament;
import clase.*;


public class Program {

	
	public static void main(String [] args) throws IOException{
		
		Companie companie = Companie.getInstance("ActivSoft", "WebDevelopment", "Bd Marasti nr.23");
		System.out.println(companie.toString());
		Departament dep1 = companie.adaugaDepartament("3", "IT");
		dep1.angajare(4);
		Departament dep2 = companie.adaugaDepartament("1", "HR");
		dep2.transfer(dep1, 7);
		Departament dep3 = companie.adaugaDepartament("2", "Financiar Contabil");
		dep3.transfer(dep2, 5);
		DepartamentAdapter dep4 = new DepartamentAdapter(dep1.getNumeDepartament());
		dep4.angajare(12);
		dep4.transfer(dep1, 15);
		System.out.println(dep1.getNumeDepartament());
		System.out.println(dep2.getNumeDepartament());
		
		
		
		

		
		
	}
}
