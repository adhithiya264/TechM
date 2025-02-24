public class ThreadExample {

    
    public static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello, Java!");
        }
    }

    public static void main(String[] args) {
        
        HelloThread helloThread = new HelloThread();
      
        helloThread.start();
    }
}
