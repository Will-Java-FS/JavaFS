package threads;

public class MyThread extends Thread{
    private int num;

    public MyThread(int num){
        this.num=num;
    }

    @Override
    public void run(){
        System.out.println("Running: "+ Thread.currentThread());

        try{
            Thread.sleep(5000);//simulating the Thread being busy
            System.out.println(num);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread(5);
        MyThread thread2 = new MyThread(10);

        thread1.start();
        thread2.start();
    }
}
