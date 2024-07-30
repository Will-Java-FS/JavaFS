package threads;

public class App {

    public static void main(String[] args) {

        /*
        Runnable interface is a functional interface
        Therefore is has only 1 abstract method.
         */

        Runnable task0 = () -> {
            Resource.change(0, 5000);
        };

        Runnable task1 = () -> {
            Resource.change(1, 5000);
        };

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(() -> {
            Resource.change(2, 5000);
        });

        thread0.start();
        thread1.start();
        thread2.start();

    }

}