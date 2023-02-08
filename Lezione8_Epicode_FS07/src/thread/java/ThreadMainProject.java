package thread.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadMainProject {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log = LoggerFactory.getLogger(TestThread.class);
		
		TestThread t1 = new TestThread("Primo Thread");
		TestThread t2 = new TestThread("Secondo Thread");
		
		//TestRunnable t1 = new TestRunnable("Primo Thread");
		//TestRunnable t2 = new TestRunnable("Secondo Thread");
		
		t1.start();
		t1.join();
		t2.start();
		
		log.info("FINE");

	}

}
