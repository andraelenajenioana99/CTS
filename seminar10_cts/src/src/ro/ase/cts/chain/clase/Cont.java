package src.ro.ase.cts.chain.clase;

public abstract class Cont {
	private Cont succesor;
	private float sold;
	
	public Cont(float sold) {
		super();
		this.sold = sold;
		this.succesor = succesor;
	}


	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}
	
	public abstract void plateste(float suma);


	public void setSold(float sold) {
		this.sold = sold;
	}


	public Cont getSuccesor() {
		return succesor;
	}


	public float getSold() {
		return sold;
	}
	
	
}
