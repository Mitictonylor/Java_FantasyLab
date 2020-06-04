import org.junit.Before;
import org.junit.Test;
import players.magic.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void setUp() {
        warlock = new Warlock("Eugene");

    }

    @Test
    public void hasName() {
        assertEquals("Eugene", warlock.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void hasMana() {
        assertEquals(20, warlock.getMana());
    }
}
