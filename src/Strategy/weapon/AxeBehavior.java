package Strategy.weapon;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("made attack with axe");
    }
}
