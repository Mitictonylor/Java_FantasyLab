package players.magic;

public class Wizard extends Magic{

    private int mana;

    public Wizard(String name) {
        super(name);
        this.mana = 14;
    }

    public int getMana() {
        return mana;
    }

}
