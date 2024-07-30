package abstraction;

public interface Herbivore {

    int number = 12;

    //As of Java 8, we can have Concrete Methods within an Interface.
    default void eatPlant() {
        System.out.println("Eats Plant. Yum.");
    }

    //By extension, as of Java 9, we can have private concrete methods.

}