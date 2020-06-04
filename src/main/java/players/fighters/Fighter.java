package players.fighters;

import players.behaviours.IFight;
import players.enemies.Enemy;

public abstract class Fighter{

    private IFight weapon;
    private String name;
    private int health;

    public Fighter(String name, IFight weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public IFight getWeapon() {
        return weapon;
    }

    public void changeWeapon(IFight newWeapon){
        this.weapon = newWeapon;
    }

    public String fight(Enemy enemy){

        return this.weapon.fight(enemy);
    }
}
