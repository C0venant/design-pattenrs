package decorator.characters;

import decorator.Character;

public class Knight extends Character {

    @Override
    public void description(){
        System.out.println("Knight");
    }

    @Override
    public int health() {
        return 3;
    }
}
