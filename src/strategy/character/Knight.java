package strategy.character;

import strategy.weapon.WeaponBehavior;

public class Knight extends Character {

    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("Knight:");
    }
}
