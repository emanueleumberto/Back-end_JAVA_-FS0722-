package corso.java;

public class SingletonTest {
	
	private String txt;
	private static SingletonTest instance = null;

	private SingletonTest() {
		super();
		this.txt = "Test Singleton";
	}
	
	public static SingletonTest getInstance() {
		if(instance != null) {
			return instance;
		} else {
			instance = new SingletonTest();
		}
		
		return instance;
	}
	
}
