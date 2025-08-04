import java.util.Arrays;

public class FlattenToSingleList {
    public static void main(String[] args) {
        int[][] numbers = {{1,2},{3,4},{5,6}};
        System.out.print(Arrays.toString(flattenList(numbers)));
    }

    public static int[] flattenList(int[][] numbers) {
        return Arrays.stream(numbers)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
