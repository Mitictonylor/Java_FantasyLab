package players.magic;

public class Warlock extends Magic{

    private int mana;

    public Warlock(String name) {
        super(name);
        this.mana = 20;
    }

    public int getMana() {
        return mana;
    }
}
