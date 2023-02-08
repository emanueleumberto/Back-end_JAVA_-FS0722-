package thread.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunnable implements Runnable {

	private String message;
	Logger log = LoggerFactory.getLogger(TestThread.class);

	public TestRunnable(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i=0; i <= 20; i++) {
			log.info("N."+i+ " - " +  message);
		}
	}

}
