package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEx {

    public static void main(String[] args) {

        Person ryan = new Person("Ryan", 300, 300);
        Person richard = new Person("Richard", 200, 400);
        Person sierra = new Person("Sierra", 100, 200);

        List<Person> people = new ArrayList<>();
        people.add(ryan);
        people.add(richard);
        people.add(sierra);

        System.out.println(people);

        System.out.println(ryan.compareTo(richard));
        System.out.println(richard.compareTo(sierra));

        Collections.sort(people);
        System.out.println(people);

        // Collections.sort(people, Person.hc);
        people.sort(Person.hc); // Preferred approach.
        System.out.println(people);

        people.sort(Person.nameComparator);
        System.out.println(people);

        // Footnote
        System.out.println(ryan.getName().compareTo(richard.getName()));

    }

}