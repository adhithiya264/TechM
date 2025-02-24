public class EvenOddThreads {

    public static class EvenNumbersThread extends Thread {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    public static class OddNumbersThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 19; i += 2) {
                System.out.println("Odd: " + i);
                try {
                  Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
    
        Thread evenThread = new EvenNumbersThread();
        Thread oddThread = new OddNumbersThread();

       
        evenThread.start();
        oddThread.start();
      
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
