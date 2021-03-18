package ro.ase.cts.clase;

public class Faraon {
	private String name; 
	private double inaltime;
	private int nrPiramide;


private static Faraon faraon=null;

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Faraon [nume=");
	builder.append(name);
	builder.append(", inaltime=");
	builder.append(inaltime);
	builder.append(", nrPiramide=");
	builder.append(nrPiramide);
	builder.append("]");
	return builder.toString();
}

private Faraon(String name, double inaltime, int nrPiramide) {
	super();
	this.name = name;
	this.inaltime = inaltime;
	this.nrPiramide = nrPiramide;
}

public void setName(String name) {
	this.name = name;
}


public void setInaltime(double inaltime) {
	this.inaltime = inaltime;
}


public void setNrPiramide(int nrPiramide) {
	this.nrPiramide = nrPiramide;
}



public static synchronized Faraon getInstance(String nume, double inaltime, int nrPiramide) {
	if(faraon==null)
	{ 
		faraon=new Faraon(nume,inaltime,nrPiramide);
	}
	return faraon;
}

}
