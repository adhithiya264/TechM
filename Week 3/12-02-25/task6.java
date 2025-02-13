package week3;

public class task7 {
	 public static void main(String[] args) {
	        System.out.println("From Main thread!");

	       
	        ThreadRunnableOne runnable1 = new ThreadRunnableOne();
	        Thread thread1 = new Thread(runnable1);
	        thread1.start(); 
	    }

	   
	    static class ThreadRunnableOne implements Runnable {
	        @Override
	        public void run() {
	       
	            System.out.println("From ThreadRunnableOne!");
	            System.out.println("From ThreadRunnableOne!");
	        }
	    }

}
