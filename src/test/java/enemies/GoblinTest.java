package enemies;

import items.Loot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoblinTest {

    Loot loot;
    Goblin goblin;

    @Before
    public void before() {
        loot = new Loot(4);
        goblin = new Goblin(loot);
    }

    @Test
    public void getHp() {
        assertEquals(5, goblin.getHp());
    }

    @Test
    public void getDmg() {
        assertEquals(5, goblin.getDmg());
    }

    @Test
    public void getLoot() {
        assertEquals(loot, goblin.getLoot());
    }

    @Test
    public void attack() {
        assertEquals(5, goblin.attack());
    }

    @Test
    public void takeDmg() {
        goblin.takeDmg(2);
        assertEquals(3, goblin.getHp());
    }
}