package scopes;

public class Box {

    static int staticnum = 10;
    int instancenum = 100;

    public static void staticMethod() {
        System.out.println("This is a static method");
//        System.out.println(instancenum);
        System.out.println(staticnum);

//        method();
        int anothernum = 10000;
    }

    public void method(int paramnum) {

        int methodnum = 5;

        System.out.println(staticnum);
        System.out.println(instancenum);
        System.out.println(paramnum);
        System.out.println(methodnum);
//        System.out.println(anothernum);


        if(true) {

            int blocknum = 1;

            System.out.println(staticnum);
            System.out.println(instancenum);
            System.out.println(paramnum);
            System.out.println(methodnum);
            System.out.println(blocknum);

        } else {
//            System.out.println(blocknum);
        }

        System.out.println("--------------");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        for(int i = 0, j = 0; i < 5; i++) {
            for(j = 0; j < 10; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");

    }

}