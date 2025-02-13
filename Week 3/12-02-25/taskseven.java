package week3;

public class task8 {
	  public static void main(String[] args) {
	        System.out.println("From Main thread!");

	       
	        ThreadRunnableTwo runnable2 = new ThreadRunnableTwo();
	        Thread thread2 = new Thread(runnable2);
	        thread2.start(); 
	    }

	    
	    static class ThreadRunnableTwo implements Runnable {
	        @Override
	        public void run() {
	       
	            System.out.println("From ThreadRunnableTwo!");
	            System.out.println("From ThreadRunnableTwo!");
	            System.out.println("From ThreadRunnableTwo!");
	        }
	    }

}
