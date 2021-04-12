package Strategy;

import Strategy.character.King;
import Strategy.character.Knight;
import Strategy.character.Queen;
import Strategy.character.Troll;
import Strategy.weapon.AxeBehavior;
import Strategy.weapon.BowAndArrowBehavior;
import Strategy.weapon.KnifeBehavior;
import Strategy.weapon.SwordBehavior;

public class SimulateBattle {

    public static void main(String[] args) {
        //generate characters
        King king = new King(new BowAndArrowBehavior());
        Queen queen = new Queen(new KnifeBehavior());
        Knight knight = new Knight(new SwordBehavior());
        Troll troll = new Troll(new AxeBehavior());

        //troll attacked
        troll.display();
        troll.attack();
        //defend against troll!
        knight.display();
        knight.attack();

        king.display();
        king.attack();

        System.out.println("king ran out of arrows so he had to change weapon");
        king.setWeapon(new SwordBehavior());
        king.display();
        king.attack();

        System.out.println("troll has been defeated");

    }
}
