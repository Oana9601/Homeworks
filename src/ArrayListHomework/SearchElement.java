package ArrayListHomework;//Write a Java program to search an element in an array list.

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        String searchColor = "Black";

        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is found in the ArrayList.");
        } else {
            System.out.println(searchColor + " is not found in the ArrayList.");
        }
    }
}
