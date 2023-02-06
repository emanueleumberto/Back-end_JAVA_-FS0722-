package playerepicode;

public class RegistrazioneAudio extends ElementoMultimedialeRiproducibile {

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
	}

	@Override
	public void play() {
		String stampa = this.getTitolo();
		for (int i = 0; i < this.volume; i++) {
			stampa += "!";
		}
		
		for (int i = 0; i < this.durata; i++) {
			System.out.println("Audio: " + stampa);
		}
		
	}

}
