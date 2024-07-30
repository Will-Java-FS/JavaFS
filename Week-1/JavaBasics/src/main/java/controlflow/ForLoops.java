package controlflow;

public class ForLoops {

    public static void main(String[] args) {

        //For Loops are best used when the number of iterations is known/calculable.

        /*

        for(counter; condition; update) {

        }
         */

        //Print out the numbers 1-100
        for (int counter = 1; counter <= 100; counter++) {
            System.out.println(counter);
        }

        //Print out the numbers 75-25
        for (int counter = 75; counter >= 25; counter--) {
            System.out.println(counter);
        }

        //Print the sum of the even numbers 2-100
//        int sum = 0;
//        for (int counter = 2; counter <= 100; counter++) {
//            if(counter % 2 == 0) {
//                sum += counter;
//            }
//        }

        int sum = 0;
        for (int counter = 2; counter <= 100; counter += 2) {
            sum += counter;
            System.out.println(sum);
        }

        System.out.println(sum);


        int rows = 5;
        int cols = rows;

        //print the 10 x 10 Times Table
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print(i*j + ""); //i = row# and j = column#
            }
            System.out.println();
        }


        //Staircase Challenge

        // Create the Traditional (Left-facing) Staircase
        // Create the Right-facing Staircase
        // Create the Inverted Left-facing Staircase
        // Create the Inverted Right-facing Staircase

        /*
        Inverted Staircase (left-facing)
        ####
        ###
        ##
        #
         */

        for(String word = "a"; !word.equals("aaaaa"); word += "a") {
            System.out.println(word);
        }


    }

}