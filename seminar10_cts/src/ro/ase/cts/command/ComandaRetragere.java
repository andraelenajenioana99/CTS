package ro.ase.cts.command;

public class ComandaRetragere extends Comanda{
	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
	}
	
	public void executa() {
		super.getCont().retragere(super.getSuma());
	}
}
