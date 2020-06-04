package players.enemies;

import players.fighters.Weapon;

public abstract class Enemy {

    private String name;
    private int health;
    private Weapon vulnerability;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        this.vulnerability = Weapon.AXE;
    }

    public void setVulnerability(Weapon vulnerability) {
        this.vulnerability = vulnerability;
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

    public Weapon getVulnerability() {
        return vulnerability;
    }
}
