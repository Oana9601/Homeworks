// Write a Java program to join two array lists.

package ArrayListHomework;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<String> color1 = new ArrayList<>();
        color1.add("White");
        color1.add("Blue");
        color1.add("Black");

        ArrayList<String> color2 = new ArrayList<String>();
        color2.add("Pink");
        color2.add("Purple");

        System.out.println("First ArrayList: " + color1);
        System.out.println("Second ArrayList: " + color2);

        color1.addAll(color2);

        System.out.println("Combined ArrayList: " + color1);

    }
}
