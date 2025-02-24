class PrimeSumTask extends Thread {
    private int start;
    private int end;
    private int[] result;

    public PrimeSumTask(int start, int end, int[] result) {
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        synchronized (result) {
            result[0] += sum;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class PrimeSum {
    public static void main(String[] args) {
        int limit = 1000;
        int threadsCount = 4;
        int range = limit / threadsCount;
        int[] result = new int[1];

        Thread[] threads = new Thread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            int start = i * range + 1;
            int end = (i + 1) * range;
            if (i == threadsCount - 1) end = limit;
            threads[i] = new PrimeSumTask(start, end, result);
            threads[i].start();
        }

        try {
            for (int i = 0; i < threadsCount; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + result[0]);
    }
}
