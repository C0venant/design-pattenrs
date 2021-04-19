package decorator;

import decorator.armor.*;
import decorator.characters.Archer;
import decorator.characters.Knight;
import decorator.characters.Wizard;

public class DecoratorTest {

    public static void main(String[] args) {
        //introduce characters
        Character knight = new Knight();
        Character archer = new Archer();
        Character wizard = new Wizard();
        //put on some armor
        knight = new SteelPlate(knight);
        knight = new SteelHelmet(knight);

        archer = new LeatherVest(archer);
        archer = new LeatherHelmet(archer);

        wizard = new SimpleRobe(wizard);

        knight.description();
        System.out.println("health: " + knight.health());

        archer.description();
        System.out.println("health: " + archer.health());

        wizard.description();
        System.out.println("health: " + wizard.health());


    }

}
