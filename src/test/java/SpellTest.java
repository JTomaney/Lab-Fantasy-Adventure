import items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before() {
        spell = new Spell("The Burning Head", 16);
    }

    @Test
    public void getName() {
        assertEquals("The Burning Head", spell.getName());
    }

    @Test
    public void getDmg() {
        assertEquals(16, spell.getDmg());
    }
}
