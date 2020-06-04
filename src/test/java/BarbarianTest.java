import org.junit.Before;
import org.junit.Test;
import players.enemies.Enemy;
import players.enemies.Troll;
import players.fighters.Barbarian;
import players.fighters.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy enemy;

    @Before
    public void setUp() {

        barbarian = new Barbarian("Antonio", Weapon.CLUB);
        enemy = new Troll("troll", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Antonio", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void hasAWeapon() {
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

    @Test
    public void canFightAnEnemy() {
        assertEquals("You hit troll with club for 10!",  barbarian.fight(enemy));
    }


}
