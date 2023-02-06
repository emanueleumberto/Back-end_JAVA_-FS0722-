package playerepicode;

import java.util.Scanner;

public class LettoreMultimediale {
	
	private static int totaleElementiMultimediali = 5;
	private static ElementoMultimediale[] listaElementi = new ElementoMultimediale[totaleElementiMultimediali];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < totaleElementiMultimediali; i++) {
			caricaElementi();
		}
		
		System.out.println("Esegui Elementi Multimediali");
		
		start();
	}
	
	public static void start() {
		do {
			System.out.println("Scegli Elemento (1-5) 0 per uscire");
			int tipo = Integer.parseInt(sc.nextLine());
			if(tipo == 0) {
				return;
			} else {
				eseguiElemento(listaElementi[tipo-1]);
			}
		}while(true);
	}
	
	/*public static void eseguiElemento(ElementoMultimediale e) {
		if(e instanceof ElementoMultimedialeRiproducibile) {
			((ElementoMultimedialeRiproducibile) e).play();
		} else if(e instanceof Immagine) {
			((Immagine) e).show();
		} else {
			System.out.println("ERRORE!!!");
		}
	}*/
	
	public static void eseguiElemento(ElementoMultimediale e) {
		if(e instanceof Video) {
			System.out.println("Cosa vuoi fare?");
			System.out.println("1-Volume 2-Luminosita 3-Riproduci");
			int scelta = Integer.parseInt(sc.nextLine());
			switch (scelta) {
			case 1:
				System.out.println("1-Aumenta Volume");
				System.out.println("2-Abbassa Volume");
				int vol = Integer.parseInt(sc.nextLine());
				if(vol == 1) {
					((Video) e).alzaVolume();
				} else if(vol == 2) {
					((Video) e).abbassaVolume();
				}
				break;
			case 2:
				System.out.println("1-Aumenta Luminosita");
				System.out.println("2-Abbassa Luminosita");
				int lum = Integer.parseInt(sc.nextLine());
				if(lum == 1) {
					((Video) e).alzaLuminosita();
				} else if(lum == 2) {
					((Video) e).abbassaLuminosita();
				}
				break;
			case 3 :
				((Video) e).play();
				break;
			default:
				break;
			}
			
		} else if(e instanceof RegistrazioneAudio) {
			System.out.println("Cosa vuoi fare?");
			System.out.println("1-Volume 2-Riproduci");
			int scelta = Integer.parseInt(sc.nextLine());
			switch (scelta) {
			case 1:
				System.out.println("1-Aumenta Volume");
				System.out.println("2-Abbassa Volume");
				int vol = Integer.parseInt(sc.nextLine());
				if(vol == 1) {
					((RegistrazioneAudio) e).alzaVolume();
				} else if(vol == 2) {
					((RegistrazioneAudio) e).abbassaVolume();
				}
				break;
			case 2 :
				((RegistrazioneAudio) e).play();
				break;
			default:
				break;
			}
			
		} else if(e instanceof Immagine) {
			System.out.println("Cosa vuoi fare?");
			System.out.println("1-Luminosita 2-Visualizza");
			int scelta = Integer.parseInt(sc.nextLine());
			switch (scelta) {
			case 1:
				System.out.println("1-Aumenta Luminosita");
				System.out.println("2-Abbassa Luminosita");
				int lum = Integer.parseInt(sc.nextLine());
				if(lum == 1) {
					((Immagine) e).alzaLuminosita();
				} else if(lum == 2) {
					((Immagine) e).abbassaLuminosita();
				}
				break;
			case 2 :
				((Immagine) e).show();
				break;
			default:
				break;
			}
			
		}
	}
	
	public static void caricaElementi() {
		
		System.out.println("Scegli il tipo (1-VIDEO; 2-AUDIO; 3-IMMAGINE)");
		int tipo = Integer.parseInt(sc.nextLine());
		
		switch (tipo) {
		case 1: {
			caricaVideo();
			break;
		}
		case 2: {
			caricaRegistrazioneAudio();
			break;
		}
		case 3: {
			caricaImmagine();
			break;
		}
		default:
			System.out.println("Selezione errata!!!");
		}
		
	}
	
	public static void caricaVideo() {
		System.out.println("Inserisci il titolo");
		String titolo = sc.nextLine();
		System.out.println("Inserisci durata");
		int durata = Integer.parseInt(sc.nextLine());
		System.out.println("Inserisci volume");
		int volume = Integer.parseInt(sc.nextLine());
		System.out.println("Inserisci luminosita");
		int luminosita = Integer.parseInt(sc.nextLine());
		Video v = new Video(titolo, durata, volume, luminosita);
		//System.out.println(v);
		salvaElementoMultimediale(v);
	}
	
	public static void caricaRegistrazioneAudio() {
		System.out.println("Inserisci il titolo");
		String titolo = sc.nextLine();
		System.out.println("Inserisci durata");
		int durata = Integer.parseInt(sc.nextLine());
		System.out.println("Inserisci volume");
		int volume = Integer.parseInt(sc.nextLine());
		RegistrazioneAudio a = new RegistrazioneAudio(titolo, durata, volume);
		//System.out.println(a);
		salvaElementoMultimediale(a);
	}
	
	public static void caricaImmagine() {
		System.out.println("Inserisci il titolo");
		String titolo = sc.nextLine();
		System.out.println("Inserisci luminosita");
		int luminosita = Integer.parseInt(sc.nextLine());
		Immagine i = new Immagine(titolo, luminosita);
		//System.out.println(i);
		salvaElementoMultimediale(i);
	}
	
	public static void salvaElementoMultimediale(ElementoMultimediale e) {
		for (int i = 0; i < listaElementi.length; i++) {
			if(listaElementi[i] == null) {
				listaElementi[i] = e;
				break;
			}
		}
	}

}
