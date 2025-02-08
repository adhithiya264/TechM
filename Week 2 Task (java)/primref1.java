package primandrefvariable;


public class primref1 {
    
    public static void main(String[] args) {
        int number = 10; // Primitive variable
        int[] array = {1, 2, 3}; // Reference variable (array)
        
        // Print initial values
        System.out.println("Before method call:");
        System.out.println("Number: " + number);
        System.out.println("Array: " + java.util.Arrays.toString(array));
        
        // Call method to modify the number and array
        modifyValues(number, array);
        
        // Print values after method call
        System.out.println("\nAfter method call:");
        System.out.println("Number: " + number); // Number is still 10 (pass by value)
        System.out.println("Array: " + java.util.Arrays.toString(array)); // Array has been modified (pass by reference)
    }
    
    // Method that modifies the number and array
    public static void modifyValues(int num, int[] arr) {
        num = 20; // This will not affect the original number in main
        arr[0] = 99; // This will modify the original array in main
        
        System.out.println("\nInside method:");
        System.out.println("Modified Number: " + num);
        System.out.println("Modified Array: " + java.util.Arrays.toString(arr));
    }
}

