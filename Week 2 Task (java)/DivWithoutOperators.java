package oops;

public class DivWithoutOperators {
	 public static void main(String[] args) {
	        int dividend = 20;
	        int divisor = 4;

	        // Find quotient and remainder using only '+' and '-'
	        int quotient = 0;
	        int remainder = dividend;

	        while (remainder >= divisor) {
	            remainder = remainder - divisor;
	            quotient = quotient + 1;
	        }

	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);
	    }

}
