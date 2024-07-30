package objects;

public class Car {

    //instance variables
    //States i.e. Fields, properties, attributes
    String name;
    String color;
    String make;
    String model;
    int year;
    int mileage;

    //Behaviors
    //Methods in a Class without a main method are not required to use the static keyword.
    public void drive(int milesDriven) {
        mileage += milesDriven;
        System.out.println("You drove " + milesDriven + " miles.");
        System.out.println("New total mileage: " + mileage);
    }

    public String toString() {
        return "Name: " + name + "; Color: " + color + "; Make: " + make
                + "; Model: " + model + "; Year: " + year + "; Mileage: " + mileage;
    }

}