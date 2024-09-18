//Write a Java program to reverse elements in an array list.

package ArrayListHomework;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Before reversing: " + colors);

        Collections.reverse(colors);

        System.out.println("After reversing: " + colors);
    }
}
