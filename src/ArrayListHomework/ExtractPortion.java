//Write a Java program to extract a portion of an array list.

package ArrayListHomework;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        int fromIndex = 2;
        int toIndex = 5;

        List<String> subList = colors.subList(fromIndex, toIndex);

        System.out.println("Extracted portion (from index "
                + fromIndex + " to " + toIndex + "): " + subList);
    }
}
