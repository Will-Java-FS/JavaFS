package abstraction;

public class Bunny extends Animal implements Herbivore,Adorable {

    @Override
    public void makeSound() {
        System.out.println("Squeak.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eats a carrot.");
    }


}

