public class ThrowExceptionIfOdd {

    public static void checkEvenNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number " + number + " is odd, exception thrown!");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        try {
           
            checkEvenNumber(5);
        } catch (Exception e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
           
            checkEvenNumber(8);
        } catch (Exception e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
