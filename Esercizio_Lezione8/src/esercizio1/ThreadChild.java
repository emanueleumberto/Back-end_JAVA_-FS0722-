package esercizio1;

public class ThreadChild implements Runnable {
	
	private char simbolo;

	public ThreadChild(char simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.print(simbolo);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
