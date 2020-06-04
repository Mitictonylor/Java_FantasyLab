package players.magic;

public enum Spells {

    FIREBALL(40,9),
    LIGHTNING(75,15),
    MAGICALGAS(10,1);

    private final int damage;
    private final int manaCost;

    Spells(int damage, int manaCost) {
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }
}
