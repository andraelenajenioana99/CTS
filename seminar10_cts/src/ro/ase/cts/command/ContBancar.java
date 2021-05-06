package ro.ase.cts.command;

public class ContBancar {
	public String detinator;
	public float sold;
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire (float suma) {
		sold = suma;
		System.out.println("S-a constituit contul cu suma" + suma);
	}
	
	public void retragere(float suma) {
		if(suma<=sold) {
			sold-=suma;
			System.out.println("S-a retras suma de " + suma);
		}
		else {
			System.out.println("Fonduri insufiente");
		}
	}
	public void depunere(float suma) {
		sold += suma;
		System.out.println("S-a depus suma"+ suma);
	}
	
}
