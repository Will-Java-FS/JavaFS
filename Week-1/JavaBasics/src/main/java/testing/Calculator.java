package testing;

public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }

    public static boolean isGreater(int num1, int num2) {
        if(num1 > num2) {
            return true;
        } else {
            return false;
        }
    }

}