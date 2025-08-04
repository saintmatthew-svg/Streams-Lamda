import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class OddNumberStream {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        IntStream generated = random.ints(50,0, 1000)
                .filter(i -> i % 2 != 0)
                .sorted();

        List<Integer> numbers = new ArrayList<>();
        generated.forEach(numbers::add);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("total numbers: " + numbers.size());
    }
}
