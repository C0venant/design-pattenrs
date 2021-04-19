package decorator.armor;

import decorator.Armor;
import decorator.Character;

public class LeatherHelmet extends Armor {

    private final Character character;

    public LeatherHelmet(Character character) {
        this.character = character;
    }

    @Override
    public void description() {
        character.description();
    }

    @Override
    public int health() {
        return character.health() + 2;
    }
}
