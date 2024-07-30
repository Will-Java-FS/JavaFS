package controlflow;

import java.util.Scanner;

/*
A Loop is designed to allow us to reiterate over code that we want
to have potentially executed many times.

 */
public class WhileLoops {

    public static void main(String[] args) {

        int count = 1;
        //Print the numbers 1-1000
        while (count <= 1000) {
            System.out.println(count);  //Print the value
            count++;                    //Update the value
        }

        System.out.println(count);

        boolean isSunny = false;
        while(isSunny) {
            System.out.println("I'm glad sunny outside!");
            isSunny = !isSunny;
        }

        int num = 100;

        while (num <= 50) {
            System.out.println(num++);
        }

        //While loops are best used in situations where the number of iterations is unknown/incalculable

        //Primitive variables:
        int num1 = 5;

        //Object variable:
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number 5: ");
        String input = scan.nextLine();

        System.out.println("The number you enter was: " + input);

        /*
        while input is not 5, have the user try again.
         */

        //Integer.parseInt(string); -> returns the int of that string.
        int number = Integer.parseInt(input);
        System.out.println(number);

        //For as long as the user does not pick 5, try again.
        while(number != 5) {
            System.out.println("You did not enter the #5. Please try again: ");
            input = scan.nextLine();
            number = Integer.parseInt(input);
        }

        System.out.println("You finally did it! You entered 5!!!");


        //Do-While Loop

        count = 100;
        do {
            System.out.println("Something to print.");
            count++;
        } while(count <= 10);

    }



}