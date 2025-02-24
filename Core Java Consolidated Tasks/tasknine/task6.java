import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsAlphabetically {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date", "elderberry");

        List<String> ascendingOrder = words.stream()
                                           .sorted()
                                           .collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " + ascendingOrder);
        List<String> descendingOrder = words.stream()
                                            .sorted((word1, word2) -> word2.compareTo(word1))
                                            .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
