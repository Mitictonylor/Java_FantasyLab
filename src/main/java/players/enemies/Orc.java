package players.enemies;

import players.fighters.Weapon;

public class Orc extends Enemy{

    private int powerAttack;


    public Orc(String name, int health) {
        super(name, health);
        this.powerAttack = 15;
        super.setVulnerability(Weapon.CLUB);
    }

    public int getPowerAttack() {
        return powerAttack;
    }


}
