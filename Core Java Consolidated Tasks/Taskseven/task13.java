import java.util.LinkedList;

public class IterateLinkedListFromPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        int startPosition = 2;

        System.out.println("Iterating through elements in the linked list starting from position " + startPosition + ":");

        for (int i = startPosition; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
