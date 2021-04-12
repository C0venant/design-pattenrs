package strategy.character;

import strategy.weapon.WeaponBehavior;

public class Troll extends Character{

    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("Troll:");
    }
}
