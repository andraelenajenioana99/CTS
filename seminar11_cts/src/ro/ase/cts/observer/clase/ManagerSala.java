package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject{

	private List <Observer> clienti;
	private final String numeSala;
	
	
	
	public ManagerSala( String numeSala) {
		this.clienti = new ArrayList<>();
		this.numeSala = numeSala;
	}
	
	@Override
	public void adaugareAbonat(Observer observer) {
		// TODO Auto-generated method stub
		clienti.add(observer);
	}
	
	@Override
	public void stergereAbonat(Observer observer) {
		// TODO Auto-generated method stub
		clienti.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		clienti.forEach(item -> item.receptioneazaMesaj(mesaj));
	}
	
	public void trimiteAnuntImportant(String tipMeci) {
		trimiteMesaj("Astazi se va juca un meci de tip" + tipMeci);
	}
}
