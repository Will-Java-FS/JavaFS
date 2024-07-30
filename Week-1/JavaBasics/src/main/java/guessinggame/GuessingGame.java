package guessinggame;

import java.util.Scanner;

//Validate that the input is a Number. (consider input.matches() or Character.isDigit()
//Track incorrect guesses to tell the player to pick a number in the new limited range. i.e. 60 is too high. Pick #1-59.
//Track total guesses, display at the end.
//Create a way for the entire game to be played again (as many times as desired) without having to restart the application.
//Create a system for leaving the game (exiting/finishing the app) at any point. Often choices like -1 are used for this.
//Bonus: Write out your scores (number of guesses) out to a txt file to track high scores. I'd suggest BufferedWriter
//Bonus to the Bonus: Have those Past/High Scores read into the app at the start of the game and displayed. I'd suggest BufferedReader.
public class GuessingGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;

        //Have the User make a Guess
        System.out.println("Enter a number between 1-100: ");
        String input = scan.nextLine();
        int myNumber = Integer.parseInt(input);

        while(myNumber != randomNumber) {
            //Guess Again

            if(myNumber > randomNumber) {
                System.out.println("You guessed too high!");
            } else {
                System.out.println("You guessed too low!");
            }

            System.out.println("Enter a number between 1-100: ");

            input = scan.nextLine();
            myNumber = Integer.parseInt(input);

        }

        System.out.println("you guessed the right number! It was: " + randomNumber);

    }

}