package garbage;

public class Book {

    String name;
    int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    //Is executed right before a object is marked for deletion
    public void finalize() {
        System.out.println("This book is about to be destroyed: " + this);
    }


}