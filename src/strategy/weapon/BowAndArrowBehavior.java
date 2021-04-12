package strategy.weapon;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("made attack with bow and arrow");
    }
}
