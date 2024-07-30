package scopes;

public class Playground {

    public static void main(String[] args) {

//        System.out.println(instancenum);  //Cannot access object scopes outside of their Object
//        System.out.println(staticnum);    //Cannot access class scopes outside of their Class

        Box box1 = new Box();
        Box box2 = new Box();

        //Object Scopes
        System.out.println(box1.instancenum);
        System.out.println(box2.instancenum);

        box1.instancenum = 200;
        box2.instancenum = 300;

        System.out.println(box1.instancenum);
        System.out.println(box2.instancenum);

        //Class Scopes
        System.out.println(box1.staticnum);
        System.out.println(box2.staticnum);

        box1.staticnum = 20;
        box2.staticnum = 30;

        System.out.println(box1.staticnum);
        System.out.println(box2.staticnum);

        System.out.println(Box.staticnum);

        box1.staticMethod();
        box2.staticMethod();

        Box.staticMethod();

//        int newNum = Integer.parseInt("456");

//        System.out.println(Integer.MAX_VALUE); //Accessing this field without having to create an Integer Object.
//        Integer num1 = 100;
//        System.out.println(num1.MAX_VALUE);

//        Math.pow(2, 3);

        System.out.println("-----------");
        box1.method(1000);

//        printSomething();
        Playground playground = new Playground();
        playground.printSomething();

    }

    public void printSomething() {
        System.out.println("Something");
    }
}