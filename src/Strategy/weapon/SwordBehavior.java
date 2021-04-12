package Strategy.weapon;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("made attack with sword");
    }
}
