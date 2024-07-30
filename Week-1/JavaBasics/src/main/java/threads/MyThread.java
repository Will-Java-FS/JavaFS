package threads;

public class MyThread extends Thread {

    private int num;

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Running: " + Thread.currentThread());


        Resource.change(num, 5000);
    }

    public static void main(String[] args) {

        MyThread thread1 = new MyThread(3);
        MyThread thread2 = new MyThread(4);

        thread1.start();
        thread2.start();

    }
}