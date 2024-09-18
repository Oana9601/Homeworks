package ArrayListHomework;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to iterate through all elements in an array list.
public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Iteration using a traditional for loop:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("Iteration using an Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


