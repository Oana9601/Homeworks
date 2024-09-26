import java.util.function.Function;

public class StringLengthFunction {
    public static void main(String[] args) {

        Function<String, Integer> stringLengthFunction = str -> str.length();

        String exampleString = "Hello, World!";
        int length = stringLengthFunction.apply(exampleString);

        System.out.println("The length of the string \"" + exampleString + "\" is: " + length);
    }
}
