package Question18;

public class ThreadsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(() -> {
            System.out.println("Thread started");
        });
        
        // Starting the thread for the first time
        thread.start();
        
        // Attempting to start the thread again
        thread.start();  // Throws java.lang.IllegalThreadStateException
    }


}
