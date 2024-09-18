//Write a Java program to clone an array list to another array list.

package ArrayListHomework;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Original ArrayList: " + colors);

        ArrayList<String> clonedColors = (ArrayList<String>) colors.clone();

        System.out.println("Cloned ArrayList: " + clonedColors);
    }
}
