import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "cherry");
        char specificLetter = 'a';
        
        long count = words.stream()
                          .filter(word -> word.toLowerCase().startsWith(String.valueOf(specificLetter).toLowerCase()))
                          .count();

        System.out.println("Number of strings starting with '" + specificLetter + "': " + count);
    }
}
