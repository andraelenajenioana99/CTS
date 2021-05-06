package src.ro.ase.cts.state.state.program;

import src.ro.ase.cts.state.clase.Masa;
import src.ro.ase.cts.state.clase.MasaLibera;

public class Program {
	public static void main (String [] args) {
		Masa masa = new Masa(3);
		masa.elibereazaMasa();
		
		masa.rezervaMasa();
		//masa.setStareMasa(new MasaLibera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}
}
