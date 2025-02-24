import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry");
        List<String> reversedStringList = reverseList(stringList);
        System.out.println("Reversed String List: " + reversedStringList);

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedIntList = reverseList(intList);
        System.out.println("Reversed Integer List: " + reversedIntList);
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
