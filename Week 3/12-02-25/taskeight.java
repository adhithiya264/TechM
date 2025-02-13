package week3;

public class task9 {
	  public static void main(String[] args) {
	        System.out.println("From Main thread!");

	        // Creating and starting ThreadRunnableOne using Runnable
	        ThreadRunnableOne runnable1 = new ThreadRunnableOne();
	        Thread thread1 = new Thread(runnable1);
	        thread1.start(); // Start the thread (calls the run method of ThreadRunnableOne)

	        // Creating and starting ThreadRunnableTwo using Runnable
	        ThreadRunnableTwo runnable2 = new ThreadRunnableTwo();
	        Thread thread2 = new Thread(runnable2);
	        thread2.start(); // Start the thread (calls the run method of ThreadRunnableTwo)
	    }

	    // Class ThreadRunnableOne implements Runnable
	    static class ThreadRunnableOne implements Runnable {
	        @Override
	        public void run() {
	            // Print two times from ThreadRunnableOne
	            System.out.println("From ThreadRunnableOne!");
	            System.out.println("From ThreadRunnableOne!");
	        }
	    }

	    // Class ThreadRunnableTwo implements Runnable
	    static class ThreadRunnableTwo implements Runnable {
	        @Override
	        public void run() {
	            // Print three times from ThreadRunnableTwo
	            System.out.println("From ThreadRunnableTwo!");
	            System.out.println("From ThreadRunnableTwo!");
	            System.out.println("From ThreadRunnableTwo!");
	        }
	    }

}
