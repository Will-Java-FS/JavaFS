package polymorphism;

public class Parent {

    String jobtitle;

    public void work() {
        System.out.println("Work hard to make money.");
    }

    public Parent someMethod() {
        return new Parent();
    }

}