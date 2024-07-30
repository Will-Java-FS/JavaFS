package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class Calculator {
    public static void main(String[] args) {
        Divider divide = new Divider();

        Calculable multiply = (x, y) -> {
            System.out.println("Multiplying two numbers");
            return x * y;
        };

        Calculable add = (x, y) -> {
            System.out.println("Adding two numbers");
            return x + y;
        };

        System.out.println(divide.calculate(10, 2));
        System.out.println(multiply.calculate(10, 2));

        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(8));

        Calculable subtract = Calculator::subtractor;
        System.out.println(subtract.calculate(10,2));
    }
        public static double subtractor(double x, double y){
            return x-y;
        }


    }

