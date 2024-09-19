import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {

        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}
