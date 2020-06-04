package players.fighters;

import players.behaviours.IFight;
import players.enemies.Enemy;

public enum Weapon implements IFight {
    SWORD(25, "sword"),
    AXE (20, "axe"),
    CLUB (10, "club");

    private final int damage;
    private final String name;


    Weapon(int damage, String name){
        this.damage = damage;
        this.name = name;

    };

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String fight(Enemy enemy) {
        return "You hit " + enemy.getName() + " with " + this.getName() +" for " + this.getDamage() + "!" ;
    }
}
