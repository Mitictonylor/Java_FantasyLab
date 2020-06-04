package players.magic;

public abstract class Magic {

    private String name;
    private int health;

    public Magic(String name) {
        this.name = name;
        this.health = 100;

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



}
