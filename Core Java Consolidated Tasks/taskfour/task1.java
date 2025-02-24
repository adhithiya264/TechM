public class ThrowAndCatchException {

    public static void main(String[] args) {
        try {
            
            throw new ArithmeticException("This is an intentional exception!");
        } catch (ArithmeticException e) {
         
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
