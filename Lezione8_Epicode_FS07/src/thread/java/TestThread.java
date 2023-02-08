package thread.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestThread extends Thread {
	
	private String message;
	Logger log = LoggerFactory.getLogger(TestThread.class);

	public TestThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i=0; i <= 20; i++) {
			try {
				log.info("N."+i+ " - " +  message);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
		}
	}

}
