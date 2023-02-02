package esercizo_epicode;

public class Dipendente {

	static double stipendioBase = 1000;
	
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello Livello;
	private Dipartimento Dipartimento;
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		Dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.Livello = Livello.OPERAIO;
	}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario,
			Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		Livello = livello;
		Dipartimento = dipartimento;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getDipartimento() {
		return Dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		Dipartimento = dipartimento;
	}
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLivello() {
		return Livello;
	}
	
	public void stampaDatiDipendente() {
		System.out.println("Matricola: " + this.matricola);
		System.out.println("Stipendio: " + this.stipendio);
		System.out.println("Importo Orario Straordinario: " + this.importoOrarioStraordinario);
		System.out.println("Livello: " + this.Livello);
		System.out.println("Dipartimento: " + this.Dipartimento);
	}
	
	public Livello promuovi() {
		if(this.Livello == Livello.OPERAIO) {
			this.Livello = Livello.IMPIEGATO;
			// IMPIEGATO = stipendioBase * 1,2
			this.stipendio = stipendioBase * 1.2;
			//return Livello.IMPIEGATO;
		} else if(this.Livello == Livello.IMPIEGATO) {
			this.Livello = Livello.QUADRO;
			// QUADRO = stipendioBase * 1,5
			this.stipendio = stipendioBase * 1.5;
			//return Livello.QUADRO;
		} else if(this.Livello == Livello.QUADRO) {
			this.Livello = Livello.DIRIGENTE;
			// DIRIGENTE = stipendioBase * 2
			this.stipendio = stipendioBase * 2;
			//return Livello.DIRIGENTE;
		} else if(this.Livello == Livello.DIRIGENTE) {
			System.out.println("Impossibile promuovere il dipendente " + this.matricola);
			//return Livello.DIRIGENTE;
		} else {
			System.out.println("Impossibile promuovere il dipendente livello sconosciuto");
			//return this.Livello;
		}
		
		return this.Livello;
	}
	
	public static double calcolaPaga(Dipendente d) {
		return d.getStipendio();
	}
	
	public static double calcolaPaga(Dipendente d, int oreStraordinario) {
		double straordinario = oreStraordinario * d.getImportoOrarioStraordinario();
		return d.getStipendio() + straordinario;
	}
}
