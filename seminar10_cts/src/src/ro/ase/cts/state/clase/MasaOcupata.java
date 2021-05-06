package src.ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa" + masa.getNrMasa() + "nu se poate ocupa");
		}
		else {
			masa.setStareMasa(this);
			System.out.println("Msa" + masa.getNrMasa() + "este trecuta in starea de ocupata");
		}
	}

}
