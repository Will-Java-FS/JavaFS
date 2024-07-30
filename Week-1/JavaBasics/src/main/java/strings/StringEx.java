package strings;

import java.util.Date;

public class StringEx {

    public static void main(String[] args) {

        int i1 = 1000;
        int i2 = 1000;

        System.out.println(i1 == i2); // == for primitives compares their value.

        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1 == date2); // == for Objects compares their memory address location.

        String hello1 = "Hello";
        String hello2 = "Hello";

        System.out.println(hello1 == hello2);

        String hello3 = new String("Hello");

        System.out.println(hello1 == hello3);
        System.out.println(hello2 == hello3);

        System.out.println(hello1.equals(hello3));

        String word = "Hey";
        System.out.println(hello1.compareTo(word));
        System.out.println(hello1.compareTo(hello3));

        System.out.println(hello1.compareToIgnoreCase("hElLo"));

        System.out.println(hello1.length());

        for(int i = 0; i < hello1.length(); i++) {
            System.out.println(hello1.charAt(i));
        }

        StringBuilder sb = new StringBuilder("Hello Everyone");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


        System.out.println("\n===TIME TEST===");
        //Test the speed of String, StringBuilder, StringBuffer
        long timestart = System.currentTimeMillis();

        String a = new String("a");
        for(int i = 0; i < 50000; i++) {
            a += "a";
        }

        long timeend = System.currentTimeMillis();
        System.out.println("String: " + (timeend - timestart) + " ms");

        //StringBuilder
        timestart = System.currentTimeMillis();

        StringBuilder a2 = new StringBuilder("a");
        for(int i = 0; i < 5000000; i++) {
            a2.append("a");
        }

        timeend = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (timeend - timestart) + " ms");

        //StringBuffer
        timestart = System.currentTimeMillis();

        StringBuffer a3 = new StringBuffer("a");
        for(int i = 0; i < 5000000; i++) {
            a3.append("a");
        }

        timeend = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (timeend - timestart) + " ms");



    }

}