import java.util.stream.IntStream;

public class SumAllEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        System.out.print(sumEvenNumbers(numbers));
    }

    public static int sumEvenNumbers(int[] numbers) {
        return IntStream.of(numbers).filter(x -> x % 2 == 0).sum();
    }

}