import java.util.List;

public class FindElementIndex {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry", "date");
        System.out.println("Index of 'cherry': " + findElementIndex(stringList, "cherry"));
        
        List<Integer> intList = List.of(10, 20, 30, 40, 50);
        System.out.println("Index of 30: " + findElementIndex(intList, 30));
    }

    public static <T> int findElementIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
