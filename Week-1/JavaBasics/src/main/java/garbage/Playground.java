package garbage;

public class Playground {

    public static void main(String[] args) {

        Book dracula1 = new Book("Dracula", 563);
        Book dracula2 = new Book("Dracula 2", 564);
        Book dracula3 = new Book("Dracula 3", 565);

        dracula1 = null;

        Book hobbit = new Book("The Hobbit", 350);

        hobbit = null;
        System.gc();

        Book it1 = new Book("It", 1000);
        Book it2 = it1;
        Book it3 = it2;

        it1 = null;
        it2 = null;
        it3 = new Book("It", 1001);

        System.gc();
        System.out.println("Distraction");

    }

}