package ro.ase.cts.decorator.clase;

public class DecoratorAbstract implements NotaAbstracta{
	
	private NotaAbstracta nota;
	
	public void printeaza() {
		nota.printeaza();
	}
	
	public DecoratorAbstract(NotaAbstracta nota ) {
		super();
		this.nota =nota;
	}
}
