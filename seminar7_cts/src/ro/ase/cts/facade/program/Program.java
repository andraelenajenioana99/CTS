package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Program {
	
 public static void main(String [] args) {
	 Persoana persoana = new Persoana("2990924250099", "Ana");
	 
	 if(Facade.esteEligibil(persoana))
	 System.out.println("OferimCredit");
	 else {
		 System.out.println("Nu oferim credit");
	 } 
 }
}
