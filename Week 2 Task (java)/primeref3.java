package primandrefvariable;

import java.util.Scanner;

public class primref3 {

    // Function to count trailing zeros in factorial of n
    public static int countTrailingZeros(int n) {
        int count = 0;
        
        // Keep dividing n by powers of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Finding trailing zeros in factorial of the number
        int trailingZeros = countTrailingZeros(number);
        
        // Output the result
        System.out.println("The number of trailing zeros in " + number + "! is: " + trailingZeros);
        
        scanner.close();
    }
}
