package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Person p1 = new Person("Will Terry",300, 200);
        Person p2 = new Person("Richard Orr",400,300);
        Person p3 = new Person("Sierra Nichols",200,250);
        Person p4 = new Person("Adam Ranieri",250,250);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        String[] words = {"Hello","Hey","Hi"};
        Stream.of(words).forEach(System.out::println);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name:");
        String input = scan.nextLine();

        //Get all Person Objects that the substring is in their name.
        //From the list of People. And Print those names to the console.

        List<Person> personList = people.stream()
                .filter(person ->person.getName().contains(input))
                .collect(Collectors.toList());
        System.out.println(personList);

        //Use a Stream to return the name of the Employees above a certain age.

        System.out.println("Enter an Age");
        int age = scan.nextInt();
        List<String> names = people.stream()
                .filter(person->person.getAge()>=age)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names);

    }
}
