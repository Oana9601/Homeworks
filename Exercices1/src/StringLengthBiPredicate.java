import java.util.function.BiPredicate;

public class StringLengthBiPredicate {
    public static void main(String[] args) {
        BiPredicate<String, String> isFirstStringLonger = (str1, str2) -> str1.length() > str2.length();


        String string1 = "Hello";
        String string2 = "World!";

        boolean result = isFirstStringLonger.test(string1, string2);

        if (result) {
            System.out.println("\"" + string1 + "\" is longer than \"" + string2 + "\".");
        } else {
            System.out.println("\"" + string1 + "\" is not longer than \"" + string2 + "\".");
        }
    }
}
