import java.util.Arrays;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;

        System.out.println("Using equals(): ");
        System.out.println(arr1.equals(arr2)); 
        System.out.println(arr1.equals(arr3)); 

        System.out.println("\nUsing deepEquals(): ");
        System.out.println(Arrays.deepEquals(new int[][]{arr1}, new int[][]{arr2}));
        System.out.println(Arrays.deepEquals(new int[][]{arr1}, new int[][]{arr3}));
    }
}
