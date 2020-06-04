package players.fighters;

public enum Weapon {
    SWORD(25),
    AXE (20),
    CLUB (10);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    };

    public int getDamage() {
        return damage;
    }
}
