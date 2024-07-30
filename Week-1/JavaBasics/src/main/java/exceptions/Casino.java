package exceptions;

public class Casino {

    public static void main(String[] args) {

        double luck = Math.random();
        System.out.println(luck);

        try {
            gamble(luck);
        } catch (LostMoneyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void gamble(double number) throws LostMoneyException {

        if(number > 0.7) {
            System.out.println("Congratulations you won money!");
        } else {
            throw new LostMoneyException("Please stop gambling!");
        }

    }

}