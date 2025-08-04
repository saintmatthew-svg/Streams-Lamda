import java.util.Arrays;

public class NumberOfString {
    public static void main(String[] args) {
        String[] words = {"apple","banana","orange","umbrella"};
        System.out.print(stringVowel(words));
    }

    public static int stringVowel(String[] words) {
        return (int) Arrays.stream(words)
                .filter(word -> "aeiou".indexOf(word.charAt(0)) != -1)
                .count();
    }
}