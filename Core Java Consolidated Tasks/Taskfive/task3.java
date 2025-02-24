import java.util.Arrays;

class MergeSortTask extends Thread {
    private int[] array;
    private int[] tempArray;
    private int left;
    private int right;

    public MergeSortTask(int[] array, int[] tempArray, int left, int right) {
        this.array = array;
        this.tempArray = tempArray;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        if (left < right) {
            int mid = (left + right) / 2;

            
            MergeSortTask leftTask = new MergeSortTask(array, tempArray, left, mid);
            leftTask.start();
            MergeSortTask rightTask = new MergeSortTask(array, tempArray, mid + 1, right);
            rightTask.start();

            try {
                leftTask.join();
                rightTask.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(array, tempArray, left, mid, right);
        }
    }

    private void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        System.arraycopy(array, left, tempArray, left, right - left + 1);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }


        while (i <= mid) {
            array[k] = tempArray[i];
            i++;
            k++;
        }
        while (j <= right) {
            array[k] = tempArray[j];
            j++;
            k++;
        }
    }
}

public class MultiThreadedMergeSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7, 14, 3, 9, 1};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] tempArray = new int[array.length];
        MergeSortTask mergeSortTask = new MergeSortTask(array, tempArray, 0, array.length - 1);
     
        mergeSortTask.start();
        
        try {
            mergeSortTask.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
