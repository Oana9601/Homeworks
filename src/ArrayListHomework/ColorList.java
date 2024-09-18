package ArrayListHomework;//1. Write a Java program to create an array list,
// add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class ColorList{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Color list is:" + colors);
    }
}

