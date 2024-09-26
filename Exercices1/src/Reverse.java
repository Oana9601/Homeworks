import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");


        strings.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted list in reverse alphabetical order: " + strings);
    }
}
