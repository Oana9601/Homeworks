// Write a Java program to append the specified element to the end of a hash set.

package HashSetHomework;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Peach");
        hashSet.add("Blueberry");
        hashSet.add("Strawberry");

        System.out.println("Original HashSet: " + hashSet);

        String elementToAdd = "Banana";

        hashSet.add(elementToAdd);

        System.out.println("Updated HashSet: " + hashSet);

    }
}
