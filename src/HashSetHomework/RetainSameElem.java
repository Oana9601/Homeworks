package HashSetHomework;

import java.util.HashSet;

public class RetainSameElem {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("Peach");
        set1.add("Blueberry");
        set1.add("Strawberry");
        set1.add("Bed");

        set2.add("Blueberry");
        set2.add("Strawberry");
        set2.add("Apple");
        set2.add("Lemon");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}
