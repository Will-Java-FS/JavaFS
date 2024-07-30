package polymorphism;

public class Playground {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.jobtitle = "Trainer";
        p.work();
//        p.play();

        Child c = new Child();
        c.favoritegames = "Minecraft";
        c.jobtitle = "Student";
        c.work();
        c.play();


        //Will have all of the states (fields) and behaviors (methods) available in the Parent Class.
        //Will have the implementations provided by the Child Class.
        Parent pc = new Child();
        pc.work();
        pc.jobtitle = "Something";
//        pc.play();
//        pc.favoritegames = "Something";


        //DETOUR

//        pc = new Parent();

        Parent p2 = pc;
        p2.work();

//        Parent p0 = (Parent) c; //This is okay because the Child variable 'c' has everything needed to make a Parent Object
//        Child c0 = (Child) p; //This is not okay because the Parent variable 'p' does not have everything needed to make a Child Object.

        Child c1 = (Child) pc;
        c1.work();
        c1.play();

    }

}