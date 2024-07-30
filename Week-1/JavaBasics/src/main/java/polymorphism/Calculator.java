package polymorphism;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add());
        System.out.println(add("123", "456"));

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int add() {
        return 0;
    }

    public static int add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public static int add(String num1, int num2) {
        return Integer.parseInt(num1) + num2;
    }

    public static int add(int num1, String num2) {
        return num1 + Integer.parseInt(num2);
    }

    //While you can make overloaded methods do Anything. Often, in reality, we have them arrive to similar
    //intended outcomes.
    public static void add(double num1, double num2) {
        System.out.println("I am going to do other things! Mwahahaha");
        System.out.println(num1 * num2);
        Math.max(num1, num2);
    }

}