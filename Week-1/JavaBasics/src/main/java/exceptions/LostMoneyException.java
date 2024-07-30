package exceptions;

public class LostMoneyException extends Exception {

    public LostMoneyException(String msg) {
        super(msg);
    }

    public LostMoneyException() {
        super("You just lost some money!");
    }

}