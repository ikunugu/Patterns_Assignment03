package LazySingleton;

public class LazySingleton {
	private static LazySingleton instance1;
	private LazySingleton() {
		
	}
	public static synchronized LazySingleton getInstance() {
		if (instance1 == null ) {
			instance1 = new LazySingleton();
		}
		return instance1;
	}

}
