import items.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before() {
        sword = new Sword(10);
    }

    @Test
    public void canGetDmg() {
        assertEquals(10, sword.getDmg());
    }

}
