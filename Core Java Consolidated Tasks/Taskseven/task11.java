import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Original list: " + colors);

        String newColor = "Yellow"; // Element to append
        colors.addLast(newColor); // Append the element to the end of the list

        System.out.println("Updated list after appending: " + colors);
    }
}
