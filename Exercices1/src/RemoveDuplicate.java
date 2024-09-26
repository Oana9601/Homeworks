import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 4, 8, 9, 5);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
