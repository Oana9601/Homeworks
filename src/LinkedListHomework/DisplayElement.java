package LinkedListHomework;

import java.util.LinkedList;

public class DisplayElement {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("The positions and their elements: ");
        for (int i = 0; i < colors.size(); i++) {
            String element = colors.get(i);
            System.out.println("Position " + i + ": " + element);
        }
    }
}
