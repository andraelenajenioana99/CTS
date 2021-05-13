package ro.ase.cts.observer.clase;

public class Client implements Observer {
	
	private final String name;
	
	public Client(String name) {
		this.name=name;
	}
	
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(name + "ai primit mesajul:" + mesaj);
	}
}
