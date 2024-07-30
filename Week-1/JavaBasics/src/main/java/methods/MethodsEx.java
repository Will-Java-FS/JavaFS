package methods;

public class MethodsEx {

    public static void main(String[] args) {

        /*
        All programs start in the main method.
        But we can create additional methods for us to use.
        This promotes reusability as well as having more readable code.
         */

        int num = 5;

//        num = num * num;
        num *= num;
        System.out.println(num);

        num = 7;

        num *= num;
        System.out.println(num);

        //------------------------


        printSquare(6);
        printSquare(num);
        printSquare(14);
        printSquare(1111111);


    }

    /**
     * A method that takes in a number and squares it. Then prints it.
     * @param number - the number to be squared and printed.
     */
    public static void printSquare(int number) {

        number *= number;
        System.out.println(number);

    }

}