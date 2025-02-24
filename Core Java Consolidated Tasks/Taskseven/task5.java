import java.util.ArrayList;

public class UpdateArrayElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        int index = 2; 
        String newColor = "Orange"; 
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newColor); 
            System.out.println("Updated list: " + colors);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
