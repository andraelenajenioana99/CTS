package ro.ase.cts.adapterclase.clase;

public class Leasing {
	
	private float suma;
	private String numeClient;
	
	public Leasing(float suma, String numeClient) {
		super();
		this.suma = suma;
		this.numeClient = numeClient;
	}
	public float getSuma() {
		return suma;
	}
	public String getNumeClient() {
		return numeClient;
	}
	
	public void imprumutaLeasing() {
		System.out.println(numeClient + "a realizat leasing cu suma" + suma);
	}
}
