package threads;

public class Resource {

    static int number = 0;

    public static void change(int num, int delay) {


        System.out.println("In the change method: " + Thread.currentThread());
        //Simulate the Thread taking time to do some things.
        try {
            Thread.sleep(delay); //in ms.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        number = num;
        System.out.println(num);

    }

}