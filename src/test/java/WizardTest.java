import org.junit.Before;
import org.junit.Test;
import players.magic.Warlock;
import players.magic.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp() {
        wizard = new Wizard("Jordan");

    }

    @Test
    public void hasName() {
        assertEquals("Jordan", wizard.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void hasMana() {
        assertEquals(14, wizard.getMana());
    }
}