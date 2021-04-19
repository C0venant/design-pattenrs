package decorator.armor;

import decorator.Armor;
import decorator.Character;

public class SteelHelmet extends Armor {

    private final Character character;

    public SteelHelmet(Character character) {
        this.character = character;
    }

    @Override
    public void description() {
        character.description();
    }

    @Override
    public int health() {
        return character.health() + 5;
    }
}
