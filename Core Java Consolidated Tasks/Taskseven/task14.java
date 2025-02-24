import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListInReverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Iterating through the linked list in reverse order:");

        ListIterator<String> iterator = colors.listIterator(colors.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
