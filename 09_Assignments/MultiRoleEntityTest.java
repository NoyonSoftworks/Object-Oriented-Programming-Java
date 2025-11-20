// Interfaces
interface Attackable {
    void attack(String target);
}

interface Healable {
    void heal(int amount);
}

// Abstract Class
abstract class GameCharacter {
    protected String name;
    protected int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " took " + damage + " damage. Current health: " + health);
    }

    public abstract void specialAbility();
}

// Warrior class
class Warrior extends GameCharacter implements Attackable {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(String target) {
        System.out.println("Warrior " + name + " slashes at " + target + "!");
    }

    @Override
    public void specialAbility() {
        System.out.println("Warrior " + name + " enters berserk mode!");
    }
}

// Cleric class
class Cleric extends GameCharacter implements Healable {
    public Cleric(String name, int health) {
        super(name, health);
    }

    @Override
    public void heal(int amount) {
        health += amount;
        System.out.println("Cleric " + name + " heals for " + amount +
                           " points. Current health: " + health);
    }

    public void healAlly(GameCharacter ally, int amount) {
        ally.health += amount;
        System.out.println("Cleric " + name + " heals " + ally.name +
                           " for " + amount + " points. " +
                           ally.name + "'s health: " + ally.health);
    }

    @Override
    public void specialAbility() {
        System.out.println("Cleric " + name + " casts a protective shield!");
    }
}

// Main class
public class MultiRoleEntityTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Noyon", 100);
        Cleric cleric = new Cleric("Subroto", 80);

        System.out.println("---- Battle Starts ----");
        warrior.attack("an Orc");
        warrior.takeDamage(30);
        warrior.specialAbility();

        System.out.println();

        System.out.println("---- Cleric Helps Warrior ----");
        cleric.specialAbility();
        cleric.healAlly(warrior, 20);

        System.out.println();

        Attackable attacker = warrior;
        Healable healer = cleric;

        System.out.println("---- Using Interface References ----");
        attacker.attack("a Troll");
        healer.heal(10);
    }
}
