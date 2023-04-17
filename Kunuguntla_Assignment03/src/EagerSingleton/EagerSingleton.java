package EagerSingleton;

public class EagerSingleton {
	private static final EagerSingleton instance1 = new EagerSingleton();
	private EagerSingleton() {
		
	}
	public static EagerSingleton getInstance() {
		return instance1;
	}

}
