package esercizio1;

public class Rettangolo {
	
	double larghezza;
	double altezza;
	
	public Rettangolo(double larghezza, double altezza) {
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	
	public double area() {
		return this.altezza*this.larghezza;
	}
	
	public double perimetro() {
		return this.altezza*2 + this.larghezza*2;
	}
	
	

}
