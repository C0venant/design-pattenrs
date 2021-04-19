package decorator.armor;

import decorator.Armor;
import decorator.Character;

public class SimpleRobe extends Armor {

    private final Character character;

    public SimpleRobe(Character character) {
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
