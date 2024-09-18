//Write a Java program to append the specified element to the end of a linked list.

package LinkedListHomework;

import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");

        System.out.println("Before appending: " + colors);

        colors.add("Blue");

        System.out.println("After appending: " + colors);
    }
}
