package decorator.armor;

import decorator.Armor;
import decorator.Character;

public class LeatherVest extends Armor {

    private final Character character;

    public LeatherVest(Character character) {
        this.character = character;
    }

    @Override
    public void description() {
        character.description();
    }

    @Override
    public int health() {
        return character.health() + 7;
    }
}
