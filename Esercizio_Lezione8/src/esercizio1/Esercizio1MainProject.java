package esercizio1;

public class Esercizio1MainProject {

	public static void main(String[] args) {
		
		ThreadChild t1 = new ThreadChild('#');
		ThreadChild t2 = new ThreadChild('@');
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();

	}

}
