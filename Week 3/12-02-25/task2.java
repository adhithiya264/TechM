package week3;

public class task2 {

    public static void main(String[] args) {
        System.out.println("From Main thread!");

       
        MTask1ThreadOne t1 = new MTask1ThreadOne();
        t1.start(); // Start ThreadOne (calls the run method)

        
        MTask1ThreadTwo t2 = new MTask1ThreadTwo();
        t2.start(); 
    }

    
    static class MTask1ThreadOne extends Thread {
        @Override
        public void run() {
            
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
            System.out.println("From ThreadOne!");
        }
    }

 
    static class MTask1ThreadTwo extends Thread {
        @Override
        public void run() {
            // Print two times from ThreadTwo
            System.out.println("From ThreadTwo!");
            System.out.println("From ThreadTwo!");

         
            System.out.println(10 / 0); // This will throw an ArithmeticException
        }
    }

}
