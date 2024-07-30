package wrappers;

public class WrapperEx {

    public static void main(String[] args) {

        double d = 0.3; //primitive
        Double dd = 0.3; //Wrapper Class equivalent (Wrapper Object)
        Double ddd = new Double(0.3); //Can but likely would never.


        System.out.println(Integer.MIN_VALUE);
        System.out.println(dd.MAX_VALUE); //should access through Class, but isn't going to break if you don't


        int n1 = 9;
        int n2 = 10;
        Integer n3 = 14;
        Integer n4 = 15;

        add(n1, n2);
        add(n3, n4);
//        add(0.5, 0.6); //doesn't work with other data types
        add(n1, n3);

        multiply(n3, n4);
        multiply(n1, n2);
        multiply(n2, n4);

        int num = Integer.parseInt("123");


    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void multiply(Integer num1, Integer num2) {
        System.out.println(num1 * num2);
    }

}