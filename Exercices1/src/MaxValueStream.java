import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class MaxValueStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2, 10, 6);


        Optional<Integer> maxValue = numbers.stream()
                .max(Integer::compareTo);


        if (maxValue.isPresent()) {
            System.out.println("Maximum value: " + maxValue.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}