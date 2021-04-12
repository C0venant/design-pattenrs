package strategy.weapon;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("made attack with knife");
    }
}
