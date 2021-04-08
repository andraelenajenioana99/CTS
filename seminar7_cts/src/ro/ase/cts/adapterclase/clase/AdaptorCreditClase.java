package ro.ase.cts.adapterclase.clase;

public class AdaptorCreditClase extends Leasing{

	public AdaptorCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}
	
	public void oferaCredit() {
		super.imprumutaLeasing();
	}
}
