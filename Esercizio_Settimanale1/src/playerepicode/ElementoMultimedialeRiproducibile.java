package playerepicode;

public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale implements RegolazioneVolume {

	protected int durata;
	protected int volume;
	
	public ElementoMultimedialeRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}
	
	public abstract void play();

	@Override
	public int alzaVolume() {
		if(this.volume < 5) {
			this.volume++;
		}
		return this.volume;
	}

	@Override
	public int abbassaVolume() {
		if(this.volume > 0) {
			this.volume--;
		}
		return this.volume;
	}

}
