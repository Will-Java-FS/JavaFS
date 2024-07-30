package exceptions;

import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        printDivision();

    }

    private static void printDivision() {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        try {
            int result = x / y;
            System.out.println(result);

            // I picked this exception at random. It is up to developer
            // to pick or use meaningful exceptions.
            throw new FileLockInterruptionException();
            // return;

        } catch (ArithmeticException e) {
            System.out.println("Oops! Something went wrong!");
            e.printStackTrace();
        } catch (FileLockInterruptionException e) {
            e.printStackTrace();
        } finally {
            System.out.println("In a finally block");
            scan.close();
        }

        System.out.println("End of program");
    }

}