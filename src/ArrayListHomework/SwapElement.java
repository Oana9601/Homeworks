// Write a Java program that swaps two elements in an array list.
package ArrayListHomework;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Before swapping: " + colors);


        Collections.swap(colors, 1, 3);

        System.out.println("After swapping: " + colors);
    }
}
