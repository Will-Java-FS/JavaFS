package encapsulation;

public class Thing {

    public String publicName = "Public";
    protected String protectedName = "Protected";
    String defaultName = "Default";
    private String privateName = "Private";

    public void publicMethod() {
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

}