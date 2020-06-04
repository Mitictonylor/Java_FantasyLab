package players.enemies;

import players.fighters.Weapon;

public class Orc extends Enemy{

    private int powerAttack;
    private Weapon vulnerability;

    public Orc(String name, int health, int powerAttack, Weapon vulnerability) {
        super(name, health);
        this.powerAttack = 15;
        this.vulnerability = Weapon.CLUB;
    }

    public int getPowerAttack() {
        return powerAttack;
    }

    public Weapon getVulnerability() {
        return vulnerability;
    }
}
