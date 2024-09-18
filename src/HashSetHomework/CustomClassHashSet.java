//Create a custom class and override equals() and hashCode() methods.
// Create a hash set and store objects of the class in it.

package HashSetHomework;

import java.util.HashSet;
import java.util.Objects;

class Person{
private String name;
private int age;


public Person(String name, int age) {
    this.name = name;
    this.age = age;
}


public String getName() {
    return name;
}

public int getAge() {
    return age;
}


@Override
public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    Person person = (Person) object;
    return age == person.age && Objects.equals(name, person.name);
}


@Override
public int hashCode() {
    return Objects.hash(name, age);
}


@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}
}

public class CustomClassHashSet {
    public static void main(String[] args) {

        HashSet<Person> personSet = new HashSet<>();


        personSet.add(new Person("Kate", 20));
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("John", 25));


        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}