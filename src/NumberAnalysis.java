import java.util.Random;
import java.util.stream.IntStream;

public class NumberAnalysis {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = random.ints(10, 1, 1000).toArray();

        System.out.print("Generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        long evenCount = IntStream.of(numbers).filter(x -> x % 2 == 0).count();
        long oddCount = numbers.length - evenCount;
        System.out.print("Total Even numbers: "  + evenCount + "\n");
        System.out.print("Total Odd numbers: " + oddCount + "\n");

        double AverageForAll = IntStream.of(numbers).average().orElse(0);
        double AverageForEven = IntStream.of(numbers).filter(x -> x % 2 == 0).average().orElse(0);
        double AverageForOdd = IntStream.of(numbers).filter(x -> x % 2 != 0).average().orElse(0);

        System.out.println("Average of all numbers: " + AverageForAll);
        System.out.println("Average of Even numbers: " + AverageForEven);
        System.out.println("Average of Odd numbers: " + AverageForOdd);

    }
}
