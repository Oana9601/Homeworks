package HashSetHomework;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();


        hashSet.add("Peach");
        hashSet.add("Blueberry");
        hashSet.add("Strawberry");
        hashSet.add("Bed");
        hashSet.add("Lemon");

        System.out.println("Iterating using for-each loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }


        System.out.println("\nIterating using iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

            System.out.println("\nIterating using forEach() method:");
        hashSet.forEach(element -> System.out.println(element));
    }
}

