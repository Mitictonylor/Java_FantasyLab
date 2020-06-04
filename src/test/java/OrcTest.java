import org.junit.Before;
import org.junit.Test;
import players.enemies.Orc;
import players.fighters.Weapon;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void setUp() {
        orc = new Orc("Orc",40);
    }
    @Test
    public void hasName() {
        assertEquals("Orc", orc.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(40, orc.getHealth());
    }

    @Test
    public void hasVulnerability() {
        assertEquals(Weapon.CLUB, orc.getVulnerability());
    }

    @Test
    public void hasPowerAttack() {
        assertEquals(15, orc.getPowerAttack());
    }

}
