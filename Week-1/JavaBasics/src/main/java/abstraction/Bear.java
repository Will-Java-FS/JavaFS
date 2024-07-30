package abstraction;

public class Bear extends Animal implements Carnivore,Herbivore {


    @Override
    public void makeSound() {
        System.out.println("Grrrrr.");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eats a fish.");
    }
}