import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp() {
        knight = new Knight ("Sir Michael");
    }

    @Test
    public void hasName() {
        assertEquals("Sir Michael", knight.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, knight.getHealth());
    }

}
