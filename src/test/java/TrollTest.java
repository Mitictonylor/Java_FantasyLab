import org.junit.Before;
import org.junit.Test;
import players.enemies.Troll;
import players.fighters.Weapon;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void setUp() {
        troll = new Troll("Trolley", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Trolley", troll.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, troll.getHealth());
    }

    @Test
    public void hasVulnerability() {
        assertEquals(Weapon.SWORD, troll.getVulnerability());
    }

    @Test
    public void hasPowerAttack() {
        assertEquals(40, troll.getPowerAttack());
    }

}
