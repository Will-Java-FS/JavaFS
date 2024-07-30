package lambdas;

public class Divider implements Calculable {

    @Override
    public double calculate(double num1, double num2) {
        return num1 / num2;
    }
}