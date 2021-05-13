package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("sala nr 3");
		Observer client1=new Client("Raluca");
		Observer client2=new Client("Gabriela");
		Observer client3=new Client("Ion");
		
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("fotbal");
		managerSala.stergereAbonat(client3);
		managerSala.trimiteAnuntImportant("handabl");

	}

}