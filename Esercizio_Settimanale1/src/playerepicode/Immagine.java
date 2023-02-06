package playerepicode;

public class Immagine extends ElementoMultimediale implements RegolazioneLuminosita{
	
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	@Override
	public int alzaLuminosita() {
		if(this.luminosita < 5) {
			this.luminosita++;
		}
		return this.luminosita;
	}

	@Override
	public int abbassaLuminosita() {
		if(this.luminosita > 0) {
			this.luminosita--;
		}
		return this.luminosita;
	}
	
	public void show() {
		String stampa = this.getTitolo();
		for (int i = 0; i < this.luminosita; i++) {
			stampa += "*";
		}
		System.out.println(stampa);
	}

}
