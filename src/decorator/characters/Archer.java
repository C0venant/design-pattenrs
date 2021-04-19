package decorator.characters;

import decorator.Character;

public class Archer extends Character {

    @Override
    public void description(){
        System.out.println("Archer");
    }

    @Override
    public int health() {
        return 5;
    }
}
