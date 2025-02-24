import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "cherry");
        List<String> list2 = List.of("date", "elderberry", "fig");
        List<String> mergedList = mergeLists(list1, list2);
        System.out.println("Merged List: " + mergedList);

        List<Integer> intList1 = List.of(1, 3, 5);
        List<Integer> intList2 = List.of(2, 4, 6);
        List<Integer> mergedIntList = mergeLists(intList1, intList2);
        System.out.println("Merged Integer List: " + mergedIntList);
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }
}
