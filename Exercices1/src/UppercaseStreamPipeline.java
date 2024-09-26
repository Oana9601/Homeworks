import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UppercaseStreamPipeline {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("orange");
        strings.add("banana");
        strings.add("cherry");
        strings.add("park");


        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println("List of uppercase strings: " + uppercaseStrings);
    }
}
