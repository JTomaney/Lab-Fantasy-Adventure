import items.healingTools.HolyRelic;
import items.weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;
import players.healers.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    HolyRelic relic;
    Cleric cleric;
    Sword sword;
    Knight knight;

    @Before
    public void before() {
        relic = new HolyRelic(5);
        cleric = new Cleric("Archbishop of Banterbury", relic);
        sword = new Sword(10);
        knight = new Knight("Dunk", sword);
    }

    @Test
    public void getName() {
        assertEquals("Archbishop of Banterbury", cleric.getName());
    }

    @Test
    public void getHp() {
        assertEquals(15, cleric.getHp());
    }

    @Test
    public void setHp() {
        cleric.setHp(13);
        assertEquals(13, cleric.getHp());
    }

    @Test
    public void getArmourRating() {
        assertEquals(10, cleric.getArmourRating());
    }

    @Test
    public void setArmourRating() {
        cleric.setArmourRating(15);
        assertEquals(15, cleric.getArmourRating());
    }

    @Test
    public void takeDmg() {
        cleric.takeDmg(20);
        assertEquals(5, cleric.getHp());
    }

    @Test
    public void getMaxHp() {
        assertEquals(15, cleric.getMaxHp());
    }

    @Test
    public void heal() {
        knight.takeDmg(40);
        cleric.heal(knight);
        assertEquals(15, knight.getHp());
    }

    @Test
    public void cantOverheal() {
        knight.takeDmg(31);
        cleric.heal(knight);
        assertEquals(20, knight.getHp());
    }
}
