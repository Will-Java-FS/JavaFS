package streams;

import collections.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalEx {

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
        System.out.println("Enter your name: ");
        String input = scan.nextLine();

        //Variable to represent a logged in person
        Person currentUser = null;

        for(Person p : people) {
            if(p.getName().contains(input)) {
                currentUser = p;
            }
        }

        if(currentUser != null) {
            //If logged in, can retrieve their information, or do whatever we want.
            System.out.println(currentUser.getAge());
        }

        /*
        Optional Class - An object that will contain a value for us.
        and allows us to check if that value is null as a prevention for NullPointerException

        Optional Classes are often used when dealing with variables that we know could potentially be null.
         */

        Optional<Person> optionalPerson = Optional.ofNullable(currentUser);

        System.out.println(optionalPerson.isPresent());

        System.out.println(optionalPerson.isPresent() ? optionalPerson.get().getHeight() : "Person: " + input
         + "; Not Found!");

        optionalPerson.ifPresent(x -> System.out.println(x.getName()));
        //optionalPerson.ifPresentorElse(consumer if present, consumer else not present);
        Person p = optionalPerson.orElse(new Person());


    }

}