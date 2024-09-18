// Write a Java program to insert some elements at the specified position into a linked list.

package LinkedListHomework;

import java.util.LinkedList;

public class PositionElement {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");

        System.out.println("Before inserting: " + colors);

        colors.add(1, "Yellow");
        colors.add(3, "Purple");

        System.out.println("After inserting: " + colors);
    }
}
