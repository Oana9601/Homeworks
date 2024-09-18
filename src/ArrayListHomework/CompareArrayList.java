// Write a Java program to compare two array lists.

package ArrayListHomework;

import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Pink");
        list1.add("Green");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Pink");
        list2.add("Green");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Red");
        list3.add("Pink");
        list3.add("Green");

        if (list1.equals(list2)) {
            System.out.println("list1 and list2 are equal.");
        } else {
            System.out.println("list1 and list2 are not equal.");
        }

        if (list1.equals(list3)) {
            System.out.println("list1 and list3 are equal.");
        } else {
            System.out.println("list1 and list3 are not equal.");
        }
    }
}
