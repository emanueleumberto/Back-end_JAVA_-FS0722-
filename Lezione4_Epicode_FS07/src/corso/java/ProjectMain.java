package corso.java;

public class ProjectMain {

	public static void main(String[] args) {

		Automobile a = new Automobile("Fiat", "500", 3);
		Moto m = new Moto("Yamaha", "R1", 1000, 1);
		Automobile g = new Automobile("Ford", "Fiesta", 5);
		a.acc();
		m.frena();
		Moto l = new Moto("Honda", "Hornet", 800, 2);
		Veicolo v = new Automobile(null, null, 0);
		Smartphone s = new Smartphone("Apple", "Iphone", 8, 128);
	
		Veicolo[] autostrada = new Veicolo[4];
		autostrada[0] = a;
		autostrada[1] = m;
		autostrada[2] = g;
		autostrada[3] = l;
		
		for(int i=0; i<autostrada.length; i++) {
			if(autostrada[i] instanceof Automobile) {
				Automobile auto = (Automobile) autostrada[i];
				System.out.println(auto);
			} else if (autostrada[i] instanceof Moto) {
				Moto moto = (Moto) autostrada[i];
				System.out.println(moto);
			}
			
			System.out.println(autostrada[i].start());
			System.out.println(autostrada[i].acc());
			
		}
		
		
		Navigatore[] oggetti = new Navigatore[3];
		oggetti[0] = a;
		oggetti[1] = m;
		oggetti[2] = s;
		
		for (int i = 0; i < oggetti.length; i++) {
			System.out.println(oggetti[i].aggiorna());
		}

	}

}
