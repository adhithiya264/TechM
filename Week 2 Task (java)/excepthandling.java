package exceptionhandling;
import java.util.Scanner;


public class excepthandling {
		
	    
	    // Method to process user input and handle exceptions
	    public static void processInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to calculate its reciprocal: ");
	        
	        try {
	            String input = scanner.nextLine(); // Read user input
	            double number = Double.parseDouble(input); // Try to parse the input to a double
	            
	            // Check if the number is 0 to prevent division by zero
	            if (number == 0) {
	                throw new ArithmeticException("Cannot calculate the reciprocal of zero.");
	            }
	            
	            double reciprocal = 1 / number; // Calculate reciprocal
	            System.out.println("The reciprocal of " + number + " is: " + reciprocal);
	            
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Please enter a valid numerical value.");
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close(); // Close the scanner resource
	        }
	    }

	    // Main method to call the processInput method
	    public static void main(String[] args) {
	        processInput();
	    }
	}

