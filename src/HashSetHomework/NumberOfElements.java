package HashSetHomework;

import java.util.HashSet;

public class NumberOfElements {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Peach");
        hashSet.add("Blueberry");
        hashSet.add("Strawberry");
        hashSet.add("Bed");

        System.out.println("HashSet elements: " + hashSet);

        int size = hashSet.size();

        System.out.println("Number of elements in the HashSet: " + size);
    }
}
