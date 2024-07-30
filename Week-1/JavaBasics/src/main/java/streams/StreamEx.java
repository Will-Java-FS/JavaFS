package streams;

import collections.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        Person p1 = new Person("Ryan Schlientz", 300, 200);
        Person p2 = new Person("Richard Orr", 400, 300);
        Person p3 = new Person("Sierra Nichols", 200, 250);
        Person p4 = new Person("Adam Ranieri", 250, 350);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Scanner scan = new Scanner(System.in);

        //Create a stream
        String[] words = {"Hello", "Hey", "Hi"};
        Stream.of(words).forEach(System.out::println);

//        System.out.println("Enter a Name: ");
//        String input = scan.nextLine();
//        streamNameContaining(people, input);

//        System.out.println("Enter an Age: ");
//        int ageInput = scan.nextInt();
//        streamPersonAboveAge(people, ageInput);

        System.out.println("Enter a Name: ");
        String input = scan.nextLine();
        streamPersonInfo(people, input);

    }

    private static void streamNameContaining(List<Person> people, String substring) {
        //Get all Person(s) that the substring in their name.
        //from some list of people. and print those names to the console.

        List<Person> personList = people.stream()
                .filter(person -> person.getName().contains(substring))
                .collect(Collectors.toList());
        System.out.println(personList);
    }

    private static void streamPersonAboveAge(List<Person> people, int age) {

        //Use a Stream to return the names of the the employees above a certain age.
        List<String> names = people.stream().filter(person -> person.getAge() > age)
//        .forEach(person -> System.out.println(person.getName()));
        .map(Person::getName)
        .collect(Collectors.toList());

        //Could return this crafted set of names, but will print for ease of example.
        System.out.println(names);

    }

    private static void streamPersonInfo(List<Person> people, String name) {

        //Have the user enter their name and if they exist
        //print their name and height to the console.

        Optional<Person> personOptional = people.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst();

        System.out.println(personOptional.isPresent()
                ? "Name: " + personOptional.get().getName() + "; Height: " + personOptional.get().getHeight()
                : "No Person Found");
    }


}