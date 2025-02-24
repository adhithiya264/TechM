import java.util.Arrays;

public class CopyAlternateElements {
    public static void main(String[] args) {
        // Sample input array
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Calculate the size of the new array (half of the original array size)
        int newSize = (originalArray.length + 1) / 2;
        
        // Create a new array to store the alternate elements
        int[] alternateArray = new int[newSize];
        
        // Copy alternate elements
        for (int i = 0, j = 0; i < originalArray.length; i += 2) {
            alternateArray[j++] = originalArray[i];
        }
        
        // Display the result
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array with alternate elements: " + Arrays.toString(alternateArray));
    }
}
