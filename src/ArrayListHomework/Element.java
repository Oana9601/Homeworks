package ArrayListHomework;//Write a Java program to insert an element
// into the array list at the first position.

import java.util.ArrayList;

public class Element {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Original ArrayList: " + colors);
        colors.add(0, "Purple");

        System.out.println("Modified ArrayList: " + colors);

    }
}

