package encapsulation2;

import encapsulation.Thing;

public class Playground3 extends Thing {

    public static void main(String[] args) {

        Thing thing3 = new Thing();

        System.out.println(thing3.publicName);
        thing3.publicMethod();

//        System.out.println(thing3.protectedName);
//        thing3.protectedMethod();

        Playground3 playground3 = new Playground3();

        System.out.println(playground3.protectedName);
        playground3.protectedMethod();


    }

}