import java.util.ArrayList;

public class InsertElementAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original list: " + colors);

        // Insert "Purple" at the first position (index 0)
        colors.add(0, "Purple");

        System.out.println("Updated list: " + colors);
    }
}
