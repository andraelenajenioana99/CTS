package ro.ase.cts.factorymethod.clase;

public class AsistentFactory implements FactoryPersonal{
	
	
		public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);
	}
}
