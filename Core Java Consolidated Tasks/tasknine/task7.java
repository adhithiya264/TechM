import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Maximum value: " + value));

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Minimum value: " + value));
    }
}
