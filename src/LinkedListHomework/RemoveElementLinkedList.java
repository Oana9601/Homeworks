package LinkedListHomework;

import java.util.LinkedList;

public class RemoveElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Before removal: " + colors);

        String elementToRemove = "Yellow";

        boolean isRemoved = colors.remove(elementToRemove);

        if (isRemoved) {
            System.out.println("Element '" + elementToRemove + "' was removed.");
        } else {
            System.out.println("Element '" + elementToRemove + "' was not found.");
        }

        System.out.println("After removal: " + colors);
    }
}
