import java.util.LinkedList;

public class InsertElementAtPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original linked list: " + colors);

        int position = 2; // Position to insert at (0-based index)
        String newColor = "Orange"; // Element to insert

        colors.add(position, newColor); // Insert the element at the specified position

        System.out.println("Updated linked list: " + colors);
    }
}
