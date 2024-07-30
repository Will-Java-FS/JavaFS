package encapsulation2;

import encapsulation.Thing;

public class Playground2 {

    public static void main(String[] args) {

        Thing thing2 = new Thing();

        System.out.println(thing2.publicName);
//        System.out.println(thing2.protectedName);  //Cannot access protected fields outside of their package.
//        System.out.println(thing2.defaultName); //Cannot access default fields outside of their package.
//        System.out.println(thing2.privateName); //Cannot access private fields outside of their class.

        thing2.publicMethod();
//        thing2.protectedMethod(); //Cannot access protected methods outside of their package.
//        thing2.defaultMethod(); //Cannot access default methods outside of their package.
//        thing2.privateMethod(); //Cannot access private methods outside of their class.

    }
}