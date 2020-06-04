import org.junit.Before;
import org.junit.Test;
import players.fighters.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() {
        barbarian = new Barbarian("Antonio");
    }

    @Test
    public void hasName() {
        assertEquals("Antonio", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, barbarian.getHealth());
    }
}
