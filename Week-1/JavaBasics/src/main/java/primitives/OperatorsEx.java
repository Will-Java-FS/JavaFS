package primitives;

public class OperatorsEx {

    public static void main(String[] args) {

        // Assignment Operator
        int x = 10, y = 2;

        // Arithmetic Operator
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        System.out.println(x);
        System.out.println(y);

        // Augmented Assignment Operators
        // Shorthand

        x = x + 3;
        x += 3; // A Shorthand for x = x + 3;
        x -= 6;
        x *= 2;
        x /= 7;
        x %= 2;

        // Increment/Decrement Operators
        // shorthand for adding or subtracting 1 from a particular value.
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        x++;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        // Post-Increment/Decrement -> x++; x--;
        // Pre-Increment/Decrement -> ++x; --x;

        System.out.println(x++);
        System.out.println(x);

        System.out.println(++x);
        System.out.println(x);

        // Do tonight. X starts at 5.
        System.out.println(1 + ++x);
        System.out.println(1 + x++);
        System.out.println("x = " + x);

        System.out.println(--x - 1);
        System.out.println("x = " + x);
        System.out.println(x++ - 1);
        System.out.println("x = " + x);

        // Comparison Operators:
        // ==, !=, <, >, <=, >=
        System.out.println(x == y);
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);

        System.out.println("--------");
        // Logical Operators
        // !, &&, ||
        System.out.println(x > 0);
        System.out.println(!(x > 0));

        System.out.println((x > 0) && (x < 5));
        System.out.println((x > 0) || (x < 5));

        // &&, || -> Short-circuit operators
        // If the overall result can be determine from the outcome of the left
        // expression,
        // then we (Java) will not execute the right expression

        // &, |, ^ -> bitwise operators
        // Will calculate the boolean expression on both sides of the operator,
        // regardless of the results
        // from the first calculation.

    }
}