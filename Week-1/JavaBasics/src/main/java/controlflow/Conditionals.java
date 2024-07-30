package controlflow;

public class Conditionals {

    public static void main(String[] args) {

        int num = 1;

        /*
        Conditional is a block of code that will execute on the basis of some condition
        Relational Operators -> ==, !=, >, <, >=, <=
        Logical Operators -> !, &, &&, |, ||, ^
        Condition is any expression that evaluated to true or false.
         */

        if (num > 5) {
            System.out.println("Our number is greater than 5.");
            System.out.println("Another print statement.");
        } else {
            System.out.println("Our number is not greater than 5.");
        }


        System.out.println("-------------------");

        //Nested Control Flow
        if (num > 5) {
            if (num > 10) {
                System.out.println("Our number is greater than 10.");
            } else {
                System.out.println("Our number is greater than 5, but less than 10.");
            }
        } else {
            System.out.println("Our number is not greater than 5.");
        }

        //If-elseif-else
        if (num > 10) {
            System.out.println("Our number is greater than 10.");
        } else if (num > 5) {
            System.out.println("Our number is greater than 5, but less than 10.");
        } else {
            System.out.println("Our number is not greater than 5.");
        }


        //Ternary Operators
        //are an alternative to an if-else statement. They are best used when replacing a situation
        //with only two outcomes.

        System.out.println("Our number is " + performTernary(num) + " greater than 5.");


        //Switch-Cases
        //Switch-Cases are best used in scenarios where a value being assessed has exact valued matches.

        /*
        switch (variable) {

        case value1: {
            dosomething();
        } case value2: {
            doSomethingElse();
        }
        }
         */

        System.out.println("--------------------");


        switch (num) {

            case 0: {
                System.out.println("Our number is 0");
                break;
            }
            case 1: {
                System.out.println("Our number is 1");
                break;
            }
            case 2:
            case 3: {
                System.out.println("Our number is either 2 or 3.");
                break;
            }
            default: {
                System.out.println("Our number is something else");
                break;
            }

        }


        System.out.println("End of Program");


    }

    private static String performTernary(int num) {
        String result = (num > 5) ? "" : "not";
        return result;
    }

}