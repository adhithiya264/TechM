import java.util.ArrayList;

public class RetrieveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        int index = 2; 

        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + ": " + color);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
