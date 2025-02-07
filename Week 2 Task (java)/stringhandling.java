package stringhandling;

public class StringProcessor {

    // Method to reverse a given string
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to count occurrences of a substring within a string
    public int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        
        // Loop through the text and count occurrences of the substring
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward by the length of the substring
        }
        
        return count;
    }

    // Method to split the string by spaces and capitalize each word
    public String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase()) // Capitalize first letter
                      .append(word.substring(1).toLowerCase())  // Keep the rest of the word in lowercase
                      .append(" ");
            }
        }
        
        return result.toString().trim(); // Remove the trailing space
    }

    public static void main(String[] args) {
        // Create an instance of StringProcessor
        StringProcessor processor = new StringProcessor();

        // Test reverseString
        String reversed = processor.reverseString("hello");
        System.out.println("Reversed: " + reversed); // Output: "olleh"

        // Test countOccurrences
        int occurrences = processor.countOccurrences("hello world, hello", "hello");
        System.out.println("Occurrences of 'hello': " + occurrences); // Output: 2

        // Test splitAndCapitalize
        String capitalized = processor.splitAndCapitalize("hello world, how are you?");
        System.out.println("Capitalized: " + capitalized); // Output: "Hello World, How Are You?"
    }
}
