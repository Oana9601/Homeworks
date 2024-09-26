import java.util.function.UnaryOperator;

public class SquareUnaryOperator {
    public static void main(String[] args) {

        UnaryOperator<Integer> squareOperator = x -> x * x;

        int value = 5;
        int result = squareOperator.apply(value);

        System.out.println("The square of " + value + " is: " + result);
    }
}
