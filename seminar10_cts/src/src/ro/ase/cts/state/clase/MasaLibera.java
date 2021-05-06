package src.ro.ase.cts.state.clase;

public class MasaLibera implements Stare {
	public void modificaStare(Masa masa) {
		if (masa.getStareMasa() instanceof MasaOcupata || masa.getStareMasa() instanceof MasaRezervata) {
			System.out.println("Masa " + masa.getNrMasa() + "trece in stare libera");
			
		}else
		{
			System.out.println("Masa " + masa.getNrMasa() + "este deja libera");
			
		}
	}
}
