package encapsulation;

public class Playground {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

//        emp1.username = "whatever";


        Thing thing1 = new Thing();

        System.out.println(thing1.publicName);
        System.out.println(thing1.protectedName);
        System.out.println(thing1.defaultName);
//        System.out.println(thing1.privateName); //Cannot access private fields outside of their class.

        thing1.publicMethod();
        thing1.protectedMethod();
        thing1.defaultMethod();
//        thing1.privateMethod(); //Cannot access private methods outside of their class.



    }

}