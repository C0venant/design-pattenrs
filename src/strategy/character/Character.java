package strategy.character;

import strategy.weapon.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.fight();
    }

    public abstract void display();
}
