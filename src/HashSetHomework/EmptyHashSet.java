package HashSetHomework;

import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Peach");
        hashSet.add("Blueberry");
        hashSet.add("Strawberry");
        hashSet.add("Bed");


        System.out.println("Original HashSet: " + hashSet);

        hashSet.clear();

        System.out.println("HashSet after clearing: " + hashSet);

        if (hashSet.isEmpty()) {
            System.out.println("The HashSet is now empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}

