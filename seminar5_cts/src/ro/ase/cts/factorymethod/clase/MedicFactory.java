package ro.ase.cts.factorymethod.clase;

public class MedicFactory implements FactoryPersonal{
	public PersonalSpital getPersonal(String nume) {
		return new Medic(nume);
	}
}
