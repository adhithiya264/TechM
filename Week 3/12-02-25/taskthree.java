package week3;

public class task3 {
	
	
	  public static void main(String[] args) {
	        System.out.println("From Main thread!");

	       
	        MTask1ThreadOne t1 = new MTask1ThreadOne();
	        t1.start(); 
	       
	        MTask1ThreadTwo t2 = new MTask1ThreadTwo();
	        t2.start(); 

	       
	        System.out.println("Executing run method from Main thread directly:");
	        new MTask1ThreadOne().run();
	    }

	   
	    static class MTask1ThreadOne extends Thread {
	        @Override
	        public void run() {
	            // Print three times from ThreadOne
	            System.out.println("From ThreadOne!");
	            System.out.println("From ThreadOne!");
	            System.out.println("From ThreadOne!");
	        }
	    }

	   
	    static class MTask1ThreadTwo extends Thread {
	        @Override
	        public void run() {
	            
	            System.out.println("From ThreadTwo!");
	            System.out.println("From ThreadTwo!");

	            
	            System.out.println(10 / 0); 
	        }
	    }

}
