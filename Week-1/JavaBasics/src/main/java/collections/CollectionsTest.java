package collections;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args) {

        Person ryan = new Person("Ryan", 300, 300);
        Person richard = new Person("Richard", 200, 400);
        Person sierra = new Person("Sierra", 100, 200);

        List<Person> people = new ArrayList<>();
        people.add(ryan);
        people.add(richard);
        people.add(sierra);
        people.add(0, ryan);

        System.out.println(people);

        System.out.println(people.get(2));
        System.out.println(people.size());

        Set<Person> personSet = new HashSet<>();
        personSet.add(ryan);
        personSet.add(richard);
        personSet.addAll(people);

        System.out.println(personSet);

        //Map

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, ryan);
        personMap.put(12, richard);
        personMap.put(45, sierra);

        System.out.println(personMap.get(45));

        //Indirect approach to iterating over a Map
        Set<Integer> keySet = personMap.keySet();

        //Inefficient way to do this:
        List<Integer> keyList = new ArrayList<>(keySet);
        for(int i = 0; i < keyList.size(); i++) {
            int key = keyList.get(i);
            System.out.println(key + " = " + personMap.get(key));
        }

        //Enhanced For Loop - designed to loop over an entire collection of elements.
        for(Integer key : personMap.keySet()) {
            System.out.println(key + " = " + personMap.get(key));
        }

    }

}