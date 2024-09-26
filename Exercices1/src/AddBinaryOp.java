import java.util.function.BinaryOperator;

public class AddBinaryOp {
    public static void main(String[] args) {

        BinaryOperator<Integer> addOperator = (a, b) -> a + b;

        int number1 = 10;
        int number2 = 20;
        int result = addOperator.apply(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
