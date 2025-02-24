import java.util.Arrays;

public class ArrayCopyRangeExample {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50, 60, 70};
        int[] destinationArray = new int[5];

        System.arraycopy(sourceArray, 2, destinationArray, 0, 5);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array after copying range: " + Arrays.toString(destinationArray));
    }
}
