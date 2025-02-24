class Producer extends Thread {
    private final SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        synchronized (sharedData) {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.setData(i);
                    System.out.println("Produced: " + i);
                    sharedData.notify();
                    sharedData.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        synchronized (sharedData) {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.wait();
                    System.out.println("Consumed: " + sharedData.getData());
                    sharedData.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SharedData {
    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
