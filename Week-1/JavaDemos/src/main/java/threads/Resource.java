package threads;

public class Resource {
    static int number =0;

    public synchronized static void change (int num, int delay){
        System.out.println("In the change method:"+ Thread.currentThread());
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        number = num;
        System.out.println(num);
    }
}
