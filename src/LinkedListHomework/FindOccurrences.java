//Write a Java program to get the first
// and last occurrence of the specified elements in a linked list.

package LinkedListHomework;

import java.util.LinkedList;

public class FindOccurrences {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");

        System.out.println("LinkedList: " + colors);

        String searchElement = "Green";

        int firstIndex = colors.indexOf(searchElement);
        int lastIndex = colors.lastIndexOf(searchElement);


        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("'" + searchElement + "' is not present in the LinkedList.");
        }
    }
}
