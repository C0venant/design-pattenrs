package decorator.characters;

import decorator.Character;

public class Wizard extends Character {

    @Override
    public void description(){
        System.out.println("Wizard");
    }

    @Override
    public int health() {
        return 3;
    }
}
