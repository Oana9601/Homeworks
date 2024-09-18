//Write a Java program to insert the specified element at the front of a linked list

package LinkedListHomework;

import java.util.LinkedList;

public class InsertElement {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");

        System.out.println("Before insert element: " + colors);

        colors.addFirst("Yellow");

        System.out.println("After insert element: " + colors);


    }
}
