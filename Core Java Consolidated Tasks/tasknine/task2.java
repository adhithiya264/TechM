import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringCaseUsingStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase words: " + upperCaseWords);

        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase words: " + lowerCaseWords);
    }
}
