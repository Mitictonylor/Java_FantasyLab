package players.enemies;

import players.fighters.Fighter;
import players.fighters.Weapon;

public class Troll extends Enemy{

    private int powerAttack;

    public Troll(String name, int health, int powerAttack) {
        super(name, health);
        this.powerAttack = powerAttack;
        super.setVulnerability(Weapon.SWORD);
    }

    //      we got a barbarian and a troll in the room
//    barbarian set weapon to axe and attack troll with a axe
//    troll health will go down 20,
//    troll will hit back 40
//    player health goes down by 40;
//    barbarian set weapon to sword and attack getTroll
//            sword is vulnerability, so it kills the villain;
//    brabarian can collect treasure and go to another room


    public int getPowerAttack() {
        return powerAttack;
    }


}
