package objects;

import java.util.Date;

public class TestDrive {

    public static void main(String[] args) {

        //Creation of primitives
        int num = 5;
        //Strings are a special case for Objects.
        String word = "Hello";

        //Creation of Objects
        Date now = new Date();
//        now.setTime(0);
        now.setTime(System.currentTimeMillis());
        System.out.println(now);

        //Creation of our own Object we defined.
        Car sedan1 = new Car();

        sedan1.year = 2016;
        sedan1.mileage = 8;
        sedan1.name = "My Car";

        System.out.println(sedan1.year);
        System.out.println(sedan1.mileage);
        System.out.println(sedan1.name);
        System.out.println(sedan1.make);

        sedan1.drive(10);
        sedan1.drive(10);
        sedan1.drive(10);
        sedan1.drive(10);

        Car sedan2 = new Car();

        System.out.println(sedan2.year);
        System.out.println(sedan2.mileage);

        sedan2.drive(100);
        System.out.println(sedan1.mileage);
        System.out.println(sedan2.mileage);


        Car sedan3 = sedan1;

        System.out.println(sedan3.mileage);
        sedan3.drive(100);

        System.out.println(sedan1.mileage);
        System.out.println(sedan2.mileage);

        sedan1 = null;
        System.out.println(sedan3.mileage);
        System.out.println(sedan2.mileage);
//        System.out.println(sedan1.mileage); //Will cause NullPointerException

        System.out.println(15);
        int number = 10;
        System.out.println(number);
        Date currentTime = new Date(System.currentTimeMillis());
        System.out.println(currentTime);

        System.out.println(sedan2);
//        System.out.println(sedan2.toString()); //Not necessary to call the object's toString() directly.

    }

}