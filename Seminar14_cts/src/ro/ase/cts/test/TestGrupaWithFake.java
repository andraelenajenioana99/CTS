package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.dubluri.FakeStudent;

public class TestGrupaWithFake {

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1056);
		for(int i=0; i<8;i++) {
			FakeStudent student=new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2;i++) {
			FakeStudent student=new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}

}