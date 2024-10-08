import java.util.List;
import java.util.Arrays;

public class SumOfIntegers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Sum of all integers: " + sum);
    }
}
