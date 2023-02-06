package playerepicode;

public class Video extends ElementoMultimedialeRiproducibile implements RegolazioneLuminosita {

	private int luminosita;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}
	
	@Override
	public void play() {
		String stampa = this.getTitolo();
		
		for (int i = 0; i < this.volume; i++) {
			stampa += "!";
		}
		
		for (int i = 0; i < this.luminosita; i++) {
			stampa += "*";
		}
	
		for (int i = 0; i < this.durata; i++) {
			System.out.println("Video: " + stampa);
		}
		
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
	
}
