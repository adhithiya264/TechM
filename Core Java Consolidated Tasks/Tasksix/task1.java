import java.util.List;

public class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] result = sumEvenOdd(numbers);
        System.out.println("Sum of Even Numbers: " + result[0]);
        System.out.println("Sum of Odd Numbers: " + result[1]);
    }

    public static <T extends Number> int[] sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            int n = num.intValue();
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        return new int[] { evenSum, oddSum };
    }
}
