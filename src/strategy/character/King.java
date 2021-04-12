package strategy.character;

import strategy.weapon.WeaponBehavior;

public class King extends Character {

    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("King:");
    }
}
