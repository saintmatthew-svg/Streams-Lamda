import java.util.Arrays;
import java.util.stream.IntStream;

public class ListOfFactorials {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5};
        System.out.println(Arrays.toString(factorialOfNumbers(numbers)));
    }

    public static int[] factorialOfNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .map(n -> IntStream.rangeClosed(1, n)
                        .reduce(1, (a, b) -> a * b))
                .toArray();
    }
}