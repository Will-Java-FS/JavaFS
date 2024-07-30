package polymorphism;

public class Child extends Parent {

    String favoritegames;

    public void play() {
        System.out.println("Playing on the Playground");
    }

    @Override
    public void work() {
        System.out.println("Did homework for grade school");
    }

    // Covariant Return type -> when overriding a method you can slightly adjust the
    // return types
    // to other data types that inherit from the original return type.
    @Override
    public Child someMethod() {
        return new Child();
    }

}