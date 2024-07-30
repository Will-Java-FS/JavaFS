package lambdas;

public class Calculator {

    public static void main(String[] args) {

        Divider divide = new Divider();

        Calculable add = (x,y) -> {
            System.out.println("Adding two numbers");
            return x + y;
        };

        Calculable multiply = (x,y) -> {
            System.out.println("Multiplying two numbers");
            return x * y;
        };


        System.out.println(divide.calculate(10, 2));
        System.out.println(add.calculate(10, 2));
        System.out.println(multiply.calculate(10,2));

    }

}