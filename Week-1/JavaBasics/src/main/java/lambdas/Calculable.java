package lambdas;

@FunctionalInterface
public interface Calculable {

    double calculate(double num1, double num2);

    //for demo purposes only
    default void hello() {
        System.out.println("Hello");
    }

//    double anotherOne();

}