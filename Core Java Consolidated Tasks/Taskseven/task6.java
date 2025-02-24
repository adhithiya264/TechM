import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        int indexToRemove = 2; 

        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            colors.remove(indexToRemove); 
            System.out.println("Updated list after removing the third element: " + colors);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
