package arrays;

import java.util.Arrays;

public class ArraysEx {

    public static void main(String[] args) {

        //An array that holds 4 ints (length of 4). Indexes: 0-3
        int[] ray = new int[4];

        ray[0] = 10; //Assign a value to the first element (index 0) of our array.
        ray[1] = 11;
        ray[2] = 12;
        ray[3] = 13;
//        ray[4] = 14;
//        ray[-2] = 8;

        System.out.println(ray);
        System.out.println(Arrays.toString(ray));
        System.out.println(ray[0]);
        System.out.println(ray.length);


        String[] words = { "Hello", "Hey", "Hi" };
        System.out.println(words.length);
        System.out.println(words[2]);
        System.out.println(words[1].toLowerCase());

//        words = { "Hello" }; //Cannot re-use the Array Literal once the array has been made.
        words = new String[3];


        //Detour
        //Multi-Dimensional Array
        int[][] number2DArray = new int[3][2];

        int[][] number2DArray2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(number2DArray2[0][1]);
        System.out.println(number2DArray2[2][0]);


        int[][][][][][][] grossness = new int[1][2][3][4][5][6][7];

        grossness[0][0][0][0][0][0][0] = 12;

        System.out.println(grossness[0][0][0][0][0][0][0]);
        //END OF DETOUR

        //Back to important stuff
        int[] ray2 = { 1, 2, 3, 4, 5 };
        add(ray2);
//        add({1, 2, 3, 4});
        multiply(ray2);
        multiply(1, 2, 3, 4, 5, 6, 7);
        multiply(4, 3, 7);
        multiply();
        multiply(10);


    }

    public static void add(int[] numbers) {

        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.println(result);
    }

    //Variable argument - varargs - is a way to present an expectation of any number of potential arguments.
    //of the same type, which is considered as an array.
    //Datatype ... paramName
    //Only 1 varargs can exist per method signature and it must be the last argument.
    public static void multiply(int ... numbers) {

        int result = 1;
        for(int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }

        System.out.println(result);

    }

}