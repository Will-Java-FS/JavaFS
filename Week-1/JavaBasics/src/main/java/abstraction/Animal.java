package abstraction;

public abstract class Animal {

    String species;

    //Concrete Method because it has an implementation
    public void eat() {
        System.out.println("The animal is eating something.");
    }

    //Abstract Method -> anything that inherits Animal will be required to implement this method.
    public abstract void makeSound();

}