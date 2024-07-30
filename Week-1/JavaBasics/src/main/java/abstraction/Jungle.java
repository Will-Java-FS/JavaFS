package abstraction;

public class Jungle {

    public static void main(String[] args) {

        // Animal a = new Animal(); //Cannot instantiate an abstract class

        Lion simba = new Lion();
        simba.species = "African Lion";
        simba.makeSound();
        simba.eat();
        simba.eatMeat();

        Bunny bugs = new Bunny();
        bugs.makeSound();
        bugs.eat();
        bugs.eatPlant();

        Bear baloo = new Bear();
        baloo.makeSound();
        baloo.eat();
        baloo.eatPlant();
        baloo.eatMeat();

        // Carnivore c = new Carnivore(); //Cannot instantiate Interfaces, as well.
        Carnivore[] meateaters = new Carnivore[3];

        meateaters[0] = simba;
        meateaters[1] = baloo;
        meateaters[2] = new Bear();

        TeddyBear teddy = new TeddyBear();
        Adorable[] cutestuff = new Adorable[4];

        cutestuff[0] = bugs;
        cutestuff[1] = teddy;
        cutestuff[2] = new Bunny();
        cutestuff[3] = new TeddyBear();

        Carnivore c = new Lion();
        c.eatMeat();
        // c.eat(); //Ultimately, 'c' is a Carnivore and can do carnivore things:
        // eatMeat() and nothing else.
        // c.makeSound();

    }

}