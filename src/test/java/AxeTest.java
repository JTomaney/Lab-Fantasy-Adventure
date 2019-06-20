import items.weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before() {
        axe = new Axe(8);
    }

    @Test
    public void canGetDmg() {
        assertEquals(8, axe.getDmg());
    }
}
