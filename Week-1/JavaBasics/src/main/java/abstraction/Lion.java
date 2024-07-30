package abstraction;

public class Lion extends Animal implements Carnivore {

    @Override
    public void makeSound() {
        System.out.println("Long live the king.");
    }

    @Override
    public void eat() {
        System.out.println("The lion eats tonight");
    }

    @Override
    public void eatMeat() {
        System.out.println("The lion eats some meat.");
    }
}