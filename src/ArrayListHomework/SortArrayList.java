package ArrayListHomework;// Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Before sorting: " + colors);

        Collections.sort(colors);

        System.out.println("After sorting: " + colors);
    }
}
