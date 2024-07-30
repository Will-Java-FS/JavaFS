package lambdas;

public class SpellBook {

    static Spell fireball = () -> {
        System.out.println("Hurls a large fireball");
    };

    static Spell magicMissile = () -> {
        System.out.println("Hurls a Magic Missile");
    };

    static Spell accio = () -> {
        System.out.println("Sends an object to you.");
    };

    static Spell alohamora = () -> {
        System.out.println("The lock is now open");
    };

    static Spell graspingVines = SpellBook::castGraspingVines;

    static void castGraspingVines() {
        System.out.println("entangles your enemy");
    }

}