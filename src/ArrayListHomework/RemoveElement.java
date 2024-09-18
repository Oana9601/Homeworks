package ArrayListHomework;//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Original ArrayList: " + colors);

        if (colors.size() > 2) {
            colors.remove(2);

            System.out.println("ArrayList after removing the third element: " + colors);
        }
    }
        }
