package Question27;

public class MySingleton {
	private static volatile MySingleton INSTANCE = null;

    private MySingleton() {}

    public static synchronized MySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }


}
