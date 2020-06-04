import org.junit.Before;
import org.junit.Test;
import players.fighters.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("wee Alfred");
    }

    @Test
    public void hasName() {
        assertEquals("wee Alfred", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, dwarf.getHealth());
    }
}
