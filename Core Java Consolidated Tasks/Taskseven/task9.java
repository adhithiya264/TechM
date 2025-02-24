import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        ArrayList<String> copiedColors = new ArrayList<>(colors); // Copying the list

        System.out.println("Copied list: " + copiedColors);
    }
}
