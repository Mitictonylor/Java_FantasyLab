package players.magic;

public enum Defender {
    DRAGON(35,5),
    OGRE(20,15);

    private final int defenseProtection;
    private final int manaHealingPower;

    Defender(int defenseProtection, int manaHealingPower) {
        this.defenseProtection = defenseProtection;
        this.manaHealingPower = manaHealingPower;
    }

    public int getDefenseProtection() {
        return defenseProtection;
    }

    public int getManaHealingPower() {
        return manaHealingPower;
    }
}
