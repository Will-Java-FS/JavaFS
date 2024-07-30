package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wizard {

    String name;
    List<Spell> proficiencies;

    public Wizard(String name, Spell ... proficiencies) {
        this.name = name;
        this.proficiencies = new ArrayList<>(Arrays.asList(proficiencies));
    }

    public void useSpell(Spell spell) {
        int index = proficiencies.indexOf(spell);
        if(index != -1) {
            spell.castSpell();
//            proficiencies.get(index).castSpell();
        } else {
            System.out.println(name + " does not know that spell!");
        }
    }

    public static void main(String[] args) {

        Wizard harry = new Wizard("Harry Potter", SpellBook.accio, SpellBook.alohamora);

        harry.proficiencies.get(0).castSpell();

        int index = harry.proficiencies.indexOf(SpellBook.alohamora);
        harry.proficiencies.get(index).castSpell();

        harry.useSpell(SpellBook.accio); //Simplifies the needs of the above lines of code
        harry.useSpell(SpellBook.fireball);



    }

}