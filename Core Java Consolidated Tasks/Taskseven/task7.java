import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        String target = "Green"; 

        if (colors.contains(target)) {
            System.out.println(target + " is present in the list.");
        } else {
            System.out.println(target + " is not present in the list.");
        }
    }
}
