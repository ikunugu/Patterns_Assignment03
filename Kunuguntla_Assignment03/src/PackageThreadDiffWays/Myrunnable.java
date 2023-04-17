package PackageThreadDiffWays;

public class Myrunnable implements Runnable {
	public void run() {
        System.out.println("Thread running");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myrunnable myRunnable = new Myrunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();


	}

	

}
